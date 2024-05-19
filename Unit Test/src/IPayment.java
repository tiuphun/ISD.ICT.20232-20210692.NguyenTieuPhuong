package src;
public interface IPayment {

	public void payOrder(double amount, String orderInfo, Client client);

	public void Request(double amount, String orderInfo);

	public void sendPayOrder(int queryURL);

}
