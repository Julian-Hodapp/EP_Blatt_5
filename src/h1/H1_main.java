package h1;

//import java.util.Arrays;

//Achtung bei git commits und beim pushen den import und das print statement löschen

public class H1_main {
	public static void main(String[] args) {
		int[ ] myArray = {10, 20, 30, 4, 5, 6, 7, 8, 9, 10, 11};
		int i = 0;
		
		while (i <= (myArray.length - 1) / 2) {
			int first = myArray[0 + i];
			int last = myArray[myArray.length - (1 + i)];
			
			myArray[myArray.length - (1 + i)] = first;
			myArray[0 + i] = last;
			i++;
		}
		
//		System.out.println(Arrays.toString(myArray));
	}
}
