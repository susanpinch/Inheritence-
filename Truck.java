
public class Truck extends Vehicle {
	public final static int toll = 3;
	private String owner;
	private int axel;
	private double balance;
	public int timesrun;
	
	public Truck(){
		
	}
	
	public Truck(String licensePlate, int x) {
		super(licensePlate, x);
		
	}
	
	
	public String getOwner() {

		return this.owner;
		
	}
	public int getAxel() {
		return this.axel;
	}
	public void setAxel(int x) {
		this.axel=x;
	}
	public void setOwner(String o) {
		String n = "Commercial owner: "+ o;
		this.owner=n;
	}
	public void addToBalance() {
		int amount = this.axel*Truck.toll;
		balance+=amount;
		super.overbridge=true;
		this.timesrun++;
		
	}
	public double getBalance() {
		return this.balance;
	}
}
