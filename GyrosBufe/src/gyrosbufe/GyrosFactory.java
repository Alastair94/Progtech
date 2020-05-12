package gyrosbufe;

import java.util.List;

/**
 *
 * @author Szondi Máté
 */
public class GyrosFactory {
    public Gyros createGyros(String gyros, List<String> zoldsegek, List<String> szoszok){
        switch(gyros){
            case "pita": return new GyrosPitaban(zoldsegek, szoszok);
            case "tortilla": return new GyrosTortillaban(zoldsegek, szoszok);
            case "tal": return new GyrosTal(zoldsegek, szoszok);
            default: return null;
        }
    }
}
