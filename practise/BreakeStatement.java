package practise;

public class BreakeStatement {
public static void main(String[] args) {
	int[] numbers= {10,20,30,40,50};
	for (int i = 0; i < numbers.length; i++) {
		
	if(numbers[i]==50) {
			break;
	}
	System.out.println(numbers[i]);
	}
}
}
