package src;
public interface IURL {

	public void parseIPNString();

	public void displayURL(String url);

	public String buildQueryURL();

	public void processResponse(String IPN_URL);

}
