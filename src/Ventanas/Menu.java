
package Ventanas;

import javax.swing.JOptionPane;
import Clases.Lista;
import Clases.Main;

/**
 * @author Han, Serrano, Villegas
 */

public class Menu extends javax.swing.JFrame {

    //Los siguientes atributos nos serviran para almacenar la informacion de las ciudades 
    //y los vuelos de manera ordenada, de tal forma que se pueda acceder a la informacion desde todas las ventanas
    private Lista ciudades = new Lista();
    private Lista vuelos = new Lista();
    
    public Menu() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        informacion = new javax.swing.JButton();
        mapa = new javax.swing.JButton();
        Express = new javax.swing.JLabel();
        Guacamayaa = new javax.swing.JLabel();
        Guacamaya = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Hojasarriba = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Menu"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informacion.setBackground(new java.awt.Color(137, 93, 64));
        informacion.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        informacion.setForeground(new java.awt.Color(0, 0, 0));
        informacion.setText("Informacion");
        informacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        informacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionActionPerformed(evt);
            }
        });
        jPanel1.add(informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 140, 40));

        mapa.setBackground(new java.awt.Color(137, 93, 64));
        mapa.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        mapa.setForeground(new java.awt.Color(0, 0, 0));
        mapa.setText("Mapa");
        mapa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mapa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapaActionPerformed(evt);
            }
        });
        jPanel1.add(mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 140, 40));

        Express.setFont(new java.awt.Font("Verdana", 2, 45)); // NOI18N
        Express.setForeground(new java.awt.Color(153, 153, 0));
        Express.setText("Express");
        jPanel1.add(Express, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 200, 60));

        Guacamayaa.setFont(new java.awt.Font("Silom", 3, 36)); // NOI18N
        Guacamayaa.setForeground(new java.awt.Color(0, 0, 51));
        Guacamayaa.setText("GUACAMAYA");
        jPanel1.add(Guacamayaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 235, -1));

        Guacamaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guaca.png"))); // NOI18N
        jPanel1.add(Guacamaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, -1, -1));

        Salir.setBackground(new java.awt.Color(137, 113, 63));
        Salir.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("Salir");
        Salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 200, 30));

        Hojasarriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bordehojas.png"))); // NOI18N
        jPanel1.add(Hojasarriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hojasarriba.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 310, -1, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
        System.exit(0); //Al hacer click en este boton, se sale del sistema
        
    }//GEN-LAST:event_SalirActionPerformed

    private void informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionActionPerformed

        JOptionPane.showMessageDialog(null, "Hola Guillen, aprecie este trabajo o hacemos la automorision. \nP.D.: Recuerde tomar aguita pls", "Bienvenida", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Para agregar una ciudad, haga click izquierdo en el punto del mapa donde desea crear \nel nodo."
                + "\n\nPara agregar un vuelo, haga click izquierdo en su ciudad origen, luego, en su ciudad \ndestino e ingrese la informacion pedida."
                + "\n\nPara conocer su plan de vuelo, haga click derecho en su nodo origen y despues \nclick derecho en su nodo destino."
                + "\n\nSe recomienda usar mouse.", "Bienvenida", JOptionPane.PLAIN_MESSAGE);
        
        for (int i = 0; i < this.ciudades.getSize(); i++) {
            
            System.out.println("Ciudad:  "+i+" "+ciudades.getDataAtIndex(i).getNombre());
            
        }
        
    }//GEN-LAST:event_informacionActionPerformed

    private void mapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapaActionPerformed
        
        this.setVisible(false);
        Main.mapa.setVisible(true);
//        Mapa mapa = new Mapa(this);
//        mapa.setVisible(true);
        
    }//GEN-LAST:event_mapaActionPerformed
  
    //Getters de la clase menu
    public Lista getListaVuelos(){       
        return this.vuelos;       
    }
    
    public Lista getListaCiudades(){       
        return this.ciudades;  
    }
        
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//               
//            }
//        });
//    }
    
    public void setCiudades(Lista ciudades) {
        this.ciudades = ciudades;
    }

    public void setVuelos(Lista vuelos) {
        this.vuelos = vuelos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Express;
    private javax.swing.JLabel Guacamaya;
    private javax.swing.JLabel Guacamayaa;
    private javax.swing.JLabel Hojasarriba;
    private javax.swing.JButton Salir;
    private javax.swing.JButton informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mapa;
    // End of variables declaration//GEN-END:variables
}
