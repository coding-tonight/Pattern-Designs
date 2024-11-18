package factories;

import buttons.Button;
import buttons.WindowOsButton;
import checkboxes.Checkbox;
import checkboxes.WindowOSCheckbox;

public class WindowOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowOSCheckbox();
    }
}
