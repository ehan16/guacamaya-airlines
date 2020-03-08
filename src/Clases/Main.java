
package Clases;

import Ventanas.Mapa;
import Ventanas.Menu;

/**
 *
 * @author Han, Serrano, Villegas
 */

public class Main {
    
    public static Menu menu;
    public static Mapa mapa;
    
    public static void main(String[] args) {
        
        menu = new Menu();
        mapa = new Mapa(menu);
        
//        mapa.setVisible(true);
        menu.setVisible(true);
        
    }
    
}
