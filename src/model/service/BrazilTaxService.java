package model.service;

public class BrazilTaxService implements TaxService {
	
	public double tax(double amount) {
		
		if (amount <= 100.0) {
			return (amount * 20) / 100;
		}
		else {
			return (amount * 15) / 100;
		}
	}

}
