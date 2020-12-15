package Arboles;

public class procesos {
    int cantidad=0;
    Nodo Padre=null;
    Nodo Raiz=null;
    int altura;
 
    public void agregarNodo (Nodo nodoActual){
     nodoActual.edad=2020-nodoActual.año;
     if(Padre==null){
         Padre=nodoActual;
         Raiz=nodoActual;
         cantidad++;  
     }
     else{
         if(nodoActual.año<Padre.año){
             if(Padre.hijoIzquierdo==null){
                 Padre.hijoIzquierdo=nodoActual;
                 Padre=Raiz;
                  cantidad++;  
         }
             else{
                 Padre=Padre.hijoIzquierdo;
                 agregarNodo(nodoActual);
             }
         }
            else{
             if(Padre.hijoDerecho==null){
              Padre.hijoDerecho=nodoActual;
              Padre=Raiz;
              cantidad++;  
             }
             else{
              Padre=Padre.hijoDerecho;
              agregarNodo(nodoActual);
             }     
        }    
     }
    }
    
       public void  altura(Nodo reco, int nivel){
       if(reco!=null){
           if(nivel>altura){
           altura=nivel;
       }
           altura(reco.hijoIzquierdo,nivel+1);
           altura(reco.hijoDerecho,nivel+1);
       }
       }
   public int altura(){
       altura=0;
       altura(Raiz, 1);
          return altura;
   }
public void inOrden(Nodo r){
if(r!=null){
    inOrden(r.hijoIzquierdo);
    System.out.print(r.nombre+" | ");
    inOrden(r.hijoDerecho);
    }
}

public void preOrden(Nodo r){
    if(r!=null){
    System.out.print(r.nombre+" | ");
    preOrden(r.hijoIzquierdo);
    preOrden(r.hijoDerecho);
    }
}

public void postOrden(Nodo r){
if(r!=null){
    postOrden(r.hijoIzquierdo);
    postOrden(r.hijoDerecho);
    System.out.print(r.nombre+" | ");
}
}
   
   Nodo menor=null;
    public  int menor(Nodo raiz) {
      Nodo aux=raiz;
        if (menor==null){
            menor=raiz;
        }
        if(aux!=null){
            if(aux.edad<menor.edad){
                menor=aux;
            }
            menor(aux.hijoIzquierdo);
            menor(aux.hijoDerecho);
        }
   return menor.edad;
        }

    Nodo mayor=null;
    public  int mayor(Nodo raiz) {
      Nodo aux=raiz;
        if (mayor==null){
            mayor=raiz;
        }
        if(aux!=null){
            if(aux.edad>mayor.edad){
                mayor=aux;
            }
            mayor(aux.hijoIzquierdo);
            mayor(aux.hijoDerecho);
        }
   return mayor.edad;
        }
       
   public int diferencia(int mayor, int menor){
       int diferencia =mayor-menor;
       return diferencia;  
   } 
   
  int suma=0;
   public  int suma(Nodo raiz) { 
       suma=suma+raiz.edad;
       if(raiz.hijoIzquierdo!=null){
            suma(raiz.hijoIzquierdo);
        }
        if(raiz.hijoDerecho!=null){
            suma(raiz.hijoDerecho);
        }        
   return suma;
   }

 float promedio=0;
  public float promedio(float promedio){
    promedio=promedio/cantidad;  
   return promedio;
  }   
}
