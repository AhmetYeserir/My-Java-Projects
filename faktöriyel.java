package faktöriyel;
import java.util.Scanner;
public class faktöriyel {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Bir Sayı Gİriniz");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		for(int i=1;i<=sayi;i++){
			faktoriyel=faktoriyel*i;}
			System.out.println(faktoriyel);
		
	}
}