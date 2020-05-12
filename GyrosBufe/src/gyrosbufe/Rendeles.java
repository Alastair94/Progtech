         package gyrosbufe;

import java.util.List;

/**
 *
 * @author Szondi Máté
 */
public abstract class Rendeles{
    protected static int cnt;
    protected abstract String kiir();
    public abstract int getAr();
    protected void setAr(int ar){};
    protected List<Gyros> gyrosok;
}
