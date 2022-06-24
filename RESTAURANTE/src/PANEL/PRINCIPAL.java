
package PANEL;

import java.awt.BorderLayout;
import java.util.Locale;

/**
*
* @author alejoz
*/
@SuppressWarnings({ "serial", "unused" })
public class PRINCIPAL extends javax.swing.JFrame {

    
    public PRINCIPAL() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); // metodo para maximizar la aplicaion en toda la pantalla
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Buttonempleados = new javax.swing.JButton();
        Buttonclientes = new javax.swing.JButton();
        Buttonfacturas = new javax.swing.JButton();
        Buttonproductos = new javax.swing.JButton();
        PCONTENIDOP = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buttonempleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MODULO EMPLEADOS.png"))); // NOI18N
        Buttonempleados.setText("MODULO EMPLEADOS");
        Buttonempleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Buttonempleados.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Buttonempleados.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Buttonempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonempleadosActionPerformed(evt);
            }
        });
        getContentPane().add(Buttonempleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 28, 186, -1));

        Buttonclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CLIENTE.png"))); // NOI18N
        Buttonclientes.setText("MODULO CLIENTES");
        Buttonclientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Buttonclientes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Buttonclientes.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Buttonclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonclientesActionPerformed(evt);
            }
        });
        getContentPane().add(Buttonclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 28, 186, -1));

        Buttonfacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MODULO FACTURAS.png"))); // NOI18N
        Buttonfacturas.setText("MODULO FACTURAS");
        Buttonfacturas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Buttonfacturas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Buttonfacturas.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Buttonfacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonfacturasActionPerformed(evt);
            }
        });
        getContentPane().add(Buttonfacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 186, -1));

        Buttonproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PRODUCTOS (2).png"))); // NOI18N
        Buttonproductos.setText("MODULO PRODUCTOS");
        Buttonproductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Buttonproductos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Buttonproductos.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        Buttonproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonproductosActionPerformed(evt);
            }
        });
        getContentPane().add(Buttonproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 190, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RESTAURANTE.png"))); // NOI18N

        javax.swing.GroupLayout PCONTENIDOPLayout = new javax.swing.GroupLayout(PCONTENIDOP);
        PCONTENIDOP.setLayout(PCONTENIDOPLayout);
        PCONTENIDOPLayout.setHorizontalGroup(
            PCONTENIDOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCONTENIDOPLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(fondo)
                .addContainerGap(795, Short.MAX_VALUE))
        );
        PCONTENIDOPLayout.setVerticalGroup(
            PCONTENIDOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PCONTENIDOPLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(fondo)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        getContentPane().add(PCONTENIDOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 680));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SignOut_icon-icons.com_74704.png"))); // NOI18N
        salir.setText("SALIR");
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        salir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonempleadosActionPerformed
           
        
           PEMPLEADOS pem = new PEMPLEADOS ();
           pem.setSize(946,421); //tamaño
           pem.setLocation(5, 5);//posicion del jpanel
           
           PCONTENIDOP.removeAll();
           PCONTENIDOP.add(pem,BorderLayout.CENTER);
           PCONTENIDOP.revalidate();
           PCONTENIDOP.repaint();

        
    }//GEN-LAST:event_ButtonempleadosActionPerformed

    private void ButtonclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonclientesActionPerformed
        
        
           INGRESARCLI pem = new INGRESARCLI();
           pem.setSize(946,421); //tamaño
           pem.setLocation(5, 5);//posicion del jpanel
           
           PCONTENIDOP.removeAll();
           PCONTENIDOP.add(pem,BorderLayout.CENTER);
           PCONTENIDOP.revalidate();
           PCONTENIDOP.repaint();
           
    }//GEN-LAST:event_ButtonclientesActionPerformed

    private void ButtonproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonproductosActionPerformed
        
        
           INGRESARPRO pem = new INGRESARPRO ();
           pem.setSize(946,421); //tamaño
           pem.setLocation(5, 5);//posicion del jpanel
           
           PCONTENIDOP.removeAll();
           PCONTENIDOP.add(pem,BorderLayout.CENTER);
           PCONTENIDOP.revalidate();
           PCONTENIDOP.repaint();
           
    }//GEN-LAST:event_ButtonproductosActionPerformed

    private void ButtonfacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonfacturasActionPerformed
       
        
           INGRESARFAC pem = new INGRESARFAC ();
           pem.setSize(946,421); //tamaño
           pem.setLocation(5, 5);//posicion del jpanel
           
           PCONTENIDOP.removeAll();
           PCONTENIDOP.add(pem,BorderLayout.CENTER);
           PCONTENIDOP.revalidate();
           PCONTENIDOP.repaint();
           
    }//GEN-LAST:event_ButtonfacturasActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

    System.exit(0); // cerrar toda la aplicacion

        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonclientes;
    private javax.swing.JButton Buttonempleados;
    private javax.swing.JButton Buttonfacturas;
    private javax.swing.JButton Buttonproductos;
    public static javax.swing.JPanel PCONTENIDOP;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
