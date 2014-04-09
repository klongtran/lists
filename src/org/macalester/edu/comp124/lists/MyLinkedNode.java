package org.macalester.edu.comp124.lists;

/**
 * Created by baylor on 4/3/14.
 */
public class MyLinkedNode<E>
{
	E value;
	MyLinkedNode<E> next;

	MyLinkedNode(E value)
	{
		this.value = value;
	}

    public E getValue() { return value; }

    public MyLinkedNode<E> getNext() { return next; }

    public void setNext(MyLinkedNode<E> next) { this.next = next; }

	@Override
	public String toString()
	{
		return value.toString();
	}
}
