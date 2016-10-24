package Sortirovki.sortpolimorph;

import java.util.Random;

public class FillArray {
	public int[] randomFill(int[] arrayToFill, long digit) {//zapolnyaem massiv
		final Random random = new Random();
		if (digit == 0) return arrayToFill;
		for (int i =0; i < arrayToFill.length;i++){
			//arrayToFill[i]= random.nextInt();
			//arrayToFill[i]= random.nextInt(99);//debug
			arrayToFill[i]= random.nextInt(999);
		}
		return arrayToFill;

	}
}
