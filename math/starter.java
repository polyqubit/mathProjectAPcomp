import pkg.*;
import java.util.ArrayList;
import java.time.Clock;

public class starter {

	public static void main(String args[]) {
		double test = 9.901;
		System.out.println(Maths.floorD(test));
		System.out.println(Maths.ceilD(test));
		System.out.println(Maths.round(900000.121));
		System.out.println(Maths.abs(-6));
		System.out.println(Maths.max(1,2,3,4,9,0.07));
		System.out.println(Maths.min(-100,200,300,400,-9.0));
		System.out.println(Maths.pow(-9,3));
		System.out.println(Maths.sqrt(11));
		System.out.println(Maths.avg(1));
		System.out.println(Maths.rand(1,1));
		
	}
}
