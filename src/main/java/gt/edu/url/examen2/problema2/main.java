package gt.edu.url.examen2.problema2;
import gt.edu.url.examen2.problema2.DemoList;
// TODO: Auto-generated Javadoc

/**
 * The Class main.
 */
public class main {
 
	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemostracionLista n1 = new  DemostracionLista();
		int temp = 0;
		do {
			int n3 = n1.crearDemoLista().remove(temp);
			System.out.println(n3);
			temp++;
		}while(temp!= n1.crearDemoLista().size());
		
		
	}

}
