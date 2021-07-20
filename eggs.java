package JavaIncome;
import java.util.Scanner;
public class eggs {

	public static void main(String[] args) {



				Scanner r = new Scanner(System.in);
				System.out.println(" Enter the number of Eggs  : ");
				int a = r.nextInt();
				r.close();
				int b=0;
				b= a / 144;
				System.out.println(" Grosses no: " + b);
				a = a % 144;
				b = a/ 12;
				System.out.println(" drozens no. : " + b);
				a = a % 12;
				System.out.println("the no.of egg that customer have: "+ a);
			}
		}


