
package Clases;

import java.awt.*;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class Circulo
{
    // Variables de la clase
    private int x, y;
    private Color color;
    private int diametro = 10;
    private String etiqueta; //Correspondera al nombre que aparecera del nodo
    private Font fuente = new Font("Monospaced",Font.BOLD, 14);
    private int izquierda;
    private int grosorBorde = 2;
    
    //Constructor de la clase
    public Circulo(int x, int y, String nombre){
        
        this.x = x;
        this.y = y;
        color = Color.ORANGE;
        etiqueta = nombre; //Nombre de la ciudad
        izquierda = 5;
        
    }
    
    //Metodo para dibujar el circulo en el mapa
    public void dibujarCirculo(Graphics graph){
            
        //Se utilizan los metodos de la libreria para ir creando el circulo
        ((Graphics2D)graph).setColor(color);
        ((Graphics2D)graph).setStroke(new BasicStroke(getGrosorBorde()));
        ((Graphics2D)graph).fillOval(x, y,diametro,diametro);
        ((Graphics2D)graph).setColor(Color.black);
        ((Graphics2D)graph).drawOval(x, y, diametro, diametro);
        ((Graphics2D)graph).drawString(etiqueta, x - (izquierda), y);
        ((Graphics2D)graph).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
    
    public void setDiametro(int diametro){
        this.diametro = diametro;
    }
    
    public int getDiametro(){
        return diametro;
    }
    
    public void setEtiqueta(String etiqueta){
        this.etiqueta= etiqueta;
    }
    
    public void setEtiqueta(String etiqueta,boolean izquierda){
        this.etiqueta= etiqueta;
    }
    
    public String getEtiqueta(){
        return etiqueta;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    public int isIzquierda() {
        return izquierda;
    }

    public void setIzquierda(int izquierda) {
        this.izquierda = izquierda;
    }

    public int getGrosorBorde() {
        return grosorBorde;
    }

    public void setGrosorBorde(int grosorBorde) {
        this.grosorBorde = grosorBorde;
    }
    
}
