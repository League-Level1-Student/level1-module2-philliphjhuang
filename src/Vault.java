import java.util.Random;

public class Vault {

	boolean isRight;
	int code = 0;

	public Vault() {
		this.code = new Random().nextInt(1000001);

	}

	public boolean tryCode(int input) {
		if (code == input) {
			return true;
		} else {
			return false;
		}
	}
}
