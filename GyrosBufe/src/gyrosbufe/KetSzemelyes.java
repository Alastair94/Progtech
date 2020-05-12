package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */
public class KetSzemelyes extends Rendeles {
    private int ar;
    public KetSzemelyes(){
        cnt = 0;
        this.ar = 2500;
    }
    
    
    @Override
    public String kiir() {
        return "A kétszemélyes menü ára: " + getAr() + "Ft.";
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
