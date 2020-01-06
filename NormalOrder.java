package testpackage;

import java.util.Date;
import java.util.Set;

public class NormalOrder extends Order{
	@Override
	void confirm() {
		System.out.println("Order is confirmed");
		order = true;
	}
	@Override
	void close() {
		System.out.println("Order is closed");
		order = false;
	}
	
	static void dispatch() {
		System.out.println("Order is dispatched");
		order = true;
	}
	
	static void receive(){
		System.out.println("Order is received");
		order = false;
	}
	
	public NormalOrder(String date, int orderId) {
		this.date = date;
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		System.out.println("Order Details: \n" + "Order ID -> " + orderId +"\n" + "Date of Order -> " + date);
		return super.toString();
	}
	
}
	
