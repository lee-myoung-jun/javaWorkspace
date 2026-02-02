package exPackage.game_project.info;

public class AppInfo {
	
	public void info() {
		System.out.println("*******************************************");
		System.out.println("애플리케이션 정보");
		System.out.println("-------------------------------------------");
		System.out.println("제목 : ★★게임");
		System.out.println("제작자 : 이명준");
		System.out.println("내용 : 가위바위보 게임/숫자 알아맞히기 게임");
		System.out.println("*******************************************");
	}  //info() 메소드 종료
	
	public void gbbInfo() {
		System.out.println("*******************************************");
		System.out.println("\t가위바위보 게임");
		System.out.println("가위 바위 보 게임 입니다.");
		System.out.println("1.가위, 2.바위, 3.보 중에 하나를 선택하세요!");
		System.out.println("컴퓨터 역시 셋 중에 하나를 선택합니다.");
		System.out.println("과연 승자는 누가될까요?");
		System.out.println("*******************************************");
		System.out.print("시작하시겠습니까?(y/n) : ");
	}  //gbbInfo() 메소드 종료
	
	public void gueInfo() {
		System.out.println("*******************************************");
		System.out.println("\t숫자 알아맞히기 게임");
		System.out.println("숫자 알아 맞히기 게임 입니다.");
		System.out.println("컴퓨터가 1~10중에서 임의 숫자를 하나 뽑습니다.");
		System.out.println("플레이어는 1~10 중에서 하나의 숫자를 입력하여 맞추면 됩니다!");
		System.out.println("몇번의 시도끝에 정답을 찾을수 있을까요?");
		System.out.println("*******************************************");
		System.out.print("시작하시겠습니까?(y/n) : ");
	}  //gueInfo() 메소드 종료
}
