/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab2Bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a, b, c;
		System.out.print("Nhập hệ số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		c = scanner.nextDouble();
		
		double delta = (b * b) - (4 * a * c);
		double t,x,x1,x2 ;
		t = -c/b;
		x = -b/(2 * a);
		x1 = (-b+Math.sqrt(delta))/(2*a);
		x2 = (-b-Math.sqrt(delta))/(2*a);
		
		if(a==0){
			if(b==0){
				if(c==0){
					System.out.print("Phương trình vô số nghiệm");
				}
				else{
					System.out.print("Phương trình vô nghiệm");
				}
			}
			else {
				System.out.printf("Phương trình có nghiệm duy nhất: %f",t);
			}
		}
		else {
			if(delta <0 ) {
				System.out.print("Phương trình vô nghiệm");
			}
			if(delta == 0) {
				System.out.printf("Phương trình có nghiệm kép: %f", x);
			}
			if(delta > 0) {
				System.out.printf("Phương trình có nghiệm x1 = %.1f và x2 = %.1f",x1,x2);
			}
		}
	}
}