package com.payroll_system.blc;
//Tax Calculation Logic: If gross salary is greater than 50000 tax is 20% else, tax is 5%.

public class TaxUtil {

public double calculateTax(Employee e) {
	if(e.calculateGrossSalary()>50000)
	{ return (e.calculateGrossSalary()*20)/100;}
	else { return (e.calculateGrossSalary()*5)/100;}
}

public double calculateTax(Manager m) {
	
	return 0.0;
}

public double calculateTax(Trainer t) {
	return 0.0; 
}

public double calculateTax(Sourcing s) {
	return 0.0;
}


	
}
