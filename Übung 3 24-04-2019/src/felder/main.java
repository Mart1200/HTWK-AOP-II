package felder;

import java.util.Arrays;
import java.util.Random;
import java.math.*;

public class main {

	public static void main(String[] args) {
		
		int n = 9;
		double mw = 0;
		double sab = 0.0;
		
		Random r = new Random();
		double[] wert = new double[n];
		
		for(int i = 0; i < wert.length; i++) {
			double x = r.nextGaussian();
			wert[i] = x;
			
			System.out.printf("Werte %2d: %6.2f \n", i+1, x);
		}
		
		
		//Mittelwert
		for(int j = 0; j < wert.length; j++) {
			mw = mw + wert[j];
		}
		
		mw = mw / wert.length;
		System.out.printf("Mittelwert: %6.2f\n", mw);
		
		//Standartabweichung
		for(int k = 0; k < wert.length; k++) {
			sab = sab + Math.pow( wert[k] - mw, 2);
		}
		
		sab = Math.sqrt(sab / (wert.length - 1));
		System.out.printf("Standartabweichung %6.2f\n", sab);
		
		//Median
		double median;
		Arrays.sort(wert);
		
		if((wert.length & 1)== 0) {
			median = (wert[wert.length/2] + wert[wert.length/2 -1]) / 2;
		}
		else {
			median = wert[(wert.length - 1)/ 2];
		}
		
		System.out.printf("Median: %6.2f", median);
		
	}

}
