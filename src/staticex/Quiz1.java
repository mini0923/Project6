package staticex;

public class Quiz1 {

	public static void main(String[] args) {

		Card card1 = new Card();
		card1.showInfo();
		
		Card card2 = new Card();
		card2.showInfo();
		
		Card card3 = new Card();
		card3.showInfo();
		
	}

}


class Card {
	static int count =100;	// 카드 번호 수 (공통속성)
	int cardNumber;			// 카드번호
	
	public Card() {
		count++;						// 신규 카드가 들어올 때 마다 증가
		this.cardNumber = count; 	// 증가된 값에 카드번호 부여
	}
	
	public void showInfo() {
		System.out.println("카드의 번호는 : " + cardNumber);

	}
	
}
