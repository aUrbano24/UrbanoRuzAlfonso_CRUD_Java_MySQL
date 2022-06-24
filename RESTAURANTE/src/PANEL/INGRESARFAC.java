package PANEL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alejoz
 */
public class INGRESARFAC extends javax.swing.JPanel {

    PreparedStatement ps, ps2;
    ResultSet rs, rs2;

    public INGRESARFAC() {
        initComponents();
    }

    
   
    public void limpiar() {

        campofactura.setText(null);
        campoidcliente.setText(null);
        campoidproducto.setText(null);
        campofechafac.setText(null);
        camponomcliente.setText(null);
        campoidempleado.setText(null);
        campopreciofac.setText(null);
        campoapellidocliente.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCONEMPLEADO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtoninsregistro = new javax.swing.JButton();
        campofactura = new javax.swing.JTextField();
        campoidcliente = new javax.swing.JTextField();
        campoidproducto = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        campofechafac = new javax.swing.JTextField();
        jButtonconsultar = new javax.swing.JButton();
        btpreconsul = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        camponomcliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoapellidocliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoidempleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campopreciofac = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(15, 153, 255));

        PCONEMPLEADO.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID DEL PRODUCTO");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NUMERO DE FACTURA");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FECHA");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID DE CLIENTE");

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

        campofactura.setEditable(false);
        campofactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campofacturaActionPerformed(evt);
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

        campofechafac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campofechafacActionPerformed(evt);
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

        btpreconsul.setText("PREPARAR CONSULTA");
        btpreconsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpreconsulActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE DEL CLIENTE");

        camponomcliente.setEditable(false);
        camponomcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponomclienteActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("APELLIDO DEL CLIENTE");

        campoapellidocliente.setEditable(false);
        campoapellidocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoapellidoclienteActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID DEL EMPLEADO");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRECIO TOTAL");

        campopreciofac.setEditable(false);
        campopreciofac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campopreciofacActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AAAA-MM-DD");

        jButton1.setText("LIMPIAR REGISTRO");
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
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PCONEMPLEADOLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campopreciofac, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campofechafac, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(camponomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoapellidocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campofactura, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btpreconsul, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))))
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButtoninsregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(686, Short.MAX_VALUE))
            .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(637, Short.MAX_VALUE)))
        );
        PCONEMPLEADOLayout.setVerticalGroup(
            PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campofactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpreconsul))
                .addGap(1, 1, 1)
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(campoidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campoidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(campoidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                        .addComponent(campopreciofac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campofechafac, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(camponomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoapellidocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtoninsregistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(PCONEMPLEADOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PCONEMPLEADOLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel2)
                    .addContainerGap(416, Short.MAX_VALUE)))
        );

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REGISTRO MODULO FACTURAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PCONEMPLEADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PCONEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoninsregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsregistroActionPerformed

        Connection conexion = null;
        int actual = 0;
        try {
            conexion = CONEXION.getConnection();

            ps = conexion.prepareStatement("insert into facturas(idcliente,idproducto,fecha,idempleado) values (?,?,?,?)"); //INGRESO LOS VALORES INICIALES
            ps.setInt(1, Integer.parseInt(campoidcliente.getText()));
            ps.setInt(2, Integer.parseInt(campoidproducto.getText()));
            ps.setDate(3, Date.valueOf(campofechafac.getText()));
            ps.setInt(4, Integer.parseInt(campoidempleado.getText()));

            int resultado = ps.executeUpdate();
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "registro exitoso");

            } else {

                JOptionPane.showMessageDialog(null, "registro no exitoso");
            }

            conexion.close();


        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        }

        PreparedStatement ps;
        ResultSet rs;

        try {
            conexion = CONEXION.getConnection();

            ps = conexion.prepareStatement("SELECT MAX(idfactura) FROM restaurante.facturas"); // INICIO LA BUSQUEDA DEL VALOR GENERADO 
            rs = ps.executeQuery();

            if (rs.next()) {
                actual = rs.getInt(1);
                //JOptionPane.showMessageDialog(null, actual);

                campofactura.setText(Integer.toString(actual));

            } else {

                JOptionPane.showMessageDialog(null, "registro no exitoso");
            }

            ps2 = conexion.prepareStatement("SELECT MAX(idfactura) FROM restaurante.facturas");
            rs2 = ps.executeQuery();

            campofactura.setEditable(false);
            conexion.close();

            //limpiar();
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        }

        PreparedStatement psn;
        ResultSet rsn;
      
        try {
            conexion = CONEXION.getConnection();

            psn = conexion.prepareStatement("select c.nombres,c.apellidos,f.idfactura from restaurante.clientes as c inner join restaurante.facturas as f on c.idclientes = f.idcliente where f.idfactura=?");
            psn.setInt(1, actual);
            rsn = psn.executeQuery();

            if (rsn.next()) {

                camponomcliente.setText(rsn.getString("nombres"));
                campoapellidocliente.setText(rsn.getString("apellidos"));

            } else {

                JOptionPane.showMessageDialog(null, "registro no exitoso");
            }

            campofactura.setEditable(false);
            conexion.close();

            //limpiar();
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        }

        //PreparedStatement psn;
        //ResultSet rsn;
        try {
            conexion = CONEXION.getConnection();

            psn = conexion.prepareStatement("select p.precio,p.idproducto,f.idfactura from restaurante.productos as p inner join restaurante.facturas as f on p.idproducto = f.idproducto where p.idproducto=?");
            psn.setInt(1, Integer.parseInt(campoidproducto.getText()));
            rsn = psn.executeQuery();

            if (rsn.next()) {

                campopreciofac.setText(rsn.getString("precio"));

            } else {

                JOptionPane.showMessageDialog(null, "registro no exitoso");
            }

            campofactura.setEditable(false);
            conexion.close();
            
            //limpiar();
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        }

    }//GEN-LAST:event_jButtoninsregistroActionPerformed

    private void campofacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campofacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campofacturaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Connection conexion = null;

        try {
            conexion = CONEXION.getConnection();

            ps = conexion.prepareStatement("delete from restaurante.facturas where idfactura=?");
            ps.setInt(1, Integer.parseInt(campofactura.getText()));

            int resultado = ps.executeUpdate();
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");

            } else {

                JOptionPane.showMessageDialog(null, "registro no existe");
            }

            conexion.close();

            limpiar();

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void campofechafacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campofechafacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campofechafacActionPerformed

    private void jButtonconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonconsultarActionPerformed

        Connection conexion = null;

        try {
            conexion = CONEXION.getConnection();

            ps = conexion.prepareStatement("select p.precio,p.idproducto,f.idfactura,f.idcliente,f.fecha,f.idempleado, c.nombres, c.apellidos from restaurante.productos as p inner join restaurante.facturas as f on p.idproducto = f.idproducto inner join restaurante.clientes as c on c.idclientes = f.idcliente where f.idfactura=?");
            ps.setInt(1, Integer.parseInt(campofactura.getText()));
            rs = ps.executeQuery();

            if (rs.next()) {

                campofactura.setText(rs.getString("idfactura"));
                campoidcliente.setText(rs.getString("idcliente"));
                campoidproducto.setText(rs.getString("idproducto"));
                campofechafac.setText(rs.getString("fecha"));
                campoidempleado.setText(rs.getString("idempleado"));
                campopreciofac.setText(rs.getString("precio"));
                camponomcliente.setText(rs.getString("nombres"));
                campoapellidocliente.setText(rs.getString("apellidos"));

            } else {

                JOptionPane.showMessageDialog(null, "registro no exitoso");
            }

            campofactura.setEditable(false);
            conexion.close();

            //limpiar();
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "error de conexion" + ex);
        }
    }//GEN-LAST:event_jButtonconsultarActionPerformed

    private void campoidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoidproductoActionPerformed

    private void btpreconsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpreconsulActionPerformed

        campofactura.setEditable(true);
        limpiar();
    }//GEN-LAST:event_btpreconsulActionPerformed

    private void camponomclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponomclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponomclienteActionPerformed

    private void campoapellidoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoapellidoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoapellidoclienteActionPerformed

    private void campopreciofacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campopreciofacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campopreciofacActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
       // initComponents();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PCONEMPLEADO;
    private javax.swing.JButton btpreconsul;
    private javax.swing.JTextField campoapellidocliente;
    private javax.swing.JTextField campofactura;
    private javax.swing.JTextField campofechafac;
    private javax.swing.JTextField campoidcliente;
    private javax.swing.JTextField campoidempleado;
    private javax.swing.JTextField campoidproducto;
    private javax.swing.JTextField camponomcliente;
    private javax.swing.JTextField campopreciofac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonconsultar;
    private javax.swing.JButton jButtoninsregistro;
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
    // End of variables declaration//GEN-END:variables
}
