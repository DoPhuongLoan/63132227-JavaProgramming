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
			System.out.printf("Phần tử thứ %d: ", i + 1);
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
		System.out.println("Phần tử nhỏ nhất trong mảng: " + min);
		
		
		
	}

}
