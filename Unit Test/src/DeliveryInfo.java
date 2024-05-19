package src;

import java.util.Arrays;

public class DeliveryInfo {

	public void DeliveryInfo() {
		private String district;
		private String city;
		private float deliveryTime;
		private float currentTime;
	}

	public boolean checkAddressSupportRushOrder(DeliveryInfo address) {
		if (address.getCity().equals("Hanoi") || !Arrays.asList(districts).contains(address.getDistrict())) {
			return false;
        } else {
            return true;
        }
	}

	public boolean checkRushOrderInfo(rushOrderInfo rushOrderInfo) {
		float timeframe = deliveryTime - currentTime;
		if (timeframe > 2) || (rushOrderInfo.getDeliveryInstruction() == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean checkDeliveryInfo() {
		if (deliveryTime < 0 || deliveryTime > 24 || currentTime < 0 || currentTime > 24) {
			printf("Invalid time input");
			return false;
		} else {
			return true;
		}
		if (district == null || city == null) {
			printf("Invalid address input");
			return false;
		} else {
			return true;
		}
	}

}
