package object;

public class Quiz3 {

	public static void main(String[] args) {

		Coffee coffee = new Coffee("별다방");
		
		Customer customer = new Customer("둘리", 10000);
		customer.takeAmericano(coffee);
		coffee.showInfo();
		System.out.println();

		Customer customer2 = new Customer("또치", 20000);
		customer2.takeLatte(coffee);
		coffee.showInfo();
		System.out.println();

		Customer customer3 = new Customer("도우너", 1000);
		customer3.takeAmericano(coffee);
		coffee.showInfo();
		System.out.println();

		Customer customer4 = new Customer("고길동", 4000);
		customer4.takeLatte(coffee);
		coffee.showInfo();
		System.out.println();

	}

}

class Coffee {
	String menu;
	int money;
	
	// 메뉴 초기화하는 생성자
	public Coffee(String menu) {
		this.menu = menu;
	}
	
	// 카페 수입
	public void take (int money) {
		this.money = this.money + money;
	}
	
	public void showInfo() {
		System.out.println("현재 수입은" + money + "입니다.");
	}
}

class Customer {
	String name;
	int money;
	
	// 손님과 가진돈을 초기화하는 생성자
	public Customer(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public void takeAmericano(Coffee coffee) {
		if (money < 4000) {
			System.out.println(name +"님은 돈이 없어 아메리카노를 마실 수 없습니다.");
			return;
		}
		coffee.take(4000);
		this.money = this.money - 4000;
		System.out.println(name + " 님의 남은 돈은 " + money + " 입니다. ");

	}
	
	public void takeLatte(Coffee coffee) {
		if (money < 4500) {
			System.out.println(name +"님은 돈이 없어 라떼를 마실 수 없습니다.");
			return;
		}
		coffee.take(4000);
		this.money = this.money - 4500;
		System.out.println(name + " 님의 남은 돈은 " + money + " 입니다. ");

	}
	

}