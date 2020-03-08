
package Ventanas;

import Clases.*;
import static Ventanas.Mapa.mapita;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class VentanaCiudades extends javax.swing.JFrame {
    
    Menu menu; //Se instancia la clase menu ya que se necesitarán de sus atributos
    DefaultListModel modelCiudad = new DefaultListModel();
    DefaultListModel modelVuelo; //Se utilizara al momento de eliminar ciudades
    private int[] coordenadas = new int[2]; //Coordenadas para ubicar las ciudades en el mapa
    
    public VentanaCiudades(Menu menu, DefaultListModel modelVuelo ) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.jListCiudad.setModel(modelCiudad);
        this.menu = menu;
        this.modelVuelo = modelVuelo;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        txtAeropuerto = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        addCiudad = new javax.swing.JButton();
        eliminarCiudad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCiudad = new javax.swing.JList<>();
        limpiarCampo = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(604, 438));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 3));
        jPanel1.setMaximumSize(new java.awt.Dimension(604, 438));
        jPanel1.setMinimumSize(new java.awt.Dimension(604, 438));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jLabel8.setFont(new java.awt.Font("Silom", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ciudad:");

        jLabel9.setFont(new java.awt.Font("Silom", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Aeropuerto:");

        jLabel10.setFont(new java.awt.Font("Silom", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Pais:");

        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setFont(new java.awt.Font("Silom", 0, 12)); // NOI18N
        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });

        txtAeropuerto.setBackground(new java.awt.Color(255, 255, 255));
        txtAeropuerto.setFont(new java.awt.Font("Silom", 0, 12)); // NOI18N
        txtAeropuerto.setForeground(new java.awt.Color(0, 0, 0));
        txtAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAeropuertoActionPerformed(evt);
            }
        });
        txtAeropuerto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAeropuertoKeyTyped(evt);
            }
        });

        txtPais.setBackground(new java.awt.Color(255, 255, 255));
        txtPais.setFont(new java.awt.Font("Silom", 0, 12)); // NOI18N
        txtPais.setForeground(new java.awt.Color(0, 0, 0));
        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });
        txtPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaisKeyTyped(evt);
            }
        });

        addCiudad.setBackground(new java.awt.Color(137, 93, 64));
        addCiudad.setFont(new java.awt.Font("Bangla MN", 1, 12)); // NOI18N
        addCiudad.setForeground(new java.awt.Color(0, 0, 0));
        addCiudad.setText("Agregar ciudad");
        addCiudad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addCiudad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addCiudad.setPreferredSize(new java.awt.Dimension(74, 26));
        addCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCiudadActionPerformed(evt);
            }
        });

        eliminarCiudad.setBackground(new java.awt.Color(137, 93, 64));
        eliminarCiudad.setFont(new java.awt.Font("Bangla MN", 1, 12)); // NOI18N
        eliminarCiudad.setForeground(new java.awt.Color(0, 0, 0));
        eliminarCiudad.setText("Eliminar ciudad");
        eliminarCiudad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminarCiudad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarCiudad.setPreferredSize(new java.awt.Dimension(74, 26));
        eliminarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCiudadActionPerformed(evt);
            }
        });

        jListCiudad.setBackground(new java.awt.Color(255, 255, 204));
        jListCiudad.setForeground(new java.awt.Color(0, 0, 0));
        jListCiudad.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListCiudadMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListCiudad);

        limpiarCampo.setBackground(new java.awt.Color(137, 93, 64));
        limpiarCampo.setFont(new java.awt.Font("Bangla MN", 1, 12)); // NOI18N
        limpiarCampo.setForeground(new java.awt.Color(0, 0, 0));
        limpiarCampo.setText("Limpiar campos");
        limpiarCampo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpiarCampo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpiarCampo.setPreferredSize(new java.awt.Dimension(74, 26));
        limpiarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCampoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(limpiarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(addCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAeropuerto, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(txtPais)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(limpiarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 490, 230));

        cerrar.setBackground(new java.awt.Color(137, 93, 64));
        cerrar.setFont(new java.awt.Font("Bangla MN", 1, 12)); // NOI18N
        cerrar.setForeground(new java.awt.Color(0, 0, 0));
        cerrar.setText("Cerrar");
        cerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrar.setPreferredSize(new java.awt.Dimension(74, 26));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 100, 20));

        jLabel2.setFont(new java.awt.Font("Silom", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ciudades");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hojasVentana.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/miniGuaca.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCiudadActionPerformed
        
        if(isCampoVacio()){
            
            //Se valida si algun campo esta vacio
            JOptionPane.showMessageDialog(null, "ERROR: uno de los campos está vacío. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        } else if(this.existeCiudad(txtCiudad.getText())){
            
            //Se verifica si esa ciudad existe en la lista o no 
            JOptionPane.showMessageDialog(null, "ERROR: la ciudad ya se encuentra en la lista. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        } else {   
        
            //Se guardan los datos de los campos en una variable externa para mejor visualizacion
            String nombreCiudad = this.txtCiudad.getText();
            String aeropuerto = this.txtAeropuerto.getText();
            String pais = this.txtPais.getText();
        
            //Se crea la nueva ciudad
            Ciudad ciudad = new Ciudad(nombreCiudad, aeropuerto, pais);
        
            //Se agrega la ciudad a la lista y al modelo para tenerlo en la interfaz
            modelCiudad.addElement(ciudad);
            menu.getListaCiudades().addLast(ciudad);
        
            //Se limpian los campos 
            this.limpiarCampos();
            
            //Se crea el nodo en el mapa
            System.out.println("Coordenada X: "+getCoordenadasX()+"\nCoordenada Y: "+getCoordenadasY());
            this.crearNodo(getCoordenadasX(), getCoordenadasY(), ciudad);
        
        }
        
        this.setVisible(false); //Como ya se agrego la ciudad, se cierra la ventana para que el usuario vea el mapa
        this.eliminarCiudad.setEnabled(true);
        
    }//GEN-LAST:event_addCiudadActionPerformed

    private void eliminarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCiudadActionPerformed
        
        if(this.jListCiudad.isSelectionEmpty()){
            
            JOptionPane.showMessageDialog(null, "ERROR: La lista esta vacia", "ERROR", JOptionPane.WARNING_MESSAGE);
            
        } else {
            
            Object objeto = this.jListCiudad.getSelectedValue();
            Ciudad ciudad = (Ciudad) objeto; //Se crea el objeto debido a que se necesitara posteriormente

            this.modelCiudad.removeElement(ciudad);
            limpiarCampos();
            
            int index = menu.getListaCiudades().getIndexCiudad(ciudad.getNombre(), menu.getListaCiudades()); //Se busca el indice del nodo que se tiene que eliminar
            menu.getListaCiudades().eliminarNodo(index); //Se elimina el nodo que contiene la ciudad
                    
            //Se eliminan todos los vuelos que entren o salgan de la ciudad eliminada
            this.eliminarVuelos(ciudad.getNombre(), modelVuelo);
            
            //Se llama al metodo de dibujar mapa para actualizarlo
            Grafo.dibujarMapa(menu.getListaVuelos(), menu.getListaCiudades());           
            
        }
        
    }//GEN-LAST:event_eliminarCiudadActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
   
        this.setVisible(false); //Boton para cerrar la ventana
        this.addCiudad.setEnabled(true); //Se vuelven a habilitar los botones
        this.eliminarCiudad.setEnabled(true);
        
    }//GEN-LAST:event_cerrarActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        
    }//GEN-LAST:event_txtCiudadActionPerformed

    private void txtAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAeropuertoActionPerformed
        
    }//GEN-LAST:event_txtAeropuertoActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        
    }//GEN-LAST:event_txtPaisActionPerformed

    private void txtPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisKeyTyped
       
        if(Character.isDigit(evt.getKeyChar()))    evt.consume(); //Validacion para que solo puedan ser introducidos letras
        
    }//GEN-LAST:event_txtPaisKeyTyped

    private void jListCiudadMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCiudadMouseReleased
        
        //Nos mostrara en cada campo la informacion de la ciudad seleccionada
        if(this.modelCiudad.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "ERROR: La lista esta vacia", "ERROR", JOptionPane.WARNING_MESSAGE);
           
        } else {
            
            Object objeto = this.jListCiudad.getSelectedValue();
            Ciudad ciudad = (Ciudad) objeto;
            llenarCampos(ciudad);
            
        }
        
    }//GEN-LAST:event_jListCiudadMouseReleased

    private void limpiarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCampoActionPerformed
     
        limpiarCampos(); //Metodo por conveniencia para limpiar de manera simultanea todos los campos
        
    }//GEN-LAST:event_limpiarCampoActionPerformed

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
        
        if(Character.isDigit(evt.getKeyChar()))  evt.consume(); //Validacion para que solo puedan ser introducidos letras
        
    }//GEN-LAST:event_txtCiudadKeyTyped

    private void txtAeropuertoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAeropuertoKeyTyped
        
        if(Character.isDigit(evt.getKeyChar()))  evt.consume(); //Validacion para que solo puedan ser introducidos letras
        
    }//GEN-LAST:event_txtAeropuertoKeyTyped

    
    public boolean isCampoVacio(){
        
        //Nos indicara si hay algun campo vacio, lo cual no puede ocurrir
        boolean nombre = this.txtCiudad.getText().equalsIgnoreCase("");
        boolean aeropuerto = this.txtAeropuerto.getText().equalsIgnoreCase("");
        boolean pais = this.txtPais.getText().equalsIgnoreCase("");
        
        return nombre || aeropuerto || pais;
        
    } 
    
    public void limpiarCampos(){
        
        //Limpia todos los campos de manera simultanea 
        this.txtAeropuerto.setText("");
        this.txtCiudad.setText("");
        this.txtPais.setText("");
        
    }   
    
    public void llenarCampos(Ciudad ciudad){
        
        //Se van a llenar los campos con la informacion de la ciudad seleccionada para conocer sus datos
        this.txtCiudad.setText(ciudad.getNombre());
        this.txtAeropuerto.setText(ciudad.getAeropuerto());
        this.txtPais.setText(ciudad.getPais());
        
    }  
    
    //Metodo para comprobar que la ciudad ingresada no se encuentre en la lista de ciudades ya
    public boolean existeCiudad(String ciudad){
        
        for (int i = 0; i < menu.getListaCiudades().getSize() ; i++) {
            
            if(ciudad.equalsIgnoreCase(menu.getListaCiudades().getDataAtIndex(i).getNombre())){
                
                return true;
                
            }
            
        }
        
        return false;
        
    }  
    
    //Metodo que elimina todos los vuelos de una ciudad
    public void eliminarVuelos(String nombreCiudad, DefaultListModel modelVuelo){
        
        for (int i = 0; i < menu.getListaVuelos().getSize(); i++) {
            
            //Se compara si la ciudad eliminada es origen o destino de algun vuelo
            if(menu.getListaVuelos().getDataAtIndexVuelo(i).getCiudadDestino().equalsIgnoreCase(nombreCiudad) || menu.getListaVuelos().getDataAtIndexVuelo(i).getCiudadOrigen().equalsIgnoreCase(nombreCiudad)){
                
                menu.getListaVuelos().eliminarNodo(i); //Se elimina el nodo en esa posicion
                modelVuelo.removeElementAt(i); //El vuelo a eliminar posee la misma posicion tanto en la lista como en el model, por lo que se elimina directamente
                i--; //Se disminuye el contador al momento de eliminar debido a que los indices de las listas se modifican
                
            }

        }
        
    }
    
    //Metodo para dibujar el nodo en el mapa
    public void crearNodo(int x, int y, Ciudad ciudad){
            
        ciudad.inicializarCirculo(x, y);
        ciudad.getCirculo().dibujarCirculo(mapita.getGraphics());
        
    }
    
    //Getters y Setters de la clase
    public void setCoordenadas(int x, int y) {
        this.coordenadas[0] = x;
        this.coordenadas[1] = y;
    }
    
    public int getCoordenadasX() {
        return coordenadas[0];
    }
    
    public int getCoordenadasY() {
        return coordenadas[1];
    }
    
    public DefaultListModel getModelCiudad(){     
        return this.modelCiudad;   
    }
    
    public void setModelCiudad(DefaultListModel modelCiudad){
        this.modelCiudad = modelCiudad;
    }

    //Para manejar la disponibilidad de los botones
    public JButton getAddCiudad() {
        return addCiudad;
    }

    public JButton getEliminarCiudad() {
        return eliminarCiudad;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCiudad;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton eliminarCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListCiudad;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarCampo;
    private javax.swing.JTextField txtAeropuerto;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
