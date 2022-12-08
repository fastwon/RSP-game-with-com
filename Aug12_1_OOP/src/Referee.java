
public class Referee {
	int num1;
	int num2;
	String result;
	
	public void startGame() {
		System.out.println("가위바위보 게임을 시작하겠습니다.");
		System.out.println("1을 입력하면 가위 / 2를 입력하면 바위 / 3을 입력하면 보");
		System.out.println("===========================================================");
	}
	public int getNum1(Player1 p) {
		System.out.println("선수 숫자를 입력하세요");
		int num = p.submitNum();
		System.out.println("===========================================================");
		if (num < 1 || num > 3) {
			System.out.println("숫자를 다시 입력하세요.");
			System.out.println("===========================================================");
		}
		return num >= 1 && num <= 3 ? num : getNum1(p);
	}
	public int getNum2(AIplayer a) {
		System.out.println("인공지능도 숫자를 입력했습니다.");
		int num = a.submitNum();
		System.out.println("===========================================================");
		return num;
	}
	public String convert(int x) {
		String choice = null;
		if (x == 1) {
			choice = "가위";
		} else if (x == 2) {
			choice = "바위";
		} else if (x == 3) {
			choice = "보";
		}
		return choice;
	}
	public String fight(int num1, int num2) {
		if (num1 > num2) {
			if (num1 == 3 && num2 == 1) {
				result = "패배!";
			} else {
				result = "승리!!";
			}
		} else if (num1 == num2) {
			result = "무승부!";
		} else {
			if (num1 == 1 && num2 == 3) {
				result = "승리!!";
			} else {
				result = "패배!";
			}
		}
		System.out.println(result);
		return result;
	}
	public void judge(Player1 p, AIplayer a) {
		int win = 0;
		int draw = 0;
		while (true) {
			System.out.println("가위 바위 보!");
			num1 = getNum1(p);
			num2 = getNum2(a);
			System.out.println("플레이어1 " + convert(num1) + " : 인공지능 "+ convert(num2));
			result = fight(num1, num2);
			System.out.println("===========================================================");
			if (result.equals("패배!")) {
				System.out.println("게임 종료!!");
				System.out.printf("승리 : %d, 무승부 : %d", win, draw);
				break;
			} else if (result.equals("승리!!")) {
				win++;
			} else {
				draw++;
			}
		}
	}
	
	public void progressGame(Player1 p, AIplayer a) {
		startGame();
		judge(p, a);
	}
}
