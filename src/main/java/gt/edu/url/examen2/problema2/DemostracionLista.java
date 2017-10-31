package gt.edu.url.examen2.problema2;

// TODO: Auto-generated Javadoc
/**
 * The Class DemostracionLista.
 */
public class DemostracionLista implements DemoList {

	/* (non-Javadoc)
	 * @see gt.edu.url.examen2.problema2.DemoList#crearDemoLista()
	 */
	@Override
	
	public List<Integer> crearDemoLista() {
		List<Integer> n1 = new ArrayList<>();
		n1.add(0, 4);
		n1.add(0, 3);
		n1.add(0, 2);
		n1.add(2, 1);
		n1.add(1, 5);
		n1.add(1, 6);
		n1.add(3, 7); 
		n1.add(0, 8);
		return n1;		
	}

}
