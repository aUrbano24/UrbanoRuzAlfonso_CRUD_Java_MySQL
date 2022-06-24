
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
public class PEMPLEADOS extends javax.swing.JPanel {

    PreparedStatement ps;
    ResultSet rs;
    


    public PEMPLEADOS() {
        initComponents();
    }

    void mostrardatos (){
    
   DefaultTableModel modelo = new DefaultTableModel();
     
    modelo.addColumn("ID ");
      modelo.addColumn("TIPO ID ");
        modelo.addColumn("NOMBRES");
          modelo.addColumn("APELLIDOS");
            modelo.addColumn("DESCRIPCION");
           tbempleados.setModel(modelo);
           
           String[] registros= new String[50];
          
           Connection conexion = null;

    try{
           conexion = CONEXION.getConnection();
            ps= conexion.prepareStatement("select * from empleados ");
            //ps.setInt(1,Integer.parseInt(campoidproducto.getText()));
            rs = ps.executeQuery();
    
    while(rs.next()){
    
        registros[0]=rs.getString("identificacion");
        registros[1]=rs.getString("tidentificacion");
        registros[2]=rs.getString("nombres");
        registros[3]=rs.getString("apellidos");
        registros[4]=rs.getString("direccion");
    
        modelo.addRow(registros);

    tbempleados.setModel(modelo);
    }

     }catch(Exception ex){

            JOptionPane.showMessageDialog(null, "error de conexion" +ex);
        }
    }

    public void limpiar (){
        
        campoapellidoempleado.setText(null);
        campodireccionempleado.setText(null);
        campoidempleado.setText(null);
        camponombreempleado.setText(null);
        campotipoempleado.setText(null);
        
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
        campoidempleado = new javax.swing.JTextField();
        campotipoempleado = new javax.swing.JTextField();
        camponombreempleado = new javax.swing.JTextField();
        campodireccionempleado = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        campoapellidoempleado = new javax.swing.JTextField();
        jButtonconsultar = new javax.swing.JButton();
        jButtonpreingre = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbempleados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 255));

        PCONEMPLEADO.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRES");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NUMERO DE ID");

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

        campoidempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoidempleadoActionPerformed(evt);
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

        campoapellidoempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoapellidoempleadoActionPerformed(evt);
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

        tbempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbempleados);

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
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCONEMPLEADOLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtoninsregistro)))
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(campoidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(camponombreempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoapellidoempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campodireccionempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jButtonpreingre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campotipoempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );
        PCONEMPLEADOLayout.setVerticalGroup(
            PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(campotipoempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(camponombreempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(campoapellidoempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(campodireccionempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonpreingre)
                        .addGap(28, 28, 28)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtoninsregistro)
                            .addComponent(jButton4)
                            .addComponent(jButtonconsultar)
                            .addComponent(actualizar))))
                .addGap(59, 296, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REGISTRO MODULO EMPLEADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PCONEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PCONEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonconsultarActionPerformed
        
         Connection conexion = null;
     
     try{
         conexion = CONEXION.getConnection();
         
         ps= conexion.prepareStatement("select * from empleados where identificacion=?");
         ps.setInt(1,Integer.parseInt(campoidempleado.getText()));
         rs = ps.executeQuery();

         if(rs.next()){
             
             campoidempleado.setText(rs.getString("identificacion"));
             campotipoempleado.setText(rs.getString("tidentificacion"));
             camponombreempleado.setText(rs.getString("nombres"));
             campoapellidoempleado.setText(rs.getString("apellidos"));
             campodireccionempleado.setText(rs.getString("direccion"));
             
         } else {
             
             JOptionPane.showMessageDialog(null, "el registro no existe");
             limpiar();
         }
         
         conexion.close();
         
         
         
     }catch(Exception ex){
         
         JOptionPane.showMessageDialog(null, "error de conexion" +ex);
     }
     
        
    }//GEN-LAST:event_jButtonconsultarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        Connection conexion = null;
     
     try{
         conexion = CONEXION.getConnection(); 
         
         ps= conexion.prepareStatement("delete from restaurante.empleados where identificacion=?");
         ps.setInt(1,Integer.parseInt(campoidempleado.getText()));

         
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
     }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtoninsregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsregistroActionPerformed
        
     Connection conexion = null;
     
     try{
         conexion = CONEXION.getConnection(); 
         
         ps= conexion.prepareStatement("insert into empleados(identificacion,tidentificacion,nombres,apellidos,direccion) values (?,?,?,?,?)");
         ps.setInt(1,Integer.parseInt(campoidempleado.getText()));
         ps.setString(2, campotipoempleado.getText());
         ps.setString(3, camponombreempleado.getText());
         ps.setString(4, campoapellidoempleado.getText());
         ps.setString(5, campodireccionempleado.getText());
         
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

    private void campoapellidoempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoapellidoempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoapellidoempleadoActionPerformed

    private void campoidempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoidempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoidempleadoActionPerformed

    private void jButtonpreingreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpreingreActionPerformed
               limpiar();
    }//GEN-LAST:event_jButtonpreingreActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed

        Connection conexion = null;
     
     try{
         conexion = CONEXION.getConnection(); 
         
         ps= conexion.prepareStatement("UPDATE empleados SET tidentificacion='"+campotipoempleado.getText()+"'"
           + ", nombres='"+camponombreempleado.getText()+"',apellidos='"+campoapellidoempleado.getText()+"'"
   + ",direccion='"+campodireccionempleado.getText()+"'where identificacion ='"+campoidempleado.getText()+"'");

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
    }//GEN-LAST:event_actualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

mostrardatos();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PCONEMPLEADO;
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField campoapellidoempleado;
    private javax.swing.JTextField campodireccionempleado;
    private javax.swing.JTextField campoidempleado;
    private javax.swing.JTextField camponombreempleado;
    private javax.swing.JTextField campotipoempleado;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbempleados;
    // End of variables declaration//GEN-END:variables
}
