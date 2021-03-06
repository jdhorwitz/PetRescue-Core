package com.systemsinmotion.petrescue.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FormTypeTest {

	@Test
	public void formCatAdoptionTest() throws Exception {

		assertEquals(FormType.CAT_ADOPTION,
				FormType.byDescription("cat-adoption"));

	}

	@Test
	public void formDogAdoptionTest() throws Exception {

		assertEquals(FormType.DOG_ADOPTION,
				FormType.byDescription("dog-adoption"));
	}

	@Test
	public void formVolunteerAdoptionTest() throws Exception {

		assertEquals(FormType.VOLUNTEER,
				FormType.byDescription("volunteer-application"));
	}
}
