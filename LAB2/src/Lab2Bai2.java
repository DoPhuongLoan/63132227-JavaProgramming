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
		double a, b, c ;
        System.out.print("Nhập hệ số a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
		c = scanner.nextDouble();
    	double x = -c/b;
    	if(a == 0) {
			if(b == 0) {
				if(c == 0) {
					System.out.print("Phương trình vô số nghiệm");
				}
				else {
					System.out.print("Phương trình vô nghiệm");
				}
			}
			else {
				System.out.printf("Nghiem cua phuong trinh la: %f", x);
			}
    	}
        
	}

}
