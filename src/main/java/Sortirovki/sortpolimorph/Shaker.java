package Sortirovki.sortpolimorph;

public class Shaker extends AbstrSortir{
	@Override
	public int[] sortirovka(int[] arrayToSort){
		int temp;
		int counter1=0;//schetchk dlua maksimumov
		int counter2=0;//schetchk dlua minimumov
		int reverseFlag=0;// 0 - vpered, 1 - nazad
		int fullArrayCounter=0;//schetchik prohodov
		if (arrayToSort.length == 0) return arrayToSort;
		while(true){
			if (fullArrayCounter % 2 == 1) reverseFlag = 1;//idem vverh
			else reverseFlag = 0;//idem vniz

			if (reverseFlag == 0){ //tolkaem vniz maksimumi
				for(int i = counter1; i < arrayToSort.length-counter1-1;i++){
					if (arrayToSort[i] > arrayToSort[i+1]){
						temp = arrayToSort[i+1];
						arrayToSort[i+1] = arrayToSort[i];
						arrayToSort[i]= temp;						
					}
				}
				counter1++;
			}
			else{//tolkaem vverh minimumi
				for(int i = arrayToSort.length-counter2-2; i > counter2; i--){
					if (arrayToSort[i] < arrayToSort[i-1]){
						temp = arrayToSort[i-1];
						arrayToSort[i-1] = arrayToSort[i];
						arrayToSort[i]= temp;

					}
				}
				counter2++;
			}
			if (fullArrayCounter == arrayToSort.length-1) {
				break;
			}
			fullArrayCounter++;
		}
		return arrayToSort;
	}
}
