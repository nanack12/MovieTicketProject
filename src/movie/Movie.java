package movie;

public class Movie {
	// 필드
	String movieName;//영화명
	int price;//금액
	int age;//나이
	int money;//실구매금액
	double rate;//할인율
	String way;//구매방법(현장, 인터넷, 쿠폰)


//생성자
public Movie(String movieName, int price, int age, String way ) {
	//매개변수로 값을 받아서 멤버변수에 넣기
	this.movieName = movieName;
	this.price = price;
	this.age = age;
	this.way = way;
	}
//메소드
//1. 할인률
void rateCal() {
	/*1) 나이가 20미만이면 25% 할인, 
	 * 나이가 20~30이면 20%할인, 30이상이면 15%할인
	 * 2) 현장구매인 경우 0%할인, 
	 * 인터넷 구매인 경우 추가 5%할인, 
	 * 쿠폰구매인 경우 10%할인
	*/
	rate=0;
	if(age<20) {
		rate= rate+0.25;
	}
	else if(age>=20&&age<30) {
		rate= rate+0.20;	
		}
	else {
		rate=rate+0.15;
	}
	
	switch(way) {
	case  "현장":
	   rate=rate+0.00;
	   break;
	  
	case "인터넷":
		rate=rate+0.05;
		break;
	
	case "쿠폰":
		rate=rate+0.10;
		break;
	}	
	
}
//2. 실구매금액
void moneyCal() {
	
	money=(int) (price-(price*rate));
	/*
	 * 의문점 
	 * 처음에는 money=(int) price*(1.0-rate);
	 * 요런식으로 했는데, 1.0-rate는 0.7 0.8 0.75로 잘 계산하면서
	 * 첫번째 값이 자꾸 7699로 -1이 된 값이 나온다;;
	 * 이유를 모르겠음;; price로 곱을 할때 ..문제가 발생하는것 같은데ㅜ
	 * 
	 */
//System.out.println(1.0-rate);
//money=(int)(price*(1.0-rate));
	
	
	
}
//3. 제목인쇄하기
void titlePrint() {
	System.out.println("영화명"+"\t"+"금액"+"\t"+"나이"+"\t"+"실구매금액");
}

//4.내용 출력하기 
void dataPrint() {
	System.out.println(movieName+"\t"+price+"\t"+age+"\t"+money);
//	System.out.printf("%s\t%d\t%d\t%d\n",movieName,price,age,money);
	
}
}
