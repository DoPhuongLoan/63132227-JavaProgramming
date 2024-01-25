/**
 * 
 */

/**
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class Lab3Bai3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Số lượng phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] mang = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Phần tử %d: ", i + 1);
			mang[i] = scanner.nextInt();
		}
		Arrays.sort(mang);
		
		System.out.println("Mảng sau khi sắp xếp:");
		for (int i = 0; i < n; i++) {
			System.out.print(mang[i] + " ");
		}
		
		int min = mang[0];
		for (int i = 1; i < n; i++) {
			min = Math.min(min, mang[i]);
		}
		System.out.println("\nPhần tử nhỏ nhất trong mảng: " + min);
		
		int tong = 0;
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (mang[i] % 3 == 0) {
				 tong += mang[i];
				 dem++;
			}
		}
		if (dem > 0) {
			float tbc = (float) tong / dem;
			System.out.printf("\nTrung bình cộng các phần tử chia hết cho 3: %.2f", tbc);
			
		}else {
			System.out.println("Không có phần tử nào chia hết cho 3 trong mảng");
		}
		
	}

}
