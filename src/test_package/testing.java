package test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void test() {
		
		program p = new program();
		
		int result1 = p.addnumbers(500,200);
		assertEquals(700,result1); 
	}

}
