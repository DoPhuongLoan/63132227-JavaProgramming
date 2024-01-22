/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab1Bai3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh khối lập phương: ");
		double canh = scanner.nextDouble();
		double thetich = canh*canh*canh;
		System.out.printf("Thể tích khối lập phương: %.1f", thetich);
		
	}

}
