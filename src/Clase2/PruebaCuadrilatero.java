
package Clase2;


public class PruebaCuadrilatero {
    public static void main (String[] args){
        Cuadrilatero c1;
        int lado1;
        int lado2;
        lado1 = 1;
        lado2 = 10;
        if (lado1 == lado2){
            c1 = new Cuadrilatero (lado1);
        } else {
            c1 = new Cuadrilatero (lado1,lado2);
        }
        System.out.println("el perimetro es: "+c1.Perimetro());
        System.out.println("el area es: "+c1.Area());
    }
}
