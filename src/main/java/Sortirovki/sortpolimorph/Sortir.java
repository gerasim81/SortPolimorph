package Sortirovki.sortpolimorph;

import java.util.Random;

public class Sortir{
	final static int MYCONST = 50;
	
	@Override
	public String toString(){
		String s = "Sortirovki";
		return s;
	}
	
	public static void main(String[] args){
		final Random random = new Random();
		int razmer = random.nextInt(MYCONST);
		//razmer = 20;
		
		
		int [] array1 = new int[razmer];//razmer massiva auto

		
		AbstrSortir [] abstr = {new Bubble(), new Brush(), new Shaker(), new EvenOdd()};
		
				
		//----------------------------
		//razmer = random.nextInt(MYCONST);
		array1 = new int[razmer];
		FillArray arr = new FillArray();

		for (AbstrSortir e : abstr){
			array1 = arr.randomFill(array1, 1234567890);
			array1 = e.sortirovka(array1);
			for (int dig1 : array1){
				System.out.print(dig1 + " ");
			}
			System.out.println();
		}		
	}
}
