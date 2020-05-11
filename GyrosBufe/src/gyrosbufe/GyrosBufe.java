package gyrosbufe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Szondi Máté
 */
public class GyrosBufe {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<String> zoldsegek = new ArrayList<>();
        List<String> szoszok = new ArrayList<>();
        
        System.out.println("Milyen gyrost szeretnél venni?");
        System.out.println("1 - Pita \n2 - Tortilla \n3 - Tál");
        
        int tipus = Integer.parseInt(br.readLine());
        
        System.out.println("Milyen zöldségeket kérsz a gyrosodhoz?");
        System.out.println("(Üres ENTER ha nem kérsz zöldséget/nem kérsz mást)");
        
        String zoldseg;
        while(true){
            zoldseg = br.readLine();
            if(zoldseg.equals(""))
                break;
            zoldsegek.add(zoldseg);
        }
        
        System.out.println("Milyen szószokat kérsz a gyrosodhoz?");
        System.out.println("(Üres ENTER ha nem kérsz szószt/nem kérsz mást)");
        
        String szosz;
        while(true){
            szosz = br.readLine();
            if(szosz.equals(""))
                break;
            szoszok.add(szosz);
        }
        
        switch(tipus){
            case 1:
                Gyros pita = new GyrosPitaban(zoldsegek, szoszok);
                pita.keszit();
                break;
            case 2:
                Gyros tortilla = new GyrosTortillaban(zoldsegek, szoszok);
                tortilla.keszit();
                break;
            case 3:
                Gyros tal = new GyrosTal(zoldsegek, szoszok);
                tal.keszit();
                break;
            default:
                System.out.println("Ilyen számozású gyros-szal nem rendelkezünk!");
                break;
        }
        
        
        
    }
    
}
