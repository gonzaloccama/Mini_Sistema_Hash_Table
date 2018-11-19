/*
 * Created by JFormDesigner on Sat Jun 17 17:08:36 COT 2017
 */

package com.window_regis;

import com.model_regis.Estudiante;

import java.awt.*;
import java.awt.event.*;
import java.util.Hashtable;
import javax.swing.*;

/**
 * @author Gonzalo
 */
public class Ventana_1 extends JFrame {

    Hashtable<Integer, Estudiante> tabla_estudiante;

    public Ventana_1(Matricula matricula, boolean b, Hashtable<Integer, Estudiante> tabla_estudiante) {
        initComponents();
        this.tabla_estudiante = matricula.data();
    }

    private void btnMostrarActionPerformed(ActionEvent e) {
        buscar_estudiantes(tabla_estudiante);
    }

    private void buscar_estudiantes(Hashtable<Integer, Estudiante> tabla_estudiante) {
       Integer documento = Integer.parseInt(txtBuscar.getText());
        String mensaje = "";

        if(tabla_estudiante.containsKey(documento) == true){
            Estudiante estudiante = tabla_estudiante.get(documento);

            mensaje += "-------------------------------------------" +
                    "\nCódigo de Matrícula: " + estudiante.getDNI() +
                    "\nNombres: " + estudiante.getNombres() +
                    "\nApellidos: " + estudiante.getApellidos() +
                    "\nDirección: " + estudiante.getDireccion() +
                    "\nCelular: " + estudiante.getCelular() +
                    "\nFecha de Nacimiento: " + estudiante.getFecha_Nacimiento() +
                    "\nGrado: " + estudiante.getGrado() +
                    "\nCurso: " + estudiante.getCurso() +
                    "\nPromedio: " + estudiante.getPromedio() +
                    "\n-------------------------------------------";
        }

        textCampoBuscar.setText(mensaje);
    }

    private void btnEliminarActionPerformed(ActionEvent e) {
        eliminar_estudiante(tabla_estudiante);
    }

    private void eliminar_estudiante(Hashtable<Integer, Estudiante> tabla_estudiante) {
        Integer documento = Integer.parseInt(txtBuscar.getText());
        if (tabla_estudiante.containsKey(documento)){
            tabla_estudiante.remove(documento);
        }

    }

    private void btnRegresarActionPerformed(ActionEvent e) {
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        panel2 = new JPanel();
        btnRegresar = new JButton();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        textCampoBuscar = new JTextArea();
        panel3 = new JPanel();
        label9 = new JLabel();
        txtBuscar = new JTextField();
        panel14 = new JPanel();
        btnMostrar = new JButton();
        btnEliminar = new JButton();

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
                btnRegresar.setBounds(155, 10, 175, 32);

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
            panel2.setBounds(0, 430, 530, 55);

            //---- label1 ----
            label1.setText("BUSCAR ESTUDIANTE");
            label1.setFont(new Font("Berlin Sans FB", Font.BOLD, 28));
            label1.setForeground(new Color(0, 153, 153));
            panel1.add(label1);
            label1.setBounds(120, 5, 290, 36);

            //======== scrollPane1 ========
            {

                //---- textCampoBuscar ----
                textCampoBuscar.setBackground(new Color(15, 52, 76));
                textCampoBuscar.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
                textCampoBuscar.setForeground(new Color(204, 204, 204));
                textCampoBuscar.setDisabledTextColor(new Color(204, 204, 204));
                textCampoBuscar.setCaretColor(new Color(204, 204, 204));
                textCampoBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                textCampoBuscar.setMargin(new Insets(10, 10, 10, 10));
                scrollPane1.setViewportView(textCampoBuscar);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(35, 130, 455, 285);

            //======== panel3 ========
            {
                panel3.setBackground(new Color(11, 24, 36));
                panel3.setLayout(null);

                //---- label9 ----
                label9.setText("BUSCAR POR CODIGO:");
                label9.setFont(new Font("Calibri", Font.BOLD, 14));
                label9.setForeground(new Color(204, 204, 204));
                label9.setHorizontalAlignment(SwingConstants.CENTER);
                panel3.add(label9);
                label9.setBounds(17, 10, 145, 20);

                //---- txtBuscar ----
                txtBuscar.setBackground(new Color(11, 24, 36));
                txtBuscar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
                txtBuscar.setBorder(null);
                txtBuscar.setDisabledTextColor(new Color(204, 204, 204));
                txtBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                txtBuscar.setCaretColor(new Color(204, 204, 204));
                txtBuscar.setForeground(new Color(204, 204, 204));
                txtBuscar.setHorizontalAlignment(SwingConstants.CENTER);
                panel3.add(txtBuscar);
                txtBuscar.setBounds(160, 4, 345, 22);

                //======== panel14 ========
                {
                    panel14.setBackground(new Color(204, 204, 204));
                    panel14.setLayout(null);

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel14.getComponentCount(); i++) {
                            Rectangle bounds = panel14.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel14.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel14.setMinimumSize(preferredSize);
                        panel14.setPreferredSize(preferredSize);
                    }
                }
                panel3.add(panel14);
                panel14.setBounds(160, 26, 345, 1);

                //---- btnMostrar ----
                btnMostrar.setText("MOSTRAR");
                btnMostrar.setBackground(new Color(52, 96, 87));
                btnMostrar.setFont(new Font("Segoe UI", Font.BOLD, 12));
                btnMostrar.setForeground(new Color(204, 204, 204));
                btnMostrar.setIcon(new ImageIcon("C:\\Users\\Ccama\\IdeaProjects\\system_in_hashtable\\recursos\\green-notes-icon.png"));
                btnMostrar.addActionListener(e -> btnMostrarActionPerformed(e));
                panel3.add(btnMostrar);
                btnMostrar.setBounds(25, 35, 180, 32);

                //---- btnEliminar ----
                btnEliminar.setText("ELIMINAR");
                btnEliminar.setBackground(new Color(52, 96, 87));
                btnEliminar.setFont(new Font("Segoe UI", Font.BOLD, 12));
                btnEliminar.setForeground(new Color(204, 204, 204));
                btnEliminar.setIcon(new ImageIcon("C:\\Users\\Ccama\\IdeaProjects\\system_in_hashtable\\recursos\\red-document-cross-icon.png"));
                btnEliminar.addActionListener(e -> btnEliminarActionPerformed(e));
                panel3.add(btnEliminar);
                btnEliminar.setBounds(330, 35, 175, 32);

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
            panel3.setBounds(0, 40, 530, 75);

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
        panel1.setBounds(0, 0, panel1.getPreferredSize().width, 485);

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
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextArea textCampoBuscar;
    private JPanel panel3;
    private JLabel label9;
    private JTextField txtBuscar;
    private JPanel panel14;
    private JButton btnMostrar;
    private JButton btnEliminar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
