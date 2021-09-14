import pkg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Clock;

public class starter {

	public static void main(String args[]) {
		/**double test = 9.901;
		System.out.println(Maths.floorD(test));
		System.out.println(Maths.ceilD(test));
		System.out.println(Maths.round(900000.121));
		System.out.println(Maths.abs(-6));
		System.out.println(Maths.max(1,2,3,4,9,0.07));
		System.out.println(Maths.min(-100,200,300,400,-9.0));
		System.out.println(Maths.pow(-9,3));
		System.out.println(Maths.sqrt(11));
		System.out.println(Maths.avg(1));
		System.out.printf("%.0f\n", Maths.rand(1000000000));
		System.out.println(Maths.avg(1,5,7,8));
		
		test code 
		**/
		Double randoms[] = new Double[1000];
		for(int i=0;i<randoms.length;i++) {
			randoms[i]=Maths.rand(100);
			Canvas.pause(1);
		}
		
		System.out.println("Base array:\n"+Arrays.toString(randoms));
		
		Double pows[] = new Double[1000];
		for(int i=0;i<pows.length;i++) {
			pows[i]=Maths.pow(randoms[i],2);
		}

		System.out.println("Squared array:\n"+Arrays.toString(pows));
		
		Double sqrts[] = new Double[1000];
		for(int i=0;i<sqrts.length;i++) {
			sqrts[i]=Maths.sqrt(randoms[i]);
		}

		System.out.println("SqrRoot array:\n"+Arrays.toString(sqrts));
		
	}
}