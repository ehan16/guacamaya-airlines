
package Ventanas;

import Algoritmos.*;
import Clases.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class VentanaRutas extends javax.swing.JFrame {
    
    Menu menu; //Se instancia la clase menu ya que se necesitarán de sus atributos
    Grafo grafo;
    Nodo nodoInicio;
    Nodo nodoFin;
    boolean porDuracion;
    
    public VentanaRutas(Menu menu, Grafo grafo) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.menu = menu;
        this.grafo = grafo;
        porDuracion = false;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cerrar2 = new javax.swing.JButton();
        opcionesPlan = new javax.swing.JPanel();
        bttnCosto = new javax.swing.JButton();
        bttnDuracion = new javax.swing.JButton();
        dijkstra = new javax.swing.JButton();
        floydWarshall = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(604, 438));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 3));
        jPanel1.setMaximumSize(new java.awt.Dimension(604, 438));
        jPanel1.setMinimumSize(new java.awt.Dimension(604, 438));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Silom", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Rutas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        cerrar2.setBackground(new java.awt.Color(137, 93, 64));
        cerrar2.setFont(new java.awt.Font("Bangla MN", 1, 12)); // NOI18N
        cerrar2.setForeground(new java.awt.Color(0, 0, 0));
        cerrar2.setText("Cerrar");
        cerrar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cerrar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrar2.setPreferredSize(new java.awt.Dimension(74, 26));
        cerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar2ActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 110, 20));

        opcionesPlan.setBackground(new java.awt.Color(255, 255, 153));
        opcionesPlan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 3));

        bttnCosto.setBackground(new java.awt.Color(137, 93, 64));
        bttnCosto.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        bttnCosto.setForeground(new java.awt.Color(0, 0, 0));
        bttnCosto.setText("Costo");
        bttnCosto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttnCosto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnCosto.setPreferredSize(new java.awt.Dimension(74, 26));
        bttnCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCostoActionPerformed(evt);
            }
        });

        bttnDuracion.setBackground(new java.awt.Color(137, 93, 64));
        bttnDuracion.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        bttnDuracion.setForeground(new java.awt.Color(0, 0, 0));
        bttnDuracion.setText("Duracion");
        bttnDuracion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttnDuracion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnDuracion.setPreferredSize(new java.awt.Dimension(74, 26));
        bttnDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDuracionActionPerformed(evt);
            }
        });

        dijkstra.setBackground(new java.awt.Color(137, 93, 64));
        dijkstra.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        dijkstra.setForeground(new java.awt.Color(0, 0, 0));
        dijkstra.setText("Dijkstra");
        dijkstra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dijkstra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dijkstra.setPreferredSize(new java.awt.Dimension(74, 26));
        dijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dijkstraActionPerformed(evt);
            }
        });

        floydWarshall.setBackground(new java.awt.Color(137, 93, 64));
        floydWarshall.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        floydWarshall.setForeground(new java.awt.Color(0, 0, 0));
        floydWarshall.setText("Floyd-Warshall");
        floydWarshall.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        floydWarshall.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        floydWarshall.setPreferredSize(new java.awt.Dimension(74, 26));
        floydWarshall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floydWarshallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout opcionesPlanLayout = new javax.swing.GroupLayout(opcionesPlan);
        opcionesPlan.setLayout(opcionesPlanLayout);
        opcionesPlanLayout.setHorizontalGroup(
            opcionesPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcionesPlanLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(opcionesPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttnCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(dijkstra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(opcionesPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(floydWarshall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnDuracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        opcionesPlanLayout.setVerticalGroup(
            opcionesPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesPlanLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(opcionesPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(opcionesPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dijkstra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(floydWarshall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(opcionesPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/miniGuaca.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hojasVentana.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 470, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCostoActionPerformed
        
        this.porDuracion = false;
        bttnDuracion.setBackground(Color.ORANGE);
        bttnCosto.setBackground(Color.black);
        System.out.println("el booleano es " + porDuracion);
        
    }//GEN-LAST:event_bttnCostoActionPerformed

    private void bttnDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDuracionActionPerformed
        
        this.porDuracion = true;
        bttnCosto.setBackground(Color.ORANGE);
        bttnDuracion.setBackground(Color.black);
        System.out.println("el booleano es " + porDuracion);
        
    }//GEN-LAST:event_bttnDuracionActionPerformed

    private void dijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dijkstraActionPerformed
        
        String camino = nodoInicio.getDatoCiudad().getNombre() + "";
        
        //Se consigue el indice de las ciudades destino y origen
        int origen = menu.getListaCiudades().getIndexCiudad(nodoInicio.getDatoCiudad().getNombre(), menu.getListaCiudades());
        int destino = menu.getListaCiudades().getIndexCiudad(nodoFin.getDatoCiudad().getNombre(), menu.getListaCiudades());
        
        //Se instancia el algoritmo de Dijkstra
        AlgoritmoDijkstra alDij = new AlgoritmoDijkstra(origen, destino, grafo, menu, porDuracion);
        alDij.caminoMinimos();
        alDij.recuperaCamino(destino);
        
        for(int k = 1; k < alDij.getCamino().length; k++){
            
            if(alDij.getCamino()[k] != 999){
                
                camino = camino + "--->" + menu.getListaCiudades().getDataAtIndex(alDij.getCamino()[k]).getNombre();
                
            } 
            
        }
        
        String[] lista = camino.split("--->");
        
        //Si la ruta no es posible, se muestra un mensaje
        if(!menu.getListaCiudades().searchNodo(lista[0]).getDatoCiudad().getCiudadesAdyacente().isContenido(menu.getListaCiudades().searchNodo(lista[1]).getDatoCiudad())){
                    
                    JOptionPane.showMessageDialog(null, "ERROR: no hay camino", "ERROR", JOptionPane.ERROR_MESSAGE);
                    
        } else {
            
            //De ser lo contrario, se marca la ruta en el mapa y se muestra
            JOptionPane.showMessageDialog(null, camino, "CAMINO", JOptionPane.INFORMATION_MESSAGE);
            this.marcarRuta(lista);
            
        }

        //Despues de correr el algoritmo, se oculta la ventana
        this.setVisible(false);
        bttnCosto.setBackground(Color.ORANGE);
        bttnDuracion.setBackground(Color.ORANGE);
        
    }//GEN-LAST:event_dijkstraActionPerformed

    private void floydWarshallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floydWarshallActionPerformed
        
        //Algoritmo de Floyd-Warshall
        AlgoritmoFloydWarshall alFloyd = new AlgoritmoFloydWarshall(menu, porDuracion, grafo);
        alFloyd.calcular();
        
        //Se consigue el indice de las ciudades destino y origen
        int origen = menu.getListaCiudades().getIndexCiudad(nodoInicio.getDatoCiudad().getNombre(), menu.getListaCiudades());
        int destino = menu.getListaCiudades().getIndexCiudad(nodoFin.getDatoCiudad().getNombre(), menu.getListaCiudades());
        
        String ciudades = alFloyd.caminocorto(origen, destino);
        
        String[] lista = ciudades.split("->");
        
        //Si la ciudad siguiente no es adyacente, significa que la ruta no es posible 
        if(!menu.getListaCiudades().searchNodo(lista[0]).getDatoCiudad().getCiudadesAdyacente().isContenido(menu.getListaCiudades().searchNodo(lista[1]).getDatoCiudad())){ 
                    
                    JOptionPane.showMessageDialog(null, "ERROR: no hay camino", "ERROR", JOptionPane.ERROR_MESSAGE);
                    
        } else {
        
            //De resto, se imprime toda la ruta y se marca
            JOptionPane.showMessageDialog(null, alFloyd.caminocorto(origen, destino), "CAMINO", JOptionPane.INFORMATION_MESSAGE);
            this.marcarRuta(lista);
        
        }
        
//        String ruta = "";
//        alFloyd.calcularRutas(origen, destino, menu.getListaCiudades().getDataAtIndex(origen).getNombre()+ ", ");
//        int index = 0;
//        while(alFloyd.getRutas()[index] != null){
//            
//            ruta = ruta + "\nRuta " + (index+1) + ": "+ alFloyd.getRutas()[index];
//            index ++;
//            
//        }
//        
//        JOptionPane.showMessageDialog(this, ruta);
        
        //Despues de correr el algoritmo, se oculta la ventana
        this.setVisible(false);
        this.setVisible(false);
        bttnCosto.setBackground(Color.ORANGE);
        bttnDuracion.setBackground(Color.ORANGE);
        
    }//GEN-LAST:event_floydWarshallActionPerformed

    private void cerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar2ActionPerformed

        this.setVisible(false);  //Boton para cerrar la ventana
    }//GEN-LAST:event_cerrar2ActionPerformed

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
    
    //Ruta para marcar en el mapa la ruta mas corta 
    public void marcarRuta(String[] ciudades){
        
        for (int i = 0; i < ciudades.length-1; i++) {
            
            Vuelo vuelo = grafo.searchFlight(ciudades[i], ciudades[i+1]).getDatoVuelo();
            menu.getListaVuelos().searchNodoNumVuelo(vuelo.getNumVuelo()).getDatoVuelo().getLinea().setColor(Color.RED);
            menu.getListaVuelos().searchNodoNumVuelo(vuelo.getNumVuelo()).getDatoVuelo().getLinea().setGrosorLinea(3);
            
        }
        
        Grafo.dibujarMapa(menu.getListaVuelos(), menu.getListaCiudades());
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCosto;
    private javax.swing.JButton bttnDuracion;
    private javax.swing.JButton cerrar2;
    private javax.swing.JButton dijkstra;
    private javax.swing.JButton floydWarshall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel opcionesPlan;
    // End of variables declaration//GEN-END:variables
}
