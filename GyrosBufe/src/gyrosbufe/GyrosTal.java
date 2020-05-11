package gyrosbufe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Szondi Mate
 */
public class GyrosTal extends Gyros{
    
    private List zoldsegek = new ArrayList<>();
    private List<String> szoszok = new ArrayList<>();
    
    public GyrosTal(List<String> zoldsegek, List<String> szoszok){
        for(int i = 0; i < zoldsegek.size(); i++){
            this.zoldsegek.add(zoldsegek.get(i));
        }
        for(int i = 0; i < szoszok.size(); i++){
            this.szoszok.add(szoszok.get(i));
        }
    }
    
    @Override
    protected void NevKiIr() {
        System.out.println("\nA gyrostál elkészítésének menete: ");
    }
    
    @Override
    protected void AlapElkeszit(){
        System.out.println("Kisütöm a sültkrumplit, majd kiszedem egy tálra.");
    }
    
    protected void ZoldsegetBele(){
        System.out.println("Teszek a tálra az alábbi zöldségekből: ");
        for(int i = 0; i < zoldsegek.size(); i++){
            System.out.println("- " + zoldsegek.get(i));
        }
    }
    
    protected void SzoszBele(){
        System.out.println("Alábbi szószokat nyomom a tálra: ");
        for(int i = 0; i < this.szoszok.size(); i++){
            System.out.println("- " + this.szoszok.get(i));
        }
    }
    
}