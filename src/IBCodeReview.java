package fr.ibformation.quality;


public class IBCodeReview {

	/**
	 * The result of the operation can't be negative.
	 *  
	 * @param firstOperand
	 * @param secondOperand
	 * @param operationType
	 * @return The result. If the result is -1, the operation have an error, particularly on the operationType.
	 */
	public int calculateOperation(final int firstOperand, final int secondOperand, final OperationType operationType) {
		int finalResult = -1;
		
		if (operationType != null) {
			if (operationType == OperationType.PLUS) {
				finalResult = firstOperand + secondOperand;
			} else if (operationType == OperationType.PRODUCT) {
				finalResult = firstOperand * secondOperand;
			}
			
// 			Utiliser un Switch Case ?
//			switch (operationType) {
//			case PLUS:
//				break;
//			case PRODUCT:
//				break;
//			default:
//				break;
//			}
		}
		
		return finalResult;
	}
	
}
