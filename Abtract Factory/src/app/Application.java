package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
         button = factory.createButton();
         checkbox = factory.createCheckbox();
    }

    public void onClick() {
        button.onClick();
        checkbox.onClick();
    }
}
