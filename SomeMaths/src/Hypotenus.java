import java.util.Scanner;

public class Hypotenus {

	public static void main(String[] args) {
		double x,y,z;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Entre x: ");
		x=scanner.nextDouble();
		System.out.println("Entre y: ");
		y=scanner.nextDouble();
		z=Math.sqrt((x*x)+(y*y));
		System.out.println("L hypothenus est: " +z);
		scanner.close();
	}

}
