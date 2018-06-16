import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VaultTest {

	
@Test
public void tryCode(){
	Vault vault = new Vault();
    boolean password = vault.code(false,9999999);
	assertEquals("Open",vault.code(true, 0));
	assertEquals("Not Open",vault.code(false, 999));
	
	
	
}
}
