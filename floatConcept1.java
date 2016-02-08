import java.util.Scanner;
import javax.swing.JOptionPane;
public class floatConcept1 {

	public static void main(String[] args) {
		// all comments refer to lines below them
		//Initialize a scanner named "input"
		Scanner input = new Scanner(System.in);
		System.out.print("Input skin float average. ");
		double average = input.nextDouble();
		System.out.print("Input min float of recieved skin. ");
		double min = input.nextDouble(); 
		System.out.print("input max float of recieved skin. ");
		double max = input.nextDouble();
		double range = max - min;;
		double skinfloat = (average * range) + min;
		//JOptionPane.showMessageDialog(null, skinfloat);
		if (skinfloat < min)
		{
			System.out.print("error incorrect average was entered");
		
		}
		else
		{
		System.out.print(skinfloat);
		}
		}

}
