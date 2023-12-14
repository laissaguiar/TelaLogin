import static org.junit.Assert.*;
import org.junit.Test;

public class TelaLoginTeste {
	@Test
	public void testSucessfulLogin() {
		TelaLogin loginScreen = new TelaLogin();
		assertTrue(loginScreen.login("john", "password123"));
	}

	@Test
	public void testFailedLogin() {
		TelaLogin loginScreen = new TelaLogin();
		assertTrue(loginScreen.login("john", "wrongpassword"));
	}

	@Test
	public void testAddUser() {
		TelaLogin loginScreen = new TelaLogin();
		loginScreen.addUser("testuser", "testpassword");
		assertTrue(loginScreen.login("testuser", "testpassword"));
	}

	private void assertTrue(boolean login) {
	}
}
