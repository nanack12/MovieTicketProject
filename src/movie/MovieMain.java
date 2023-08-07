package movie;

public class MovieMain {

	public static void main(String[] args) {
		
		
		
		Movie rec1 = new Movie("1917",11000,10,"인터넷");
		Movie rec2 = new Movie("주디",15000,25,"현장");
		Movie rec3 = new Movie("인비저블맨",12500,40,"쿠폰");
		
		
		//제목 행 불러오기
		rec1.titlePrint();
		
		//각 행의 할인률 계산하기
		rec1.rateCal();
		rec2.rateCal();
		rec3.rateCal();
		
		//실 구매 금액 계산하기
		rec1.moneyCal();
		rec2.moneyCal();
		rec3.moneyCal();
		
		//최종 출력
		rec1.dataPrint();
		rec2.dataPrint();
		rec3.dataPrint();

	}

}
