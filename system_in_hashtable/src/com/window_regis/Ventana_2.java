/*
 * Created by JFormDesigner on Sat Jun 17 18:26:00 COT 2017
 */

package com.window_regis;

import com.model_regis.Estudiante;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.*;

/**
 * @author Gonzalo
 */
public class Ventana_2 extends JFrame {

    public Ventana_2(Matricula matricula, boolean b, Hashtable<Integer, Estudiante> tabla_estudiante) {
        initComponents();
        mostrar_estdudiantes(tabla_estudiante);
    }
    private void mostrar_estdudiantes(Hashtable<Integer, Estudiante> tabla_estudiante) {
        String mensaje = "";
        int i = 1;

        Enumeration<Estudiante> elemento = tabla_estudiante.elements();
        while (elemento.hasMoreElements()){
            Estudiante estudiante = elemento.nextElement();
            mensaje += "-------------------- " + i + " --------------------" +
                    "\nCódigo de Matrícula: " + estudiante.getDNI() +
                    "\nNombres: " + estudiante.getNombres() +
                    "\nApellidos: " + estudiante.getApellidos() +
                    "\nCelular: " +  estudiante.getCelular() +
                    "\nDireccion: " + estudiante.getDireccion() +
                    "\n-------------------------------------------\n";
            i++;
        }
        textCampoLista.setText(mensaje);
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
        textCampoLista = new JTextArea();

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
                btnRegresar.setBounds(330, 10, 175, 32);

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

                //---- textCampoLista ----
                textCampoLista.setBackground(new Color(15, 52, 76));
                textCampoLista.setFont(new Font(Font.MONOSPACED, Font.BOLD, 16));
                textCampoLista.setForeground(new Color(204, 204, 204));
                textCampoLista.setDisabledTextColor(new Color(204, 204, 204));
                textCampoLista.setCaretColor(new Color(204, 204, 204));
                textCampoLista.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                textCampoLista.setMargin(new Insets(10, 10, 10, 10));
                scrollPane1.setViewportView(textCampoLista);
            }
            panel1.add(scrollPane1);
            scrollPane1.setBounds(35, 45, 455, 370);

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
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextArea textCampoLista;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
