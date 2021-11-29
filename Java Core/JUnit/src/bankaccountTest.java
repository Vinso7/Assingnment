import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class bankaccountTest {
	@Test
	void test1() {
		bankaccount w1 = new bankaccount();
		assertThrows(IllegalAccessException.class,()-> w1.withdraw(20000));
		
	}
}
