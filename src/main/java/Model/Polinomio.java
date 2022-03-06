package Model;

import Model.Listas.ListaDoble;
import Model.Listas.NodoDoble;

public class Polinomio extends ListaDoble{
    public Polinomio (){

    }

    public Polinomio suma (Polinomio a) {
        Polinomio nuevoPolinomio = new Polinomio();
        int flag=0;
        for (int i=6; i>=0; i--){
            NodoDoble actual = this.inicio;
            NodoDoble actualA = a.inicio;
            Monomio nuevoMonomio = new Monomio(0, i);
            while (actual != null && actualA != null){
                if(actual.dato.grado == i){
                    nuevoMonomio.setCoeficiente(nuevoMonomio.getCoeficiente()+actual.dato.getCoeficiente());
                    flag++;
                }else{
                    actual=actual.siguiente;
                }

                if (actualA.dato.grado == i){
                    nuevoMonomio.setCoeficiente(nuevoMonomio.getCoeficiente()+actualA.dato.getCoeficiente());
                    flag++;
                }else{
                    actualA=actualA.siguiente;
                }

                if (flag==2){
                    break;
                }
            }
            if (nuevoMonomio.coeficiente != 0){
                nuevoPolinomio.insertaOrdenado(nuevoMonomio);
            }
        }

        return nuevoPolinomio;
    }

    public Polinomio resta (Polinomio a) {
        Polinomio nuevoPolinomio = new Polinomio();
        int flag=0;
        for (int i=6; i>=0; i--){
            NodoDoble actual = this.inicio;
            NodoDoble actualA = a.inicio;
            Monomio nuevoMonomio = new Monomio(0, i);
            while (actual != null && actualA != null){
                if(actual.dato.grado == i){
                    nuevoMonomio.setCoeficiente(nuevoMonomio.getCoeficiente()-actual.dato.getCoeficiente());
                    flag++;
                }else{
                    actual=actual.siguiente;
                }

                if (actualA.dato.grado == i){
                    nuevoMonomio.setCoeficiente(nuevoMonomio.getCoeficiente()-actualA.dato.getCoeficiente());
                    flag++;
                }else{
                    actualA=actualA.siguiente;
                }

                if (flag==2){
                    break;
                }
            }
            if (nuevoMonomio.coeficiente != 0){
                nuevoPolinomio.insertaOrdenado(nuevoMonomio);
            }
        }
        
        return nuevoPolinomio;
    }

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
