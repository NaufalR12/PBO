/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanggilFrameTurunan;

/**
 *
 * @author LENOVO
 */
import javax.swing.*;
class FrameTurunan extends JFrame {
    public FrameTurunan(String judul) {
        setTitle(judul);
        setSize(300,200);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
}
public class PanggilFrameTurunan {
    public static void main (String [] args) {
        FrameTurunan f = new FrameTurunan("Ini Frame Turunan");
    }
}