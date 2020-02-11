/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Entities.Discografica;
import Entities.Genero;
import Entities.Interprete;
import Vista.Menu;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sergi
 */
public class PanelAgregarAlbum extends javax.swing.JPanel
{

    private Menu ventana;
    private Object[][] matriz;

    /**
     * Creates new form PanelAgregarAlbum
     */
    public PanelAgregarAlbum(Menu ventana, List<Discografica> discograficas, List<Interprete> interpretes, List<Genero> generos)
    {
        this.ventana = ventana;
        initComponents();
        for (Genero genero : generos)
        {
            jComboBox2.addItem(genero);
        }
        for (Interprete interprete : interpretes)
        {
            jComboBox3.addItem(interprete);
        }
        for (Discografica discografica : discograficas)
        {
            jComboBox1.addItem(discografica);
        }
        for(int i = 0; i < 60; i++)
        {
            jComboBox4.addItem(""+i);
            jComboBox5.addItem(""+i);
        }
        desplegarDatos(interpretes);

        /*AbstractButton b;
        b = new AbstractButton() {};
        b.setText("EP");
        buttonGroup1.add(b);
        AbstractButton b2;
        b2 = new AbstractButton() {};
        b.setText("Album");
        buttonGroup1.add(b2);
         */
    }

    public void desplegarDatos(List<Interprete> interpretes)
    {
        String[] columns =
        {
            "Cod Artista", "Nombre", "Pais"
        };
        matriz = new Object[interpretes.size()][columns.length];
        for (int i = 0; i < interpretes.size(); i++)
        {
            String nombre = interpretes.get(i).getNombreArtista();
            if (nombre == null || nombre.equals(""))
            {
                nombre = interpretes.get(i).getNombreReal();
            }
            matriz[i][0] = interpretes.get(i).getCodInterprete();
            matriz[i][1] = nombre;
            matriz[i][2] = interpretes.get(i).getCodPais();
        }
        DefaultTableModel model = new DefaultTableModel(matriz, columns);
        jTable1.setModel(model);
        jScrollPane1.setViewportView(jTable1);
        repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelAlbum = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextFieldNAlbum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        FormattedFecha = new javax.swing.JFormattedTextField();
        ButtonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TextFieldTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ButtonAgregarCancion = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setText("Ingrese el nombre del álbum");

        jLabel2.setText("Ingrese la fecha de lanzamiento (DD/MM/YYYY)");

        jLabel3.setText("Seleccione la discografica");

        FormattedFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        ButtonGuardar.setText("Guardar");
        ButtonGuardar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonGuardarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        TextFieldTitulo.setEnabled(false);

        jLabel4.setText("Escriba el nombre de la canción");

        jComboBox2.setEnabled(false);

        jLabel5.setText("Seleccione el género");

        jComboBox3.setEnabled(false);

        jLabel6.setText("Seleccione el Artista Principal");

        jLabel7.setText("Seleccione los Artistas Secundarios");

        ButtonAgregarCancion.setText("Agregar Canción");
        ButtonAgregarCancion.setEnabled(false);
        ButtonAgregarCancion.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ButtonAgregarCancionActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("EP");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Completo");

        jComboBox4.setEnabled(false);

        jComboBox5.setEnabled(false);

        jLabel8.setText("Seleccione la duración");

        jLabel9.setText("m");

        jLabel10.setText("s");

        javax.swing.GroupLayout panelAlbumLayout = new javax.swing.GroupLayout(panelAlbum);
        panelAlbum.setLayout(panelAlbumLayout);
        panelAlbumLayout.setHorizontalGroup(
            panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlbumLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlbumLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 393, Short.MAX_VALUE))
                    .addGroup(panelAlbumLayout.createSequentialGroup()
                        .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonAgregarCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addGroup(panelAlbumLayout.createSequentialGroup()
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(panelAlbumLayout.createSequentialGroup()
                                .addComponent(TextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, 0, 108, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(panelAlbumLayout.createSequentialGroup()
                        .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldNAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(FormattedFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonGuardar))
                        .addGap(84, 84, 84)
                        .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(panelAlbumLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelAlbumLayout.setVerticalGroup(
            panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlbumLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldNAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FormattedFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonGuardar)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(19, 19, 19)
                .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAlbumLayout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonAgregarCancion))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgregarCancionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonAgregarCancionActionPerformed
    {//GEN-HEADEREND:event_ButtonAgregarCancionActionPerformed
        int[] ids = jTable1.getSelectedRows();
        List<BigInteger> idsArtistas = new ArrayList<BigInteger>();
        for (int i = 0; i < ids.length; i++)
        {
            int id = ids[i];
            BigInteger id_i = (BigInteger)matriz[id][0];
            idsArtistas.add(id_i);
        }
        ventana.AgregarCancion(TextFieldTitulo.getText(), (Genero)jComboBox2.getSelectedItem(),
                (Interprete)jComboBox3.getSelectedItem(), idsArtistas, Integer.parseInt((String)jComboBox5.getSelectedItem()), Integer.parseInt((String)jComboBox4.getSelectedItem()));
    }//GEN-LAST:event_ButtonAgregarCancionActionPerformed

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ButtonGuardarActionPerformed
    {//GEN-HEADEREND:event_ButtonGuardarActionPerformed
        String selection = "";

        for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();)
        {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected())
            {
                selection = button.getText();
            }
        }

        boolean guardado = ventana.AgregarAlbum(TextFieldNAlbum.getText(), FormattedFecha.getText(), (Discografica) jComboBox1.getSelectedItem(), selection);
        if (guardado)
        {
            ButtonAgregarCancion.setEnabled(true);
            ButtonGuardar.setEnabled(false);
            FormattedFecha.setEnabled(false);
            TextFieldNAlbum.setEnabled(false);
            TextFieldTitulo.setEnabled(true);
            jComboBox1.setEnabled(false);
            jComboBox2.setEnabled(true);
            jComboBox3.setEnabled(true);
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
            jTable1.setEnabled(true);
            jScrollPane1.setEnabled(true);
            jComboBox4.setEnabled(true);
            jComboBox5.setEnabled(true);
        }
    }//GEN-LAST:event_ButtonGuardarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton1ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregarCancion;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JFormattedTextField FormattedFecha;
    private javax.swing.JTextField TextFieldNAlbum;
    private javax.swing.JTextField TextFieldTitulo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Discografica> jComboBox1;
    private javax.swing.JComboBox<Genero> jComboBox2;
    private javax.swing.JComboBox<Interprete> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelAlbum;
    // End of variables declaration//GEN-END:variables

    void actualizar(List<Interprete> interpretes)
    {
        desplegarDatos(interpretes);
        jComboBox3.removeAllItems();
        for (Interprete interprete : interpretes)
        {
            jComboBox3.addItem(interprete);
        }
    }
}
