package testpackage;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
	static Set customerSet = new HashSet();
	static Map orderMap = new HashMap();
	
	public static void main(String[] args) {
		String name1 = "name1";
		int id1 = 1;
		Order order1 = new NormalOrder("date1", 1);
		Customer customer1 = new Customer(name1, id1, order1);
		
		String name2 = "name2";
		int id2 = 2;
		Order order2 = new NormalOrder("date2", 2);
		Customer customer2 = new Customer(name2, id2, order2);
		
		String name3 = "name3";
		int id3 = 3;
		Order order3 = new SpecialOrder("date3", 1);
		Customer customer3 = new Customer(name3, 3, order3);
		
		orderMap.put(id1, order1);
		orderMap.put(id2, order2);
		
		System.out.println(customer1);
		System.out.println(order1);
		addCustomer(customer1);
		addCustomer(customer3);
		findCustomer(customer1);
		updateCustomer(customer1, customer2);
		addCustomer(customer1);
		deleteCustomer(customer1);
	}
	
	static void addCustomer(Customer customer) {
		customerSet.add(customer);
		System.out.println("Customer " + customer.name + " is added.");
	}
	
	static void findCustomer(Customer customer) {
			boolean flag = false;
			if(customerSet.iterator().hasNext()) {
				for(int i = 0; i < customerSet.size(); i++) {
					if(customerSet.iterator().next() == customer) {
						System.out.println("Customer " + customer.name + " is found.");
					} else {
						flag = true;
					}
				} if(flag == true) {
					System.out.println("Customer " + customer + " is not found.");
				}
			} else {
				System.out.println("No data present");
			}
		
	}
	
	static void updateCustomer(Customer customerPrevious, Customer customerNext) {
		boolean flag = false;
		if(customerSet.iterator().hasNext()) {
			for(int i = 0; i < customerSet.size(); i++) {
				if(customerSet.iterator().next() == customerPrevious) {
					customerSet.remove(customerPrevious);
					customerSet.add(customerNext);
					System.out.println("Customer " + customerNext.name + " is added instead of Customer " + customerPrevious.name + ".");
					break;
				} else {
					flag = true;
				}
			} if(flag == true) {
				System.out.println("Customer " + customerPrevious.name + " is not found. Add Customer first to update.");
			}
		} else {
			System.out.println("Set is empty");
		}
	}
	
	static void deleteCustomer(Customer customer) {
		customerSet.remove(customer);
		System.out.println("Customer " + customer.name + " is removed.");
	}
}
