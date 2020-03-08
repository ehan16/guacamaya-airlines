/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import Clases.*;
import Ventanas.Menu;

/**
 *
 * @author EH
 */
public class AlgoritmoFloydWarshall {
    
    
    public static int INFINITO = 0xFFFF;
    private int nnodos;
    private int nodos[][][];
    private Menu menu;
    private String[] rutas = new String[10];
    private int numRutas = 0;
        
    public AlgoritmoFloydWarshall(Menu menu, boolean porDuracion, Grafo grafo) {
            
            this.menu = menu;
            this.nnodos = menu.getListaCiudades().getSize();
            this.nodos = new int[nnodos][nnodos][2];
        
            if(porDuracion){
                    
                for (int i = 0; i < nnodos; i++) {
                        
                    for (int j = 0; j < nnodos; j++) {
                           
                        //Se va llenando la matriz con los valores correspondientes
                        Nodo aux = grafo.searchFlight(menu.getListaCiudades().getDataAtIndex(i).getNombre(), menu.getListaCiudades().getDataAtIndex(j).getNombre());
                            
                        if( i == j){
                           
                            nodos[i][j][0] = 0;
                            nodos[i][j][1] = 0;
                            
                        } else if ( aux != null){
                                                           
                            nodos[i][j][0] = aux.getDatoVuelo().getDuracion();
                            nodos[i][j][1] = i;
                             
                        } else {
                                
                            nodos[i][j][0] = INFINITO;
                            nodos[i][j][1] = i;
                                
                        }
                            
                    }
                        
                }
                    
            } else {
                    
                for (int i = 0; i < nnodos; i++) {
                        
                    for (int j = 0; j < nnodos; j++) {
                            
                        //Se va llenando la matriz con los valores correspondientes
                        Nodo aux = grafo.searchFlight(menu.getListaCiudades().getDataAtIndex(i).getNombre(), menu.getListaCiudades().getDataAtIndex(j).getNombre());
                            
                        if( i == j){
                            
                            nodos[i][j][0] = 0;
                            nodos[i][j][1] = 0;
                            
                        } else if ( aux != null){
                                           
                            nodos[i][j][0] = aux.getDatoVuelo().getCosto();
                            nodos[i][j][1] = i;
                             
                        } else {
                                
                            nodos[i][j][0] = INFINITO;
                            nodos[i][j][1] = i;
                                
                        }
                            
                    }
                        
                }
                   
            }
                
	}

    //Metodo para calcular los pesos finales de la matriz de pesos
    public void calcular() {
                
        for (int i = 0; i < this.nnodos; i++) {
                    
            for (int j = 0; j < this.nnodos; j++) {
                            
                for (int k = 0; k < this.nnodos; k++) {
                                    
                    if (this.nodos[i][k][0] + this.nodos[k][j][0] < this.nodos[i][j][0]) {
                        
                        this.nodos[i][j][0] = this.nodos[i][k][0]+ this.nodos[k][j][0];
			this.nodos[i][j][1] = k;
                        
                    }
		}
            }
	}
    }

    //Metodo que nos imprimira el camino mas corto
    public String caminocorto(int origen, int destino) {
            
	String camino;
                
	if (origen == destino) {
                    
            camino = menu.getListaCiudades().getDataAtIndex(origen).getNombre();
            
	} else {
                
            camino = caminocorto(origen, this.nodos[origen][destino][1]) + "->"+ menu.getListaCiudades().getDataAtIndex(destino).getNombre();
	
        }
        
        return camino;
                
    }
    
//    public void calcularRutas(int origen, int destino, String ruta){
//        
//        for (int j = 0; j < menu.getListaCiudades().getSize(); j++) {
//            
//            if(this.nodos[origen][j][1] != 0){
//            
//                if(j != destino){
//                    
//                    String aux = ruta + menu.getListaCiudades().getDataAtIndex(j).getNombre() + " ,";
//                    calcularRutas(j, destino, aux);
//                    
//                }
//                
//            } else {
//                
//                ruta += " " + menu.getListaCiudades().getDataAtIndex(j).getNombre();
//                this.rutas[this.numRutas] = ruta;
//                this.numRutas++;
//                
//            }
//        
//        }
//    }
//
//    public String[] getRutas() {
//        return rutas;
//    }
    

}
