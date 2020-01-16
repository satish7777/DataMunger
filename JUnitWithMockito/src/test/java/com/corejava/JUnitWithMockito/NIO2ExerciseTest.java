package com.corejava.JUnitWithMockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.corejava.JUnitWithMockito.fileNIO.NIO2Exercise;
import com.corejava.JUnitWithMockito.fileNIO.Tablet;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class NIO2ExerciseTest {

	Map<String, String> expected;
	// paractomal=24/03/1992, cocin=14/04/1993

	@Mock
	Tablet tabletMock;

	@InjectMocks
	NIO2Exercise nio2Exercise;

	@Before
	public void setUp() throws Exception {
		expected = new HashMap<String, String>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetExpiredTablets() {
		// fail("Not yet implemented");
		expected.put("paractomal", "24/03/1992");
		expected.put("cocin", "14/04/1993");
		// Map<String, String> data = NIO2Exercise.getExpiredTablets("medical.txt",
		// "reddys");
		assertEquals(expected, NIO2Exercise.getExpiredTablets("medical.txt", "reddys"));

	}

	@Test
	public void TestNotNull() {

		assertNotNull(NIO2Exercise.getExpiredTablets("medical.txt", "reddys"));

	}

	@Test
	public void TestNotNullFailure() {
		assertNotNull(NIO2Exercise.getExpiredTablets("medical.txt", "redd"));
	}

	@Test(expected = RuntimeException.class)
	public void checkExceptionTest() {
		when(nio2Exercise.findAbsolutePath("medical.txt", "repo")).thenThrow(new NoSuchFileException("medical.txt"));

	}

}
