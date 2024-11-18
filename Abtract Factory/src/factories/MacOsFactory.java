package factories;
import buttons.Button;
import buttons.MacOsButton;
import checkboxes.Checkbox;
import checkboxes.MacOSCheckbox;

public class MacOsFactory  implements GUIFactory {
    @Override
    public Button createButton() {
      return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
