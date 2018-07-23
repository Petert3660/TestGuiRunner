/* This file is auto-generated by the ScriptDirectedGui program.         */
/* Please do not modify directly, but feel free to copy into a project   */

package com.thehutgroup.testgui;

import com.thehutgroup.guicomponents.FreeButton;
import com.thehutgroup.guicomponents.FreeLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TestGui extends JFrame {

    private static final String MAIN_HEADING = "GIT Branch Creator";
    private static final String TITLE = MAIN_HEADING;
    private static final int FRAME_X_SIZE = 800;
    private static final int FRAME_Y_SIZE = 600;
    private Color col = new Color(230, 255, 255);

    private TestGui tg = this;

    private JMenuBar menuBar = new JMenuBar();

    public TestGui() {
        this.setTitle(TITLE);
        this.setSize(FRAME_X_SIZE, FRAME_Y_SIZE);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(col);

        FreeLabel l0 = new FreeLabel(MAIN_HEADING, 30, 30, 500, 20, new Font("", Font.BOLD + Font.ITALIC, 20));

        FreeButton b0 = new FreeButton("Exit", 360, 500, 80);


        // This is the control for the Exit-implement button
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tg.dispose();
            }
        });

        p1.add(b0);
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
        menu0.addSeparator();
        JMenuItem menuItem03 = new JMenuItem("Exit");
        menu0.add(menuItem03);

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

        // This is the control for the File\Exit-implement menu item
        menuItem03.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tg.dispose();
            }
        });

        menuBar.add(menu0);

        JMenu menu1 = new JMenu("Edit");
        JMenuItem menuItem10 = new JMenuItem("Read");
        menu1.add(menuItem10);
        JMenuItem menuItem11 = new JMenuItem("Write");
        menu1.add(menuItem11);
        JMenuItem menuItem12 = new JMenuItem("Close");
        menu1.add(menuItem12);

        // This is the control for the Edit\Read menu item
        menuItem10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - Read in the Edit menu has been clicked");
            }
        });

        // This is the control for the Edit\Write menu item
        menuItem11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - Write in the Edit menu has been clicked");
            }
        });

        // This is the control for the Edit\Close menu item
        menuItem12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Menu item - Close in the Edit menu has been clicked");
            }
        });

        menuBar.add(menu1);

    }

}
