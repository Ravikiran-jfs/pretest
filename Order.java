package testpackage;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class Order {
	int orderId;
	String date;
	
	static boolean order;
	
	abstract void confirm();
	abstract void close();
	
		
	}

