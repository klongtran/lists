package org.macalester.edu.comp124.lists;

/**
 * Created by baylor on 4/3/14.
 */
public class MyLinkedList<E>
{
	protected MyLinkedNode<E> head;
	protected MyLinkedNode<E> tail;
	public int numElements = 0;

	/**
	 * Returns the element at position index.
	 * @param index
	 * @return
	 */
    public E get(int index)
	{
        if (index >= 0 && index < numElements) {
            int pos = 0;
            for (MyLinkedNode<E> current = head;
                 current != null;
                 current = current.getNext(), pos+=1 )
            {
                if (pos == index) {
                    return current.getValue();
                }
            }
        }

        // must not have been a legal position
        return null;
	}

	/**
	 * Adds a new element to the end of the list:
	 *
	 * @param elem
	 */
	public void add(E elem)
	{
        MyLinkedNode<E> newNode = new MyLinkedNode(elem);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.setNext(newNode);
            tail = newNode;
        }

        numElements++;
	}

	/**
	 * Inserts a new element at the specified index.
	 *
	 * @param elem
	 */

	public void add(int i, E elem) {

		MyLinkedNode<E> current = head;
        int indexCounter = 0;

        int targetIndex = i - 1;

        MyLinkedNode<E> newNode = new MyLinkedNode<E>(elem);

        if (current != null) {
            while(indexCounter < targetIndex && current.getNext() != null) {
                indexCounter++;
                current = current.getNext();
            }

            if (indexCounter == targetIndex) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
            } else if (i == 0) {
                newNode.setNext(head);
                head = newNode;
            }

        } else if (i == 0) {
            head = newNode;
        }

        numElements++;
	}

	/**
	 * Returns the current size of the list.
	 * @return
	 */
	public int size() {
		return numElements;
	}


	/**
	 * Clears the contents of the list.
	 */
	public void clear() {
		head = null;
		tail = null;
		numElements = 0;
	}


	/**
	 * These methods are only used by the unit tests.
	 * They are intentionally not public.
	 * @return
	 */
	MyLinkedNode getHead() { return head; }
	MyLinkedNode getTail() { return tail; }

	/**
	 * Print the contents of the list
	 * @return
	 */
	@Override public String toString()
	{
		String output = "";
		MyLinkedNode current = head;
		while (current!=null)
		{
			output += current;
			output += " -> ";
		}
		output = output.substring(0,output.length()-4);
		return output;
	}
}
