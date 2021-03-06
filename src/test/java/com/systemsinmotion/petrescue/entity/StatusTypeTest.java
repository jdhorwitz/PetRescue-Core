package com.systemsinmotion.petrescue.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatusTypeTest {

	@Test
	public void testDescription() throws Exception {

		assertEquals(StatusType.A, StatusType.byDescription("adoptable"));
		assertEquals(StatusType.H, StatusType.byDescription("hold"));
		assertEquals(StatusType.P, StatusType.byDescription("pending"));
		assertEquals(StatusType.X, StatusType.byDescription("adopted"));

	}
}
