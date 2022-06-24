/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PANEL;


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alejoz
 */
public class INGRESARPRO extends javax.swing.JPanel {

    /**
     * Creates new form INGRESARPRO
     */
    public INGRESARPRO() {
        initComponents();
     
    }
    
    void mostrardatos (){
    
   DefaultTableModel modelo = new DefaultTableModel();
     
    modelo.addColumn("ID ");
      modelo.addColumn("NOMBRE ");
        modelo.addColumn("PRECIO");
          modelo.addColumn("DESCRIPCION");
           tbproductos.setModel(modelo);
           
           String[] registros= new String[50];
          
           Connection conexion = null;
           
   
    try{
           conexion = CONEXION.getConnection();
            ps= conexion.prepareStatement("select * from productos ");
            //ps.setInt(1,Integer.parseInt(campoidproducto.getText()));
            rs = ps.executeQuery();
    
    while(rs.next()){
    
        registros[0]=rs.getString("idproducto");
        registros[1]=rs.getString("nombre");
        registros[2]=rs.getString("precio");
        registros[3]=rs.getString("descripcion");
    
        modelo.addRow(registros);
        
    
    tbproductos.setModel(modelo);
    }

     }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "error de conexion" +ex);
        }
    }

    public void limpiar (){
 
        campoidproducto.setText(null);
        camponombreproducto.setText(null);
        campodescripcionpro.setText(null);
        campopreciopro.setText(null);
        
    }
    
    PreparedStatement ps;
    ResultSet rs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PCONEMPLEADO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtoninsregistro = new javax.swing.JButton();
        campoidproducto = new javax.swing.JTextField();
        camponombreproducto = new javax.swing.JTextField();
        campopreciopro = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButtonconsultar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        campodescripcionpro = new javax.swing.JTextField();
        jButtonpreingre = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbproductos = new javax.swing.JTable();
        mostrardatos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(15, 153, 255));

        PCONEMPLEADO.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE DEL PRODUCTO");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID DEL PRODUCTO");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRECIO");

        jButtoninsregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ADICIONAR.png"))); // NOI18N
        jButtoninsregistro.setText("INSERTAR REGISTRO");
        jButtoninsregistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtoninsregistro.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtoninsregistro.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtoninsregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninsregistroActionPerformed(evt);
            }
        });

        campoidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoidproductoActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BORRAR.png"))); // NOI18N
        jButton4.setText("BORRAR REGISTRO");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BUSCAR.png"))); // NOI18N
        jButtonconsultar.setText("CONSULTAR");
        jButtonconsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonconsultar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonconsultar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButtonconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonconsultarActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DESCRIPCION");

        campodescripcionpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campodescripcionproActionPerformed(evt);
            }
        });

        jButtonpreingre.setText("PREPARAR INGRESO");
        jButtonpreingre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpreingreActionPerformed(evt);
            }
        });

        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ACTUALIZAR.png"))); // NOI18N
        actualizar.setText("ACTUALIZAR");
        actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        actualizar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        tbproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbproductos);

        mostrardatos.setText("MOSTRAR DATOS");
        mostrardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrardatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PCONEMPLEADOLayout = new javax.swing.GroupLayout(PCONEMPLEADO);
        PCONEMPLEADO.setLayout(PCONEMPLEADOLayout);
        PCONEMPLEADOLayout.setHorizontalGroup(
            PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButtoninsregistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonconsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualizar)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCONEMPLEADOLayout.createSequentialGroup()
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campodescripcionpro, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campopreciopro, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(camponombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addComponent(jButtonpreingre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)))
                        .addGap(39, 39, 39)))
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(mostrardatos)
                        .addGap(81, 129, Short.MAX_VALUE))
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        PCONEMPLEADOLayout.setVerticalGroup(
            PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrardatos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCONEMPLEADOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(camponombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCONEMPLEADOLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campopreciopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campodescripcionpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonpreingre)
                        .addGap(33, 33, 33)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButtoninsregistro)
                            .addComponent(jButtonconsultar)
                            .addComponent(actualizar)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRO MODULO PRODUCTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PCONEMPLEADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PCONEMPLEADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoninsregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsregistroActionPerformed

        Connection conexion = null;

        try{
            conexion = CONEXION.getConnection();

            ps= conexion.prepareStatement("insert into productos(idproducto,nombre,precio,descripcion) values (?,?,?,?)");
            ps.setInt(1,Integer.parseInt(campoidproducto.getText()));
            ps.setString(2, camponombreproducto.getText());
            ps.setString(3, campopreciopro.getText());
            ps.setString(4, campodescripcionpro.getText());
            

            int resultado = ps.executeUpdate();
            mostrardatos();
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "registro exitoso");

            } else {

                JOptionPane.showMessageDialog(null, "registro no exitoso");
            }

            conexion.close();

            limpiar();

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "error de conexion" +ex);
        }
    }//GEN-LAST:event_jButtoninsregistroActionPerformed

    private void campoidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoidproductoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Connection conexion = null;
     
     try{
         conexion = CONEXION.getConnection(); 
         
         ps= conexion.prepareStatement("delete from restaurante.productos where idproducto=?");
         ps.setInt(1,Integer.parseInt(campoidproducto.getText()));

         
         int resultado = ps.executeUpdate();
         mostrardatos();
         if(resultado>0){
             JOptionPane.showMessageDialog(null, "eliminacion exitosa");
             
         } else {
             
             JOptionPane.showMessageDialog(null, "registro no existe");
         }
         
         conexion.close();
         
         limpiar();
         
     }catch(Exception ex){
         
         JOptionPane.showMessageDialog(null, "error de conexion" +ex);
     }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonconsultarActionPerformed

        Connection conexion = null;

        try{
            conexion = CONEXION.getConnection();

            ps= conexion.prepareStatement("select * from productos where idproducto=?");
            ps.setInt(1,Integer.parseInt(campoidproducto.getText()));
            rs = ps.executeQuery();

            if(rs.next()){

                campoidproducto.setText(rs.getString("idproducto"));
                camponombreproducto.setText(rs.getString("nombre"));
                campopreciopro.setText(rs.getString("precio"));
                campodescripcionpro.setText(rs.getString("descripcion"));
                
                

            } else {

                JOptionPane.showMessageDialog(null, "el registro no existe");
                limpiar();
            }

            conexion.close();

            
        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "error de conexion" +ex);
        }
    }//GEN-LAST:event_jButtonconsultarActionPerformed

    private void campodescripcionproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campodescripcionproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campodescripcionproActionPerformed

    private void jButtonpreingreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpreingreActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonpreingreActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed

       Connection conexion = null;
     
       try{
         conexion = CONEXION.getConnection(); 
         
         ps= conexion.prepareStatement("UPDATE productos SET nombre='"+camponombreproducto.getText()+"'"
           + ", precio='"+campopreciopro.getText()+"',descripcion='"+campodescripcionpro.getText()+"'"
        + " where idproducto ='"+campoidproducto.getText()+"'");

         int resultado = ps.executeUpdate();
         mostrardatos();
         if(resultado>0){
             JOptionPane.showMessageDialog(null, "actualizacion exitosa");
             
         } else {
             
             JOptionPane.showMessageDialog(null, "error de actualizacion");
         }
         
         conexion.close();
         
         limpiar();
         
     }catch(Exception ex){
         
         JOptionPane.showMessageDialog(null, "error de conexion" +ex);
     }    
        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarActionPerformed

    private void mostrardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrardatosActionPerformed

   mostrardatos();

        // TODO add your handling code here:
    }//GEN-LAST:event_mostrardatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PCONEMPLEADO;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField campodescripcionpro;
    private javax.swing.JTextField campoidproducto;
    private javax.swing.JTextField camponombreproducto;
    private javax.swing.JTextField campopreciopro;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonconsultar;
    private javax.swing.JButton jButtoninsregistro;
    private javax.swing.JButton jButtonpreingre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mostrardatos;
    private javax.swing.JTable tbproductos;
    // End of variables declaration//GEN-END:variables
}
