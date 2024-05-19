package src;
public interface IVerify {

	public void Response(String IPN_URL);

	public boolean checkDataIntegrity(String vnp_SecureHash);

	public int handleErrorCode();

	public int checkTransactionResult(String vnp_SecureHash, int vnp_TransactionNo, String vnp_BankCode, double vnp_Amount);

}
