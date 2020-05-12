package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */
public class Minusz_1000 extends Engedmeny {
   
    public Minusz_1000(Rendeles rendeles) {
        super(rendeles);
        cnt++;
    }

    @Override
    public String engedmenyKiir() {
        return "+ 1000 Ft-os kuponnal: " + (rendeles.getAr() - getEngedmenyOsszeg());
    }

    @Override
    public int getEngedmenyOsszeg() {
        return 1000;
    }

}
