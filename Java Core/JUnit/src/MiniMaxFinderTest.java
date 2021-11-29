import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MiniMaxFinderTest {
	@Test
	void testMinMaxFind() {
		MiniMaxFinder mnf = new MiniMaxFinder();
		
		int expedted[] = new int[] {3,56};
		
		assertArrayEquals(expedted, mnf.arr(new int[] {56,34,7,3,54,3,34,34,53}));
	}

	@Test
	void testMinMaxFind1() {
		MiniMaxFinder mnf1 = new MiniMaxFinder();
		
		int expedted1[] = new int[] {0,99};
		
		assertArrayEquals(expedted1, mnf1.arr(new int[] {30,1,10,25,56,99,87,45,0}));
	}
	
	@Test
	void testMinMaxFind2() {
		MiniMaxFinder mnf2 = new MiniMaxFinder();
		
		int expedted2[] = new int[] {101,999};
		
		assertArrayEquals(expedted2, mnf2.arr(new int[] {999,101,205,665,777,854,465}));
}
}
