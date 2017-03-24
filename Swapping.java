package practice;

public class Swapping {

	int a ;
	int b;
	
	// call by value (does not work in java)
	public static void swap(int x, int y){
		int temp = x;
		x=y;
		y= temp;
	}
	
	// call by reference
	public static void swap(Swapping swap){
		
		int temp =swap.a;
		swap.a = swap.b;
		swap.b = temp;
	}
	
	public static void main(String[] args) {
		Swapping sw = new Swapping();
		sw.a = 10;
		sw.b = 20;
		swap(sw.a,sw.b);
		
		System.out.println("The value of a after swap is "+ sw.a);
		System.out.println("The value of b after swap is "+ sw.b);
		
		swap(sw);
		System.out.println("The value of a after swap is "+ sw.a);
		System.out.println("The value of b after swap is "+ sw.b);
		
		
	}

}
