
package Clases;

/**
 *
 * @author Han, Serrano, Villegas
 */
public class Nodo {
    
    //Atributos de la clase Nodo
    private Nodo pNext;
    private Ciudad datoCiudad;
    private Vuelo datoVuelo;
    
    //Constructor
    public Nodo(){
    }
    
    public Nodo(Ciudad ciudad, Vuelo vuelo){ 
        
        this.datoCiudad = ciudad;
        this.datoVuelo = vuelo;
        this.pNext = null;
        
    }  
    
    //Para cuando el nodo sea una ciudad
    public Nodo (Ciudad dato){
        
        this.datoCiudad = dato;
        this.pNext = null; 
        
    }
    
    public Ciudad getDatoCiudad(){     
        return datoCiudad;  
    }
        
    //Para cuando el nodo sea un vuelo
    public Nodo (Vuelo dato){     
        
        this.datoVuelo = dato;
        this.pNext = null;      
        
    }
    
    //Metodos de la clase nodo
    
    public Vuelo getDatoVuelo(){        
        return datoVuelo;       
    }

    public void setDatoVuelo(Vuelo datoVuelo) {
        this.datoVuelo = datoVuelo;
    }
          
    public Nodo getpNext() {
        return pNext;
    }
        
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;   
    }

}
