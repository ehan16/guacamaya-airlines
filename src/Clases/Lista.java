
package Clases;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class Lista {
      
    //Atributos de las listas
    Nodo pFirst = null;
    int tamano = 0;
    
    //Para saber si la lista esta vacia
    public boolean esVacio(){       
       return pFirst == null;     
    }
    
    //Te indica el tamano de la lista
    public int getSize(){
        return tamano;    
    }
    
    public void printList(){
        Nodo aux = pFirst;
        if(esVacio()){
            System.out.println("La lista no tiene elementos");
        } else {
            for (int i = 0; i < tamano; i++) {
                System.out.print("["+ aux.getDatoCiudad().getNombre() + "]---> ");
                aux = aux.getpNext();
            }
        }
    }
    
    public void printListVuelos(){
        Nodo aux = pFirst;
        if(esVacio()){
            System.out.println("La lista no tiene elementos");
        } else {
            for (int i = 0; i < tamano; i++) {
                System.out.print("["+ aux.getDatoVuelo().getNumVuelo() + "]---> ");
                aux = aux.getpNext();
            }
        }
    }
    
    //Metodo para ayudar de ultimo un nodo
    public void addNodo(Nodo nodo){
        
        if(esVacio()){
            
            pFirst = nodo;          
            
        } else {
            
            int cont = 0;
            Nodo aux = pFirst;
//            System.out.println("EL PNEXT DE AUX ES "+aux.getpNext().getDatoCiudad().getNombre());
            System.out.println("VOY A ENTRAR AL WHILE");
            while(aux.getpNext() != null &&  cont != getSize()-1){  
                System.out.println("ESOTY EN LE WHILE   ");
                aux = aux.getpNext();
//                System.out.println("Aux ahorita es "+aux.getDatoCiudad().getNombre());
                cont++;
                if(aux.getpNext() == null) System.out.println("ES NULO");
//                System.out.println("EL PNEXT ES "+aux.getpNext().getDatoCiudad().getNombre());
            }
            
                System.out.println("SALI DEL WHILE");
            aux.setpNext(nodo);
            
            
        }
        
        tamano++; 
        
    }
    
    //Metodo para añadir al final de la lista cuando es vuelo
    public void addLast(Vuelo dato){
        
        Nodo nodo = new Nodo(dato);
        
        if(esVacio()){
            
            pFirst = nodo;          
            
        } else {
            
            Nodo aux = pFirst;
            
            while(aux.getpNext() != null){             
                aux = aux.getpNext();              
            }
            
            aux.setpNext(nodo);
            
        }
        tamano++; 
    }
    
    //Agregar de ultimo cuando es ciudad
    public void addLast(Ciudad dato){
        
        Nodo nodo = new Nodo(dato);
        
        if(esVacio()){
            
            pFirst = nodo;           
            
        } else {
            
            Nodo aux = pFirst;
            
            while(aux.getpNext() != null){           
                aux = aux.getpNext();          
            }
            
            aux.setpNext(nodo);
            
        }      
        tamano++;
    }
    
    //Agregar de ultimo cuando es un nodo con ambos datos, para la lista de adyacencia
    public void addLast(Ciudad ciudad, Vuelo vuelo){
        
        Nodo nodo = new Nodo(ciudad, vuelo);
        
        //ESTO ES PRUEBA
        System.out.println("Se anadio ciudad "+nodo.getDatoCiudad().getNombre()+" y vuelo "+nodo.getDatoVuelo().getNumVuelo());
        
        if(esVacio()){
            
            pFirst = nodo;
            
        } else {
            
            Nodo aux = pFirst;
            
            while(aux.getpNext() != null){              
                aux = aux.getpNext();             
            }
            
            aux.setpNext(nodo);
            
        }       
        tamano++;     
        
    }
    
    //Obtener informacion del nodo cuando es una ciudad
    public Ciudad getDataAtIndex(int indice){
        
        if(esVacio() || indice < 0 || indice > tamano){
            
            return null;
            
        } else {
            
            Nodo aux = pFirst;
            int i = 0;
            
            while(aux.getpNext() != null && i<indice){            
                aux = aux.getpNext();
                i++;           
            }
            
            return aux.getDatoCiudad();
            
        }
     
    }
    
    
    //Obtener datos del nodo cuando es un vuelo
    public Vuelo getDataAtIndexVuelo(int indice){
        
        if(esVacio() || indice < 0 || indice > tamano){
            
            return null;
            
        } else {
            
            Nodo aux = pFirst;
            int i = 0;
            
            while(aux.getpNext() != null && i<indice){              
                aux = aux.getpNext();
                i++;             
            }
            
            return aux.getDatoVuelo();
            
        }
     
    }
    
    //Metodo para eliminar elementos de la lista
    public void eliminarNodo(int index){

        if(!esVacio()){
            if (index < 0 || index >= tamano) {
           
            } else {
            
                if (index == 0) {
                    pFirst = searchNodo(index + 1);
                } else {
                    Nodo aux = searchNodo(index + 1);
                    searchNodo(index - 1).setpNext(aux);
                }
            
                tamano--;
            
            }
        }
     
    }
    
    //Metodo para eliminar mediante el pase de un nodo por parametro
    public void eliminarNodo(Nodo nodo){
        
        for (int i = 0; i < getSize() ; i++) {
            
//            if(nodo.equals(this.searchNodo(i)))     this.eliminarNodo(i);
            if(nodo.getDatoCiudad().getNombre().equalsIgnoreCase(searchNodo(i).getDatoCiudad().getNombre()))    this.eliminarNodo(i);
            
        }
        
    }
    
    //Metodo para vaciar la lista
    public void vaciarLista(Lista lista){
        
//        for (int i = 0; i < getSize(); i++) {
//            
//            this.eliminarNodo(i);
//            
//        }
        while(!lista.esVacio()){
            this.eliminarNodo(0);
        }
        
    }   
    
    //Devuelve en cual indice se encuentra la informacion que se busca en cuanto a vuelos
    public int getIndex (String info, Lista lista){
        
        int index = -1;
        
        for (int i = 0; i < lista.getSize() ; i++) {
            
            String dato = lista.searchNodo(i).getDatoVuelo().getNumVuelo() + "";
            
            if(dato.equalsIgnoreCase(info)){
                
                index = i;
                break;
                
            }
            
        }
        
        return index;
        
    }
    
    //Se encuentra el indice de la ciudad deseada
    public int getIndexCiudad (String info, Lista lista){
        
        int index = -1;
        
        for (int i = 0; i < lista.tamano ; i++) {
            
            String dato = lista.searchNodo(i).getDatoCiudad().getNombre();
            
            if(dato.equalsIgnoreCase(info)){
                
                index = i;
                break;
                
            }
            
        }
        
        return index;
        
    }
    
    //Devuelve el nodo en el indice solicitado
    public Nodo searchNodo(int position){
        
        Nodo nodo;
        
        if (position < 0 || getSize() <= position){
            
            return null;
            
        }
        
        nodo = pFirst;
        
        for (int i = 0; (i < position) && (nodo != null); i++) {
            
            nodo = nodo.getpNext();
        
        }
        
        return nodo;
    
    }
    
    //Metodo para encontrar el nodo que tiene el numero de vuelo que buscamos
    public Nodo searchNodoNumVuelo(int numVuelo){
        
        Nodo nodo = null;
        
        for (int i = 0; i < getSize(); i++) {
            
            if(this.getDataAtIndexVuelo(i).getNumVuelo() == numVuelo){
                
                nodo = this.searchNodo(i);
                break;
                
            }
        
        }
        
        return nodo;
    
    }
    
    //Metodo para buscar si hay un nodo en esas coordenadas
    public Nodo searchNodo(int x, int y){
        
        Nodo aux = null;
        for (int i = 0; i < getSize(); i++) {
            
            int posX = this.getDataAtIndex(i).getCoordenadasX();
            int posY = this.getDataAtIndex(i).getCoordenadasY();
            //Se verifica si el area oprimida corresponde al area del circulo
            if((x > posX) && (x < (posX + this.getDataAtIndex(i).getCirculo().getDiametro()))){
                
                if((y > posY) && (y < (posY + this.getDataAtIndex(i).getCirculo().getDiametro()))){
                    
                    aux = this.searchNodo(i); //Si el punto en donde se dio click coincide con un nodo, se devuelve ese nodo
                    break;
                    
                }
                
            }
            
        }
               
        return aux;
        
    }
    
    //Metodo para buscar ciudades por el nombre
    public Nodo searchNodo(String nombre){
        
        Nodo aux = null;
        
        for (int i = 0; i < getSize(); i++) {
            
            if(this.getDataAtIndex(i).getNombre().equalsIgnoreCase(nombre)){
                aux = this.searchNodo(i);
                break;
            }
            
        }
        
        return aux;
        
    }
    
    //Metodo para saber si existe determinado nodo en la lista 
    public boolean isContenido(Ciudad nodo){
        
        boolean contenido = false;
        
        for (int i = 0; i < this.getSize(); i++) {
            
            if(this.searchNodo(i).getDatoCiudad().getNombre().equalsIgnoreCase(nodo.getNombre()))  contenido = true;
            
        }
        
        return contenido;
        
    }
    
}
