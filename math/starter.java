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
		ArrayList<Double> randoms = new ArrayList<Double>(1000);
		for(int i=0;i<randoms.size();i++) {
			randoms.set(i,Maths.rand(100));
			Canvas.pause(1);
		}
		
		System.out.println("Base array:\n"+Arrays.toString(randoms.toArray()));
		
		ArrayList<Double> pows = new ArrayList<Double>(1000);
		for(int i=0;i<pows.size();i++) {
			pows.set(i,Maths.pow(randoms.get(i),2));
			Canvas.pause(1);
		}

		System.out.println("Squared array:\n"+Arrays.toString(randoms.toArray()));
		
		ArrayList<Double> sqrts = new ArrayList<Double>(1000);
		for(int i=0;i<sqrts.size();i++) {
			sqrts.set(i,Maths.sqrt(randoms.get(i)));
		}

		System.out.println("SqrRoot array:\n"+Arrays.toString(sqrts.toArray()));
		
	}
}