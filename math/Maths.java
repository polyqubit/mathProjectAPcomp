import pkg.*;
import java.util.ArrayList;

public final class Maths {
	private static float mathnumber;
	private Maths () {
		mathnumber = 0;
	}
	
	//floor, takes double
	public static int floorD(double inpu) {
		return (int) inpu;
	}
	
	//ceiling command, takes double
	public static int ceilD(double inpu) {
		int benchmark = (int) inpu;
		if(inpu>benchmark){return (int) inpu+1;}
		else if(inpu==benchmark){return (int) inpu;}
		else{return 0;}
	}
	
	//round command, takes double
	public static int round(double inpu) {
		double benchmark = (int) inpu+0.5;
		if(inpu<benchmark){return (int) inpu;}
		else if(inpu>benchmark){return (int) inpu+1;}
		else{return (int) inpu+1;}
	}
	
	//absolute value command, takes double
	public static double abs(double inpu) {
		if(inpu>0){return inpu;}
		else{return 0;}
	}
}
