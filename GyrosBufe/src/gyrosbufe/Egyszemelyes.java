package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */
public class Egyszemelyes extends Rendeles {
    private int ar;
    public Egyszemelyes(){
        cnt = 0;
        this.ar = 1500;
    }
    
    @Override
    public String kiir() {
        return "Az egyszemélyes menü ára: " + getAr() + "Ft.";
    }

    @Override
    public int getAr() {
        return ar;
    }
    
    @Override
    public void setAr(int ar){
        this.ar = ar;
    }
}
