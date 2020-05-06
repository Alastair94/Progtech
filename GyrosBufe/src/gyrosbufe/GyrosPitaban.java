package gyrosbufe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Szondi Mate
 */
public class GyrosPitaban extends Gyros{
    
    private List zoldsegek = new ArrayList<>();
    private List<String> szoszok = new ArrayList<>();
    
    public GyrosPitaban(List<String> zoldsegek, List<String> szoszok){
        for(int i = 0; i < zoldsegek.size(); i++){
            this.zoldsegek.add(zoldsegek.get(i));
        }
        for(int i = 0; i < szoszok.size(); i++){
            this.szoszok.add(szoszok.get(i));
        }
    }
    
    @Override
    protected void NevKiIr() {
        System.out.println("\nA gyros elkészítésének menete pitában: ");
    }
    
    @Override
    protected void AlapElkeszit(){
        System.out.println("Leszelek egy darabot a kész pitából, majd megmelegítem.");
    }
    
    protected void ZoldsegetBele(){
        System.out.println("Beleteszem a pitába az alábbi zöldségeket: ");
        for(int i = 0; i < zoldsegek.size(); i++){
            System.out.println("- " + zoldsegek.get(i));
        }
    }
    
    protected void SzoszBele(){
        System.out.println("Alábbi szószok mehetnek a pitába: ");
        for(int i = 0; i < this.szoszok.size(); i++){
            System.out.println("- " + this.szoszok.get(i));
        }
    }
    
}
