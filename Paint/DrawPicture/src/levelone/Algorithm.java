package levelone;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @category Vẽ hình ảnh
 * @author vuongluis
 * {@code
 * 	 Input: 5
 *   Output: Image
 * }
 */

@SuppressWarnings("all")
public class Algorithm {
	public static void getResultProcess(int n){
		for(int i = 0; i < n; i++){
			for(int j = 0;j < n; j++){
				if(i == 0){
					System.out.print("*");
				}else if(i == n-1){
					System.out.print("*");
				}else if(j == 0){
					System.out.print("*");
				}else{
					System.out.print("o");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
		System.out.print("Please enter your number: ");
		int n = Integer.parseInt(new Scanner(System.in).nextLine());
		getResultProcess(n);
	}
}
