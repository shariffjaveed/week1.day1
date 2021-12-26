package week1.day1;

public class OddNumbers {

	public static void main(String[] args) {
		System.out.println("these are the odd numbers 1 to 20");
		for (int i= 1;i<=20; i++) {
			if(i%2 == 0 ) //%-> reminder
				//1%2->1->odd
				//2%2->0->even
			{
			System.out.print(i+" ");	
			}
			
		}
	

	}

}
