package tekciftsayi;
import java.util.Scanner;
public class tekciftsayi {
    public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
    int sayi;
    System.out.println("Lütfen Bir Tam Sayı Giriniz");
    sayi=giris.nextInt();
    if (sayi%2==0){
    System.out.println(sayi+" Sayısı Çift Sayıdır");
    }
    else{
        System.out.println(sayi+" Sayısı Tek Sayıdır");
        
    }
        
        
        
        
        
        
        }
}
