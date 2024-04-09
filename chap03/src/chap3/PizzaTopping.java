package chap3;

public class PizzaTopping {

	public static void main(String[] args) {
		String[] toppings = new String[] {"Pepperoni","Mushroom","Onion","Sausage","Bacon"};
		
//		for(String a : toppings) {
//			System.out.print(a + " ");
//		}
		
		for(int i=0; i<toppings.length; i++) {
			System.out.print(toppings[i] + " ");
		}
	}

}
