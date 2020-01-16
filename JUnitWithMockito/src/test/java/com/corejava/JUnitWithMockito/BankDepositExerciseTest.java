package com.corejava.JUnitWithMockito;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import com.corejava.JUnitWithMockito.dataAndTime.BankDepositExercise;

@RunWith(MockitoJUnitRunner.class)
public class BankDepositExerciseTest {
	
	DateTimeFormatter formatter;// = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate expected;//=LocalDate.parse("24-02-2014", formatter);;
	String expected1;
	
	@InjectMocks
	BankDepositExercise bankDepositExerciseTest;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 expected=LocalDate.parse("24-02-2014", formatter);;
		 expected1="3 months are 7";	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetMaturityDate() {		
		assertEquals(expected, bankDepositExerciseTest.getMaturityDate("24/03/2013", Period.ofYears(8).ofMonths(11)));		
	}
	@Test
	public void testgetMaturityDateFailure() {		
		assertNotEquals(expected, bankDepositExerciseTest.getMaturityDate("24/03/2014", Period.ofYears(8).ofMonths(11)));		
	}

	@Test
	public void testNotnull() {		
		assertNotNull(expected);	
	}
	
	@Test
	public void testgetInvestmentPeriod() {		
		//System.out.println(expected1);
		assertEquals(expected1, bankDepositExerciseTest.getInvestmentPeriod("2013-05-12", "2016-12-12"));
	}
	
	@Test
	public void testgetInvestmentPeriodFailure() {		
		//System.out.println(expected1);
		String wrongoutput=bankDepositExerciseTest.getInvestmentPeriod("2013-05-12", "2016-12-11");
		assertNotEquals(expected1, wrongoutput);
	}
	
	@Test
	public void testgetInvestmentPeriodNotnull() {		
		assertNotNull(expected1);	
	}
	
}
