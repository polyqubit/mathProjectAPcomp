import pkg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Clock;

public class starter {

	public static void main(String args[]) {
		/**
		Maths Mathss = new Maths(-9.093);
		System.out.println(Mathss.floorD());
		System.out.println(Mathss.ceilD());
		System.out.println(Mathss.round());
		System.out.println(Mathss.abs());
		System.out.println(Mathss.max(1,2,3,4,9,0.07));
		System.out.println(Mathss.min(-100,200,300,400,-9.0));
		System.out.println(Mathss.pow(3));
		System.out.println(Mathss.sqrt());
		System.out.println(Mathss.avg(1));
		System.out.printf("%.0f\n", Mathss.rand(100000000));
		System.out.println(Mathss.avg(1,5,7,8));
		
		test code
		**/
		
		//print flag
		int fp = 0b1011000000;
		
		nMath mNum = new nMath(0);
		double nNum;
		double avg=0;
		double maxinp=0;
		double mininp=0;
		int col=0;
		Rectangle point;
		Color pc;
		System.out.print("baseArray[ ");
		ArrayList<Double> randoms = new ArrayList<Double>(2000);
		for(int i=0;i<2000;i++) {
			nNum = mNum.rand(fp,255);
			mNum = new nMath(nNum);
			randoms.add(nNum);
			Canvas.pause(1);
			avg += randoms.get(i);
			point = new Rectangle(randoms.get(i)*1.5,250,2,5);
			col = mNum.floorD(fp);
			pc = new Color(col,col/2,100);
			point.setColor(pc);
			point.fill();
			if (randoms.get(i)>maxinp) {maxinp=randoms.get(i);}
			if (randoms.get(i)<mininp) {mininp=randoms.get(i);}
			if(i<1999){System.out.print(", ");}
			else{break;}
		}
		System.out.print(" ]\nAverage of array:"+avg/2000+"\nMax,Min of array:"+maxinp+", "+mininp+"\n\n\n");
		avg=0;
		maxinp=0;
		mininp=0;
		mNum = new nMath(0);
		
		//System.out.println("Base array:\n"+Arrays.toString(randoms.toArray()));
		
		System.out.print("powArray[ ");
		ArrayList<Double> pows = new ArrayList<Double>(2000);
		for(int i=0;i<2000;i++) {
			mNum = new nMath(randoms.get(i));
			pows.add(mNum.pow(fp,2));
			Canvas.pause(1);
			avg+=pows.get(i);
			if (pows.get(i)>maxinp) {maxinp=pows.get(i);}
			if (pows.get(i)<mininp) {mininp=pows.get(i);}
			if(i<1999){System.out.print(", ");}
			else{break;}
		}
		System.out.print(" ]\nAverage of array:"+avg/2000+"\nMax,Min of array:"+maxinp+", "+mininp+"\n\n\n");
		avg=0;
		maxinp=0;
		mininp=0;
		mNum = new nMath(0);

		System.out.print("sqrtArray[ ");
		ArrayList<Double> sqrts = new ArrayList<Double>(2000);
		for(int i=0;i<2000;i++) {
			mNum = new nMath(randoms.get(i));
			sqrts.add(mNum.sqrt(fp));
			Canvas.pause(1);
			avg+=sqrts.get(i);
			if (sqrts.get(i)>maxinp) {maxinp=sqrts.get(i);}
			if (sqrts.get(i)<mininp) {mininp=sqrts.get(i);}
			if(i<1999){System.out.print(", ");}
			else{break;}
		}
		System.out.print(" ]\nAverage of array:"+avg/2000+"\nMax,Min of array:"+maxinp+", "+mininp+"\n\n\n");
		
	}
}