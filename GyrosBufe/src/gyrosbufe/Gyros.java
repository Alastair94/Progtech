package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */

public abstract class Gyros {
    public void keszit(){
        AlapElkeszit();
        HustHozzaAd();
        ZoldsegetBele();
        SzoszBele();
        Felszolgal();
    }
    
    protected abstract void AlapElkeszit();
    
    private void HustHozzaAd(){
        System.out.println("A húst leszelem a forgatósütőről, majd elhelyezem az előkészített alaphoz.");
    }
    
    protected abstract void ZoldsegetBele();
    
    protected void SzoszBele(){};
    
    private void Felszolgal(){
        System.out.println("Az elkészült ételt felszolgálom a vásárlónak.");
    }
    
}
