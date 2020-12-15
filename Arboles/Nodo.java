package Arboles;

public class Nodo {
    String nombre;
    int año, edad;
    Nodo hijoIzquierdo, hijoDerecho;
    
    public  Nodo (String nom, int añoN){
        this.nombre=nom;
        this.hijoIzquierdo=null; 
        this.hijoDerecho=null;
        this.año=añoN;
        this.edad=0;
    }

}
