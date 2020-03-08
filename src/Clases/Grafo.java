
package Clases;

import static Ventanas.Mapa.mapita;
import Ventanas.Menu;
import java.awt.Color;

/**
 *
 * @author Han, Serrano, Villegas
 */
public class Grafo {
    
    Menu menu; //Se instancia el menu para poder acceder a las listas
        
    //Constructor de la clase
    public Grafo(Menu menu){
            
        this.menu = menu;
            
    }
        
    //Metodos de la clase
        
    //Se vuelven a reestablecer los colores originales una vez hecho todos los procedimientos
    public void colorOriginal(){
        
        if(!menu.getListaCiudades().esVacio()){
            
            for (int i = 0; i < menu.getListaCiudades().getSize() ; i++) {
                
                menu.getListaCiudades().getDataAtIndex(i).getCirculo().setColor(Color.ORANGE);
                
            }
            
            if(!menu.getListaVuelos().esVacio()){
                
                for (int i = 0; i < menu.getListaVuelos().getSize() ; i++) {
                    
                    menu.getListaVuelos().getDataAtIndexVuelo(i).getLinea().setColor(Color.BLACK);
                    menu.getListaVuelos().getDataAtIndexVuelo(i).getLinea().setGrosorLinea(1);
                    
                }
                
            }
            
        }
        
    }
    
    //Metodo para dibujar todos las ciudades de la lista en el mapa
    public static void dibujarCiudades(Lista ciudades){

        for (int i = 0; i < ciudades.getSize() ; i++) {
            
            ciudades.getDataAtIndex(i).getCirculo().dibujarCirculo(mapita.getGraphics());
            
        }
        
    }
    
    //Metodo para dibujar todos los vuelos de la lista
    public static void dibujarVuelos(Lista vuelos){

        for (int i = 0; i < vuelos.getSize() ;i++) {
            
            vuelos.getDataAtIndexVuelo(i).getLinea().dibujarLinea(mapita.getGraphics());
            
        }
        
    }
    
    //Metodo para refrescar el visual del mapa por cada ocurrencia, ya sea agregar, modificar o eliminar
    //Se crea un metodo static para no tener que instanciar un objeto de la clase grafo en todas las ventanas 
    public static void dibujarMapa(Lista vuelos, Lista ciudades){ 
        
        mapita.paint(mapita.getGraphics());
        dibujarCiudades(ciudades);
        dibujarVuelos(vuelos);
        
    }      
    
    //Metodo para saber si dos ciudades son adyacentes
    public boolean isAdyacente(String origen, String destino){
        
        boolean encontrado = false;
        Nodo ciudadOrigen = menu.getListaCiudades().searchNodo(origen);
//        Ciudad ciudadDestino = menu.getListaCiudades().searchNodo(destino).getDatoCiudad();
        
        if(ciudadOrigen != null){
        
            for (int i = 0; i < ciudadOrigen.getDatoCiudad().getCiudadesAdyacente().getSize(); i++) {
            
                if(ciudadOrigen.getDatoCiudad().getCiudadesAdyacente().searchNodo(i).getDatoCiudad().getNombre().equalsIgnoreCase(destino)){
                
                    encontrado = true;
                    break;
                
                }
            
            }
        }
        
        return encontrado;
        
    }
    
    //Metodo para devolver el vuelo que une dos ciudades
    public Nodo searchFlight(String origen, String destino){
        
        Nodo aux = null;
  
        if(this.isAdyacente(origen, destino)){
        
            for (int i = 0; i < menu.getListaVuelos().getSize(); i++) {
            
                if(menu.getListaVuelos().getDataAtIndexVuelo(i).getCiudadOrigen().equalsIgnoreCase(origen) && menu.getListaVuelos().getDataAtIndexVuelo(i).getCiudadDestino().equalsIgnoreCase(destino)){
                
                    aux = menu.getListaVuelos().searchNodo(i);
                    break;
                
                }
        
            }
        
        }
        
        return aux;
        
    }
    
}
