package tahminivaris;
import java.util.Scanner;
public class Tahminivaris {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int yol,saat;
    System.out.println("Yol Mesafesini Giriniz (km) : ");
    yol = scan.nextInt();
    System.out.println("Gitmek istediğiniz süreyi giriniz (saat) : ");
    saat = scan.nextInt();
    System.out.println("Gitmeniz gereken ortalama hız = " + (yol/saat) + "km/s dir.");
   }
   }
