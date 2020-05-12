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
        List<Gyros> tetelek = new ArrayList<>();
        
        do{
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
                if(zoldsegek.contains(zoldseg))
                    System.out.println("Ezt a feltétet már választotta!");
                else
                    zoldsegek.add(zoldseg);
            }

            System.out.println("Milyen szószokat kérsz a gyrosodhoz?");
            System.out.println("(Üres ENTER ha nem kérsz szószt/nem kérsz mást)");

            String szosz;
            while(true){
                szosz = br.readLine();
                if(szosz.equals(""))
                    break;
                if(szoszok.contains(szosz))
                    System.out.println("Ezt a szószt már választotta!");
                else
                    szoszok.add(szosz);
            }

            Gyros gyros = factory.createGyros(tipus, zoldsegek, szoszok);
            tetelek.add(gyros);

            System.out.println("Szeretne még rendelni valamit?");
            System.out.println("n - NEM | ENTER - IGEN");

            }while(!br.readLine().equals("n"));

        for (int i = 0; i < tetelek.size(); i++){
            tetelek.get(i).keszit();
            System.out.println("\n");
        }
        
        System.out.println("\n");
        Rendeles rendeles = new EgySzemelyes(tetelek);
        
        System.out.println(rendeles.kiir());
        Rendeles r2 = new Minusz_500(rendeles);
        System.out.println(r2.kiir());
        Rendeles r3 = new Minusz_500(r2);
        System.out.println(r3.kiir());
        
        System.out.println("\n");
        Rendeles rendeles2= new KetSzemelyes(tetelek);
        
        System.out.println(rendeles2.kiir());
        Rendeles r10 = new Minusz_1000(rendeles2);
        System.out.println(r10.kiir());

        
    }
    
}
