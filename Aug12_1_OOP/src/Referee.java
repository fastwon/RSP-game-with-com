
public class Referee {
	int num1;
	int num2;
	String result;
	
	public void startGame() {
		System.out.println("���������� ������ �����ϰڽ��ϴ�.");
		System.out.println("1�� �Է��ϸ� ���� / 2�� �Է��ϸ� ���� / 3�� �Է��ϸ� ��");
		System.out.println("===========================================================");
	}
	public int getNum1(Player1 p) {
		System.out.println("���� ���ڸ� �Է��ϼ���");
		int num = p.submitNum();
		System.out.println("===========================================================");
		if (num < 1 || num > 3) {
			System.out.println("���ڸ� �ٽ� �Է��ϼ���.");
			System.out.println("===========================================================");
		}
		return num >= 1 && num <= 3 ? num : getNum1(p);
	}
	public int getNum2(AIplayer a) {
		System.out.println("�ΰ����ɵ� ���ڸ� �Է��߽��ϴ�.");
		int num = a.submitNum();
		System.out.println("===========================================================");
		return num;
	}
	public String convert(int x) {
		String choice = null;
		if (x == 1) {
			choice = "����";
		} else if (x == 2) {
			choice = "����";
		} else if (x == 3) {
			choice = "��";
		}
		return choice;
	}
	public String fight(int num1, int num2) {
		if (num1 > num2) {
			if (num1 == 3 && num2 == 1) {
				result = "�й�!";
			} else {
				result = "�¸�!!";
			}
		} else if (num1 == num2) {
			result = "���º�!";
		} else {
			if (num1 == 1 && num2 == 3) {
				result = "�¸�!!";
			} else {
				result = "�й�!";
			}
		}
		System.out.println(result);
		return result;
	}
	public void judge(Player1 p, AIplayer a) {
		int win = 0;
		int draw = 0;
		while (true) {
			System.out.println("���� ���� ��!");
			num1 = getNum1(p);
			num2 = getNum2(a);
			System.out.println("�÷��̾�1 " + convert(num1) + " : �ΰ����� "+ convert(num2));
			result = fight(num1, num2);
			System.out.println("===========================================================");
			if (result.equals("�й�!")) {
				System.out.println("���� ����!!");
				System.out.printf("�¸� : %d, ���º� : %d", win, draw);
				break;
			} else if (result.equals("�¸�!!")) {
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
