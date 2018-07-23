package com.thehutgroup.guicomponents;

import java.util.ArrayList;
import javax.swing.ButtonGroup;

public class FreeRadioButtonGroup extends ButtonGroup {

    ArrayList<FreeRadioButton> allButtons;

    public FreeRadioButtonGroup() {
    }

    public FreeRadioButtonGroup(ArrayList<FreeRadioButton> radioButtons) {
        for (FreeRadioButton frb : radioButtons) {
            this.add(frb);
        }
        allButtons = radioButtons;
    }

    public void setSelectedButton(int order) {
        this.setSelected(allButtons.get(order).getModel(), true);
    }

    public String getSelectedButton() {
        return this.getSelection().getActionCommand();
    }

    public void addButtons(ArrayList<FreeRadioButton> radioButtons) {
        for (FreeRadioButton frb : radioButtons) {
            this.add(frb);
        }
        allButtons = radioButtons;
    }

    public ArrayList<FreeRadioButton> getButtons() { return allButtons; }
}
