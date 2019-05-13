package matmultpack;

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Matrix {
	// final ist nur als Test gedacht (nicht erklärt)
	private final int dim;
	private final double[][] elems;
	
	public Matrix(int n) {
		dim = n;
		elems = new double[n][n];
		
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++)
				elems[i][j] = 0.0;
		}
	}
	
	public Matrix(Matrix m) {
		dim = m.getDim();
		elems = new double[dim][dim];
		
		for(int i = 0; i < dim; i++) {
			for(int j = 0; j < dim; j++) {
				elems[i][j] = m.getElems()[i][j];
			}
		}	
	}
	
	public static Matrix read(InputStream istream)
	{
		Scanner reader = new Scanner(istream,"ISO8859_1");
		int n = reader.nextInt();
		Matrix r = new Matrix(n);
		
		for(int i= 0; i < r.getDim(); i++) {
			for(int j = 0; j < r.getDim(); j++) {
				r.elems[i][j] = reader.nextDouble();
			}
		}
		
		return r;
	}
	
	public void print(OutputStream ostream) throws UnsupportedEncodingException 
	{
		PrintStream writer = new PrintStream(ostream,true,"ISO8859_1");
		writer.println(dim);
		for(int i = 0; i < dim; i++) {
			for(int j = 0; j < dim; j++) {
				writer.printf("%10.4f", elems[i][j]);
			}
			writer.println();
		}
		
		
	}
	
	public void randomize() {
		Random zufall = new Random();
		double rdouble = 0.0;
		
		for(int i = 0; i < dim; i++) {
			for(int j = 0; j < dim; j++) {
				rdouble = zufall.nextDouble();
				elems[i][j] = rdouble;
			}
		}
	}
	
	public Matrix mult(Matrix m) {
		if(this.getDim() != m.getDim()) {
			throw new ArrayIndexOutOfBoundsException("Dim stimmmen nicht über ein!");
		}else {
			Matrix c = new Matrix(this.getDim());
			for(int i = 0; i < this.getDim(); i++) {
				for(int j = 0; j < this.getDim(); j++) {
					c.elems[i][j] = 0.0;
					for(int k = 0; k < this.getDim(); k++) {
						c.elems[i][j] = c.elems[i][j] + this.getElems()[i][k] * m.getElems()[k][j];
					}
				}
			}
		}
		
		return null;
	}
	
	
	public int getDim() {
		return dim;
	}
	
	public double[][] getElems() {
		return elems;
	}
	
}
