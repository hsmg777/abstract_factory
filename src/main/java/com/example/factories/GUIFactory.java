package com.example.factories;

import com.example.Buttons.Button;
import com.example.CheckBoxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
