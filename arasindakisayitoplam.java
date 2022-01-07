package arasindakisayitoplam;
import java.util.Scanner;
public class arasindakisayitoplam {
    public static void main(String[] args){ 
Scanner input = new Scanner (System.in);
System.out.println("Lütfen Bir Sayı Giriniz");
int sayi = input.nextInt();
int toplam = 0;
for(int i= 1;i<=sayi ;i++){
    if(sayi%2==0){
    System.out.println(sayi=sayi + i);}
    toplam = toplam + i;
 System.out.println("1-" + sayi + "Arasındaki Sayıların Toplamı" + toplam );

    }

}
}
