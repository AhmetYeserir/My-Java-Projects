package sayinegatifpozitif;
import java.util.Scanner;
public class sayinegatifpozitif {
    public static void main(String[] args) {
    System.out.println("Bir Sayı Girin");
    Scanner reader = new Scanner (System.in);
    double sayi =reader .nextInt();
    if (sayi<0){
    System.out.println("Sayı Negatiftir");
    }
    else if (sayi==0){
    System.out.println("Sayı 0 a eşittir");
    }
    else {
    System.out.println("Sayı Pozitiftir");
    }
    
   
    }
}