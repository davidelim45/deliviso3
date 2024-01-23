package delliviso4iso7;
import java.util.Scanner;
public class DeiviSo4i7 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		        System.out.println("vnesi vrednost za n: ");
		        int n = input.nextInt();
		        System.out.println("broevi delivi so 4 i 7 od 1 do " + n + " se:");

		        for (int i = 1; i <= n; i++) {
		            if (i % 4 == 0 && i % 7 == 0) {
		                System.out.print(i + " ");
		            }
		        }

		        input.close();
		    
	}

}
