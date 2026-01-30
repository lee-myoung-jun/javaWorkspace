package ch05.sec04;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// 열거타입 사용 예시
		// 동일한 패키지 내에 들어있고, public이라면 import없이 사용 가능
		Week today = null;  //Week 객체타입과 동일, 초기값으로 null
		// today 참조변수가 참조할 데이터는 Week 객체 참조(즉 Week 객체의 상수값만 대입가능)
		
		//Calendar 클래스는 Instance를 생성하는 메소드를 제공함. getInstance() 메소드 이용해서 생성된 인스턴스 반환받도록 되어 있음
		//Date, Calendar, LocalDateTime : 날짜 및 요일, 시간을 반환받을 수 있음
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		int week = cal.get(Calendar.DAY_OF_WEEK);  //1~7까지의 정수 반환
		
		//week 변수의 값에 따라 today라는 참조변수에 Week 상수 참조 대입
		switch(week) {
		case 1: today=Week.SUNDAY; break;
		case 2: today=Week.MONDAY; break;
		case 3: today=Week.TUESDAY; break;
		case 4: today=Week.WEDNESDAY; break;
		case 5: today=Week.THURSDAY; break;
		case 6: today=Week.FRIDAY; break;
		case 7: today=Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : " + today); //객체참조변수를 print문에 적용하면 내부에 저장된 속성값을 출력해줌
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다");
		} else {
			System.out.println("열심히 공부합시다");
		}
		
		//열거객체의 메소드
		today = Week.SUNDAY;
		Week day = Week.WEDNESDAY;
		//Week.SUNDAY 요거는 열거 객체인데 단순히 SUNDAY라는 문자열을 가진게 아니라 다양한 값을 가지고 있음
		//그래서 name()요거를 통해 이 열거 객체가 가지고 있는 문자열을 반환받음
		String name = today.name();  //name() 메소드를 통해서 상수가 저장하는 문자열을 반환받음
		System.out.println(name);
		
		//열거 객체의 순번 반환
		int ordinal = today.ordinal();
		System.out.println(ordinal);  //순번은 0부터 시작
		
		//매개값과 순번을 비교
		int result1 = today.compareTo(day);  //day기준
		int result2 = day.compareTo(today);  //today기준
		System.out.println(result1);  // 4 순번이 늦음
		System.out.println(result2);  //-4 순번이 빠름
		
		//매개값과 동일한 문자열을 갖는 열거 객체 리턴
		Week weekDay = Week.valueOf("SUNDAY");
		System.out.println(weekDay);
	}

}



















