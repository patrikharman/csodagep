
package main;

import modell.MindentTudoGep;

public class Program {
    
    public static void main(String[] args) {
        MindentTudoGep gep = new MindentTudoGep();
        System.out.println("lottó szelvény:/n" + gep.generalLottoSzelveny());
        System.out.println("toto szelvény:/n" + gep.generalTotoSzelveny());
    }
}
