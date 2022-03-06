package Model;

import Model.Listas.ListaDoble;
import Model.Listas.NodoDoble;

public class Polinomio extends ListaDoble{
    public Polinomio (){

    }

    /*public Polinomio suma (Polinomio a) {
        Polinomio nuevoPolinomio;
        NodoDoble actual = this.inicio;
        NodoDoble auxiliarA = this.inicio;
        NodoDoble actualA = a.inicio;
        while (!actual.equals(null) && !actualA.equals(null)){
            if (!actual.equals(null) && !actualA.equals(null)){
                

                actual=actual.siguiente;
                actualA=actualA.siguiente;
            }


        }
        return nuevoPolinomio;
    }*/

    public Polinomio multiplica (Polinomio a){
        Polinomio nuevoPolinomio = new Polinomio();
        NodoDoble actual = this.inicio;
        while (actual!=null){
            NodoDoble aux = a.inicio;
            while (aux!=null){
                Monomio nuevoMonomio = new Monomio((actual.dato.coeficiente*aux.dato.coeficiente), (actual.dato.grado+aux.dato.grado));
                nuevoPolinomio.insertaOrdenado(nuevoMonomio);
                aux=aux.siguiente;
            }
            actual=actual.siguiente;
        }

        return nuevoPolinomio;
    }

    public Polinomio multiplicarPorEscalar (int a){
        Polinomio nuevoPolinomio = new Polinomio();
        NodoDoble actual = this.inicio;
        while (actual!=null){
            Monomio nueMonomio = new Monomio((a*actual.dato.coeficiente), actual.dato.grado);
            nuevoPolinomio.insertaOrdenado(nueMonomio);
            actual=actual.siguiente;
        }

        return nuevoPolinomio;
    }
}
