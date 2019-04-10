package test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing2 {

	@Test
	void test() {
		
		program p = new program(); 
		
		String result2 = p.addstrings("abc","def");
		assertEquals("abcdef",result2); 
	}

}
