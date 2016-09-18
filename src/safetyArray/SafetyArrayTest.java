package safetyArray;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class SafetyArrayTest {

	SafetyArray sa;

	@Before
	public void init() {
		sa = new SafetyArray();
	}

	/**
	 * Wächst das Array richtig?
	 */
	@Test
	public void testInsertElement() {
		sa.insertElement(0, new Object());
		sa.insertElement(1, new Object());
		Assert.assertTrue(sa.getSize() == 5);

		sa.insertElement(14, new Object());
		Assert.assertEquals(19, sa.getSize());

		sa.insertElement(15, new Object());
		Assert.assertEquals(19, sa.getSize());

		sa.insertElement(20, new Object());
		Assert.assertEquals(25, sa.getSize());
	}

	/**
	 * Wird ordentlich gelöscht?
	 */
	@Test
	public void testRemoveElement() {
		Object a = new Object();
		Object b = new Object();

		sa.insertElement(0, a);
		try {
			sa.removeElement(a);
		} catch (ThisObjectDoesNotExistHereException e1) {
			Assert.fail();
		}

		try {
			sa.removeElement(a);
			Assert.fail();
		} catch (ThisObjectDoesNotExistHereException e1) {
			// do nothing
		}

		sa.insertElement(0, a);
		sa.insertElement(20, a);

		try {
			sa.removeElement(a);
		} catch (ThisObjectDoesNotExistHereException e1) {
			Assert.fail();
		}

		try {
			sa.getElement(20);
			Assert.fail();
		} catch (ThereIsNoElementAtThisIndexException e2) {
			// do nothing
		}

		try {
			sa.removeElement(a);
			Assert.fail();
		} catch (ThisObjectDoesNotExistHereException e1) {
			// do nothing
		}

		try {
			sa.removeElement(b);
			Assert.fail();
		} catch (ThisObjectDoesNotExistHereException e) {
			// Do nothing
		}
	}

	/**
	 * Wird ordentlich zurückgegeben?
	 */
	@Test
	public void testGetElement() {
		Object a = new Object();
		Object b = new Object();

		sa.insertElement(0, a);
		sa.insertElement(25, b);

		try {
			Assert.assertEquals(sa.getElement(0), a);
		} catch (ThereIsNoElementAtThisIndexException e) {
			Assert.fail();
		}

		try {
			Assert.assertEquals(sa.getElement(25), b);
		} catch (ThereIsNoElementAtThisIndexException e) {
			Assert.fail();
		}

		try {
			Assert.assertEquals(sa.getElement(5), null);
			Assert.fail();
		} catch (ThereIsNoElementAtThisIndexException e) {
		}

		try {
			Assert.assertEquals(sa.getElement(44), null);
			Assert.fail();
		} catch (ThereIsNoElementAtThisIndexException e) {
		}
	}
}
