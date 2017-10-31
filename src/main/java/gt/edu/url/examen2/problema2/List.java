package gt.edu.url.examen2.problema2;

// TODO: Auto-generated Javadoc
/**
 * The Interface List.
 *
 * @param <E>
 *            the element type
 */
public interface List<E>{

	/**
	 * Returns list elements count.
	 *
	 * @return number of elements in list
	 */
	int size();
	
	/**
	 * Checks if list is empty.
	 *
	 * @return true if list is empty, false otherwise
	 */
	boolean isEmpty();

	/**
	 * Retrieves but not removes the element at index i.
	 *
	 * @param i
	 *            the i
	 * @return Element at index i
	 */
	E get(int i);
	
	/**
	 * Replaces the element at index i with e, and returns the replaced element.
	 *
	 * @param i
	 *            the i
	 * @param e
	 *            the e
	 * @return Replaced element at index i
	 */
	E set(int i, E e);
	
	
	/**
	 * Inserts element e to be at index i, shifting all subsequent elements later.
	 *
	 * @param i
	 *            Insertion point
	 * @param e
	 *            Element to be inserted
	 */
	void add(int i, E e);
	
	/**
	 * Removes/returns the element at index i, shifting subsequent elements earlier.
	 *
	 * @param i
	 *            the i
	 * @return Deleted element at index i
	 * @throws IndexOutOfBoundsException
	 *             the index out of bounds exception
	 */
	 E remove(int i) throws IndexOutOfBoundsException;

}
