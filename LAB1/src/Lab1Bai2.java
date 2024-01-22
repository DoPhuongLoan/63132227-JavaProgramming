/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;
public class Lab1Bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double cd, cr;
		System.out.print("Nhập chiều dài: ");
		cd = scanner.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		cr = scanner.nextDouble();
		
		double cv, dt, cmin;
		cv =(cd + cr) * 2;
		dt = cd * cr;
		cmin = Math.min(cd, cr);
		System.out.printf("Chu vi HCN: %.2f\n", cv);
		System.out.printf("Diện tích HCN: %.2f\n", dt);
		System.out.printf("Cạnh nhỏ nhất HCN: %.2f", cmin);
	}

}
