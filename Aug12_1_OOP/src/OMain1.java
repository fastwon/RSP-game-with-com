
// ����������
//	1. �����ι� ���� ? -> ���� / ??? / ???
//		-> �� ���� ���ڸ��� ����
//		-> �������״� ����� ����
//		1�� �Է��ϸ� ���� / 2�� �Է��ϸ� ���� / 3�� �Է��ϸ� ��
//	2. �� ��ü�� �Ӽ� ? �ൿ ?
//	3. ���� �� ���� �� �� / �� �� �ߴ���

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
