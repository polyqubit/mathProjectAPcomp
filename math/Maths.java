import pkg.*;
import java.util.ArrayList;
import java.time.Clock;

public class Maths {
	double mathnumber;
	private Clock clo;
	
	Maths (double inp) {
		mathnumber = inp;
	}
	
	//floor, takes double
	int floorD() {
		return (int) mathnumber;
	}
	
	//ceiling command, takes double
	int ceilD() {
		int benchmark = (int) mathnumber;
		if(mathnumber>0){
			if(mathnumber>benchmark){return (int) mathnumber+1;}
			else if(mathnumber==benchmark){return (int) mathnumber;}
			else{return 0;}
		}
		else{
			if(mathnumber<benchmark){return (int) mathnumber-1;}
			else if(mathnumber==benchmark){return (int) mathnumber;}
			else{return 0;}
		}
	}
	
	//round command, takes double
	int round() {
		double benchmark = (int) mathnumber+0.5;
		if(mathnumber<benchmark){return (int) mathnumber;}
		else if(mathnumber>benchmark){return (int) mathnumber+1;}
		else{return (int) mathnumber+1;}
	}
	
	//absolute value command, takes double
	double abs() {
		if(mathnumber>0){return mathnumber;}
		else{return mathnumber*(-1);}
	}
	
	//maximum command, takes unlimited doubles
	double max(double[] inp) {
		double maxinp = inp[0];
		for(int i=1;i<inp.length;i++) {
			if (inp[i]>maxinp) {maxinp=inp[i];}
		}
		return maxinp;
	}
	
	//minimum command, takes unlimited doubles
	double min(double[] inp) {
		double mininp = inp[0];
		for(int i=1;i<inp.length;i++) {
			if (inp[i]<mininp) {mininp=inp[i];}
		}
		return mininp;
	}
	
	//power command, takes a double base and an int exponent
	double pow(int exp) {
		if(exp<=0) {return 1;}
		int c = 1;
		double d = mathnumber;
		while(c<exp) {d=d*mathnumber;c++;}
		return d;
	}
	
	//root command, takes a double base
	//note: not my code, couldn't figure out a way to do this
	double sqrt() {
		if(mathnumber<0){return 0;}
		double a = 0;
		double sqt = mathnumber/2;
		while((a-sqt)!=0){
			a = sqt;
			sqt = (a+(mathnumber/a))/2;
		}
		return sqt;
	}
	
	//averaging function, takes unlimited doubles
	double avg(double[] inp) {
		double sum = 0;
		for(int i=0;i<inp.length;i++) {
			sum += inp[i];
		}
		return sum/inp.length;
	}
	
	//random command, takes an integer upper bound
	double rand(int limit) {
		if(limit>100000000) {limit=100000000;}
		double tiom = System.currentTimeMillis()*System.currentTimeMillis()*30109.14159265358979;
		int[] list = new int[limit+1];
		for(int i=0;i<list.length;i++){
			list[i]=i;
		}
		if(limit%2==0){
			if(tiom<0) {tiom = tiom%(limit+1)*(-1);}
			else {tiom = tiom%(limit+1);}
		}
		else{
			if(tiom<0) {tiom = tiom%(limit)*(-1);}
			else {tiom = tiom%(limit);}
		}
		int toim = (int) tiom;
		return list[toim];
	}
}



class nMath extends Maths {
	double num = 0;
	public nMath(double inp) {
		num = inp;
		super(inp);
	}
	public int floorD() {
		return(super.floorD());
	}
	public int ceilD() {
		return(super.ceilD());
	}
	
	//round command, takes double
	public int round() {
		return(super.round());
	}
	
	//absolute value command, takes double
	public double abs() {
		return(super.abs());
	}
	
	//maximum command, takes unlimited doubles
	public double max(double ... inp) {
		return(super.max(inp));
	}
	
	//minimum command, takes unlimited doubles
	double min(double ... inp) {
		return(super.min(inp));
	}
	
	//power command, takes a double base and an int exponent
	double pow(int exp) {
		return(super.pow(exp));
	}
	
	//root command, takes a double base
	//note: not my code, couldn't figure out a way to do this
	double sqrt() {
		return(super.sqrt());
	}
	
	//averaging function, takes unlimited doubles
	double avg(double ... inp) {
		return(super.avg(inp));
	}
	
	//random command, takes an integer upper bound
	double rand(int limit) {
		return(super.rand(limit));
	}
}

