# Use Case: Place Order 
## 1. Description
* Brief Description: This use case allows the customer to place an order for a product.
* Actors: Customer
* Preconditions: None
* Postconditions: The order is placed and the customer is notified of the order status.


## 2. Basic Flow
1. The customer searches for the product they want to order.
2. The customer selects the product they want to order.
3. The customer views the cart.
4. The customer provides the delivery information for the order.
5. The customer provides the payment information for the order.
6. The customer reviews the cart.
7. The customer requests to place the order.
8. The customer chooses the delivery method.
9. The customer pays for the order.
10. The system processes the order and notifies the customer of the order status.
11. The cart is emptied upon a successful order.

## 3. Alternative Flows
| No. | Location | Condition | Action | Resume Location |
| --- | --- | --- | --- | --- |
| 1 | 6 | The customer does not confirm the order. | The customer cancels the order. | 1 |
| 2 | 7 | The system is unable to process the order. | The system notifies the customer of the order status. | 7 |
| 3 | 1 | The customer wants to sort products by price. | The customer selects the sort by price option. | 1 |
| 4 | 2 | The customer wants to add products with corresponding quantity. | The customer selects the add quantity option. | 2 |
| 5 | 3 | The customer wants to remove products from the cart. | The customer selects the remove product option. | 3 |
| 6 | 7 | If the inventory quantity is insufficient. | The system displays the inventory quantity for each unmet product and requests customers to update the cart. | 6 |
| 7 | 9 | The customer chooses to pay via VNPay. | VNPay requires customers to provide the necessary information. | 9 |
