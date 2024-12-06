package service;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();
	
	default double payment(double amount, int months) {
		if (months < 1 || months > 12) {
			throw new InvalidParameterException("O número de meses precisa estar entra 1 e 12");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
