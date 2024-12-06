package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());
		
		System.out.println();
		System.out.println("Enter order data");
		
		sc.nextLine();
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		Client client = new Client(nome, email, date);
		Order order = new Order(new Date(), status, client);
		
		for (int i  = 1; i<=n; i++) {
			System.out.printf("Enter the #%d item data", i);
			System.out.println();
			sc.nextLine();
			System.out.print("Product Name: ");
			String prodcuctNome = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int qntd = sc.nextInt();
			
			Product product = new Product(prodcuctNome, productPrice);
			OrderItem orderItem = new OrderItem(qntd, productPrice, product); 
			
			System.out.println(orderItem.subTotal());
			
			order.addItens(orderItem);
		}
		System.out.println(order);
		sc.close();
	}

}
