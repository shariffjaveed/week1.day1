package week1.day1;

public class FibonacciLearning {
			public static void main(String[] args) {
			int num1=0;
			int num2=1;
			System.out.println(num1);
			System.out.println(num2);

			int num3;
			// generate 8 numbers
			for(int i=1; i<=10; i++) {
			num3= num1+ num2;
			//num3=0+1=1
			//num3=1=1+1=2
			//num3=2=1+2=3
			System.out.println(num3);//1

			//swap the numbers
			num1=num2; //0=1, 1=1
			num2=num3; //1=1, 1=2


			}

			}


			

		

	}


