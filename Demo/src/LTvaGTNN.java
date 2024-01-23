/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class LTvaGTNN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số thực a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập số thực b: ");
		double b = scanner.nextDouble();
		double luythua = Math.pow(a, b);
		System.out.println("a ^ b: " + luythua);
		double gtnn = Math.min(a, b);
		System.out.println("Giá trị nhỏ nhất của hai số: " + gtnn);
	}

}
