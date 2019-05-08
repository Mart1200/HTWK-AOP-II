package Vector;

import java.util.Arrays;
import java.util.Random;

public class Vector {
	private double l�nge;
	private double[] vector;
	
	
	public Vector(int vl�nge) {
		Random r = new Random();
		vector = new double[vl�nge];
		
		for(int i = 0; i<vl�nge; i++) {
			double a = r.nextDouble() * 10;
			vector[i] = a;
		}
		this.l�ngeBerechnen();
	}
	
	public Vector(double[] ve) {
		vector = ve;
		this.l�ngeBerechnen();
	}
	
	public double getL�nge() {
		return l�nge;
	}

	public void setL�nge(double l�nge) {
		this.l�nge = l�nge;
	}

	public double[] getVector() {
		return vector;
	}

	public void setVector(double[] vector) {
		this.vector = vector;
	}
	
	@Override
	public String toString() {
		return "Vector [l�nge=" + l�nge + ", vector=" + Arrays.toString(vector) + "]";
	}

	public void l�ngeBerechnen() {
		double summ = 0;
		
		for(int i = 0; i < vector.length; i++) {
			summ = summ + Math.pow(vector[i], 2);
		}
		l�nge = Math.sqrt(summ);	
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
		return 180 * Math.acos((this.skalar(v2))/ (this.getL�nge() * v2.getL�nge())) / Math.PI;
	}
	
}
