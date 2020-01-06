package testpackage;

public class Customer {
	String name;
	int id;
	
	boolean sendOrder;
	boolean receiveOrder;
	
	Order customerOrder;
	
	
		public Customer(String name, int id, Order order) {
			this.name = name;
			this.id = id;
			customerOrder = order;
		
		}
		
	@Override
	public String toString() {
		System.out.println("Customer Details: \n" + "Customer Name -> " + name +"\n" + "Customer ID -> " + id + "\n" + "Customer Order ID -> " + customerOrder.orderId);
		return super.toString();
	}
	}
	
	

