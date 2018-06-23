import java.util.Random;

public class VaultTest{
		boolean isRight;
		int code=0;
	
	public static void main(String[] args) {
		
		 JamesBond JB = new JamesBond();
		 Vault vault = new Vault();
		 JB.findCode(vault);
		System.out.println(vault);
		
		
	}

}

