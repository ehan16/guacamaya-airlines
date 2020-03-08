/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Algoritmos.AlgoritmoDijkstra;
import Clases.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Han, Serrano, Villegas
 */
public class Mapa extends javax.swing.JFrame {
    
    Menu menu;  
    VentanaVuelos ventanaVuelo;
    VentanaCiudades ventanaCiudad;
    VentanaRutas ventanaRuta;
    VentanaArchivos ventanaArchivo;
    Grafo grafo; 
    
    public Mapa(Menu menu) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.menu = menu;     
        this.ventanaVuelo = new VentanaVuelos(menu);
        this.ventanaCiudad = new VentanaCiudades(menu, ventanaVuelo.getModelVuelo());
        this.ventanaArchivo = new VentanaArchivos(menu, ventanaVuelo, ventanaCiudad);
        this.grafo = new Grafo(this.menu);
        this.ventanaRuta = new VentanaRutas(menu, grafo);
        
    }
    
    //Variables utilizadas para los algoritmos
    Nodo nodoInicio = null;
    Nodo nodoFin = null;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mapita = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ciudades = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mostrarMenu = new javax.swing.JButton();
        Vuelos = new javax.swing.JButton();
        Repositorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Mapa\n"); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 3, true));

        mapita.setBackground(new java.awt.Color(163, 255, 231));
        mapita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        mapita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mapitaMousePressed(evt);
            }
        });
        mapita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mapa.png"))); // NOI18N
        mapita.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        Ciudades.setBackground(new java.awt.Color(137, 93, 64));
        Ciudades.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        Ciudades.setForeground(new java.awt.Color(0, 0, 0));
        Ciudades.setText("Ciudades");
        Ciudades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ciudades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ciudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Silom", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MAPA");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 0));
        jSeparator1.setOpaque(true);

        mostrarMenu.setBackground(new java.awt.Color(137, 113, 63));
        mostrarMenu.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        mostrarMenu.setForeground(new java.awt.Color(0, 0, 0));
        mostrarMenu.setText("Mostrar menu");
        mostrarMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostrarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMenuActionPerformed(evt);
            }
        });

        Vuelos.setBackground(new java.awt.Color(137, 93, 64));
        Vuelos.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        Vuelos.setForeground(new java.awt.Color(0, 0, 0));
        Vuelos.setText("Vuelos");
        Vuelos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Vuelos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Vuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VuelosActionPerformed(evt);
            }
        });

        Repositorio.setBackground(new java.awt.Color(137, 93, 64));
        Repositorio.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        Repositorio.setForeground(new java.awt.Color(0, 0, 0));
        Repositorio.setText("Repositorio");
        Repositorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Repositorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Repositorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepositorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mostrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mapita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(Vuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(Repositorio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(mapita, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ciudades)
                    .addComponent(Vuelos)
                    .addComponent(Repositorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(mostrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RepositorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepositorioActionPerformed

        ventanaArchivo.setVisible(true); //Nos dirige a la ventana de los archivos
        
    }//GEN-LAST:event_RepositorioActionPerformed

    private void VuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VuelosActionPerformed

        ventanaVuelo.setVisible(true); //Nos dirige a la ventana de los vuelos
        ventanaVuelo.getAddVuelo().setEnabled(false);
        
    }//GEN-LAST:event_VuelosActionPerformed

    private void CiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadesActionPerformed

        ventanaCiudad.setVisible(true); //Nos dirige a la ventana de las ciudades
        ventanaCiudad.getAddCiudad().setEnabled(false);
        
    }//GEN-LAST:event_CiudadesActionPerformed

    private void mostrarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMenuActionPerformed

        menu.setVisible(true); //Al oprimir el boton se muestra el menu nuevamente
//        Main.menu.setVisible(false);
        
    }//GEN-LAST:event_mostrarMenuActionPerformed

    private void mapitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapitaMousePressed

        int x = evt.getX(), y = evt.getY();
        ventanaCiudad.setCoordenadas(x, y);
        
        if(evt.isMetaDown()){
            
            if(menu.getListaCiudades().searchNodo(x, y) != null){ //Se verifica si lo que se hizo click fue sobre un nodo 
                
                if(nodoInicio == null){
                    
                    //Se vuelve a preparar el mapa nuevamente para correr el algoritmo para encontrar el camino minimo
                    grafo.colorOriginal();
                    
                    nodoInicio = menu.getListaCiudades().searchNodo(x, y); //El nodo de inicio ahora pasa a ser el nodo al que se le ha dado click
                    nodoInicio.getDatoCiudad().getCirculo().setColor(Color.magenta); //Se cambia de color el circulo para indicar que ha sido seleccionado
//                    ventanaRuta.setNodoInicio(menu.getListaCiudades().searchNodo(x, y));
                    ventanaRuta.setNodoInicio(nodoInicio);
                    
                } else {
                    
                    //Si entra aqui, significa que ya se ha escogido el nodo de inicio, asi que se esta escogiendo el nodo final
                    nodoFin = menu.getListaCiudades().searchNodo(x, y); 
                    nodoFin.getDatoCiudad().getCirculo().setColor(Color.magenta);
//                    ventanaRuta.setNodoFin(menu.getListaCiudades().searchNodo(x, y));
                    ventanaRuta.setNodoFin(nodoFin);
                    
                    if(nodoFin != nodoInicio){
                    
                        //Se muestran las instrucciones
                        JOptionPane.showMessageDialog(null, ""
                        + "\n\nPrimero seleccione si es por costo o duración, el sistema por default se encuentra en costo."
                        + "\n\nDespués seleccione el algoritmo que desea utilizar.");
                    
                        //Se muestra la ventana de rutas para mostrarle las acciones
                        ventanaRuta.setVisible(true);
                        
                    } else {
                        
                        JOptionPane.showMessageDialog(null, "ERROR: las ciudades son iguales", "ERROR", JOptionPane.ERROR_MESSAGE);
                        
                    }
                    
                    nodoInicio = null;
                    nodoFin = null;
//                    ventanaRuta.setNodoFin(nodoFin);
//                    ventanaRuta.setNodoInicio(nodoInicio);
                    
                }
                
            } 
            
        } else {
            
            if(menu.getListaCiudades().searchNodo(x, y) != null){ //Se verifica si lo que se hizo click fue sobre un nodo 
             
                if(nodoInicio == null){
                        
                    grafo.colorOriginal(); //Se vuelve a poner el color original del grafo
                    
                    nodoInicio = menu.getListaCiudades().searchNodo(x, y); //El nodo de inicio ahora pasa a ser el nodo al que se le ha dado click
                    nodoInicio.getDatoCiudad().getCirculo().setColor(Color.RED); //Se cambia de color el circulo para indicar que ha sido seleccionado
                
                } else {
                    
                    //Si entra aqui, significa que ya se ha escogido el nodo de inicio, asi que se esta escogiendo el nodo final
                    nodoFin = menu.getListaCiudades().searchNodo(x, y);
                    nodoFin.getDatoCiudad().getCirculo().setColor(Color.RED);
                    
                    //Se crea la arista que une las ciudades
                    ventanaVuelo.getEraseVuelo().setEnabled(false);
                    ventanaVuelo.getModifyVuelo().setEnabled(false);
                    ventanaVuelo.setVisible(true);
                    ventanaVuelo.getTxtOrigen().setText(nodoInicio.getDatoCiudad().getNombre());
                    ventanaVuelo.getTxtDestino().setText(nodoFin.getDatoCiudad().getNombre());
                    
                    //Se vuelven a establecer los colores originales del mapa
                    grafo.colorOriginal();
                    
                    //Se vuelven a settear los nodos a null para poder seleccionar mas nodos y crear mas aristas
                    nodoInicio = null;
                    nodoFin = null; 
                    
                }
                
            } else {
                
                //Si no se ha seleccionado ningun nodo, significa que se va a crear uno nuevo
                ventanaCiudad.getEliminarCiudad().setEnabled(false);
                ventanaCiudad.setVisible(true);
                
            }
            
        }
              
        Grafo.dibujarMapa(menu.getListaVuelos(), menu.getListaCiudades());

    }//GEN-LAST:event_mapitaMousePressed

    //Getters y setters para los nodos de inicio y fin
    public Nodo getNodoInicio() {
        return nodoInicio;
    }

    public void setNodoInicio(Nodo nodoInicio) {
        this.nodoInicio = nodoInicio;
    }

    public Nodo getNodoFin() {
        return nodoFin;
    }

    public void setNodoFin(Nodo nodoFin) {
        this.nodoFin = nodoFin;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ciudades;
    private javax.swing.JButton Repositorio;
    private javax.swing.JButton Vuelos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JPanel mapita;
    private javax.swing.JButton mostrarMenu;
    // End of variables declaration//GEN-END:variables
}
