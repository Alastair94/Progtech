package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */
public class Minusz_500 extends Engedmeny {

    public Minusz_500(Rendeles rendeles) {
        super(rendeles);
        cnt++;
    }

//    @Override
//    public String engedmenyKiir() {
//        return "+ 500 Ft-os kuponnal: " + ((rendeles.getAr() - getEngedmenyOsszeg()) > 0 ? (rendeles.getAr() - getEngedmenyOsszeg()) : rendeles.getAr());
//    }
    @Override
    public String engedmenyKiir() {
        return "+ 500 Ft-os kuponnal: " + (rendeles.getAr() - getEngedmenyOsszeg());
    }

    @Override
    public int getEngedmenyOsszeg() {
        return 500;
    }
    
}
