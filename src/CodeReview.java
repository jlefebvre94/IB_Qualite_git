package fr.ibformation.quality;

public class CodeReview {

	public int calculateOperation(int oldValue, int valueOperation, String operationType) {
		int finalResult = 0;
		
		if (operationType.equalsIgnoreCase("plus")) {
			finalResult = oldValue + valueOperation;
		} else if (operationType.equalsIgnoreCase("product")) {
			finalResult = oldValue * valueOperation;
		} else {
			finalResult = -1;
		}
		
		return finalResult;
	}
}
