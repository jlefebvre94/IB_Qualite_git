package fr.ibformation.quality;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IBCodeReviewTest {

	@Test
	void testPlus( ) {
		//GIVEN
		IBCodeReview IBCodeReview = new IBCodeReview();
				
		//WHEN
		int result = IBCodeReview.calculateOperation(6, 4, OperationType.PLUS);
				
		//THEN
		assertEquals(result, 10);
	}
	
	@Test
	void testProduct( ) {
		//GIVEN
		IBCodeReview IBCodeReview = new IBCodeReview();
				
		//WHEN
		int result = IBCodeReview.calculateOperation(6, 4, OperationType.PRODUCT);
				
		//THEN
		assertEquals(result, 24);
	}
	
	@Test
	void testTypeNull( ) {
		//GIVEN
		IBCodeReview IBCodeReview = new IBCodeReview();
				
		//WHEN
		int result = IBCodeReview.calculateOperation(6, 4, null);
				
		//THEN
		assertEquals(result, -1);
	}

}
