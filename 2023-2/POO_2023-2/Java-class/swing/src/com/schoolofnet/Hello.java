package com.schoolofnet;

import javax.swing.*;
import java.awt.EventQueue;

import static jdk.internal.misc.OSEnvironment.initialize;

public class Hello {

    private JFrame frame;

    /*
    * Launch the application
     */

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Hello window = new Hello();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /*
    * Create the application
     */
    public Hello() {
        initialize();
    }

    /*
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
