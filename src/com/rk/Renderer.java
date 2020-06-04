package com.rk;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Renderer extends JPanel implements ListCellRenderer {

    JLabel leftText, rightText;

    public Renderer() {
        super(new BorderLayout());
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        leftText = new JLabel();
        leftText.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0));

        rightText = new JLabel();
        rightText.setHorizontalAlignment(SwingConstants.RIGHT);
        rightText.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 2));

        add(leftText, BorderLayout.WEST);
        add(rightText, BorderLayout.EAST);
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Vector item = (Vector) value;

        leftText.setText(item.get(0).toString());
        rightText.setText(item.get(1).toString());

        leftText.setFont(list.getFont());
        rightText.setFont(list.getFont());

        if (index < 0) {
            leftText.setForeground(list.getForeground());
        } else {
            if (isSelected) {
                leftText.setForeground(list.getSelectionForeground());
                this.setBackground(list.getSelectionBackground());
            } else {
                leftText.setForeground(list.getForeground());
                this.setBackground(list.getBackground());
            }
        }

        return this;
    }
}
