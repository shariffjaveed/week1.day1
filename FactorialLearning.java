package week1.day1;

public class FactorialLearning {

	public static void main(String[] args) {
		int input= 5;
		
		int fact=1; //initial value for result
		
		for(int i= 1; i<= input; i++)
		{
			fact =fact*i; 
			//1=1*1=1
			//1=1*2=2
			//2=2*3=6
			//6=6*4=24
			//24=24*5=120
		}
		
		System.out.println(fact);
		
	}
}


