import pkg.*;
import java.util.ArrayList;
import java.time.Clock;

public final class Maths {
	private static float mathnumber;
	private static Clock clo;
	private Maths () {
		mathnumber = 0;
	}
	
	//floor, takes double
	public static int floorD(double inp) {
		return (int) inp;
	}
	
	//ceiling command, takes double
	public static int ceilD(double inp) {
		int benchmark = (int) inp;
		if(inp>benchmark){return (int) inp+1;}
		else if(inp==benchmark){return (int) inp;}
		else{return 0;}
	}
	
	//round command, takes double
	public static int round(double inp) {
		double benchmark = (int) inp+0.5;
		if(inp<benchmark){return (int) inp;}
		else if(inp>benchmark){return (int) inp+1;}
		else{return (int) inp+1;}
	}
	
	//absolute value command, takes double
	public static double abs(double inp) {
		if(inp>0){return inp;}
		else{return inp*(-1);}
	}
	
	//maximum command, takes unlimited doubles
	public static double max(double ... inp) {
		double maxinp = inp[0];
		for(int i=1;i<inp.length;i++) {
			if (inp[i]>maxinp) {maxinp=inp[i];}
		}
		return maxinp;
	}
	
	//minimum command, takes unlimited doubles
	public static double min(double ... inp) {
		double mininp = inp[0];
		for(int i=1;i<inp.length;i++) {
			if (inp[i]<mininp) {mininp=inp[i];}
		}
		return mininp;
	}
	
	//power command, takes a double base and an int exponent
	public static double pow(double base, int exp) {
		if(exp<=0) {return 1;}
		int c = 1;
		double d = base;
		while(c<exp) {d=d*base;c++;}
		return d;
	}
	
	//root command, takes an int base and an int root
	//note: not my code, couldn't figure out a way to do this
	public static double sqrt(int base) {
		double a = 0;
		double sqt = base/2;
		while((a-sqt)!=0){
			a = sqt;
			sqt = (a+(base/a))/2;
		}
		return sqt;
	}
	
	//averaging function, takes unlimited doubles
	public static double avg(double ... inp) {
		double sum = 0;
		for(int i=0;i<inp.length;i++) {
			sum += inp[i];
		}
		return sum/inp.length;
	}
	
	//random command, takes an integer seed and an upper bound
	public static double rand(int seed, int limit) {
		double tiom = System.currentTimeMillis()*seed;
		int[] lims = new int[limit];
		for(int i=0;i<lims.length;i++) {
			lims[i] = i;
		}
		return tiom%10;
	}
}
