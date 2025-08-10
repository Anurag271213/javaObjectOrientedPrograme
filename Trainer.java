package com.payroll_system.blc;

public class Trainer {
int trainerId;
String trainerName;
double basicSalary;
double HRAPer;
double DAPer;
double batchCount;
double perkPerBatch;

public double calculateGrossSalary() {
	return  basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch);
			 
}

}
