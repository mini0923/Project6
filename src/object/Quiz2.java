package object;

public class Quiz2 {

	public static void main(String[] args) {

		Student student = new Student("둘리", 50000);
		Taxi taxi = new Taxi("70합 1234");
		student.takeTaxi(taxi); 
		student.showInfo(); 
		taxi.showInfo();

		
	}

}

class Taxi {
	String taxiNumber;	// 택시번호	
	int money;	// 수입
	
	// 택시번호 초기화하는 생성자
	public Taxi(String  taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	// 택시에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;
	}
	
	public void showInfo() {
		System.out.println("택시번호 " + taxiNumber + "의 수입은 " + money + "입니다.");
	}
}
	



