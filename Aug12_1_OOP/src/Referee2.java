import java.util.Iterator;

public class Referee2 {
	String[] rulebook = new String[] { " ", "가위", "바위", "보" };
	
	public void readRulebook() {
		System.out.println("==================");
		for (int i = 1; i < rulebook.length; i++) {
			System.out.printf("%d. %s\n", i, rulebook[i]);
		}
		System.out.println("==================");
	}
	
	public int askAns(Player1 m) {
		System.out.printf("마루 뭐낼래 ? : ");
		int p1Ans = m.submitNum();
		return (p1Ans >= 1 && p1Ans <= 3) ? p1Ans : askAns(m);
	}
	
	public int askAns(AIplayer b) {
		int aiAns = b.submitNum();
		return aiAns;
	}
	// 누가 뭐 냈는지
	public void printHand(int aiHand, int p1Hand) {
		System.out.printf("마루는 %s\n", rulebook[p1Hand]);
		System.out.printf("동생은 %s\n", rulebook[aiHand]);
	}
	
	// 판정
	public boolean judgeWin(int p1Hand, int aiHand, Player1 m) {
		int result = p1Hand - aiHand;
		if (result == 0) {
			System.out.println("무승부");
			m.draw++;
		} else if (result == -1 || result == 2) {
			System.out.println("동생이 이겼다.");
		} else {
			System.out.println("마루가 이겼다.");
			m.win++;
		}
		return (result == -1 || result == 2);
	}
	public void sayMaruWin(Player1 m) {
		System.out.println("승리 : " + m.win);
		System.out.println("무승부 : " + m.draw);
	}
	
	
	// 시작
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
