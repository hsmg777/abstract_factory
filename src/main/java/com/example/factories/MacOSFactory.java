package com.example.factories;

import com.example.Buttons.Button;
import com.example.Buttons.MacOSButton;
import com.example.CheckBoxes.Checkbox;
import com.example.CheckBoxes.MacOSCheckbox;;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
    
}
