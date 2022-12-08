import java.util.Random;

public class AIplayer {
	Random r = new Random();
	
	public int submitNum() {
		return r.nextInt(3) + 1;
	}
}
