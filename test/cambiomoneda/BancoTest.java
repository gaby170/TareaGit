
package cambiomoneda;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BancoTest {
    
    Banco caja1;
    Banco caja2;
    float entrada1, entrada2;
    float salida1, salida2;
    
    public BancoTest() {
    }
    
    @Before
    public void setUp() {
      float result1=0F, result2=0F;
      caja1 = new Banco(100F, "EURO");
      caja2 = new Banco(100F, "LIBRA");
      result1= caja1.Dinero();
      result2= caja2.Dinero();
      entrada1= 100F; //LE
      salida1= 300F;
      entrada2= 100F; //EL
      salida2= 150F; 
    }
    
    @Test
    public void testCambio() {
        System.out.println("cambio");
        float EL_ = 0.5F;
        caja1.cambio(EL_);
        caja2.cambio(EL_);
        }

    /**
     * Test of Suma method, of class Banco.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        caja1.cambio(0.5F);
        caja2.cambio(0.5F);
        caja1.Suma(entrada1, "LIBRA");
        assertEquals(salida1, caja1.Dinero(), 0.1F);
        caja2.Suma(entrada2, "EURO");
        assertEquals(salida2, caja2.Dinero(), 0.1F);
        }

    /**
     * Test of visualiza method, of class Banco.
     */
    @Test
    public void testVisualiza() {
        System.out.println("visualiza");
        caja1.visualiza();
    }

    /**
     * Test of Dinero method, of class Banco.
     */
    @Test
    public void testDinero() {
        System.out.println("Dinero");
        System.out.println(caja1.Dinero());
    }
    
}
