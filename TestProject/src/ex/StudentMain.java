package ex;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student();  //생성자 함수 std를 생성하여 Student.java에 있는 정보를 가져옴(인스턴스 생성)
		
		//학생 정보 입력 창 출력
		std.inputStdInfo();  // Student.java에 있는 inputStdInfo() 함수를 실행
		
		System.out.println();
		
		//학생 정보 출력 창 출력
		std.showStdInfo();  // Student.java에 있는 showStdInfo() 함수를 실행

	}

}
