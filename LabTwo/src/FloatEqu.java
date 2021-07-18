
public class FloatEqu {

	public static void main(String[] args) {
		double A = (1.0/10) * (1.0/10);
		double B = (1.0/100);
		
		if (A == B)
			System.out.println("EQUAL");
		else if (Math.abs(A-B) < 1e-10) //addition conditional statement for variables approximately equal 
			System.out.println("APPROXIMATELY EQUAL");
		else
			System.out.println("NOT EQUAL");
	

	}

}
