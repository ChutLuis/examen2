package gt.edu.url.examen2.problema3;

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
		 LinkedPositionalList<String> n1 = new LinkedPositionalList<>();
	        Position<String> P0, P1, P2, P3;
	        P0 = n1.addFirst("G");
	        P1 = n1.addAfter(P0,"F");
	        P2 = n1.addAfter(P1,"B");
	        P2 = n1.addAfter(P2, "C");
	        P2 = n1.addAfter(P2, "D");
	        P3 = P2;
	        n1.addAfter(P3, "E");
	        n1.swap(P1, P2);
	        String recorrer = null;
	        System.out.println("Punteros");
	        System.out.println(P1.getElement());
	        System.out.println(P2.getElement());
	        System.out.println(P3.getElement());
	        System.out.println("Lista Completa");
	        do{
	            try{
	                Position<String> tempPosition = n1.first();
	                recorrer = n1.remove(tempPosition);
	                System.out.println(recorrer);
	            }
	            catch(Exception e){
	                System.out.println("Fin de Lista");
	                recorrer =null;
	                break;
	            }
	}while(recorrer != null); 

	}

}
