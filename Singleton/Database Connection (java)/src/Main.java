import db.DatabaseConnection;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            DatabaseConnection db = DatabaseConnection.getInstance();
            System.out.println(db.getConnection());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}