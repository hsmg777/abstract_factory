package com.example.factories;
import com.example.Buttons.Button;
import com.example.Buttons.WindowsButton;
import com.example.CheckBoxes.Checkbox;
import com.example.CheckBoxes.WindowsCheckbox;;
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
