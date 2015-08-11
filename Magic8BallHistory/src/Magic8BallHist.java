//This is the main program
import java.util.Random;
import java.util.Scanner;
	
public class Magic8BallHist {

		public static void main ( String[] args )
		{
		
			Generate ans = new Generate();
			String resp = "y";
			String question = "";
			Scanner scan = new Scanner(System.in);
			String q[] = new String [30];
			String a[] = new String [30];
			int i = 0;
			int j = 0;
			
			while(resp.equalsIgnoreCase("y"))
			{	
				
				System.out.println("Ask a question!");
				question = scan.nextLine();
				q[i] = question;
				String solution = ans.answer();
				a[i] = solution;
				i++;
				System.out.println( "MAGIC 8-BALL SAYS: " + solution +"\n" );
				System.out.println("Ask another question? (y/n)");
				resp = scan.next();
				scan.nextLine();
				if(resp.equalsIgnoreCase("history"))
				{
					for(j=0; j<i; j++)
					{
						System.out.println("Question: " + q[j] + "  " + "Answer: " +a[j]);
					}
				}
					
				
			}
					
			
			
			
		}
}




