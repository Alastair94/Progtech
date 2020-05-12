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
        if(cnt <= 1){
            if ((rendeles.getAr() - getEngedmenyOsszeg()) > 0)
                return rendeles.getAr() - getEngedmenyOsszeg();
            else
                return rendeles.getAr();
        }
        else
           return rendeles.getAr();
    }
    
    public abstract String engedmenyKiir();
    public abstract int getEngedmenyOsszeg();
}