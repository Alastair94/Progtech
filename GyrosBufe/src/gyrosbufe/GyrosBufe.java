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
        GyrosFactory factory = new GyrosFactory();
        
        
        List<String> zoldsegek = new ArrayList<>();
        List<String> szoszok = new ArrayList<>();
        
        System.out.println("Milyen gyrost szeretnél venni?");
        System.out.println("- pita \n- tortilla \n- tal");
        
        String tipus = br.readLine();
        
        while(!(tipus.equals("pita") || tipus.equals("tortilla") || tipus.equals("tal"))){
            System.out.println("Kérlek pontosan írd le, mit szeretnél kérni a felsorolt gyrosok közül!");
            tipus = br.readLine();
        }
        
        
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
        
        Gyros gyros = factory.createGyros(tipus, zoldsegek, szoszok);
        gyros.keszit();
        
        System.out.println("");
        
        Rendeles r1 = new Egyszemelyes();
        System.out.println(r1.kiir());
        Rendeles r2 = new Minusz_500(r1);
        System.out.println(r2.kiir());
        Rendeles r3 = new Minusz_1000(r2);
        System.out.println(r3.kiir());

        Rendeles r10 = new KetSzemelyes();
        System.out.println(r10.kiir());
        Rendeles r11 = new Minusz_1000(r10);
        System.out.println(r11.kiir());
        
        
    }
    
}
