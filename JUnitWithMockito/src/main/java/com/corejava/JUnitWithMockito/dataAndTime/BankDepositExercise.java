package com.corejava.JUnitWithMockito.dataAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class BankDepositExercise {
	public static void main(String[] args) {
		getMaturityDate("24/03/2013", Period.ofYears(8).ofMonths(11));
		getInvestmentPeriod("2013-05-12", "2016-12-12");
	}

	public static LocalDate getMaturityDate(String investmentDate, Period duration) {
		// - Method should take investment date and duration as input and return the
		// maturity date as a string in the format <dd-mmm-yyyy>
		// Input fro period

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd-MM-yyyy][dd/MM/yyyy]");
		LocalDate date = LocalDate.parse(investmentDate, formatter);
		// LocalDate maturityDate = date.plusMonths(8).plusYears(10);
		LocalDate maturityDate = date.plus(duration);
		System.out.println(maturityDate + " is the maturuity data");
		return maturityDate;
	}

	// dd/mm/yyyy, dd-mm-yyyy>. Test the above methods

	public static String getInvestmentPeriod(String investmentDate, String maturityDate) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/mm/yyyy]");
		LocalDate local = LocalDate.parse(investmentDate, formatter);
		LocalDate local1 = LocalDate.parse(maturityDate);
		System.out.println(local1);
		Period differ = Period.between(local, local1);
		System.out.println(differ.getYears() + " months are" + differ.getMonths() + " is the difference");
		return differ.getYears() + " months are " + differ.getMonths();

	}
	// - Method should take investment date and maturity dates as input and return
	// the duration as a string in the format <x years, y months>

}
