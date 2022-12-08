
// 가위바위보
//	1. 등장인물 누구 ? -> 심판 / ??? / ???
//		-> 다 같이 한자리에 있음
//		-> 심판한테는 룰북이 있음
//		1을 입력하면 가위 / 2를 입력하면 바위 / 3을 입력하면 보
//	2. 각 객체들 속성 ? 행동 ?
//	3. 한판 질 동안 몇 승 / 몇 무 했는지

public class OMain1 {
	public static void main(String[] args) {
		Referee r1 = new Referee();
		Referee2 r2 = new Referee2();
		Player1 p1 = new Player1();
		AIplayer a1 = new AIplayer();
		
		r1.progressGame(p1, a1);
//		r2.start(p1, a1);
	}
}
