package gyrosbufe;

import java.util.List;

/**
 *
 * @author Szondi Máté
 */
public class EgySzemelyes extends Rendeles {
    private int ar;
    private List<Gyros> list;
    public EgySzemelyes(List<Gyros> list){
        cnt = 0;
        this.list = list;
        this.ar = 1500 * this.list.size();
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
