package com.payroll_system.blc;

public class Sourcing {

int sourceId;
String sourceName;
double basicSalary;
double HRAPer;
double DAPer;
double enrollmentTarget;
int enrollmentReached;
double perkPerEnrollment;

public double calculateGrossSalary() {
	return  basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
}

}
