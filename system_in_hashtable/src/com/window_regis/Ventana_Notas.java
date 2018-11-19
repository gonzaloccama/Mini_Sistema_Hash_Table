/*
 * Created by JFormDesigner on Sat Jun 17 19:28:43 COT 2017
 */

package com.window_regis;

import com.model_regis.Estudiante;

import java.awt.*;
import java.awt.event.*;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Gonzalo
 */
public class Ventana_Notas extends JFrame {

    Hashtable<Integer, Estudiante> tabla_estudiante;

    public Ventana_Notas(Matricula matricula, boolean b, Hashtable<Integer, Estudiante> tabla_estudiante) {
        initComponents();
        this.tabla_estudiante = matricula.data();
    }

    private void btnGuardarNotasActionPerformed(ActionEvent e) {
        guardar_nota(tabla_estudiante);
    }

    private void guardar_nota(Hashtable<Integer, Estudiante> tabla_estudiante) {
        Integer documento = Integer.parseInt(txtDNI.getText());
        Estudiante study = new Estudiante();
        Estudiante estudiante = tabla_estudiante.get(documento);

        study.setDNI(estudiante.getDNI());
        study.setNombres(estudiante.getNombres());
        study.setApellidos(estudiante.getApellidos());
        study.setDireccion(estudiante.getDireccion());
        study.setCelular(estudiante.getCelular());
        study.setFecha_Nacimiento(estudiante.getFecha_Nacimiento());
        study.setGrado(estudiante.getGrado());
        study.setCurso(txtCurso.getText());
        study.setNota_1(Integer.parseInt(txtNota_1.getText()));
        study.setNota_2(Integer.parseInt(txtNota_2.getText()));
        study.setNota_3(Integer.parseInt(txtNota_3.getText()));
        study.setNota_4(Integer.parseInt(txtNota_4.getText()));
        tabla_estudiante.put(study.getDNI(), study);

        dispose();

    }

    private void btnRegresarActionPerformed(ActionEvent e) {
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel2 = new JPanel();
        btnRegresar = new JButton();
        btnGuardarNotas = new JButton();
        label1 = new JLabel();
        panel9 = new JPanel();
        panel12 = new JPanel();
        label4 = new JLabel();
        txtNota_1 = new JTextField();
        panel7 = new JPanel();
        label5 = new JLabel();
        txtNota_2 = new JTextField();
        panel8 = new JPanel();
        label6 = new JLabel();
        panel10 = new JPanel();
        txtNota_3 = new JTextField();
        label7 = new JLabel();
        txtNota_4 = new JTextField();
        label8 = new JLabel();
        txtCurso = new JTextField();
        panel11 = new JPanel();
        panel3 = new JPanel();
        label9 = new JLabel();
        txtDNI = new JTextField();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(15, 52, 76));
            panel1.setLayout(null);

            //======== panel2 ========
            {
                panel2.setBackground(new Color(27, 32, 35));
                panel2.setLayout(null);

                //---- btnRegresar ----
                btnRegresar.setText("REGRESAR");
                btnRegresar.setBackground(new Color(52, 96, 87));
                btnRegresar.setFont(new Font("Segoe UI", Font.BOLD, 12));
                btnRegresar.setForeground(new Color(204, 204, 204));
                btnRegresar.setIcon(new ImageIcon("C:\\Users\\Ccama\\IdeaProjects\\system_in_hashtable\\recursos\\arrow-back-icon.png"));
                btnRegresar.addActionListener(e -> btnRegresarActionPerformed(e));
                panel2.add(btnRegresar);
                btnRegresar.setBounds(325, 20, 175, 32);

                //---- btnGuardarNotas ----
                btnGuardarNotas.setText("GUARDAR NOTAS");
                btnGuardarNotas.setBackground(new Color(52, 96, 87));
                btnGuardarNotas.setFont(new Font("Segoe UI", Font.BOLD, 12));
                btnGuardarNotas.setForeground(new Color(204, 204, 204));
                btnGuardarNotas.setIcon(new ImageIcon("C:\\Users\\Ccama\\IdeaProjects\\system_in_hashtable\\recursos\\green-disk-icon.png"));
                btnGuardarNotas.addActionListener(e -> btnGuardarNotasActionPerformed(e));
                panel2.add(btnGuardarNotas);
                btnGuardarNotas.setBounds(45, 20, 175, 32);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel2);
            panel2.setBounds(0, 410, 530, 75);

            //---- label1 ----
            label1.setText("INGRESAR NOTAS");
            label1.setFont(new Font("Berlin Sans FB", Font.BOLD, 28));
            label1.setForeground(new Color(0, 153, 153));
            panel1.add(label1);
            label1.setBounds(145, 5, 240, 36);

            //======== panel9 ========
            {
                panel9.setBorder(new LineBorder(Color.lightGray));
                panel9.setBackground(new Color(15, 52, 76));
                panel9.setLayout(null);

                //======== panel12 ========
                {
                    panel12.setBackground(new Color(204, 204, 204));
                    panel12.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel12.getComponentCount(); i++) {
                            Rectangle bounds = panel12.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel12.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel12.setMinimumSize(preferredSize);
                        panel12.setPreferredSize(preferredSize);
                    }
                }
                panel9.add(panel12);
                panel12.setBounds(0, 353, 455, 1);

                //---- label4 ----
                label4.setText("NOTA 1:");
                label4.setFont(new Font("Calibri", Font.BOLD, 12));
                label4.setForeground(new Color(204, 204, 204));
                label4.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label4);
                label4.setBounds(0, 50, 455, 15);

                //---- txtNota_1 ----
                txtNota_1.setBackground(new Color(13, 51, 76));
                txtNota_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtNota_1.setBorder(null);
                txtNota_1.setDisabledTextColor(new Color(204, 204, 204));
                txtNota_1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtNota_1.setCaretColor(new Color(204, 204, 204));
                txtNota_1.setForeground(new Color(204, 204, 204));
                txtNota_1.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtNota_1);
                txtNota_1.setBounds(5, 65, 445, 22);

                //======== panel7 ========
                {
                    panel7.setBackground(new Color(204, 204, 204));
                    panel7.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel7.getComponentCount(); i++) {
                            Rectangle bounds = panel7.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel7.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel7.setMinimumSize(preferredSize);
                        panel7.setPreferredSize(preferredSize);
                    }
                }
                panel9.add(panel7);
                panel7.setBounds(0, 87, 455, 1);

                //---- label5 ----
                label5.setText("NOTA 2:");
                label5.setFont(new Font("Calibri", Font.BOLD, 12));
                label5.setForeground(new Color(204, 204, 204));
                label5.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label5);
                label5.setBounds(0, 95, 455, 15);

                //---- txtNota_2 ----
                txtNota_2.setBackground(new Color(13, 51, 76));
                txtNota_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtNota_2.setBorder(null);
                txtNota_2.setDisabledTextColor(new Color(204, 204, 204));
                txtNota_2.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtNota_2.setCaretColor(new Color(204, 204, 204));
                txtNota_2.setForeground(new Color(204, 204, 204));
                txtNota_2.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtNota_2);
                txtNota_2.setBounds(5, 110, 445, 22);

                //======== panel8 ========
                {
                    panel8.setBackground(new Color(204, 204, 204));
                    panel8.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel8.getComponentCount(); i++) {
                            Rectangle bounds = panel8.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel8.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel8.setMinimumSize(preferredSize);
                        panel8.setPreferredSize(preferredSize);
                    }
                }
                panel9.add(panel8);
                panel8.setBounds(0, 132, 455, 1);

                //---- label6 ----
                label6.setText("NOTA 3:");
                label6.setFont(new Font("Calibri", Font.BOLD, 12));
                label6.setForeground(new Color(204, 204, 204));
                label6.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label6);
                label6.setBounds(0, 140, 455, 15);

                //======== panel10 ========
                {
                    panel10.setBackground(new Color(204, 204, 204));
                    panel10.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel10.getComponentCount(); i++) {
                            Rectangle bounds = panel10.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel10.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel10.setMinimumSize(preferredSize);
                        panel10.setPreferredSize(preferredSize);
                    }
                }
                panel9.add(panel10);
                panel10.setBounds(0, 177, 455, 1);

                //---- txtNota_3 ----
                txtNota_3.setBackground(new Color(13, 51, 76));
                txtNota_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtNota_3.setBorder(null);
                txtNota_3.setDisabledTextColor(new Color(204, 204, 204));
                txtNota_3.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtNota_3.setCaretColor(new Color(204, 204, 204));
                txtNota_3.setForeground(new Color(204, 204, 204));
                txtNota_3.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtNota_3);
                txtNota_3.setBounds(5, 155, 445, 22);

                //---- label7 ----
                label7.setText("NOTA 4:");
                label7.setFont(new Font("Calibri", Font.BOLD, 12));
                label7.setForeground(new Color(204, 204, 204));
                label7.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label7);
                label7.setBounds(0, 185, 455, 15);

                //---- txtNota_4 ----
                txtNota_4.setBackground(new Color(13, 51, 76));
                txtNota_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtNota_4.setBorder(null);
                txtNota_4.setDisabledTextColor(new Color(204, 204, 204));
                txtNota_4.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtNota_4.setCaretColor(new Color(204, 204, 204));
                txtNota_4.setForeground(new Color(204, 204, 204));
                txtNota_4.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtNota_4);
                txtNota_4.setBounds(5, 200, 445, 22);

                //---- label8 ----
                label8.setText("NOMBRE DEL CURSO:");
                label8.setFont(new Font("Calibri", Font.BOLD, 12));
                label8.setForeground(new Color(204, 204, 204));
                label8.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label8);
                label8.setBounds(0, 5, 455, label8.getPreferredSize().height);

                //---- txtCurso ----
                txtCurso.setBackground(new Color(13, 51, 76));
                txtCurso.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtCurso.setBorder(null);
                txtCurso.setDisabledTextColor(new Color(204, 204, 204));
                txtCurso.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtCurso.setCaretColor(new Color(204, 204, 204));
                txtCurso.setForeground(new Color(204, 204, 204));
                txtCurso.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtCurso);
                txtCurso.setBounds(5, 20, 445, txtCurso.getPreferredSize().height);

                //======== panel11 ========
                {
                    panel11.setBackground(new Color(204, 204, 204));
                    panel11.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel11.getComponentCount(); i++) {
                            Rectangle bounds = panel11.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel11.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel11.setMinimumSize(preferredSize);
                        panel11.setPreferredSize(preferredSize);
                    }
                }
                panel9.add(panel11);
                panel11.setBounds(0, 42, 455, 1);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel9.getComponentCount(); i++) {
                        Rectangle bounds = panel9.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel9.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel9.setMinimumSize(preferredSize);
                    panel9.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel9);
            panel9.setBounds(40, 130, 455, 224);

            //======== panel3 ========
            {
                panel3.setBackground(new Color(11, 24, 36));
                panel3.setBorder(new LineBorder(Color.lightGray));
                panel3.setLayout(null);

                //---- label9 ----
                label9.setText("CODIGO DEL ESTUDIANTE");
                label9.setFont(new Font("Calibri", Font.BOLD, 14));
                label9.setForeground(new Color(204, 204, 204));
                label9.setHorizontalAlignment(SwingConstants.CENTER);
                panel3.add(label9);
                label9.setBounds(5, 5, 445, 20);

                //---- txtDNI ----
                txtDNI.setBackground(new Color(11, 24, 36));
                txtDNI.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtDNI.setBorder(null);
                txtDNI.setDisabledTextColor(new Color(204, 204, 204));
                txtDNI.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtDNI.setCaretColor(new Color(204, 204, 204));
                txtDNI.setForeground(new Color(204, 204, 204));
                txtDNI.setHorizontalAlignment(SwingConstants.CENTER);
                panel3.add(txtDNI);
                txtDNI.setBounds(5, 25, 445, 22);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel3.getComponentCount(); i++) {
                        Rectangle bounds = panel3.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel3.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel3.setMinimumSize(preferredSize);
                    panel3.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel3);
            panel3.setBounds(40, 60, 455, 48);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(new Rectangle(new Point(0, 0), panel1.getPreferredSize()));

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JPanel panel2;
    private JButton btnRegresar;
    private JButton btnGuardarNotas;
    private JLabel label1;
    private JPanel panel9;
    private JPanel panel12;
    private JLabel label4;
    private JTextField txtNota_1;
    private JPanel panel7;
    private JLabel label5;
    private JTextField txtNota_2;
    private JPanel panel8;
    private JLabel label6;
    private JPanel panel10;
    private JTextField txtNota_3;
    private JLabel label7;
    private JTextField txtNota_4;
    private JLabel label8;
    private JTextField txtCurso;
    private JPanel panel11;
    private JPanel panel3;
    private JLabel label9;
    private JTextField txtDNI;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
