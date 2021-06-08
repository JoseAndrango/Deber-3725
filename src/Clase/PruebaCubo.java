
package Clase;

public class PruebaCubo {
    public static void main(String[] args) {
        Cubo b1;
        int ancho;
        int alto;
        int profundo;
        alto = 10;
        ancho = 23;
        profundo = 40;
        b1 = new Cubo (ancho,alto,profundo); 
        System.out.println("el volumen del cubo en cm: "+b1.CalculoCubo());
        
    }
}
