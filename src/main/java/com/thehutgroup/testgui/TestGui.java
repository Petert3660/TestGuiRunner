/* This file is auto-generated by the ScriptDirectedGui program.                  */
/* Please do not modify directly as the code cannot then be guaranteed to operate */
/* correctly. However, please feel free to copy the source into a project.        */

package com.thehutgroup.testgui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.io.File;
import com.thehutgroup.guicomponents.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGui extends JFrame {

    private static final String MAIN_HEADING = "Example Dashboard";
    private static final String SUB_HEADING = "Main Dashboard";
    private static final String TITLE = MAIN_HEADING + " - " + SUB_HEADING;
    private static final int FRAME_X_SIZE = 1000;
    private static final int FRAME_Y_SIZE = 900;
    private Color col = new Color(235, 255, 255);

    private TestGui tg = this;

    private JMenuBar menuBar = new JMenuBar();

    public TestGui() {
        this.setTitle(TITLE);
        this.setSize(FRAME_X_SIZE, FRAME_Y_SIZE);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(col);

        FreeLabel l0 = new FreeLabel(MAIN_HEADING, 30, 30, 500, 20, new Font("", Font.BOLD + Font.ITALIC, 20));

        FreeButton b0 = new FreeButton("OK", 295, 800, 80);

        FreeButton b1 = new FreeButton("Browse", 405, 800, 80);

        FreeButton b2 = new FreeButton("Clear", 515, 800, 80);

        FreeButton b3 = new FreeButton("Exit", 625, 800, 80);

        FreeRadioButton rb0 = new FreeRadioButton(col, "Radio One", 30, 390, 150, 20);
        rb0.setSelected();
        FreeRadioButton rb1 = new FreeRadioButton(col, "Radio Two", 180, 390, 150, 20);

        FreeLabelTextFieldPair comp0 = new FreeLabelTextFieldPair(col, "Please enter the new branch name:", 30, 90, 240);

        ArrayList<String> items0 = new ArrayList<String>();
        FreeLabelComboBoxPair comp1 = new FreeLabelComboBoxPair(col, "Please select the project name:", 30, 140, 240, items0);

        FreeLabel comp2 = new FreeLabel("This is an example of a free label", 30, 190, 400, 20);

        FreeCheckBox comp3 = new FreeCheckBox(col, "Please select if this is to be selected", 30, 240, 300, 20);

        FreeTextField comp4 = new FreeTextField("This is an example of a free textField", 30, 290, 500, 20);

        ArrayList<String> items1 = new ArrayList<String>();
        FreeComboBox comp5 = new FreeComboBox(30, 340, 200, 20, items1);

        FreeRadioButtonGroup comp6 = new FreeRadioButtonGroup();
        ArrayList<FreeRadioButton> items2 = new ArrayList<FreeRadioButton>();
        items2.add(rb0);
        items2.add(rb1);
        comp6.addButtons(items2);

        FreeLabelTextButtonTriple comp7 = new FreeLabelTextButtonTriple(col, "Please enter a file name:", 30, 440, 10, "Clear");

        FreeTextArea comp8 = new FreeTextArea(col, "The output will be shown below:", 30, 490, 200, 950, 220, false);

        // This is the control for the OK button
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button output - " + b0.getButtonText());
            }
        });

        // This is the control for the Browse-implement button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.setCurrentDirectory(new File("c:\\"));
                int returnVal = fc.showOpenDialog(tg);
            }
        });

        // This is the control for the Clear button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button output - " + b2.getButtonText());
            }
        });

        // This is the control for the Exit-implement button
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tg.dispose();
            }
        });

        // This is the control for the Please select if this is to be selected check box
        comp3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (comp3.isSelected()) {
                    System.out.println("Checkbox - " + comp3.getLabel() + " has been selected");
                } else {
                    System.out.println("Checkbox - " + comp3.getLabel() + " has been de-selected");
                }
            }
        });

        // This is the control for the Clear button on the triple Label, Text, Button
        comp7.getButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button - " + comp7.getButtonText() + " in the triple group has been clicked");
            }
        });

        // This is the control for the Radio One radio button
        rb0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Radio button output - " + rb0.getLabelText());
            }
        });

        // This is the control for the Radio Two radio button
        rb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Radio button output - " + rb1.getLabelText());
            }
        });

        p1.add(b0);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(rb0);
        p1.add(rb1);
        p1.add(comp0.getPanel());
        p1.add(comp1.getPanel());
        p1.add(comp2);
        p1.add(comp3);
        p1.add(comp4);
        p1.add(comp5);
        p1.add(comp7.getPanel());
        p1.add(comp8.getPanel());
        p1.add(l0);

        setUpMenuBar();
          this.setJMenuBar(menuBar);
        this.add(p1);

    }

    private void setUpMenuBar() {
        JMenu menu0 = new JMenu("File");
        JMenuItem menuItem00 = new JMenuItem("Open");
        menu0.add(menuItem00);
        JMenuItem menuItem01 = new JMenuItem("Close");
        menu0.add(menuItem01);
        JMenuItem menuItem02 = new JMenuItem("Exit");
        menu0.add(menuItem02);

        // This is the control for the File\Open menu item
        menuItem00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - Open in the File menu has been clicked");
            }
        });

        // This is the control for the File\Close menu item
        menuItem01.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - Close in the File menu has been clicked");
            }
        });

        // This is the control for the File\Exit menu item
        menuItem02.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - Exit in the File menu has been clicked");
            }
        });

        menuBar.add(menu0);

        JMenu menu1 = new JMenu("Edit");
        JMenuItem menuItem10 = new JMenuItem("DoThis");
        menu1.add(menuItem10);
        JMenuItem menuItem11 = new JMenuItem("DoThat");
        menu1.add(menuItem11);
        menu1.addSeparator();
        JMenuItem menuItem13 = new JMenuItem("DoTheOther");
        menu1.add(menuItem13);

        // This is the control for the Edit\DoThis menu item
        menuItem10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - DoThis in the Edit menu has been clicked");
            }
        });

        // This is the control for the Edit\DoThat menu item
        menuItem11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - DoThat in the Edit menu has been clicked");
            }
        });

        // This is the control for the Edit\DoTheOther menu item
        menuItem13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - DoTheOther in the Edit menu has been clicked");
            }
        });

        menuBar.add(menu1);

        JMenu menu2 = new JMenu("AnotherMenu");
        JMenuItem menuItem20 = new JMenuItem("DoThis");
        menu2.add(menuItem20);
        JMenuItem menuItem21 = new JMenuItem("DoThat");
        menu2.add(menuItem21);

        // This is the control for the AnotherMenu\DoThis menu item
        menuItem20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - DoThis in the AnotherMenu menu has been clicked");
            }
        });

        // This is the control for the AnotherMenu\DoThat menu item
        menuItem21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - DoThat in the AnotherMenu menu has been clicked");
            }
        });

        menuBar.add(menu2);

    }

}
