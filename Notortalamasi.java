package notortalamasi;
import java.util.Scanner;
public class Notortalamasi {
    public static void main(String[] args) {
        int vizenotu;
        int finalnotu;
    Scanner scan=new Scanner(System.in);
    System.out.println("Lütfen Vize Notunu Giriniz");
    vizenotu=scan.nextInt();
    System.out.println("Lütfen Final Notunu Giriniz");
    finalnotu=scan.nextInt();
        double ort = vizenotu*0.4 + finalnotu*0.6;
    if (ort<50){
        System.err.println("Maalesef! Kaldınız");
        }
    else { 
    System.err.println("Tebrikler! Geçtiniz");   
    }
    
    }
    
}
