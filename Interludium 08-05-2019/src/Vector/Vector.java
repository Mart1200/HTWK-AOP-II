package Vector;

import java.util.Arrays;
import java.util.Random;

public class Vector {
	private double länge;
	private double[] vector;
	
	
	public Vector(int vlänge) {
		Random r = new Random();
		vector = new double[vlänge];
		
		for(int i = 0; i<vlänge; i++) {
			double a = r.nextDouble() * 10;
			vector[i] = a;
		}
		this.längeBerechnen();
	}
	
	public Vector(double[] ve) {
		vector = ve;
		this.längeBerechnen();
	}
	
	public double getLänge() {
		return länge;
	}

	public void setLänge(double länge) {
		this.länge = länge;
	}

	public double[] getVector() {
		return vector;
	}

	public void setVector(double[] vector) {
		this.vector = vector;
	}
	
	@Override
	public String toString() {
		return "Vector [länge=" + länge + ", vector=" + Arrays.toString(vector) + "]";
	}

	public void längeBerechnen() {
		double summ = 0;
		
		for(int i = 0; i < vector.length; i++) {
			summ = summ + Math.pow(vector[i], 2);
		}
		länge = Math.sqrt(summ);	
	}
	
	public double length() {
		return vector.length;
	}
	
	public double skalar(Vector v2) {
		double sp = 0;
		
//		if(this.length() != v2.length()) {
//			throw java.lang.IndexOutOfBoundsException;
//		}
		
		for(int i = 0; i < this.length(); i++) {
			sp = sp + v2.getVector()[i] * vector[i];
		}
		
		return sp;
	}
	
	public double winkelZw(Vector v2) {
		return 180 * Math.acos((this.skalar(v2))/ (this.getLänge() * v2.getLänge())) / Math.PI;
	}
	
}
