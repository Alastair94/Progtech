package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */
public class Minusz_500 extends Engedmeny {

    public Minusz_500(Rendeles rendeles) {
        super(rendeles);
    }

    @Override
    public String engedmenyKiir() {
        return "+ 500 Ft-os kuponnal: " + (rendeles.ar() - engedmenyOsszeg());
    }

    @Override
    public int engedmenyOsszeg() {
        return 500;
    }
    
}
