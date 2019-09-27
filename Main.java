import java.util.Random;
public class Main {
	
	/*In this program, I created three vehciles, truck, car, and emergency vehicle. All three were set up with a default license plate
	 * and were then set up with a account number. After doing so, I created a while loop that randomly picks a car and increases its balance
	 * by making it cross a bridge. After this, I printed out the three balances. The other classes use inheritence to track
	 * the ways of the cars. Each class has an addToBalance() method that can called whenever the car crosses the bridge. This adds
	 * to the balance of the car, which we can retrieve from getBalance() method. 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int n; int n2;
		Car c1 = new Car("59g3857", 411);
		c1.setFirstName("Mary");
		c1.setLastName("Smith");
		
		Truck t1 = new Truck("62477h",511);
		t1.setOwner("Lays");
		t1.setAxel(5);
		
		Emergency e1 = new Emergency("567886",6);
		e1.setOwner("Parks department");
		
		
		int x=0;
		while(x<20) {
			n = r.nextInt(3)+1;
			switch(n) {
			case 1: c1.addToBalance();break;
			case 2: t1.addToBalance();break;
			case 3: e1.addToBalance();break;
			}
			x++;
		}
		System.out.println("The car had a balance of "+ c1.getBalance()+ " Ran "+ c1.timesrun);
		System.out.println("The truck had a balanceof "+ t1.getBalance()+ " Ran "+ t1.timesrun);
		System.out.println("The emergency vehicle had a balance of "+ e1.getBalance() + " Ran "+ e1.timesrun);
		
		
	
		
		
	}

}
