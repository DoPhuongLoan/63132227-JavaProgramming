/**
 * 
 */

/**
 * 
 */
public class Random {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 5;
		int max = 12;
		int songaunhien = (int) (Math.random() * (max - min + 1)) + min;
		double canso = Math.sqrt(songaunhien);
		
		System.out.println("Số ngẫu nhiên: " + songaunhien);
		System.out.println("Căn bậc 2 của số ngẫu nhiên: " + canso);
	}

}
