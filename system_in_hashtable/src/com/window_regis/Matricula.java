/*
 * Created by JFormDesigner on Sat Jun 17 15:15:52 COT 2017
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
public class Matricula extends JFrame {

    Hashtable<Integer, Estudiante> tabla_estudiante;

    public Matricula() {
        initComponents();
        tabla_estudiante = new Hashtable<Integer, Estudiante>();
    }

    private void btnMatriculaActionPerformed(ActionEvent e) {
        registar_estudiante(tabla_estudiante);
    }

    private void registar_estudiante(Hashtable<Integer, Estudiante> tabla_estudiante) {
        Estudiante study = new Estudiante();

        study.setDNI(Integer.parseInt(txtDNI.getText()));
        study.setNombres(txtNombres.getText());
        study.setApellidos(txtApellidos.getText());
        study.setDireccion(txtDireccion.getText());
        study.setCelular(Integer.parseInt(txtCelular.getText()));
        study.setFecha_Nacimiento(txtNacimiento.getText());
        study.setGrado(txtGrado.getText());

        if (tabla_estudiante.containsKey(study.getDNI()) == false){
            tabla_estudiante.put(study.getDNI(), study);
            limpiar();
        }else {
            JOptionPane.showMessageDialog(null, "El estudiante ya existe!!", "Advertencia!", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void limpiar() {
        txtDNI.setText(null);
        txtNombres.setText(null);
        txtApellidos.setText(null);
        txtDireccion.setText(null);
        txtCelular.setText(null);
        txtNacimiento.setText(null);
        txtGrado.setText(null);
        txtDNI.grabFocus();
    }

    private void btnBuscarActionPerformed(ActionEvent e) {
        Ventana_1 ventana_1 = new Ventana_1(this, true, tabla_estudiante);
        ventana_1.setVisible(true);
    }

    public Hashtable<Integer, Estudiante> data(){
        return tabla_estudiante;
    }

    private void btnVerListaActionPerformed(ActionEvent e) {
        Ventana_2 ventana_2 = new Ventana_2(this, true, tabla_estudiante);
        ventana_2.setVisible(true);
    }

    private void btnSalirActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    private void btnIngresarNotaActionPerformed(ActionEvent e) {
        Ventana_Notas ventana_notas = new Ventana_Notas(this, true, tabla_estudiante);
        ventana_notas.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        panel9 = new JPanel();
        label2 = new JLabel();
        txtDNI = new JTextField();
        panel5 = new JPanel();
        panel12 = new JPanel();
        label3 = new JLabel();
        panel6 = new JPanel();
        txtNombres = new JTextField();
        label4 = new JLabel();
        txtApellidos = new JTextField();
        panel7 = new JPanel();
        label5 = new JLabel();
        txtDireccion = new JTextField();
        panel8 = new JPanel();
        label6 = new JLabel();
        panel10 = new JPanel();
        txtCelular = new JTextField();
        label7 = new JLabel();
        panel11 = new JPanel();
        txtNacimiento = new JTextField();
        label8 = new JLabel();
        txtGrado = new JTextField();
        panel13 = new JPanel();
        panel3 = new JPanel();
        btnVerLista = new JButton();
        btnSalir = new JButton();
        btnMatricula = new JButton();
        btnBuscar = new JButton();
        btnIngresarNota = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(15, 52, 76));
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("SISTEMA DE MATRICULA");
            label1.setFont(new Font("Berlin Sans FB", Font.BOLD, 28));
            label1.setForeground(new Color(0, 153, 153));
            panel1.add(label1);
            label1.setBounds(new Rectangle(new Point(110, 0), label1.getPreferredSize()));

            //======== panel9 ========
            {
                panel9.setBorder(new LineBorder(Color.lightGray));
                panel9.setBackground(new Color(15, 52, 76));
                panel9.setLayout(null);

                //---- label2 ----
                label2.setText("CODIGO:");
                label2.setFont(new Font("Calibri", Font.BOLD, 12));
                label2.setForeground(new Color(204, 204, 204));
                label2.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label2);
                label2.setBounds(0, 5, 455, label2.getPreferredSize().height);

                //---- txtDNI ----
                txtDNI.setBackground(new Color(13, 51, 76));
                txtDNI.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtDNI.setBorder(null);
                txtDNI.setDisabledTextColor(new Color(204, 204, 204));
                txtDNI.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtDNI.setCaretColor(new Color(204, 204, 204));
                txtDNI.setForeground(new Color(204, 204, 204));
                txtDNI.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtDNI);
                txtDNI.setBounds(5, 19, 445, txtDNI.getPreferredSize().height);

                //======== panel5 ========
                {
                    panel5.setBackground(new Color(204, 204, 204));
                    panel5.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel5.getComponentCount(); i++) {
                            Rectangle bounds = panel5.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel5.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel5.setMinimumSize(preferredSize);
                        panel5.setPreferredSize(preferredSize);
                    }
                }
                panel9.add(panel5);
                panel5.setBounds(0, 41, 455, 1);

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

                //---- label3 ----
                label3.setText("NOMBRES:");
                label3.setFont(new Font("Calibri", Font.BOLD, 12));
                label3.setForeground(new Color(204, 204, 204));
                label3.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label3);
                label3.setBounds(0, 45, 455, 15);

                //======== panel6 ========
                {
                    panel6.setBackground(new Color(204, 204, 204));
                    panel6.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel6.getComponentCount(); i++) {
                            Rectangle bounds = panel6.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel6.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel6.setMinimumSize(preferredSize);
                        panel6.setPreferredSize(preferredSize);
                    }
                }
                panel9.add(panel6);
                panel6.setBounds(0, 82, 455, 1);

                //---- txtNombres ----
                txtNombres.setBackground(new Color(13, 51, 76));
                txtNombres.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtNombres.setBorder(null);
                txtNombres.setDisabledTextColor(new Color(204, 204, 204));
                txtNombres.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtNombres.setCaretColor(new Color(204, 204, 204));
                txtNombres.setForeground(new Color(204, 204, 204));
                txtNombres.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtNombres);
                txtNombres.setBounds(5, 60, 445, 22);

                //---- label4 ----
                label4.setText("APELLIDOS:");
                label4.setFont(new Font("Calibri", Font.BOLD, 12));
                label4.setForeground(new Color(204, 204, 204));
                label4.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label4);
                label4.setBounds(0, 90, 455, 15);

                //---- txtApellidos ----
                txtApellidos.setBackground(new Color(13, 51, 76));
                txtApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtApellidos.setBorder(null);
                txtApellidos.setDisabledTextColor(new Color(204, 204, 204));
                txtApellidos.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtApellidos.setCaretColor(new Color(204, 204, 204));
                txtApellidos.setForeground(new Color(204, 204, 204));
                txtApellidos.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtApellidos);
                txtApellidos.setBounds(5, 105, 445, 22);

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
                panel7.setBounds(0, 127, 455, 1);

                //---- label5 ----
                label5.setText("DIRECCION:");
                label5.setFont(new Font("Calibri", Font.BOLD, 12));
                label5.setForeground(new Color(204, 204, 204));
                label5.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label5);
                label5.setBounds(0, 135, 455, 15);

                //---- txtDireccion ----
                txtDireccion.setBackground(new Color(13, 51, 76));
                txtDireccion.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtDireccion.setBorder(null);
                txtDireccion.setDisabledTextColor(new Color(204, 204, 204));
                txtDireccion.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtDireccion.setCaretColor(new Color(204, 204, 204));
                txtDireccion.setForeground(new Color(204, 204, 204));
                txtDireccion.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtDireccion);
                txtDireccion.setBounds(5, 150, 445, 22);

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
                panel8.setBounds(0, 172, 455, 1);

                //---- label6 ----
                label6.setText("CELULAR:");
                label6.setFont(new Font("Calibri", Font.BOLD, 12));
                label6.setForeground(new Color(204, 204, 204));
                label6.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label6);
                label6.setBounds(0, 180, 455, 15);

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
                panel10.setBounds(0, 217, 455, 1);

                //---- txtCelular ----
                txtCelular.setBackground(new Color(13, 51, 76));
                txtCelular.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtCelular.setBorder(null);
                txtCelular.setDisabledTextColor(new Color(204, 204, 204));
                txtCelular.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtCelular.setCaretColor(new Color(204, 204, 204));
                txtCelular.setForeground(new Color(204, 204, 204));
                txtCelular.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtCelular);
                txtCelular.setBounds(5, 195, 445, 22);

                //---- label7 ----
                label7.setText("FECHA DE NACIMIENTO:");
                label7.setFont(new Font("Calibri", Font.BOLD, 12));
                label7.setForeground(new Color(204, 204, 204));
                label7.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label7);
                label7.setBounds(0, 225, 455, 15);

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
                panel11.setBounds(0, 262, 455, 1);

                //---- txtNacimiento ----
                txtNacimiento.setBackground(new Color(13, 51, 76));
                txtNacimiento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtNacimiento.setBorder(null);
                txtNacimiento.setDisabledTextColor(new Color(204, 204, 204));
                txtNacimiento.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtNacimiento.setCaretColor(new Color(204, 204, 204));
                txtNacimiento.setForeground(new Color(204, 204, 204));
                txtNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtNacimiento);
                txtNacimiento.setBounds(5, 240, 445, 22);

                //---- label8 ----
                label8.setText("GRADO:");
                label8.setFont(new Font("Calibri", Font.BOLD, 12));
                label8.setForeground(new Color(204, 204, 204));
                label8.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(label8);
                label8.setBounds(0, 270, 455, 15);

                //---- txtGrado ----
                txtGrado.setBackground(new Color(13, 51, 76));
                txtGrado.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtGrado.setBorder(null);
                txtGrado.setDisabledTextColor(new Color(204, 204, 204));
                txtGrado.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtGrado.setCaretColor(new Color(204, 204, 204));
                txtGrado.setForeground(new Color(204, 204, 204));
                txtGrado.setHorizontalAlignment(SwingConstants.CENTER);
                panel9.add(txtGrado);
                txtGrado.setBounds(5, 285, 445, 22);

                //======== panel13 ========
                {
                    panel13.setBackground(new Color(204, 204, 204));
                    panel13.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel13.getComponentCount(); i++) {
                            Rectangle bounds = panel13.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel13.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel13.setMinimumSize(preferredSize);
                        panel13.setPreferredSize(preferredSize);
                    }
                }
                panel9.add(panel13);
                panel13.setBounds(0, 307, 455, 1);

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
            panel9.setBounds(35, 35, 455, 308);

            //======== panel3 ========
            {
                panel3.setBackground(new Color(27, 32, 35));
                panel3.setLayout(null);

                //---- btnVerLista ----
                btnVerLista.setText("VER LISTA DE MATRICULA");
                btnVerLista.setBackground(new Color(52, 96, 87));
                btnVerLista.setFont(new Font("Segoe UI", Font.BOLD, 12));
                btnVerLista.setForeground(new Color(204, 204, 204));
                btnVerLista.setIcon(new ImageIcon("C:\\Users\\Ccama\\IdeaProjects\\system_in_hashtable\\recursos\\green-address-book-icon.png"));
                btnVerLista.addActionListener(e -> btnVerListaActionPerformed(e));
                panel3.add(btnVerLista);
                btnVerLista.setBounds(15, 70, 190, 32);

                //---- btnSalir ----
                btnSalir.setText("SALIR");
                btnSalir.setBackground(new Color(52, 96, 87));
                btnSalir.setFont(new Font("Segoe UI", Font.BOLD, 12));
                btnSalir.setForeground(new Color(204, 204, 204));
                btnSalir.setIcon(new ImageIcon("C:\\Users\\Ccama\\IdeaProjects\\system_in_hashtable\\recursos\\red-cross-icon.png"));
                btnSalir.addActionListener(e -> btnSalirActionPerformed(e));
                panel3.add(btnSalir);
                btnSalir.setBounds(210, 70, 100, 32);

                //---- btnMatricula ----
                btnMatricula.setText("MATRICULAR");
                btnMatricula.setBackground(new Color(52, 96, 87));
                btnMatricula.setFont(new Font("Segoe UI", Font.BOLD, 12));
                btnMatricula.setForeground(new Color(204, 204, 204));
                btnMatricula.setIcon(new ImageIcon("C:\\Users\\atil_\\IdeaProjects\\system_in_hashtable\\recursos\\green-disk-icon.png"));
                btnMatricula.addActionListener(e -> btnMatriculaActionPerformed(e));
                panel3.add(btnMatricula);
                btnMatricula.setBounds(15, 25, 190, 32);

                //---- btnBuscar ----
                btnBuscar.setText("BUSCAR");
                btnBuscar.setBackground(new Color(52, 96, 87));
                btnBuscar.setFont(new Font("Segoe UI", Font.BOLD, 12));
                btnBuscar.setForeground(new Color(204, 204, 204));
                btnBuscar.setIcon(new ImageIcon("C:\\Users\\Ccama\\IdeaProjects\\system_in_hashtable\\recursos\\blue-search-icon.png"));
                btnBuscar.addActionListener(e -> btnBuscarActionPerformed(e));
                panel3.add(btnBuscar);
                btnBuscar.setBounds(315, 25, 195, 32);

                //---- btnIngresarNota ----
                btnIngresarNota.setText("INGRESAR NOTAS");
                btnIngresarNota.setBackground(new Color(52, 96, 87));
                btnIngresarNota.setFont(new Font("Segoe UI", Font.BOLD, 12));
                btnIngresarNota.setForeground(new Color(204, 204, 204));
                btnIngresarNota.setIcon(new ImageIcon("C:\\Users\\Ccama\\IdeaProjects\\system_in_hashtable\\recursos\\green-document-plus-icon.png"));
                btnIngresarNota.addActionListener(e -> btnIngresarNotaActionPerformed(e));
                panel3.add(btnIngresarNota);
                btnIngresarNota.setBounds(315, 70, 195, 32);

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
            panel3.setBounds(0, 360, 530, 125);

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
        panel1.setBounds(0, 0, 530, 485);

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
    private JLabel label1;
    private JPanel panel9;
    private JLabel label2;
    private JTextField txtDNI;
    private JPanel panel5;
    private JPanel panel12;
    private JLabel label3;
    private JPanel panel6;
    private JTextField txtNombres;
    private JLabel label4;
    private JTextField txtApellidos;
    private JPanel panel7;
    private JLabel label5;
    private JTextField txtDireccion;
    private JPanel panel8;
    private JLabel label6;
    private JPanel panel10;
    private JTextField txtCelular;
    private JLabel label7;
    private JPanel panel11;
    private JTextField txtNacimiento;
    private JLabel label8;
    private JTextField txtGrado;
    private JPanel panel13;
    private JPanel panel3;
    private JButton btnVerLista;
    private JButton btnSalir;
    private JButton btnMatricula;
    private JButton btnBuscar;
    private JButton btnIngresarNota;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
