import gyrosbufe.Egyszemelyes;
import gyrosbufe.Minusz_1000;
import gyrosbufe.Rendeles;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mate
 */
public class VegosszegPozitiv {
    
    public VegosszegPozitiv() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void getAr(){
        Rendeles r1 = new Egyszemelyes();
        Rendeles r2 = new Minusz_1000(r1);
        Rendeles r3 = new Minusz_1000(r2);
        assertTrue(r3.getAr() > 0);
    }
    
    @Test
    public void tobbKupon(){
        Rendeles r1 = new Egyszemelyes();
        Rendeles r2 = new Minusz_1000(r1);
        Rendeles r3 = new Minusz_1000(r2);
        assertTrue(r3.getAr() == 500);
    }
}
