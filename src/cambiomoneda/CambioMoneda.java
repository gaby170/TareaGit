
package cambiomoneda;

public class CambioMoneda 
{
     public static void main(String[] args) 
     {
        System.out.println("prueba");
        System.out.println("prueba");
        Banco caja1 = new Banco(100, "EURO");
        Banco caja2 = new Banco(100, "LIBRA");
        caja1.cambio(((float)0.5));
        caja1.visualiza();
        caja1.Suma(50, "LIBRA");
        caja1.visualiza();
        caja2.cambio(((float)0.5));
        caja2.visualiza();
        caja2.Suma(50, "EURO");
        caja2.visualiza();

     }
}
