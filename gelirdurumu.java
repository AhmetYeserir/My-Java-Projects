package gelirdurumu;
import java.util.Scanner;
public class gelirdurumu {
    public static void main(String[] args) {
        // Gelir durumuna göre Açlık / Yoksulluk sınırının belirlenmesi 
        int anneMaas;
        int babaMaas;
        double toplamGelir;
    Scanner scanner = new Scanner (System.in);
    System.out.println("Lütfen Annenizin Maaşını Giriniz");
    anneMaas = scanner.nextInt();
    System.out.println("Lütfen Babanızın Maaşını Giriniz");
    babaMaas = scanner.nextInt();
    
    toplamGelir = (anneMaas + babaMaas);
    if (toplamGelir > 0 && toplamGelir < 4500) {   
    System.err.println ("Açlık Sınırındasınız");
    }
    else if (toplamGelir > 4500 && toplamGelir < 8000){
    System.err.println("Yoksulluk Sınırındasınız");
    }
    else {
    System.err.println("Gelir Durumunuz Normal");  
    }
    }
    
}

