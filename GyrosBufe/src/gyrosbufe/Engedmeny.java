package gyrosbufe;

/**
 *
 * @author Mate
 */
public abstract class Engedmeny extends Rendeles {
    
    protected Rendeles rendeles;
    public Engedmeny(Rendeles rendeles){
        this.rendeles = rendeles;
    }
    
    @Override
    public String kiir() {
        return engedmenyKiir();
    }
    @Override
    public int ar(){
        return rendeles.ar() - engedmenyOsszeg();
    }
    
    public abstract String engedmenyKiir();
    public abstract int engedmenyOsszeg();
}
