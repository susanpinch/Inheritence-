
public class Car extends Vehicle{
	public final static int toll=5;
	private String lastName;
	private String firstName;
	private double balance;
	public int timesrun;
	
	public Car() {
		
	}
	public Car(String licensePlate, int a){
		super(licensePlate,a);
		
	
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setLastName(String l) {
		this.lastName=l;
	}
	public void setFirstName(String f) {
		this.firstName=f;
	}
	public void addToBalance() {
		super.overbridge=true;
		balance+=Car.toll;
		this.timesrun++;
	}
	public double getBalance() {
		return this.balance;
	}
	
}
