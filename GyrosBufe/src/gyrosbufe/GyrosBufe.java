package gyrosbufe;

/**
 *
 * @author Szondi Máté
 */
public class GyrosBufe {

    public static void main(String[] args) {
        Gyros zoldseges = new GyrosPitabanZoldseges();
        zoldseges.keszit();
        Gyros mindenes= new GyrosPitabanMindenes();
        mindenes.keszit();
    }
    
}
