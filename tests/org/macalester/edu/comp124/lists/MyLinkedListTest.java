package org.macalester.edu.comp124.lists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by baylor on 4/3/14.
 */
public class MyLinkedListTest
{
	@Test
	public void testAddAndGetHead()
	{
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("A");
		String expected = "A";
		String actual   = list.get(0);
		assertEquals(expected, actual);
	}

	@Test
	public void testAddAndGetMiddle()
	{
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		String expected = "B";
		String actual   = list.get(1);
		assertEquals(expected, actual);
		expected = "C";
		actual   = list.get(2);
		assertEquals(expected, actual);
		expected = "D";
		actual   = list.get(3);
		assertEquals(expected, actual);
		expected = "E";
		actual   = list.get(4);
		assertEquals(expected, actual);
	}

	@Test
	public void testAddAndGetTail()
	{
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		String expected = "F";
		String actual   = list.get(5);
		assertEquals(expected, actual);
	}

	@Test
	public void testInsertFront()
	{
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        assertEquals(6, list.size());

        list.add(0, "new head");
        assertEquals(7, list.size());
        String expected = "new head";
        String actual   = list.get(0);
        assertEquals(expected, actual);
	}

	@Test
	public void testInsertMiddle()
	{
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        assertEquals(6, list.size());

        list.add(3, "new middle");
        assertEquals(7, list.size());
        String expected = "new middle";
        String actual   = list.get(3);
        assertEquals(expected, actual);
	}

	@Test
	public void testInsertEnd()
	{
		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		assertEquals(6, list.size());

		list.add(6, "new tail");
		assertEquals(7, list.size());
		String expected = "new tail";
		String actual   = list.get(6);
		assertEquals(expected, actual);
	}
}
