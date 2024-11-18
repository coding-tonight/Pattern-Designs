import app.Application;
import factories.GUIFactory;
import factories.MacOsFactory;
import factories.WindowOsFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String os = "Window";

        if(os.equalsIgnoreCase("window")) {
             factory = new WindowOsFactory();
        } else {
            factory = new MacOsFactory();
        }

        app = new Application(factory);

        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();

        app.onClick();
    }
}