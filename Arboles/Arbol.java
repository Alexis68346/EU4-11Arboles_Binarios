package Arboles;

import java.util.Scanner;

public class Arbol {
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
             
             
                 procesos arbol =new procesos();
                 int opc, año, elemento;
                 int opc2=0;

            Nodo nodoActual5=new Nodo("Alicia",2009);
            Nodo nodoActual10=new Nodo("Cristal",1993);
            Nodo nodoActual9=new Nodo("Carmen",1970);
            Nodo nodoActual6=new Nodo("Cesar",2005);
            Nodo nodoActual7=new Nodo("Roberto",1982);
            Nodo nodoActual8=new Nodo("Fernando",1981);
            Nodo nodoActual12=new Nodo("Martha",1990);
            Nodo nodoActual1=new Nodo("Ana", 1997);
            Nodo nodoActual4=new Nodo("Lalo",2002);
            Nodo nodoActual2=new Nodo("Joseline",2003);
            Nodo nodoActual3=new Nodo("Ramiro",2001);            
            Nodo nodoActual11=new Nodo("Gustavo",1986);

            arbol.agregarNodo(nodoActual1);
            arbol.agregarNodo(nodoActual2);
            arbol.agregarNodo(nodoActual3);
            arbol.agregarNodo(nodoActual4);
            arbol.agregarNodo(nodoActual5);
            arbol.agregarNodo(nodoActual6);
            arbol.agregarNodo(nodoActual7);
            arbol.agregarNodo(nodoActual8);
            arbol.agregarNodo(nodoActual9);
            arbol.agregarNodo(nodoActual10);
            arbol.agregarNodo(nodoActual11);
            arbol.agregarNodo(nodoActual12); 
            
       do{ 
        System.out.println("\n                            Menu"
                + "\n 1. ¿Quien es la persona mas pequeña y que edad tiene? "
                + "\n 2. ¿Quien es la persona mas grande y que edad tiene? "
                + "\n 3. ¿Cuantos años de diferencia tiene la persona mas grande y la persona mas chica? "
                + "\n 4. ¿Cuantos participantes hay? "
                + "\n 5.¿Cuanto es la suma de las edades de los participantes "
                + "\n 6. ¿Cual es el promedio de edad de los participantes? "
                + "\n 7. Mostrar altura "
                + "\n 8. Mostrar In-Orden "
                + "\n 9. Mostrar Pre-orden "
                + "\n 10. Mostrar Pos-orden "
                + "\n 11. Salir del programa "
                + "\n Elige una Opcion: ");
        
        System.out.println("..............................................................................................");
        opc=leer.nextInt();
        switch(opc){  
            case 1:  
            System.out.println("Su edad es: "+arbol.menor(arbol.Raiz)+" \nSu nombre es: "+arbol.menor.nombre);
            break;
            case 2:
            System.out.println("Su edad es: "+arbol.mayor(arbol.Raiz)+"\nSu nombre es: "+arbol.mayor.nombre);
            break;
            case 3:
            int mayor=arbol.mayor(arbol.Raiz);
            int menor=arbol.menor(arbol.Raiz);
            System.out.print(arbol.diferencia(mayor,menor)+" años");
            break;
            case 4:
            System.out.println(arbol.cantidad+" participantes.");
            break;
            case 5:
            System.out.println(arbol.suma(arbol.Raiz)+" años");
            arbol.suma=0;
            break;
            case 6:
            float suma=arbol.suma(arbol.Raiz);
            System.out.println("Promedio de la edades: "+arbol.promedio(suma));
            arbol.suma=0;
            break;
            case 7:
            System.out.println("Altura: "+ arbol.altura());
            break;
            case 8:
            arbol.inOrden(arbol.Raiz);                    
            break;
            case 9:
            arbol.preOrden(arbol.Raiz);
            break;
            case 10:
            arbol.postOrden(arbol.Raiz);
            break;
            case 11: 
                System.out.println("Saliendo.......");
                System.exit(0);
                break;
            default:System.out.println("Intente con una opcion del menu.");
        }
       }while(opc2!=11);
    }
    
}
