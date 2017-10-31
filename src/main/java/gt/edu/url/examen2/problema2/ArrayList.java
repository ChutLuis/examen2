package gt.edu.url.examen2.problema2;

// TODO: Auto-generated Javadoc
/**
 * The Class ArrayList.
 *
 * @param <E>
 *            the element type
 */
public class ArrayList<E> implements List<E> {
	
	/** The Constant CAPACITY. */
	public static final int CAPACITY=1;
	
	/** The data. */
	private E[ ] data;
	
	/** The size. */
	private int size = 0;
	
	/**
	 * Instantiates a new array list.
	 */
	public ArrayList() {
		this(CAPACITY);
	}

	/**
	 * Instantiates a new array list.
	 *
	 * @param capacity
	 *            the capacity
	 */
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}

	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema2.List#size()
	 */
	public int size() {
		return size;
	}

	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema2.List#isEmpty()
	 */
	public boolean isEmpty() { 
		return size == 0;
	}

	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema2.List#get(int)
	 */
	public E get(int i) {
		
		return data[i];
	}

	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema2.List#set(int, java.lang.Object)
	 */
	public E set(int i, E e) {
		
		E temp = data[i];
		data[i] = e;
		return temp;
	}
	
	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema2.List#add(int, java.lang.Object)
	 */
	public void add(int i, E e) {
				
				if (size == data.length) // not enough capacity
					resize(2 * data.length);
				for (int k = size - 1; k >= i; k--) // start by shifting rightmost
					data[k + 1] = data[k];
				data[i] = e; // ready to place the new element 
				size++;
		
			}

	/**
	 * Resize.
	 *
	 * @param capacity
	 *            the capacity
	 */
	protected void resize(int capacity) {
				E[] temp = (E[]) new Object[capacity];
				for (int k=0; k < size; k++)
					temp[k] = data[k];
				data = temp;
			}
	
	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema2.List#remove(int)
	 */
	public E remove(int i) throws IndexOutOfBoundsException {
		
		E temp = data[i];
		for (int k=i; k < size-1; k++)
			data[k] = data[k+1];
		data[size-1] = null;
		size--;
		return temp;
}
}
