
package modell;

import java.util.Arrays;
import java.util.Random;


public class MindentTudoGep {
    int[] lottoSzelveny;
    String totoSzelveny;
    String[] dalok;
    Random rn =  new Random();
    public MindentTudoGep(){
        this(new String[0]);
    }
    public MindentTudoGep(String dal){
        this(new String[]{dal});
    }
    public MindentTudoGep(String[] dalok){
        this.lottoSzelveny = new int[5];
        this.totoSzelveny = "";
        this.dalok = dalok;
        if (dalok.length == 0) {
            ujraIndit();
        }
      
    }
    public void ujraIndit(){
        this.generalLottoSzelveny();
        this.dalokkalFeltolt();
        this.generalTotoSzelveny();
        
    }
    private void dalokkalFeltolt(){
        this.dalok = new String[3];
        dalok[0] = "I KNOW";
        dalok[1] = "FEIN";
        dalok[2] = "BABY I'M BACK";
    }
    private void generalLottoSzelveny(){
        for (int i = 0; i < 5; i++) {
            lottoSzelveny[i] += Math.random()* 90;
        }
    }
    private void generalTotoSzelveny(){
        int randomSzam = rn.nextInt(1,14);
        for (int i = 0; i < 15; i++) {
            if (randomSzam > i) {
                totoSzelveny += "1";
            }
        }
        for (int i = 0; i < 15; i++) {
            if (randomSzam == i) {
                totoSzelveny += "X";
            }
        }
        for (int i = 0; i < 15; i++) {
            if (randomSzam < i) {
                totoSzelveny += "2";
            }
        }
    
    }
}
    
    
    

