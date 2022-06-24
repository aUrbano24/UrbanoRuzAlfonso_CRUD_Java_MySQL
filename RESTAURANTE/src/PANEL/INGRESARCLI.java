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
public class INGRESARCLI extends javax.swing.JPanel {

PreparedStatement ps;
ResultSet rs;    
    
    /**
     * Creates new form INGRESARCLI
     */
    public INGRESARCLI() {
        initComponents();
    }

void mostrardatos (){
    
   DefaultTableModel modelo = new DefaultTableModel();
     
    modelo.addColumn("ID ");
      modelo.addColumn("TIPO ID ");
        modelo.addColumn("NOMBRES");
          modelo.addColumn("APELLIDOS");
            modelo.addColumn("DIRECCION");
              modelo.addColumn("APELLIDOS");
           tbclientes.setModel(modelo);
           
           String[] registros= new String[50];
          
           Connection conexion = null;
    try{
           conexion = CONEXION.getConnection();
            ps= conexion.prepareStatement("select * from clientes ");
            rs = ps.executeQuery();
    
    while(rs.next()){
    
        registros[0]=rs.getString("idclientes");
        registros[1]=rs.getString("identificacion");
        registros[2]=rs.getString("nombres");
        registros[3]=rs.getString("apellidos");
        registros[4]=rs.getString("direccion");
        registros[5]=rs.getString("telefono");
    
        modelo.addRow(registros);
        
    tbclientes.setModel(modelo);
    }

     }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "error de conexion" +ex);
        }
    }

    public void limpiar (){
        
        campoapellidocliente.setText(null);
        campodireccioncliente.setText(null);
        campoidcliente.setText(null);
        camponombrecliente.setText(null);
        campotipocliente.setText(null);
        campotelefonocliente.setText(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCONEMPLEADO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtoninsregistro = new javax.swing.JButton();
        campoidcliente = new javax.swing.JTextField();
        campotipocliente = new javax.swing.JTextField();
        camponombrecliente = new javax.swing.JTextField();
        campodireccioncliente = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        campoapellidocliente = new javax.swing.JTextField();
        jButtonconsultar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        campotelefonocliente = new javax.swing.JTextField();
        jButtonpreingre = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbclientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(15, 153, 255));

        PCONEMPLEADO.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRES");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID DEL CLIENTE");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APELLIDOS");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIPO DE ID");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DIRECCION");

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

        campoidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoidclienteActionPerformed(evt);
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

        campoapellidocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoapellidoclienteActionPerformed(evt);
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
        jLabel7.setText("TELEFONO");

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

        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbclientes);

        jButton1.setText("MOSTRAR DATOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PCONEMPLEADOLayout = new javax.swing.GroupLayout(PCONEMPLEADO);
        PCONEMPLEADO.setLayout(PCONEMPLEADOLayout);
        PCONEMPLEADOLayout.setHorizontalGroup(
            PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(45, 45, 45)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campotipocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(camponombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoapellidocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campotelefonocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campodireccioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addComponent(campoidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199)
                                .addComponent(jButton1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addComponent(jButtoninsregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCONEMPLEADOLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonpreingre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
            .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(637, Short.MAX_VALUE)))
        );
        PCONEMPLEADOLayout.setVerticalGroup(
            PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCONEMPLEADOLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addComponent(campoidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(campotipocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(camponombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(campoapellidocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campodireccioncliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(campotelefonocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonpreingre)
                        .addGap(17, 17, 17)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtoninsregistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel2)
                    .addContainerGap(394, Short.MAX_VALUE)))
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REGISTRO MODULO CLIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PCONEMPLEADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PCONEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoninsregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsregistroActionPerformed

        Connection conexion = null;

        try{
            conexion = CONEXION.getConnection();

            ps= conexion.prepareStatement("insert into clientes(idclientes,identificacion,nombres,apellidos,direccion,telefono) values (?,?,?,?,?,?)");
            ps.setInt(1,Integer.parseInt(campoidcliente.getText()));
            ps.setString(2, campotipocliente.getText());
            ps.setString(3, camponombrecliente.getText());
            ps.setString(4, campoapellidocliente.getText());
            ps.setString(5, campodireccioncliente.getText());
            ps.setString(6, campotelefonocliente.getText());

            int resultado = ps.executeUpdate();
            mostrardatos ();
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

    private void campoidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoidclienteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Connection conexion = null;
     
     try{
         conexion = CONEXION.getConnection(); 
         
         ps= conexion.prepareStatement("delete from restaurante.clientes where idclientes=?");
         ps.setInt(1,Integer.parseInt(campoidcliente.getText()));

         
         int resultado = ps.executeUpdate();
         mostrardatos ();
         if(resultado>0){
             JOptionPane.showMessageDialog(null, "eliminacion exitosa");
             
         } else {
             
             JOptionPane.showMessageDialog(null, "registro no existe");
         }
         
         conexion.close();
         
         limpiar();
         
     }catch(Exception ex){
         
         JOptionPane.showMessageDialog(null, "error de conexion" +ex);
     }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void campoapellidoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoapellidoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoapellidoclienteActionPerformed

    private void jButtonconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonconsultarActionPerformed

        Connection conexion = null;

        try{
            conexion = CONEXION.getConnection();

            ps= conexion.prepareStatement("select * from clientes where idclientes=?");
            ps.setInt(1,Integer.parseInt(campoidcliente.getText()));
            rs = ps.executeQuery();

            if(rs.next()){

                campoidcliente.setText(rs.getString("idclientes"));
                campotipocliente.setText(rs.getString("identificacion"));
                camponombrecliente.setText(rs.getString("nombres"));
                campoapellidocliente.setText(rs.getString("apellidos"));
                campodireccioncliente.setText(rs.getString("direccion"));
                campotelefonocliente.setText(rs.getString("telefono"));

            } else {

                JOptionPane.showMessageDialog(null, "el registro no existe");
                limpiar();
            }

            conexion.close();

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "error de conexion" +ex);
        }

    }//GEN-LAST:event_jButtonconsultarActionPerformed

    private void jButtonpreingreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpreingreActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonpreingreActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed

       Connection conexion = null;
     
       try{
         conexion = CONEXION.getConnection(); 
         
         ps= conexion.prepareStatement("UPDATE clientes SET identificacion='"+campotipocliente.getText()+"'"
           + ", nombres='"+camponombrecliente.getText()+"',apellidos='"+campoapellidocliente.getText()+"'"
   + ",direccion='"+campodireccioncliente.getText()+"', telefono='"+campotelefonocliente.getText()+"' where idclientes ='"+campoidcliente.getText()+"'");
 
         int resultado = ps.executeUpdate();
         mostrardatos ();
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
    }//GEN-LAST:event_actualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    mostrardatos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PCONEMPLEADO;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField campoapellidocliente;
    private javax.swing.JTextField campodireccioncliente;
    private javax.swing.JTextField campoidcliente;
    private javax.swing.JTextField camponombrecliente;
    private javax.swing.JTextField campotelefonocliente;
    private javax.swing.JTextField campotipocliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonconsultar;
    private javax.swing.JButton jButtoninsregistro;
    private javax.swing.JButton jButtonpreingre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbclientes;
    // End of variables declaration//GEN-END:variables


}
