package gyrosbufe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Szondi Máté
 */
public class GyrosBufe {

    public static void main(String[] args) {
        List<String> zoldsegek = Arrays.asList("uborka", "paradicsom", "kaposzta");
        List<String> szoszok = Arrays.asList("tzatziki", "csipos");
        Gyros pita = new GyrosPitaban(zoldsegek, szoszok);
        pita.keszit();
        
        zoldsegek = Arrays.asList("paradicsom", "hagyma");
        szoszok = Arrays.asList("tzatziki", "csipos", "paradicsomos");
        pita = new GyrosPitaban(zoldsegek, szoszok);
        pita.keszit();
        
        zoldsegek = Arrays.asList("paradicsom", "hagyma", "uborka", "káposzta");
        szoszok = Arrays.asList("tzatziki", "paradicsomos");
        Gyros tortilla = new GyrosTortillaban(zoldsegek, szoszok);
        tortilla.keszit();
        
        
    }
    
}
