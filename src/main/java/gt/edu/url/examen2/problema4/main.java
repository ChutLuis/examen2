package gt.edu.url.examen2.problema4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PositionalList<String> n1 = new LinkedPositionalList<>();
        Position<String> P0, P1, P2, P3, P4, P5;
        P0=n1.addFirst("Primero");
        P1=n1.addAfter(P0, "Segundo");
        P2=n1.addAfter(P1, "Tercero");
        P3=n1.addAfter(P2, "Cuarto");
        P4= n1.addAfter(P3, "Quinto");
        P5=n1.addAfter(P4, "Sexto");
        
        Position<String> prueba =n1.positionAtIndex(4);
        System.out.println(prueba.getElement());
	}

}
