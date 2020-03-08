
package Ventanas;

import Clases.*;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author Han, Serrano, Villegas
 */

public class VentanaArchivos extends javax.swing.JFrame {
    
    Menu menu; //Se instancia la clase menu ya que se necesitarán de sus atributos
    VentanaVuelos ventanaVuelo;
    VentanaCiudades ventanaCiudad;
    
    public VentanaArchivos(Menu menu, VentanaVuelos vuelos, VentanaCiudades ciudades) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.menu = menu;
        this.ventanaCiudad = ciudades;
        this.ventanaVuelo = vuelos;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escogerArchivo = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        cargarArchivo = new javax.swing.JButton();
        crearArchivo = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(604, 438));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 3));
        jPanel1.setMaximumSize(new java.awt.Dimension(604, 438));
        jPanel1.setMinimumSize(new java.awt.Dimension(604, 438));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargarArchivo.setBackground(new java.awt.Color(137, 93, 64));
        cargarArchivo.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        cargarArchivo.setForeground(new java.awt.Color(0, 0, 0));
        cargarArchivo.setText("Cargar archivo");
        cargarArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cargarArchivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cargarArchivo.setPreferredSize(new java.awt.Dimension(74, 26));
        cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(cargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 130, 50));

        crearArchivo.setBackground(new java.awt.Color(137, 93, 64));
        crearArchivo.setFont(new java.awt.Font("Bangla MN", 1, 14)); // NOI18N
        crearArchivo.setForeground(new java.awt.Color(0, 0, 0));
        crearArchivo.setText("Crear archivo");
        crearArchivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearArchivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crearArchivo.setPreferredSize(new java.awt.Dimension(74, 26));
        crearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(crearArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 130, 50));

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
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 110, 20));

        jLabel2.setFont(new java.awt.Font("Silom", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Repositorio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/miniGuaca.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hojasVentana.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -20, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoActionPerformed
        
        //Se utiliza el metodo de limpiar las listas para "empezar de nuevo" el programa
        //Se procede a ir leyendo el archivo CSV para ir llenando las listas
        
        //Se le pregunta al usuario si quiere guardar los datos actuales
        String[] opciones = {"Guardar", "Ignorar"};
        int seleccion = JOptionPane.showOptionDialog(null, "AVISO: Si no guarda los datos actuales, se perderan", "AVISO", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opciones, opciones[0]);
        
        if(seleccion == 0){
            
            this.crearArchivo.doClick(); //Se ejecuta el metodo de crear archivo si la opcion es guardar
            
        }
        
        try{
            
            JOptionPane.showMessageDialog(null, "Por favor escoja el archivo que desea cargar al sistema.", "Cargar archivo", JOptionPane.INFORMATION_MESSAGE);
            
            int result = escogerArchivo.showOpenDialog(this); //Se muestra la ventana para escoger el archivo
            
            if(result == JFileChooser.CANCEL_OPTION){
                
                //Por si el usuario ya no desea cargar el archivo
                JOptionPane.showMessageDialog(null, "Se ha cancelado la seleccion", "AVISO", JOptionPane.WARNING_MESSAGE);
                
            } else if(result == JFileChooser.APPROVE_OPTION){
            
                //Se vacian las listas para poder llenarlas de informacion nueva
                menu.getListaCiudades().vaciarLista(menu.getListaCiudades());
                menu.getListaVuelos().vaciarLista(menu.getListaVuelos());
                ventanaCiudad.getModelCiudad().clear();
                ventanaVuelo.getModelVuelo().clear();
                Grafo.dibujarMapa(menu.getListaVuelos(), menu.getListaCiudades());
            
                File archivoCargar = escogerArchivo.getSelectedFile(); //Se obtiene el archivo que se quiere cargar 
            
                FileReader reader = new FileReader(archivoCargar);
                BufferedReader buffReader = new BufferedReader(reader);
                String line;
            
                while ((line = buffReader.readLine()) != null && !(line.equalsIgnoreCase("fciudades"))){ 
                
                    //Una vez que lleguemos a fciudades significa que se ha acabado las ciudades y se tiene que pasar a los vuelos
                    String[] palabrasSeparadas = line.split(", ");  //Se distinguen las palabras separadas por la ", "
                    String nombre = palabrasSeparadas[0]; 
                    String aeropuerto = palabrasSeparadas[1]; 
                    String pais = palabrasSeparadas[2]; 
                
                    //Se crea un nuevo objeto de la clase ciudad
                    Ciudad ciudad = new Ciudad(nombre, aeropuerto, pais);
                    ventanaCiudad.crearNodo(this.numeroRandom(), this.numeroRandom(), ciudad); //Se dibuja el circulo en el mapa

                    //Se agrega la ciudad a la lista
                    menu.getListaCiudades().addLast(ciudad);
                    ventanaCiudad.getModelCiudad().addElement(ciudad); //Se agregan las ciudades al model
                
                }
            
                while ((line = buffReader.readLine()) != null && !(line.equalsIgnoreCase("fvuelos"))){
                
                    //Si se llega a fvuelos, significa que ya se acabaron los vuelos
                    String[] palabrasSeparadas = line.split(", ");  //Se distinguen las palabras separadas por la ", "
                    int numVuelo = Integer.parseInt(palabrasSeparadas[0]);
                    String aerolinea = palabrasSeparadas[1];
                    int costo = Integer.parseInt(palabrasSeparadas[2]);
                    int duracion = Integer.parseInt(palabrasSeparadas[3]);
                
                    //Se crea un objeto de la clase vuelo
                    Vuelo vuelo = new Vuelo(numVuelo, aerolinea, costo, duracion);
                    //En el siguiente paso se completara la informacion de cada vuelo con las ciudades correspondientes
                
                    //Se agrega el vuelo a la lista
                    menu.getListaVuelos().addLast(vuelo);
                
                }
            
                //Ahora se procede con las conexiones que nos daran las ciudades de cada vuelo
            
                while ((line = buffReader.readLine()) != null){
                
                    //Se lee el archivo hasta la ultima linea sin mas validaciones
                    String[] palabrasSeparadas = line.split(", "); 
                    String numVuelo = palabrasSeparadas[2]; //Se utilizara para validar si corresponde con el vuelo
                    String origen = palabrasSeparadas[0];
                    String destino = palabrasSeparadas[1];
                    
                    //Se procede a obtener las coordenadas de cada ciudad, origen y destino, para colocarlas en el vuelo
                    int[] posOrigen = new int[2];
                    int[] posDestino = new int[2];
                    
                    //Encontramos en que indice esta la ciudad cuyas coordenadas queremos averiguar
                    int indexOrigen = menu.getListaCiudades().getIndexCiudad(origen, menu.getListaCiudades());
                    int indexDestino = menu.getListaCiudades().getIndexCiudad(destino, menu.getListaCiudades());
                    
                    //Se guardan las coordenadas en sus variables respectivas 
                    posOrigen[0] = menu.getListaCiudades().getDataAtIndex(indexOrigen).getCoordenadasX(); //De la ciudad origen
                    posOrigen[1] = menu.getListaCiudades().getDataAtIndex(indexOrigen).getCoordenadasY();
                    
                    posDestino[0] = menu.getListaCiudades().getDataAtIndex(indexDestino).getCoordenadasX(); //De la ciudad destino
                    posDestino[1] = menu.getListaCiudades().getDataAtIndex(indexDestino).getCoordenadasY();
                    
                    int index = menu.getListaVuelos().getIndex(numVuelo, menu.getListaVuelos());
                    menu.getListaVuelos().getDataAtIndexVuelo(index).setCiudadOrigen(origen);
                    menu.getListaVuelos().getDataAtIndexVuelo(index).setCiudadDestino(destino);
                    menu.getListaVuelos().getDataAtIndexVuelo(index).setCoordenadasOrigen(posOrigen[0], posOrigen[1]);
                    menu.getListaVuelos().getDataAtIndexVuelo(index).setCoordenadasDestino(posDestino[0], posDestino[1]);
                    //Se termina de llenar los datos de cada vuelo (ciudades y coordenadas)
                    
                    //Se agregan los vuelos al model
                    ventanaVuelo.getModelVuelo().addElement(menu.getListaVuelos().getDataAtIndexVuelo(index));
                    //Se dibujara la arista en el mapa 
                    ventanaVuelo.crearArista(menu.getListaVuelos().getDataAtIndexVuelo(index), menu.getListaCiudades().getDataAtIndex(indexOrigen), menu.getListaCiudades().getDataAtIndex(indexDestino));
                   
                }
            
                buffReader.close(); //Se cierra el reader                
                Grafo.dibujarMapa(menu.getListaVuelos(), menu.getListaCiudades()); //Se llama al metodo de dibujar mapa para actualizarlo
            
            }
            
        } catch (IOException e){
            
            JOptionPane.showMessageDialog(null, "ERROR: no se pudo leer el archivo. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            //En caso de que se genere algun error a la hora de leer el archivo
            
        }   
             
    }//GEN-LAST:event_cargarArchivoActionPerformed

    private void crearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearArchivoActionPerformed
              
        try{
            
            //Se crea una variable auxiliar que contendrá el nombre como desea llamar el archivo
            String nombreArchivo;

            nombreArchivo = JOptionPane.showInputDialog(null, "¿Cómo desea llamar el archivo de texto. \nSi se deja el campo vacío, se llamará MyFile.", "Archivo", JOptionPane.INFORMATION_MESSAGE );
            //Se le da la potestad al usuario de elegir el nombre del archivo, obviamente no puede estar vacio el nombre
            
            if((nombreArchivo != null)){
            //Verificacion por si el usuario ha oprimido el boton de cancelar 
            
                if(nombreArchivo.equalsIgnoreCase("")) nombreArchivo = "MyFile"; //Como se ha dicho, si el campo es vacio, se llamara MyFile
            
                //Se utilizan las librerias de Java pertinentes para la escritura de datos en un archivo de texto
                FileWriter write = new FileWriter(nombreArchivo+".txt");
                BufferedWriter buffWriter = new BufferedWriter(write);
            
                for(int i = 0; i < menu.getListaCiudades().getSize(); i++){
                
                    //Se van escribiendo los datos de cada vuelo, se accede al dato del nodo
                    buffWriter.write(menu.getListaCiudades().getDataAtIndex(i).getNombre() +", "+menu.getListaCiudades().getDataAtIndex(i).getAeropuerto()+", "+menu.getListaCiudades().getDataAtIndex(i).getPais());
                    buffWriter.newLine(); //Se mueve a la siguiente linea, cuestiones de estetica
                
                }
            
                buffWriter.write("fciudades"); //Para poder conocer cuando termina el listado de ciudades
                buffWriter.newLine();
            
                for (int i = 0; i < menu.getListaVuelos().getSize(); i++) {
                
                    //Se van escribiendo los datos de cada vuelo, se accede al dato del nodo y se usan sus metodos
                    buffWriter.write(menu.getListaVuelos().getDataAtIndexVuelo(i).getNumVuelo()+", "+menu.getListaVuelos().getDataAtIndexVuelo(i).getAerolinea()+", "+menu.getListaVuelos().getDataAtIndexVuelo(i).getCosto()+", "+menu.getListaVuelos().getDataAtIndexVuelo(i).getDuracion());
                    buffWriter.newLine();
                
                }
            
                buffWriter.write("fvuelos"); //Para poder conocer cuando termina el listado de vuelos
                buffWriter.newLine();
            
                for (int i = 0; i < menu.getListaVuelos().getSize(); i++) {
                
                    //Se accede a la informacion del nodo para usar sus metodos y obneter los nombres necesarios
                    buffWriter.write(menu.getListaVuelos().getDataAtIndexVuelo(i).getCiudadOrigen()+ ", " + menu.getListaVuelos().getDataAtIndexVuelo(i).getCiudadDestino()+ ", " + menu.getListaVuelos().getDataAtIndexVuelo(i).getNumVuelo());
                    buffWriter.newLine();
                
                }
            
                buffWriter.close(); //Se tiene que finalizar el escritor 
            
                JOptionPane.showMessageDialog(null, "Se ha creado el archivo de texto plano de manera exitosa", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                //Se le informa al usuario que se pudo realizar de manera exitosa el archivo deseado
                
            } else {
                
                //Por si el usuario ya no desea crear el archivo
                JOptionPane.showMessageDialog(null, "Se ha cancelado la seleccion", "AVISO", JOptionPane.WARNING_MESSAGE);
                
            }
            
        } catch (IOException e){
            
            JOptionPane.showMessageDialog(null, "ERROR: no se pudo crear el archivo. \nIntente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            //En caso de que se genere algun error a la hora de crear el archivo
            
        } 
        
    }//GEN-LAST:event_crearArchivoActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
 
        this.setVisible(false);  //Boton para cerrar la ventana

    }//GEN-LAST:event_cerrarActionPerformed

    //Se hace un metodo que devuelva numeros random para darle coordenadas aleatorias a los nodos de cada ciudad
    public int numeroRandom(){
        
        int num = (int)((Math.random()*400)+10);
        
        return num;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarArchivo;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton crearArchivo;
    private javax.swing.JFileChooser escogerArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
