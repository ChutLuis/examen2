package gt.edu.url.examen2.problema5;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Stack<String> n1 = new DynamicStack<>();
		n1.push("Prueba 1");
		n1.push("Prueba 2");
		n1.push("Prueba 3");
		n1.push("Prueba 4");
		n1.push("Prueba 5");
		n1.push("Prueba 6");
		n1.push("Prueba 7");
		n1.push("Prueba 8");
		String temp = null;
		do {	
			temp = n1.pop();
			System.out.println(temp);
		}while(temp!=null);
	
	}

}
