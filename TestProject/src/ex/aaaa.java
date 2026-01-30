package ex;

import java.util.Arrays;
import java.util.Random;

public class aaaa {

	public static void main(String[] args) {
		Random Rd = new Random();
		int[] num = new int[6];
		int[] num2 = new int[6];
		
		for(int i=0; i<num.length; i++) {
			num[i] = Rd.nextInt(45)+1;
		}
		
		for(int i=0; i<num.length; i++) {
			num2[i] = num[i];
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		
		if(Arrays.toString(num)==Arrays.toString(num2))
			System.out.println("aaa");

	}

}
