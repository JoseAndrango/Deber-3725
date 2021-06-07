
package Clase2;

public class Cuadrilatero {
    int lado1;
    int lado2;

    public Cuadrilatero (int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
//Para definir si los lados pertenecen a un cuadrado
    public Cuadrilatero(int lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    public int Perimetro (){
        int perimetro = 2*(lado1+lado2) ;
        return perimetro;
    }
    public int Area (){
        int area=(lado1*lado2);
        return area; 
    }
    
}

