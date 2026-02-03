package ex.constructor_ex;

public class PartTimeWorker {

	public static void main(String[] args) {
		Worker wor = new Worker("12341234","홍길동");
		PartTime pt = new PartTime(6000,60);
		
		System.out.println(wor);
		System.out.println(pt);
		System.out.println("총액 : " + pt.calculatePay());
	}

}
