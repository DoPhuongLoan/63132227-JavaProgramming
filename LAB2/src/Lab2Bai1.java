/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab2Bai1 {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	double a, b;
        System.out.print("Nhập hệ số a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        b = scanner.nextDouble();
        float x = (float)(-b/a);
        if(a==0){
        	if(b==0) {
        		System.out.print("Phương trình vô số nghiệm");
        	}
        	else {
        		System.out.print("Phương trình vô nghiệm");
        	}
        }
        else {
        	System.out.printf("Nghiệm của phương trình: %.2f",x);
        }
	}
}
