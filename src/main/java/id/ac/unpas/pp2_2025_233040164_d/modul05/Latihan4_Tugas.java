/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.pp2_2025_233040164_d.modul05;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Acer
 */

public class Latihan4_Tugas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Contoh BorderLayout dengan Aksi Tombol");
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // 1. Buat komponen utama
                JLabel label = new JLabel("Label ada di Atas (NORTH)", SwingConstants.CENTER);
                JButton buttonSouth = new JButton("Tombol ada di Bawah (SOUTH)");
                JButton buttonNorth = new JButton("WEST");
                JButton buttonEast = new JButton("EAST");
                JButton buttonCenter = new JButton("CENTER");
                JButton buttonWest = new JButton("WEST");

                // 2. Tambahkan aksi untuk setiap tombol
                buttonSouth.addActionListener(e -> label.setText("Tombol di SOUTH diklik!"));
                buttonNorth.addActionListener(e -> label.setText("Tombol di NORTH diklik!"));
                buttonWest.addActionListener(e -> label.setText("Tombol di WEST diklik!"));
                buttonEast.addActionListener(e -> label.setText("Tombol di EAST diklik!"));
                buttonCenter.addActionListener(e -> label.setText("Tombol di CENTER diklik!"));

                // 3. Tambahkan komponen ke frame sesuai posisi BorderLayout
                frame.add(label, BorderLayout.NORTH);
                frame.add(buttonSouth, BorderLayout.SOUTH);
                frame.add(buttonWest, BorderLayout.WEST);
                frame.add(buttonEast, BorderLayout.EAST);
                frame.add(buttonCenter, BorderLayout.CENTER);

                frame.setVisible(true);
            }
        });
    }
}

