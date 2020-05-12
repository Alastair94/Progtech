package gyrosbufe;

import java.util.List;

/**
 *
 * @author Szondi Máté
 */
public class KetSzemelyes extends Rendeles {
    private int ar;
    private List<Gyros> list;
    public KetSzemelyes(List<Gyros> list){
        cnt = 0;
        this.list = list;
        this.ar = 2500 * this.list.size();
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
        if(ar >= 200)
            this.ar = ar;
    }
}
