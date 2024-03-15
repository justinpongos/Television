import java.util.ArrayList;
public class TelevisionDriver {
	public static void main(String[]args) {
		
		ArrayList <Television> Tele = new ArrayList<Television>();
			Tele.add(new Television("Insignia", 79.99));
			Tele.add(new LED("LG LED", 169.99, 10));
			Tele.add(new DLP("ViewSonic DLP Projector", 299.99, 300.0));
			Tele.add(new FourK("Samsung 4K", 329.99, true));
			
			System.out.println("TVs in the store…");
			
			for (Television info : Tele) {
				System.out.println(info + " ");
			}//end for each
	}//end main
}//end class
