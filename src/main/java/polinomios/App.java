package polinomios;

import Model.Monomio;
import Model.Polinomio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Polinomio a = new Polinomio();
        Monomio b = new Monomio(2, 2);
        Monomio c = new Monomio(4, 4);
        Monomio d = new Monomio(13, 0);
        a.insertaOrdenado(d);
        a.insertaOrdenado(b);
        a.insertaOrdenado(c);
        
        a.imprimir();
        System.out.println();
        Polinomio a2 = new Polinomio();
        Monomio b2 = new Monomio(3, 2);
        Monomio c2 = new Monomio(5, 6);
        Monomio d2 = new Monomio(13, 1);
        a2.insertaOrdenado(d2);
        a2.insertaOrdenado(b2);
        a2.insertaOrdenado(c2);
        
        a2.imprimir();
        System.out.println();
        Polinomio nuevo = new Polinomio();
        nuevo = (a.suma(a2)); 
        nuevo.imprimir();
        System.out.println();
        
    }
}
