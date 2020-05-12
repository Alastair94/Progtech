package gyrosbufe;

//import gyrosbufe.EgySzemelyes;
//import gyrosbufe.Gyros;
//import gyrosbufe.GyrosTal;
//import gyrosbufe.Minusz_1000;
//import gyrosbufe.Rendeles;
import java.util.ArrayList;
import java.util.List;
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
    
    Rendeles r1;
    Rendeles r2;
    Rendeles r3;
    
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
       List<String> zoldsegek = new ArrayList<>();
       zoldsegek.add("hagyma");
       zoldsegek.add("paradicsom");
       zoldsegek.add("paprika");
       List<String> szoszok = new ArrayList<>();
       szoszok.add("tzatziki");
       szoszok.add("csípős");
       Gyros gyros = new GyrosTal(zoldsegek, szoszok);
       List<Gyros> tetelek = new ArrayList<>();
       tetelek.add(gyros);
       r1 = new EgySzemelyes(tetelek);
       r1.setAr(600);
       r2 = new Minusz_1000(r1);
       r3 = new Minusz_500(r2);
      
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void getAr(){
        
        assertTrue(r3.getAr() > 0);
    }

}
