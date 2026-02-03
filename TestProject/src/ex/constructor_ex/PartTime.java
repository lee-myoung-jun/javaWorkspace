package ex.constructor_ex;

public class PartTime {
	int hours, unitPrice;
	
	public PartTime(int unitPrice, int hours) {
		this.unitPrice = unitPrice;
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return "시급 : " + unitPrice + "\n근무시간 : " + hours;
	}
	
	public int calculatePay() {
		return hours*unitPrice;
	}
}
