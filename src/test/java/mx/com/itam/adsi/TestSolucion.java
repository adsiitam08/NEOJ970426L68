package mx.com.itam.adsi;

import static org.junit.Assert.assertTrue;

//import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSolucion {
    //private final static Logger LOG = Logger.getLogger(TestPrincipal.class);
    
    private Solucion s = new Solucion();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isCorrectListTest() {
        String val="";
        //LOG.info("Ejecutando la prueba");
        
        //LOG.info("Debe imprimir: A-->B...-->F");
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
