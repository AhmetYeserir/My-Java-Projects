package cembercevrealan;
import java.util.Scanner;
public class cembercevrealan {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Çemberin Yarıçapını Giriniz");
    int yaricap =scan.nextInt();
    final double pi= Math.PI;
    double cembercevre=2*pi*yaricap;
    System.out.println("Çemberin Çevresi = "+cembercevre);
    double cemberalan=pi*yaricap*yaricap;
    System.out.println("Çemberin Alanı = "+cemberalan);        
    }
    
}