package gyrosbufe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Szondi Máté
 */
public class GyrosTortillaban extends Gyros {
    private List<String> zoldsegek = new ArrayList<>();
    private List<String> szoszok = new ArrayList<>();
    
    public GyrosTortillaban(List<String> zoldsegek, List<String> szoszok){
        for(int i = 0; i < zoldsegek.size(); i++){
            this.zoldsegek.add(zoldsegek.get(i));
        }
        for(int i = 0; i < szoszok.size(); i++){
            this.szoszok.add(szoszok.get(i));
        }
    }
    
    @Override
    protected void NevKiIr() {
        System.out.println("\nA gyros készítésének menete tortillában: ");
    }
    
    @Override
    protected void AlapElkeszit() {
        System.out.println("Megmelegítem a tortillalapot, majd pedig előkészítem, a többi feltéthez.");
    }

    
    protected void ZoldsegetBele() {
        System.out.println("Beleteszem a tortillába az alábbi zöldségeket: ");
        for(int i = 0; i < zoldsegek.size(); i++){
            System.out.println("- " + zoldsegek.get(i));
        }
    }
    
    protected void SzoszBele(){
        System.out.println("Alábbi szószok mehetnek a tortillába: ");
        for(int i = 0; i < this.szoszok.size(); i++){
            System.out.println("- " + this.szoszok.get(i));
        }
    }
}
