
package Clase;

public class Cubo {
    int ancho;
    int alto;
    int profundo;
    //construtor
    public Cubo(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public Cubo() {
        System.out.println("ingrese los lados del cubo");
    }
    public int CalculoCubo(){
        int cubo1 = (ancho * alto * profundo) ;
        return cubo1;
    }
}
