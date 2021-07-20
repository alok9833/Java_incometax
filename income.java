package JavaIncome;
import java.util.Scanner;
public class income {


		
		public static void main(String[] args) {
			
			Scanner op = new Scanner(System.in);
			int a=0;
			System.out.println("Enter income : ");
			a = op.nextInt();
			
			int b=0;
			System.out.println("enter the Gender : ");
			System.out.println("1. Male");
			System.out.println("2. Female");
			System.out.println("3. Other");
			b=op.nextInt();
			op.close();
			
			if(b==1 || b==3)
			{
				if(a>=0 && a<=180000)
				{
					System.out.println(" No tax for you");
				}
				else if(a>=180001 && a<=500000)
				{
				int tax;
				tax = a/10;
					System.out.println(" Tax is : 10%");
					System.out.println("Amount of Tax is:" + tax);
					System.out.println("Amount is :" + a);
				}
				else if(a>=500001 && a<=800000)
				{
					int tax;
					tax = a*(20/100);
					System.out.println("Tax is : 20%");
					System.out.println("Amount of Tax is:" + tax);
					System.out.println("Amount is :" + a);
				}
				else if(a>800000)
				{
					int tax;
					tax = a*(30/100);
					System.out.println("Tax is : 30%");
					System.out.println("Amount of Tax is :");
					System.out.println("Amount is:" + a);
				}
			}
			else {
				if(a>=0 && a<=190000)
				{
					System.out.println("No tax for you");
				}
				else if(a>=190001 && a<=500000)
				{
					int tax=0;
					tax = a/10;
					System.out.println("Your Tax is : 10%");
					System.out.println("Amount of Tax is :" + tax);
					System.out.println("Amount is :" + a);
				}
				else if(a>=500001 && a<=800000)
				{
					int tax=0;
					tax = a*(20/100);
					System.out.println("Amount of Tax is :" + tax);
					System.out.println("Your Tax is : 20%");
					System.out.println("Amount is :" + a);
				}
				else if(a>800000)
				{
					int tax;
					tax = a*(30/100);
					System.out.println("Amount of Tax is :" + tax);
					System.out.println("Your Tax is : 30%");
					System.out.println("Amount is:" + a);
				}
			}
			System.out.println("Thaank you ");
		}

	}


