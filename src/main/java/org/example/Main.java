package org.example;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setUndecorated(true);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setVisible(true);
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/main/resources/rd2.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(5000);
            clip.close();

            audioInputStream = AudioSystem.getAudioInputStream(new File("src/main/resources/rdd.wav"));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(1000);

            ImageIcon imageIcon = new ImageIcon("src/main/resources/scr.jpg");
            JLabel label = new JLabel(imageIcon);
            window.getContentPane().add(label, BorderLayout.CENTER);
            window.validate();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
