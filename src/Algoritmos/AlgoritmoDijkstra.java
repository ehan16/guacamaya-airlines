
package Algoritmos;

import Clases.*;
import static Ventanas.Mapa.mapita;
import Ventanas.Menu;
import java.awt.Color;

/**
 *
 * @author Han, Serrano, Villegas
 */


public class AlgoritmoDijkstra {
    
    //Atributos de la clase
    private int[][] pesos;
    private int[] ultimo;
    private int[] D;
    private boolean [] F;
    private int[] camino;
    private int origen;
    private int n;
    private static int INFINITO = 0xFFFF;
    private int destino;
   
    public AlgoritmoDijkstra(int origen, int destino, Grafo grafo, Menu menu, boolean porDuracion){
        
        n = menu.getListaCiudades().getSize();
        this.origen = origen;
        ultimo = new int [n];
        D = new int[n];
        F = new boolean [n];
        camino = new int[n]; 
        pesos = new int[n][n];
        
        if(porDuracion){ //Si el usuario decide encontrar el camino mas corto por duracion
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    
                    Nodo aux = grafo.searchFlight(menu.getListaCiudades().getDataAtIndex(i).getNombre(), menu.getListaCiudades().getDataAtIndex(j).getNombre());
                    if(i == j){

                        pesos[i][j] = 0; //En caso de que el vuelo sea hacia si mismo, es cero porque no existe
                    
                    } if(aux != null){
                       
                        pesos[i][j] = aux.getDatoVuelo().getDuracion(); //Se coloca el peso del camino
                   
                    } else {
                        
                        pesos[i][j] = INFINITO; //Si no existe conexion, entonces el peso es infinito
                        
                    }
                }
            }
            
        } else { //De no ser asi, es por costo
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    
                    Nodo aux = grafo.searchFlight(menu.getListaCiudades().getDataAtIndex(i).getNombre(), menu.getListaCiudades().getDataAtIndex(j).getNombre());
                    if(i == j){

                        pesos[i][j] = 0; //En caso de que el vuelo sea hacia si mismo, es cero porque no existe
                    
                    } if(aux != null){
                       
                        pesos[i][j] = aux.getDatoVuelo().getCosto(); //Se coloca el peso del camino
                   
                    } else {
                        
                        pesos[i][j] = INFINITO; //Si no existe conexion, entonces el peso es infinito
                        
                    }
                }
            }
            
        }
        
        for (int i = 0; i < camino.length; i++) {
            camino[i] = 999;
        }
        
    }
 
    public void caminoMinimos(){
        
        //valores iniciales
        for (int i = 0; i < n; i++){
            
            F[i] = false;
            D[i] = pesos[origen][i];
            ultimo[i] =  origen;
            
        }
        
        F[origen] = true; 
        D[origen] = 0;
        
        //Pasos para marcar los n-1 vertices 
        for (int i = 1; i < n; i++) {
            
            int v = minimo();
            //selecciona vertice no marcado de menor distancia 
            F[v] = true;
            // actualizada distancia de vertices no marcados
            
            for (int w = 1; w < n; w++) {
                if (!F[w]) {
                    if ((D[v] + pesos[v][w] < D[w])) {
                        D[w] = D[v] + pesos[v][w];
                        ultimo[w] = v;
                    }
                }
            }
        }
    }
    
    private int minimo(){
        
        int mx = INFINITO;
        int v = 1;
        
        for (int j = 1; j < n; j++) {
            
            if (!F[j] && (D[j] <= mx)){
                
                mx = D[j];
                v = j;
                
            }
            
        }
        
        return v;
    }
    
    public void recuperaCamino(int v){
        
        int anterior = ultimo[v];
        if (v != origen){
        
            recuperaCamino(anterior); // vuelve al último del último

            for (int i = 0; i < n; i++) {
            
                if(camino[i] == 999){
                
                    camino[i] = v;
                    break;
                
                }
            
            }
    
        } else {
    
            camino[0] = origen;
    
        }

    }
    
    public int[] getCamino() {
        return camino;
    }

    public void setCamino(int[] camino) {
        this.camino = camino;
    }
 
}
