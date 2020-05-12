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
        if(cnt <= 1)
            if((rendeles.getAr() - getEngedmenyOsszeg()) > 0)
                return engedmenyKiir();
            else
                return "A végösszeg nem lehet mínuszban!";
        else
            return "Már használtál fel kupont ehhez a rendeléshez!";
        
        
        //return engedmenyKiir();
    }
    @Override
    public int getAr(){
        return rendeles.getAr() - getEngedmenyOsszeg() > 0 ? rendeles.getAr() - getEngedmenyOsszeg() : rendeles.getAr();
    }
    
    public abstract String engedmenyKiir();
    public abstract int getEngedmenyOsszeg();
}