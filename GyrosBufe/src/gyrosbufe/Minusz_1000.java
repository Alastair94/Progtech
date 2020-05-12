package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */
public class Minusz_1000 extends Engedmeny {

    public Minusz_1000(Rendeles rendeles) {
        super(rendeles);
    }

    @Override
    public String engedmenyKiir() {
        return "+ 1000 Ft-os kuponnal: " + (rendeles.ar() - engedmenyOsszeg());
    }

    @Override
    public int engedmenyOsszeg() {
        return 1000;
    }
    
}
