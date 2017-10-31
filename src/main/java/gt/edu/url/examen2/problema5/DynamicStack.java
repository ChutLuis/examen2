package gt.edu.url.examen2.problema5;

// TODO: Auto-generated Javadoc
/**
 * The Class DynamicStack.
 *
 * @param <E>
 *            the element type
 */
public class DynamicStack<E> implements Stack<E> {
	
	/** The Constant CAPACITY. */
	public static final int CAPACITY=1;
	
	/** The data. */
	private E[] data;
	
	/** The t. */
	private int t=-1;
	
	/**
	 * Instantiates a new dynamic stack.
	 */
	public DynamicStack() {
		this(CAPACITY);
	}

	/**
	 * Instantiates a new dynamic stack.
	 *
	 * @param capacity
	 *            the capacity
	 */
	public DynamicStack(int capacity) {
		data = (E[]) new Object[capacity];
	}

	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema5.Stack#size()
	 */
	public int size(){
		return t+1;
	}

	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema5.Stack#isEmpty()
	 */
	public boolean isEmpty() {
		return (t == -1);
	}

	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema5.Stack#push(java.lang.Object)
	 */
	public void push(E e) {
		if (t == data.length-1) resize(2 * data.length);		
		data[++t] = e;
	    
	}

	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema5.Stack#top()
	 */
	public E top() {
		if (isEmpty()) return null;
		return data[t];
	}
	
	/**
	 * Resize.
	 *
	 * @param capacity
	 *            the capacity
	 */
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		for (int k=0; k < data.length; k++)
			temp[k] = data[k];
		data = temp;
	}
	
	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema5.Stack#pop()
	 */
	public E pop() {
		if (isEmpty()) return null;
		E response = data[t];
		data[t] = null;
		t--;
		return response;
	}


}
