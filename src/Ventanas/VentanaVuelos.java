
package Ventanas;

import Clases.*;
import static Ventanas.Mapa.mapita;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Han, Serrano, Villegas
 */
public class VentanaVuelos extends javax.swing.JFrame {
    
    Menu menu; //Se instancia la clase menu ya que se necesitarán de sus atributos
    DefaultListModel modelVuelo = new DefaultListModel();
    
    public VentanaVuelos(Menu menu) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.jListVuelo.setModel(modelVuelo);
        this.menu = menu;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtNumVuelo = new javax.swing.JTextField();
        txtAerolinea = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        eraseVuelo = new javax.swing.JButton();
        addVuelo = new javax.swing.JButton();
        modifyVuelo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListVuelo = new javax.swing.JList<>();
        limpiarCampo = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(604, 438));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 3));
        jPanel1.setMinimumSize(new java.awt.Dimension(604, 438));
        jPanel1.setPreferredSize(new java.awt.Dimension(604, 366));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Silom", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Vuelos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jLabel11.setFont(new java.awt.Font("Silom", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Ciudad origen: ");

        jLabel12.setFont(new java.awt.Font("Silom", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ciudad destino: ");

        jLabel13.setFont(new java.awt.Font("Silom", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Numero de vuelo:");

        jLabel14.setFont(new java.awt.Font("Silom", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Aerolinea:");

        jLabel15.setFont(new java.awt.Font("Silom", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Costo ($) :");

        jLabel16.setFont(new java.awt.Font("Silom", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Duracion (h) : ");

        txtOrigen.setBackground(new java.awt.Color(255, 255, 255));
        txtOrigen.setFont(new java.awt.Font("Silom", 0, 12)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(0, 0, 0));
        txtOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigenActionPerformed(evt);
            }
        });
        txtOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrigenKeyTyped(evt);
            }
        });

        txtDestino.setBackground(new java.awt.Color(255, 255, 255));
        txtDestino.setFont(new java.awt.Font("Silom", 0, 12)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(0, 0, 0));
        txtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinoActionPerformed(evt);
            }
        });
        txtDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDestinoKeyTyped(evt);
            }
        });

        txtNumVuelo.setBackground(new java.awt.Color(255, 255, 255));
        txtNumVuelo.setFont(new java.awt.Font("Silom", 0, 12)); // NOI18N
        txtNumVuelo.setForeground(new java.awt.Color(0, 0, 0));
        txtNumVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumVueloActionPerformed(evt);
            }
        });
        txtNumVuelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumVueloKeyTyped(evt);
            }
        });

        txtAerolinea.setBackground(new java.awt.Color(255, 255, 255));
        txtAerolinea.setFont(new java.awt.Font("Silom", 0, 12)); // NOI18N
        txtAerolinea.setForeground(new java.awt.Color(0, 0, 0));
        txtAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAerolineaActionPerformed(evt);
            }
        });
        txtAerolinea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAerolineaKeyTyped(evt);
            }
        });

        txtCosto.setBackground(new java.awt.Color(255, 255, 255));
        txtCosto.setFont(new java.awt.Font("Silom", 0, 12)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(0, 0, 0));
        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        txtDuracion.setBackground(new java.awt.Color(255, 255, 255));
        txtDuracion.setFont(new java.awt.Font("Silom", 0, 12)); // NOI18N
        txtDuracion.setForeground(new java.awt.Color(0, 0, 0));
        txtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionActionPerformed(evt);
            }
        });
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });

        eraseVuelo.setBackground(new java.awt.Color(137, 93, 64));
        eraseVuelo.setFont(new java.awt.Font("Bangla MN", 1, 12)); // NOI18N
        eraseVuelo.setForeground(new java.awt.Color(0, 0, 0));
        eraseVuelo.setText("Eliminar");
        eraseVuelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eraseVuelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eraseVuelo.setPreferredSize(new java.awt.Dimension(74, 26));
        eraseVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseVueloActionPerformed(evt);
            }
        });

        addVuelo.setBackground(new java.awt.Color(137, 93, 64));
        addVuelo.setFont(new java.awt.Font("Bangla MN", 1, 12)); // NOI18N
        addVuelo.setForeground(new java.awt.Color(0, 0, 0));
        addVuelo.setText("Añadir");
        addVuelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addVuelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addVuelo.setPreferredSize(new java.awt.Dimension(74, 26));
        addVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVueloActionPerformed(evt);
            }
        });

        modifyVuelo.setBackground(new java.awt.Color(137, 93, 64));
        modifyVuelo.setFont(new java.awt.Font("Bangla MN", 1, 12)); // NOI18N
        modifyVuelo.setForeground(new java.awt.Color(0, 0, 0));
        modifyVuelo.setText("Modificar");
        modifyVuelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modifyVuelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modifyVuelo.setPreferredSize(new java.awt.Dimension(74, 26));
        modifyVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyVueloActionPerformed(evt);
            }
        });

        jListVuelo.setBackground(new java.awt.Color(255, 255, 204));
        jListVuelo.setForeground(new java.awt.Color(0, 0, 0));
        jListVuelo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListVueloMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListVuelo);

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtCosto)
                            .addComponent(txtOrigen)
                            .addComponent(txtDestino)
                            .addComponent(txtNumVuelo)
                            .addComponent(txtAerolinea))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(limpiarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifyVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eraseVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtNumVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel14))
                            .addComponent(txtAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eraseVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 530, -1));

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
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 100, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/miniGuaca.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hojasVentana.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 470, 438));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVueloActionPerformed
        
        if(isCampoVacio()){
            
            //Se valida si algun campo esta vacio
            JOptionPane.showMessageDialog(null, "ERROR: uno de los campos está vacío. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        } else if(menu.getListaCiudades().getSize() < 2){
            
            //Para que existan vuelos, tienen que existir al menos dos ciudades
            JOptionPane.showMessageDialog(null, "ERROR: ciudades insuficientes para crear un vuelo. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE); 
            
        } else if(!this.existenCiudades(txtOrigen.getText(), txtDestino.getText()) || (txtOrigen.getText().equalsIgnoreCase(txtDestino.getText()))){
            
            //Se tiene que verificar que ambas ciudades existen y sean diferentes
            JOptionPane.showMessageDialog(null, "ERROR: una de las ciudades es invalida. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE); 
            
        } else if (this.validarVuelo(txtOrigen.getText(), txtDestino.getText())){
          
            //Se valida si ya existe un vuelo entre ambas ciudades 
            JOptionPane.showMessageDialog(null, "ERROR: ya existe una conexion entre estas dos ciudades. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE); 
            
        } else if(this.existeNumVuelo(Integer.parseInt(txtNumVuelo.getText()))){
            
            //Se valida si ese numero de vuelo existe
            JOptionPane.showMessageDialog(null, "ERROR: el numero de vuelo ya existe. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE); 
            
        } else {
        
            //Se guardan los datos de cada campo en su respectiva variable
            String ciudadOrigen = this.txtOrigen.getText();
            String ciudadDestino = this.txtDestino.getText();
            String aerolinea = this.txtAerolinea.getText();
            int numVuelo = Integer.parseInt(this.txtNumVuelo.getText());
            int costo = Integer.parseInt(this.txtCosto.getText());
            int duracion = Integer.parseInt(this.txtDuracion.getText());
        
            //Se crea un nuevo vuelo
            Vuelo vuelo = new Vuelo(ciudadOrigen, ciudadDestino, numVuelo, costo, duracion, aerolinea);
            
            //Se procede a obtener las coordenadas de cada ciudad, origen y destino, para colocarlas en el vuelo
            int[] posOrigen = new int[2];
            int[] posDestino = new int[2];
                    
            //Encontramos en que indice esta la ciudad cuyas coordenadas queremos averiguar
            int indexOrigen = menu.getListaCiudades().getIndexCiudad(ciudadOrigen, menu.getListaCiudades());
            int indexDestino = menu.getListaCiudades().getIndexCiudad(ciudadDestino, menu.getListaCiudades());
                    
            //Se guardan las coordenadas en sus variables respectivas 
            posOrigen[0] = menu.getListaCiudades().getDataAtIndex(indexOrigen).getCoordenadasX(); //De la ciudad origen
            posOrigen[1] = menu.getListaCiudades().getDataAtIndex(indexOrigen).getCoordenadasY();
                   
            posDestino[0] = menu.getListaCiudades().getDataAtIndex(indexDestino).getCoordenadasX(); //De la ciudad destino
            posDestino[1] = menu.getListaCiudades().getDataAtIndex(indexDestino).getCoordenadasY();                
        
            //Se settean las coordenadas de cada ciudad
            vuelo.setCoordenadasOrigen(posOrigen[0], posOrigen[1]);
            vuelo.setCoordenadasDestino(posDestino[0], posDestino[1]);
            
            //Se añade el vuelo a su lista respectiva y al modelo para tenerlo en la interfaz
            modelVuelo.addElement(vuelo);
            menu.getListaVuelos().addLast(vuelo);   
            
            //Se dibuja la arista que une las ciudades
            this.crearArista(vuelo, menu.getListaCiudades().getDataAtIndex(indexOrigen), menu.getListaCiudades().getDataAtIndex(indexDestino));
            
            //Se limpian todos los campos
            this.limpiarCampos();
        
        }
        
        //Una vez que se agrega el vuelo, se cierra la ventana para poder visualizar el mapa
        this.setVisible(false);
        this.eraseVuelo.setEnabled(true);
        this.modifyVuelo.setEnabled(true);
        
    }//GEN-LAST:event_addVueloActionPerformed

    private void eraseVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseVueloActionPerformed
        
        if(this.jListVuelo.isSelectionEmpty()){ //Se verifica si se ha escogido un vuelo para borrar
            
            JOptionPane.showMessageDialog(null, "ERROR: La lista esta vacia", "ERROR", JOptionPane.WARNING_MESSAGE);
            
        } else {
            
            Object objeto = this.jListVuelo.getSelectedValue();
            Vuelo vuelo = (Vuelo) objeto; //Se crea el objeto debido a que se necesitara posteriormente
            this.modelVuelo.removeElement(vuelo);
            limpiarCampos();
            
            String numVuelo = vuelo.getNumVuelo()+""; //Identificador del vuelo
            int index = menu.getListaVuelos().getIndex( numVuelo, menu.getListaVuelos()); //Se busca en cual indice se encuentra el vuelo que se desea borrar
            menu.getListaVuelos().eliminarNodo(index); //Se elimina el indice encontrado de la lista que estamos trabajando
            
            //Se elimina de la lista de adyacencia
            int indiceOrigen = menu.getListaCiudades().getIndexCiudad(vuelo.getCiudadOrigen(), menu.getListaCiudades());
            int indiceDestino = menu.getListaCiudades().getIndexCiudad(vuelo.getCiudadDestino(), menu.getListaCiudades());
            menu.getListaCiudades().getDataAtIndex(indiceOrigen).eliminarAdyacente(menu.getListaCiudades().getDataAtIndex(indiceDestino));
            
            //Se llama al metodo de dibujar mapa para actualizarlo
            Grafo.dibujarMapa(menu.getListaVuelos(), menu.getListaCiudades());           
            
        }
        
    }//GEN-LAST:event_eraseVueloActionPerformed

    private void modifyVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyVueloActionPerformed
        
        //Se le informa al usuario que campos no podra modificar
        JOptionPane.showMessageDialog(null, "El numero de vuelo, ciudad de origen y ciudad de destino no seran modificados, aun asi cambie la informacion en el campo. /n", "Informacion", JOptionPane.INFORMATION_MESSAGE);
     
        if(this.jListVuelo.isSelectionEmpty()){
            
            JOptionPane.showMessageDialog(null, "ERROR: La lista esta vacia", "ERROR", JOptionPane.WARNING_MESSAGE);
            
        } else {
            
            Object objeto = this.jListVuelo.getSelectedValue();
            Vuelo vuelo = (Vuelo) objeto; //Se crea el objeto debido a que se necesitara posteriormente
            
            if(isCampoVacio()){
                
                //Como es obvio, ninguno de los campos puede estar vacio
                JOptionPane.showMessageDialog(null, "ERROR: uno de los campos está vacío. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            } else {
                
                //De lo contrario, se modifica la informacion del vuelo, es decir, se crea el vuelo modificado
                Vuelo vueloModificado = new Vuelo(vuelo.getCiudadOrigen(), vuelo.getCiudadDestino(), vuelo.getNumVuelo(), Integer.parseInt(txtCosto.getText()), Integer.parseInt(txtDuracion.getText()), txtAerolinea.getText());
                vueloModificado.setLinea(vuelo.getLinea());
                
                //Se agrega el vuelo modificado
                modelVuelo.addElement(vueloModificado);
                menu.getListaVuelos().addLast(vueloModificado);
                
                //Se elimina el vuelo viejo de las listas
                modelVuelo.removeElement(vuelo);
                int index = menu.getListaVuelos().getIndex( vuelo.getNumVuelo()+"", menu.getListaVuelos()); //Se busca en cual indice se encuentra el vuelo que se desea borrar
                menu.getListaVuelos().eliminarNodo(index); //Se elimina el indice encontrado de la lista que estamos trabajando
                
                //Se modifica el vuelo tambien en la lista de ciudades adyacentes
                int indCiudad = menu.getListaCiudades().getIndexCiudad(vuelo.getCiudadOrigen(), menu.getListaCiudades());
                menu.getListaCiudades().getDataAtIndex(indCiudad).modificarVueloAdyacente(vueloModificado);
                
                //Se le avisa al usuario que el vuelo ha sido modificado de manera exitosa
                JOptionPane.showMessageDialog(null, "El vuelo ha sido modificado de manera exitosa", "Modificacion de vuelos", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            //Se llama al metodo de dibujar mapa para actualizarlo
            Grafo.dibujarMapa(menu.getListaVuelos(), menu.getListaCiudades());           
            
        }
        
    }//GEN-LAST:event_modifyVueloActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        
        this.setVisible(false); //Boton para cerrar la ventana
        this.addVuelo.setEnabled(true); //Se vuelven a habilitar todos los botones
        this.eraseVuelo.setEnabled(true);
        this.modifyVuelo.setEnabled(true);
        
    }//GEN-LAST:event_cerrarActionPerformed

    private void txtOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigenActionPerformed

    }//GEN-LAST:event_txtOrigenActionPerformed

    private void txtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinoActionPerformed
      
    }//GEN-LAST:event_txtDestinoActionPerformed

    private void txtNumVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumVueloActionPerformed
        
    }//GEN-LAST:event_txtNumVueloActionPerformed

    private void txtNumVueloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumVueloKeyTyped
        
        if(evt.getKeyChar() < '0' || evt.getKeyChar() > '9') evt.consume(); //Validacion para que nada mas puedan ser introducidos numeros positivos
        if(txtNumVuelo.getText().length() > 3) evt.consume(); //Se le coloca un limite a la cantidad de digitos que puede contener el numero de Vuelo
        
    }//GEN-LAST:event_txtNumVueloKeyTyped

    private void txtAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAerolineaActionPerformed
        
    }//GEN-LAST:event_txtAerolineaActionPerformed

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
   
    }//GEN-LAST:event_txtCostoActionPerformed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        
        if(evt.getKeyChar() < '0' || evt.getKeyChar() > '9') evt.consume(); //Validacion para que nada mas puedan ser introducidos numeros positivos    
        if(txtCosto.getText().length() > 4) evt.consume(); //Se le coloca un limita a los digitos que puede tener el costo de cada vuelo
        
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionActionPerformed
        
    }//GEN-LAST:event_txtDuracionActionPerformed

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
        
        if(evt.getKeyChar() < '0' || evt.getKeyChar() > '9') evt.consume(); //Validacion para que nada mas puedan ser introducidos numeros positivos
        if(txtDuracion.getText().length() > 1) evt.consume(); //Se le coloca un limita a los digitos que puede tener la duracion de cada vuelo
        
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void jListVueloMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListVueloMouseReleased
        
        //Metodo para mostrar los datos del vuelo seleccionado por el usuario
        if(this.modelVuelo.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "ERROR: La lista esta vacia", "ERROR", JOptionPane.WARNING_MESSAGE);
           
        } else {
            
            Object objeto = this.jListVuelo.getSelectedValue();
            Vuelo vuelo = (Vuelo) objeto;
            llenarCampos(vuelo);
            
        }
        
    }//GEN-LAST:event_jListVueloMouseReleased

    private void limpiarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCampoActionPerformed
        
        limpiarCampos(); //Se limpian simultaneamente todos los campos para brindar mayor facilidad al usuario
        
    }//GEN-LAST:event_limpiarCampoActionPerformed

    private void txtOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrigenKeyTyped
        
        if(Character.isDigit(evt.getKeyChar()))  evt.consume(); //Validacion para que solo puedan ser introducidos letras
        
    }//GEN-LAST:event_txtOrigenKeyTyped

    private void txtDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoKeyTyped
        
        if(Character.isDigit(evt.getKeyChar()))  evt.consume(); //Validacion para que solo puedan ser introducidos letras
        
    }//GEN-LAST:event_txtDestinoKeyTyped

    private void txtAerolineaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAerolineaKeyTyped
        
        if(Character.isDigit(evt.getKeyChar()))  evt.consume(); //Validacion para que solo puedan ser introducidos letras
        
    }//GEN-LAST:event_txtAerolineaKeyTyped
   
    public void limpiarCampos(){
        
        //Se limpian todos los campos a vacio nuevamente
        this.txtAerolinea.setText("");
        this.txtCosto.setText("");
        this.txtDestino.setText("");
        this.txtDuracion.setText("");
        this.txtNumVuelo.setText("");
        this.txtOrigen.setText("");
        
    }
    
    public boolean isCampoVacio(){
        
        //Este metodo nos ayudara a saber si hay algun campo vacio ya que no puede existir ninguno
        boolean origen = this.txtOrigen.getText().equalsIgnoreCase("");
        boolean destino = this.txtDestino.getText().equalsIgnoreCase("");
        boolean numVuelo = this.txtNumVuelo.getText().equalsIgnoreCase("");
        boolean costo = this.txtCosto.getText().equalsIgnoreCase("");
        boolean duracion = this.txtDuracion.getText().equalsIgnoreCase("");
        boolean aerolinea = this.txtAerolinea.getText().equalsIgnoreCase("");
        
        return origen || destino || numVuelo || costo || duracion || aerolinea;
        
    }
    
    public void llenarCampos(Vuelo vuelo){
        
        //Se llenan los campos con los datos del vuelo que se desea visualizar
        this.txtAerolinea.setText(vuelo.getAerolinea());
        this.txtCosto.setText(vuelo.getCosto()+"");
        this.txtDestino.setText(vuelo.getCiudadDestino());
        this.txtDuracion.setText(vuelo.getDuracion()+"");
        this.txtNumVuelo.setText(vuelo.getNumVuelo()+"");
        this.txtOrigen.setText(vuelo.getCiudadOrigen());
        
    }
    
    public boolean validarVuelo(String ciudad1, String ciudad2){
        
        //Este metodo revisara si ya existe un vuelo entre ambas ciudades ya que solo puede haber un vuelo por cada par de ciudades
        for (int i = 0; i < menu.getListaVuelos().getSize() ; i++) {
            
            //Se crearan los dos booleanos para tener un codigo mas presentable, se compara en pares
            boolean vueloExiste1 = (menu.getListaVuelos().getDataAtIndexVuelo(i).getCiudadDestino().equalsIgnoreCase(ciudad1) && (menu.getListaVuelos().getDataAtIndexVuelo(i).getCiudadOrigen().equalsIgnoreCase(ciudad2)));
            boolean vueloExiste2 = (menu.getListaVuelos().getDataAtIndexVuelo(i).getCiudadDestino().equalsIgnoreCase(ciudad2) && (menu.getListaVuelos().getDataAtIndexVuelo(i).getCiudadOrigen().equalsIgnoreCase(ciudad1)));
            
            if(vueloExiste1 || vueloExiste2){            
                return true;
            }
            
        }
        
        return false;
        
    }
    
    //Metodo para validar que las ciudades ingresadas existen
    public boolean existenCiudades(String origen, String destino){
        
        boolean origenExiste = false, destinoExiste = false;
        
        for (int i = 0; i < menu.getListaCiudades().getSize() ; i++) {
            
            if(menu.getListaCiudades().getDataAtIndex(i).getNombre().equalsIgnoreCase(origen)){
                
                origenExiste = true;
                
            }
            
            if(menu.getListaCiudades().getDataAtIndex(i).getNombre().equalsIgnoreCase(destino)){
                
                destinoExiste = true;
                
            }
            
        }
        
        return (origenExiste && destinoExiste);
        
    }
    
    //Metodo que nos dira si ya existe ese numero de vuelo
    public boolean existeNumVuelo(int numVuelo){
        
        boolean numVueloExiste = false; //Se considera que no existe en un principio
        
        for (int i = 0; i < menu.getListaVuelos().getSize(); i++) {
            
            if(menu.getListaVuelos().getDataAtIndexVuelo(i).getNumVuelo() == numVuelo) numVueloExiste = true;
            
        }
        
        return numVueloExiste;
        
    }
    
    //Se van agregando las ciudades adyacentes a su respectiva lista
    public void llenarListaAdyacencia(Ciudad origen, Ciudad adyacente, Vuelo vuelo){
            
            if(origen != null && adyacente != null){
                
                origen.agregarAdyacente(adyacente, vuelo);
                
            }
            
    }
    
    //Metodo para dibujar la arista que une las ciudades
    public void crearArista(Vuelo vuelo, Ciudad origen, Ciudad adyacente){
        
        vuelo.inicializarLinea();
        vuelo.getLinea().dibujarLinea(mapita.getGraphics());
        llenarListaAdyacencia(origen, adyacente, vuelo);
        
    }
    
    public DefaultListModel getModelVuelo(){     
        return this.modelVuelo;   
    }

    //Se utilizaran mas tarde para manejar la disponibilidad de los botones
    public JButton getAddVuelo() {
        return addVuelo;
    }

    public JButton getEraseVuelo() {
        return eraseVuelo;
    }

    public JButton getModifyVuelo() {
        return modifyVuelo;
    }

    public JTextField getTxtDestino() {
        return txtDestino;
    }

    public JTextField getTxtOrigen() {
        return txtOrigen;
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVuelo;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton eraseVuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListVuelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarCampo;
    private javax.swing.JButton modifyVuelo;
    private javax.swing.JTextField txtAerolinea;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNumVuelo;
    private javax.swing.JTextField txtOrigen;
    // End of variables declaration//GEN-END:variables
}
