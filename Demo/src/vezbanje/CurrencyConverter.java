package vezbanje;

import java.util.ArrayList;

public class CurrencyConverter {
	
	public static void main(String[] args) {
		

		System.out.println(euroConverter(1));
		
	}
		
	public static ArrayList<Double> euroConverter(double eur) {
		
		double den;
		double din;
		double hrk;
		
		den = (double) (eur*61.8);
		din = (double) (eur*117.93);
		hrk = (double) (eur*7.54);
		
	
		ArrayList<Double>eurList = new ArrayList<Double>();
		
		eurList.add(den);
		eurList.add(din);
		eurList.add(hrk);
		
		
		
		return eurList;
		
	}
	
	public static ArrayList<Double> dinConverter(double din) {
		
		double eur;
		double den;
		double hrk;
		
		eur = (double) (din/117.93);
		
				
		
		
		ArrayList<Double> dinList = new ArrayList<Double>();
		
		dinList.add(eur);
		dinList.add(den);
		dinList.add(hrk);
		
		
		
		
		
		
		
		return null;
		
	}
	
	
		
}
		
		
	
	
	

		
		
		
		

