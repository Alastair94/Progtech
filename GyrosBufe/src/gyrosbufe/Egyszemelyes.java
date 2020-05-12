package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */
public class Egyszemelyes extends Rendeles {

    @Override
    public String kiir() {
        return "Az egyszemélyes menü ára: " + ar() + "Ft.";
    }

    @Override
    public int ar() {
        return 1500;
    }
    
}
