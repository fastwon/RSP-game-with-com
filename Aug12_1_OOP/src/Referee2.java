import java.util.Iterator;

public class Referee2 {
	String[] rulebook = new String[] { " ", "����", "����", "��" };
	
	public void readRulebook() {
		System.out.println("==================");
		for (int i = 1; i < rulebook.length; i++) {
			System.out.printf("%d. %s\n", i, rulebook[i]);
		}
		System.out.println("==================");
	}
	
	public int askAns(Player1 m) {
		System.out.printf("���� ������ ? : ");
		int p1Ans = m.submitNum();
		return (p1Ans >= 1 && p1Ans <= 3) ? p1Ans : askAns(m);
	}
	
	public int askAns(AIplayer b) {
		int aiAns = b.submitNum();
		return aiAns;
	}
	// ���� �� �´���
	public void printHand(int aiHand, int p1Hand) {
		System.out.printf("����� %s\n", rulebook[p1Hand]);
		System.out.printf("������ %s\n", rulebook[aiHand]);
	}
	
	// ����
	public boolean judgeWin(int p1Hand, int aiHand, Player1 m) {
		int result = p1Hand - aiHand;
		if (result == 0) {
			System.out.println("���º�");
			m.draw++;
		} else if (result == -1 || result == 2) {
			System.out.println("������ �̰��.");
		} else {
			System.out.println("���簡 �̰��.");
			m.win++;
		}
		return (result == -1 || result == 2);
	}
	public void sayMaruWin(Player1 m) {
		System.out.println("�¸� : " + m.win);
		System.out.println("���º� : " + m.draw);
	}
	
	
	// ����
	public void start(Player1 m, AIplayer b) {
		readRulebook();
		int p1Hand;
		int aiHand;
		while (true) {
			p1Hand = askAns(m);
			aiHand = askAns(b);
			printHand(aiHand, p1Hand);
			System.out.println("=============");
			if (judgeWin(p1Hand, aiHand, m)) {
				sayMaruWin(m);
				break;
			}
			System.out.println("=============");
			
		}
				
	}
	
	
	
	
}
