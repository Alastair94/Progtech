package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */
public class KetSzemelyes extends Rendeles {

    @Override
    public String kiir() {
        return "A kétszemélyes menü ára: " + ar() + "Ft.";
    }

    @Override
    public int ar() {
        return 2500;
    }
    
}
