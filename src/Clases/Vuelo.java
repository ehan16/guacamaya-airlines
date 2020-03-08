
package Clases;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class Vuelo {
    
    //Atributos de la clase vuelo
    private String ciudadOrigen, ciudadDestino;
    private int numVuelo, costo, duracion;
    private String aerolinea;
    private Linea linea;
    private boolean camino = false;
    private int[] coordenadasOrigen = new int[2], coordenadasDestino = new int[2]; //Coordenadas de las ciudades del vuelo
    
    //Constructor de la clase vuelos
    public Vuelo(){
        
    }
    
    public Vuelo(String ciudadOrigen, String ciudadDestino, int numVuelo, int costo, int duracion, String aerolinea) {
        
        this.ciudadOrigen = ciudadOrigen.toUpperCase();
        this.ciudadDestino = ciudadDestino.toUpperCase();
        this.numVuelo = numVuelo;
        this.costo = costo;
        this.duracion = duracion;
        this.aerolinea = aerolinea.toUpperCase();
        
    }
    
    public Vuelo(int numVuelo, String aerolinea, int costo, int duracion){
        
        this.numVuelo = numVuelo;
        this.aerolinea = aerolinea.toUpperCase();
        this.costo = costo;
        this.duracion = duracion;
        
    } 
    
    //Getters y setters de la clase vuelo
    //Se omiten los setters de la ciudad origen y ciudad destino porque tecnicamente eso no deberia ser modificable
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public int getCosto() {
        return costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getAerolinea() {
        return aerolinea;
    }
    
    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea.toUpperCase();
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen.toUpperCase();
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino.toUpperCase();
    }
 
    @Override
    public String toString(){
        return numVuelo+""; 
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }
    
    public void setCoordenadasOrigen(int x, int y) {
        this.coordenadasOrigen[0] = x + 5; //Se le suma la mitad del diametro por razones de estetica
        this.coordenadasOrigen[1] = y + 5;
    }
    
    public int getCoordenadasXOrigen() {
        return coordenadasOrigen[0];
    }
    
    public int getCoordenadasYOrigen() {
        return coordenadasOrigen[1];
    }
    
    public void setCoordenadasDestino(int x, int y) {
        this.coordenadasDestino[0] = x + 5; //Se le suma la mitad del diametro por razones de estetica
        this.coordenadasDestino[1] = y + 5;
    }
    
    public int getCoordenadasXDestino() {
        return coordenadasDestino[0];
    }
    
    public int getCoordenadasYDestino() {
        return coordenadasDestino[1];
    }
    
    public void inicializarLinea(){
        
        Linea line = new Linea(coordenadasOrigen[0], coordenadasOrigen[1], coordenadasDestino[0], coordenadasDestino[1], this.numVuelo+"");
        setLinea(line);
        
    }

    public boolean isCamino() {
        return camino;
    }

    public void setCamino(boolean camino) {
        this.camino = camino;
    }
    
    
}
