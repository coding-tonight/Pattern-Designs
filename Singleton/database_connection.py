import psycopg2
import pprint
import os

class SingletonClass(object):
  def __new__(cls):
    if not hasattr(cls, 'instance'):
      cls.instance = super(SingletonClass, cls).__new__(cls)
    return cls.instance


def dictfetchall(cursor):
    """
    Return all rows from a cursor as a dict.
    Assume the column names are unique.
    """
    columns = [col[0] for col in cursor.description]
    return [dict(zip(columns, row)) for row in cursor.fetchall()]
  

class DatabaseConnection(SingletonClass):
    _connection = None
        
    def connect(self, host, port, dbname, user, password) -> None:
        try:
            self._connection = psycopg2.connect(
                host=host,
                port=port,
                dbname=dbname,
                user=user,
                password=password
            )
        except Exception as e:
            print("Database Connection Failed...")
            
    
    def disconnect(self):
        if self._connection is not None:
            self._connection.close()
            self._connection = None
            
    
    def execute(self, query, params=None):
        self.connect()
        
        if self._connection is None:
            print("Error: database connection is not established")
            return None
        
        with self._connection.cursor():
            cursor = self._connection.cursor()
            cursor.execute(query, params)
            result = dictfetchall(cursor)
            return result
    

class Music:
    def __init__(self):
        self._db = DatabaseConnection().connect(
            host=os.environ['DB_HOST'], port=os.environ['DB_PORT'], 
            dbname=os.environ['DB_NAME'], user=os.environ['DB_USER'],
            password=os.environ['DB_PASSWORD']
        )
    
    def all(self, limit=0, offset=0):
        return self._db.execute("SELECT * FROM musics LIMIT %s OFFSET %s", [limit, offset])    
    

if __name__ == "__main__":
    try:
        all_musics = Music()
        
        pprint.pprint(all_musics.all())
    except Exception as exe:
        raise Exception(exe)
        
        




    
