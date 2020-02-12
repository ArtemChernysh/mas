package task1;

public class main {
	public static void main(String args[]) {
		int array[] = new int[] { 10, 20, 40, 50, 100 };
		int max = getMax(array);
		System.out.println("Max Value is: " + max);
	}

	public static int getMax(int[] arrray){
		int maxValue = arrray[0];
		for(int i=1;i < arrray.length;i++){ if(arrray[i] > maxValue){
			 maxValue = arrray[i];
		}
		}
		return maxValue;
}
}
