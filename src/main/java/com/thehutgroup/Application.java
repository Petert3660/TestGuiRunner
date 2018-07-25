package com.thehutgroup;

import com.thehutgroup.guis.GuiHelper;
import com.thehutgroup.testgui.*;

public class Application {

    public static void main(String[] args) {
        System.out.println("This is the TestGui Runner");

        TestGui testGui = new TestGui();
        GuiHelper.showFrame(testGui);
    }
}
