package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */

public abstract class Gyros {
    public void keszit(){
        NevKiIr();
        AlapElkeszit();
        HustHozzaAd();
        ZoldsegetBele();
        SzoszBele();
        Felszolgal();
    }
    protected abstract void NevKiIr();
    
    protected abstract void AlapElkeszit();
    
    private void HustHozzaAd(){
        System.out.println("A húst leszelem a forgatósütőről, majd elhelyezem az előkészített alaphoz.");
    }
    
    protected void ZoldsegetBele(){};
    
    protected void SzoszBele(){};
    
    private void Felszolgal(){
        System.out.println("Az elkészült ételt felszolgálom a vásárlónak.");
    }
    
}
