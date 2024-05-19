package src;
public class VNPaySubsystem implements IPayment, IURL, IVerify {


	/**
	 * @see IPayment#payOrder(double, String, Client)
	 */
	public void payOrder(double amount, String orderInfo, Client client) {

	}


	/**
	 * @see IPayment#Request(double, String)
	 */
	public void Request(double amount, String orderInfo) {

	}


	/**
	 * @see IPayment#sendPayOrder(int)
	 */
	public void sendPayOrder(int queryURL) {

	}


	/**
	 * @see IURL#parseIPNString()
	 */
	public void parseIPNString() {

	}


	/**
	 * @see IURL#displayURL(String)
	 */
	public void displayURL(String url) {

	}


	/**
	 * @see IURL#buildQueryURL()
	 */
	public String buildQueryURL() {
		return null;
	}


	/**
	 * @see IURL#processResponse(String)
	 */
	public void processResponse(String IPN_URL) {

	}


	/**
	 * @see IVerify#Response(String)
	 */
	public void Response(String IPN_URL) {

	}


	/**
	 * @see IVerify#checkDataIntegrity(String)
	 */
	public boolean checkDataIntegrity(String vnp_SecureHash) {
		return false;
	}


	/**
	 * @see IVerify#handleErrorCode()
	 */
	public int handleErrorCode() {
		return 0;
	}


	/**
	 * @see IVerify#checkTransactionResult(String, int, String, double)
	 */
	public int checkTransactionResult(String vnp_SecureHash, int vnp_TransactionNo, String vnp_BankCode, double vnp_Amount) {
		return 0;
	}

}
