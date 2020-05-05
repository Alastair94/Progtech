package gyrosbufe;

/**
 *
 * @author Szondi Mate
 */
public class GyrosPitabanZoldseges extends Gyros{
    @Override
    protected void AlapElkeszit(){
        System.out.println("Leszelek egy darabot a kész pitából, majd megmelegítem.");
    }
    
    @Override
    protected void ZoldsegetBele(){
        System.out.println("Beleteszem a pitába az uborkát, paradicsomot, káposztát.");
    } 
}
