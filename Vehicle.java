
public class Vehicle {
		private String license;
		private int accountNumber;
		protected boolean overbridge;
		
		public Vehicle() {
			
		}
		public Vehicle(String L, int n) {
			this.license=L;
			this.accountNumber=n;
		}
		public void setLicense(String s) {
			this.license=s;
		}
		
		public void setAccountNumber(int i) {
			this.accountNumber=i;
		}
		
		public String getLicense() {
			return this.license;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		public boolean overBridge() {
			return overbridge;
		}
		
}
