/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul06;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Acer
 */
public class Latihan1_KalkulatorSederhana {
    public static void main(String[] args) {
        // 1. Buat frame utama
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout(5, 5)); // Gunakan BorderLayout

        // 2. Tambahkan layar (display) di bagian atas
        JTextField display = new JTextField();
        display.setEditable(false); // Tidak bisa diketik
        display.setHorizontalAlignment(JTextField.RIGHT); // Teks rata kanan
        frame.add(display, BorderLayout.NORTH);

        // 3. Buat panel untuk tombol-tombol angka dan operator
        JPanel panelTombol = new JPanel();
        panelTombol.setLayout(new GridLayout(4, 4, 5, 5)); // 4 baris, 4 kolom

        // 4. Tambahkan tombol-tombol
        String[] tombol = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String teks : tombol) {
            JButton btn = new JButton(teks);
            panelTombol.add(btn);
        }

        // 5. Tambahkan panel tombol ke frame (bagian tengah)
        frame.add(panelTombol, BorderLayout.CENTER);

        // 6. Tampilkan frame
        frame.setVisible(true);
    }
}
