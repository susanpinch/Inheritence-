
public class Emergency extends Truck{
	private double balance;
	private String owner;
	public int timesrun;
	
	
	public Emergency() {
		super();
	}
	public Emergency(String licensePlate, int a) {
		super(licensePlate, a);
	
		
	}
	
	public void setOwner(String s) {
		String n = "Government Owner: " + s;
		this.owner=n;
	}
	public String getOwner() {
		return this.owner;
	}
	
	public void addToBalance() {
		balance+=0;
		super.overbridge=true;
		this.timesrun++;
	}
	public double getBalance() {
		return this.balance;
	}

}
