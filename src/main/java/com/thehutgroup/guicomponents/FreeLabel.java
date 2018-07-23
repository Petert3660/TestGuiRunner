package com.thehutgroup.guicomponents;

import java.awt.Font;
import javax.swing.JLabel;

/**
 * Created by thomsonp on 05/01/2017.
 */
public class FreeLabel extends JLabel {

    public FreeLabel(String value, int x, int y, int xSize, int ySize) {
        this.setText(value);
        this.setBounds(x, y, xSize, ySize);
    }

    public FreeLabel(String value, int x, int y, int xSize, int ySize, Font font) {
        this(value, x, y, xSize, ySize);
        this.setFont(font);
    }

    public String getLabelText() { return this.getText(); }

    public void setLabelText(String newValue) { this.setText(newValue); }
}
