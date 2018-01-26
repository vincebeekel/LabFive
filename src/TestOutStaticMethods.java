public class TestOutStaticMethods {

   public static void printPizzaArea() {
      double pizzaDiameter;
      double pizzaRadius;
      double pizzaArea;
      double piVal = 3.14159265;

      pizzaDiameter = 12.0;
      pizzaRadius = pizzaDiameter / 2.0;
      pizzaArea = piVal * pizzaRadius * pizzaRadius;
      System.out.print(pizzaDiameter + " inch pizza is ");
      System.out.println(pizzaArea + " inches squared.");
   }

   public static void main (String [] args) {
      printPizzaArea();
   }



/*public class TestOutStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int input = 1;
		
		System.out.println(random1(input));
	}*/

	public static int random1 (int rando) {
		rando = (int) ((Math.random()* 6 ) + 1);
		
		return rando;
	}
	
}
