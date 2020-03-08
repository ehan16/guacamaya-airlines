
package Clases;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class Ciudad {
 
    //Atributo de la clase ciudad
    private String nombre, aeropuerto, pais;
    //Se crea una lista de ciudades adyacentes para conocer con cuales tiene conexion
    Lista ciudadesAdyacente; //Lista de las ciudades con las que tiene conexion
    Circulo circulo;
    int[] coordenadas = new int[2];
    
    //Constructor de la clse 
    public Ciudad(){
        
    }
    
    public Ciudad(String nombre, String aeropuerto, String pais){
        
        this.nombre = nombre.toUpperCase(); //Se pasa todo a mayuscula por razones de estetica
        this.aeropuerto = aeropuerto;
        this.pais = pais;
        this.ciudadesAdyacente = new Lista();
        
    } 
    
    public Ciudad(String nombre, String aeropuerto, String pais, int x, int y){
        
        this.nombre = nombre.toUpperCase(); //Se pasa todo a mayuscula por razones de estetica
        this.aeropuerto = aeropuerto.toUpperCase();
        this.pais = pais.toUpperCase();
        this.coordenadas[0] = x;
        this.coordenadas[1] = y;
        this.ciudadesAdyacente = new Lista();
        
    } 

    //Getters de las atrbutos de la ciudad
    public String getNombre() {
        return nombre;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString(){
        
        return nombre;
        
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }
    
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

    public Lista getCiudadesAdyacente() {
        return ciudadesAdyacente;
    }
    
    //Metodo que elimina todos los vuelos de una ciudad
    public void eliminarVuelos(Lista vuelos, String nombreCiudad){
        
        for (int i = 0; i < vuelos.getSize(); i++) {
            
            if(vuelos.getDataAtIndexVuelo(i).getCiudadDestino().equalsIgnoreCase(nombreCiudad)){
                
                vuelos.eliminarNodo(i);
                
            } else if (vuelos.getDataAtIndexVuelo(i).getCiudadOrigen().equalsIgnoreCase(nombreCiudad)){
                
                vuelos.eliminarNodo(i);
                
            }
            
        }
        
    }
    
    //Metodo para anadir ciudades adyacentes a la lista
    public void agregarAdyacente(Ciudad ciudad, Vuelo vuelo){
        
        this.ciudadesAdyacente.addLast(ciudad, vuelo);

    }
    
    //Metodo para eliminar ciudades adyacentes de la lista
    public void eliminarAdyacente(Ciudad ciudad){
        
        for (int i = 0; i < ciudadesAdyacente.getSize(); i++) {
            
            int index = ciudadesAdyacente.getIndexCiudad(ciudad.getNombre(), ciudadesAdyacente);
            //Solo ocurrira una o ninguna vez
            ciudadesAdyacente.eliminarNodo(index);
            
        }
        
    }
    
    //Metodo para modificar el vuelo adyacente
    public void modificarVueloAdyacente(Vuelo vuelo){
        
        ciudadesAdyacente.searchNodoNumVuelo(vuelo.getNumVuelo()).setDatoVuelo(vuelo);
        
    }
    
    //Metodo para settear los valores del circulo de la ciudad
    public void inicializarCirculo(int x, int y){
        
        Circulo circul = new Circulo(x, y, nombre);
        this.setCoordenadas(x, y);
        setCirculo(circul);
        
    }
    
}
