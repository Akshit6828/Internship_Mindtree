import java.util.Scanner;

public class ShapeArea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shape name: ");
		System.out.println("Triangle, Square, Rectangle, Circle");
        String shape=sc.next();
		switch (shape){
		case "Traingle":
			int s=sc.nextInt();
			int h=sc.nextInt();
			System.out.println("Area of Triangle is "+0.5*s*h);
			break;
		case "Square":
			int l=sc.nextInt();
			System.out.println("Area of Square is "+l*l);
			break;
			
		case "Rectangle":
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Area of Rectangle is "+a*b);	
			break;
		case "Circle":
			double r=sc.nextInt();
			System.out.println("Area of Circle is "+3.14*r*r);
			break;
			default:
				System.out.println("Invalid option");	
		}
        sc.close();  
    }
}
