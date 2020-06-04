package com.rk;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Vector;

public class FormUtama extends JFrame {

    String data1[] = {"Republik Indonesia", "RI"};
    String data2[] = {"Pegawai Negeri Sipil", "PNS"};
    String data3[] = {"Komisi Pemberantasan Korupsi", "KPK"};
    String data4[] = {"Universitas Sumatera Utara", "USU"};
    String data5[] = {"Rizky Khapidsyah", "RK"};

    JComboBox JcB;

    public FormUtama() {
        super("Multi Column JComboBox List");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        AturComboBox();

        setPreferredSize(new Dimension(320, 210));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void AturComboBox() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        model.addElement(new Vector(Arrays.asList(data1)));
        model.addElement(new Vector(Arrays.asList(data2)));
        model.addElement(new Vector(Arrays.asList(data3)));
        model.addElement(new Vector(Arrays.asList(data4)));
        model.addElement(new Vector(Arrays.asList(data5)));

        JcB = new JComboBox();

        JcB.setModel(model);
        JcB.setRenderer(new Renderer());

        add(JcB, BorderLayout.NORTH);
    }
}
