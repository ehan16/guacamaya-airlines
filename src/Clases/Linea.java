

package Clases;
import java.awt.*;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class Linea {
    
    //Varirables de la clase
    private int xInicio, yInicio, xFinal, yFinal;
    private Color color;
    private float grosorLinea;
    private String etiqueta; //Este sera el numero del vuelo

    //Constructor de la clase
    public Linea(int xInicio, int yInicio, int xFinal, int yFinal, String nombre){
        
        // inicializando variables de instancia
        this.xInicio = xInicio;
        this.yInicio = yInicio;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        this.etiqueta = nombre;
        grosorLinea = 1f;
        color = Color.black;
 
    }
    
    //Metodo para dibujar la linea que unira los nodos conectados por un vuelo
    public void dibujarLinea(Graphics graph){
        
        int xAux = 0; int yAux = 0;
        
        ((Graphics2D)graph).setColor(getColor());
        ((Graphics2D)graph).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(grosorLinea);
        ((Graphics2D)graph).setStroke(stroke);
        
        ((Graphics2D)graph).drawLine(xInicio, yInicio, xFinal, yFinal);
        
        if(xInicio <= xFinal)   xAux=((xFinal - xInicio)/2) + xInicio;       
        if(xInicio > xFinal)    xAux=((xInicio - xFinal)/2) + xFinal;
        if(yInicio < yFinal)    yAux=((yFinal - yInicio)/2) + yInicio;
        if(yInicio >= yFinal)   yAux=((yInicio - yFinal)/2) + yFinal;
        
        //Se imprime el numero de vuelo para reconocer cual es
        Font fuente=new Font("Monospaced",Font.PLAIN, 12);
        graph.setFont(fuente);
        ((Graphics2D)graph).drawString(etiqueta, xAux, yAux);    
        
        stroke = new BasicStroke(1);
        ((Graphics2D)graph).setStroke(stroke);
        
    }
//    private int mayor(int n1,int n2){
//        return (n1 > n2) ? n1 : n2;
//    }
//    
//    private int menor(int n1,int n2){
//        return (n1 < n2) ? n1 : n2;
//    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
    
    public void setGrosorLinea(float grosorLinea){
        this.grosorLinea = grosorLinea;
    }
    
    public float getGrosorLinea(){
        return grosorLinea;
    }
    
    public void setEtiqueta(String etiqueta){
        this.etiqueta= etiqueta;
    }
    
    public String getEtiqueta(){
        return etiqueta;
    }

    public int getxInicio() {
        return xInicio;
    }

    public void setxInicio(int xInicio) {
        this.xInicio = xInicio;
    }

    public int getyInicio() {
        return yInicio;
    }

    public void setyInicio(int yInicio) {
        this.yInicio = yInicio;
    }

    public int getxFinal() {
        return xFinal;
    }

    public void setxFinal(int xFinal) {
        this.xFinal = xFinal;
    }

    public int getyFinal() {
        return yFinal;
    }

    public void setyFinal(int yFinal) {
        this.yFinal = yFinal;
    }

    
}
