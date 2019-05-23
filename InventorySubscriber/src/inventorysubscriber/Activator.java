package inventorysubscriber;

import inventorydatabase.model.Customer;
import inventorydatabase.model.Orders;
import inventorydatabase.model.Suppliers;
import inventorydatabase.model.Tasks;
import inventorypublisher.service.InventoryPublisherService;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Started Inventory Subcriber");
		serviceReference = bundleContext.getServiceReference(InventoryPublisherService.class.getName());
		InventoryPublisherService service = (InventoryPublisherService) bundleContext.getService(serviceReference);

		System.out.println("------------------------------------------");
		System.out.println("==========================================");
		System.out.println("       Inventory Management System        ");
		System.out.println("==========================================");
		System.out.println("------------------------------------------");
		System.out.println("******* Inventory Menu ************");
		System.out.println(" 001 - Find Customer");
		System.out.println(" 002 - Delete Customer");
		System.out.println(" 003 - Find Supplier");
		System.out.println(" 004 - Find Order");
		System.out.println(" 005 - Find Task");
		System.out.println(" 006 - Add Customer");
		System.out.println(" 007 - Add Supplier");
		System.out.println(" 008 - Add Order");
		System.out.println(" 009 - Add Task");
		System.out.println(" 010 - Delete Supplier");
		System.out.println(" 011 - Delete Order");
		System.out.println(" 012 - Delete Task");
		System.out.println("*******  Menu ************");

		System.out.println("\n Enter a close to exit");
		String choice = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (true) {
				System.out.println("Enter Menu Item : ");
				choice = in.readLine();

				if (choice.equals("001")) {
					System.out.println("Enter Customer ID : ");
					String customerId = in.readLine();
					service.findCustomerById(customerId);
				} else if (choice.equals("002")) {
					System.out.println("Enter Customer ID : ");
					String customerId = in.readLine();
					service.deleteCustomerById(customerId);
				} else if (choice.equals("003")) {
					System.out.println("Enter Supplier ID : ");
					String supplierId = in.readLine();
					service.findSupplierById(supplierId);
					;
				} else if (choice.equals("004")) {
					System.out.println("Enter Order ID : ");
					String orderId = in.readLine();
					service.findOrderById(orderId);
				} else if (choice.equals("005")) {
					System.out.println("Enter Task ID : ");
					String taskId = in.readLine();
					service.findTaskById(taskId);
				} else if (choice.equals("006")) {
					Customer customer = new Customer();
					System.out.println("Customer ID");
					String id = in.readLine();
					System.out.println("Customer First Name");
					String firstname = in.readLine();
					System.out.println("Customer Last Name");
					String lastname = in.readLine();
					System.out.println("Customer Contact Number");
					String contactno = in.readLine();
					System.out.println("Customer Email");
					String email = in.readLine();
					System.out.println("Customer Address");
					String address = in.readLine();
					customer.setId(id);
					customer.setFirstname(firstname);
					customer.setAddress(address);
					customer.setContactno(contactno);
					customer.setEmail(email);
					customer.setLastname(lastname);

					service.addCustomer(customer);
				} else if (choice.equals("007")) {
					Suppliers supplier = new Suppliers();
					System.out.println("Supplier ID");
					String id = in.readLine();
					System.out.println("Supplier First Name");
					String firstname = in.readLine();
					System.out.println("Supplier Last Name");
					String lastname = in.readLine();
					System.out.println("Supplier Contact Number");
					String contactno = in.readLine();
					System.out.println("Supplier Email");
					String email = in.readLine();
					System.out.println("Supplier Address");
					String address = in.readLine();
					supplier.setId(id);
					supplier.setFirstname(firstname);
					supplier.setAddress(address);
					supplier.setContactno(contactno);
					supplier.setEmail(email);
					supplier.setLastname(lastname);

					service.addSupplier(supplier);
				} else if (choice.equals("008")) {
					Orders order = new Orders();
					System.out.println("Order ID : ");
					String id = in.readLine();
					System.out.println("Order Item Code : ");
					String itemcode = in.readLine();
					System.out.println("Order Description : ");
					String description = in.readLine();
					System.out.println("Order Quantity : ");
					String quantity = in.readLine();
					System.out.println("Order Price Per Item : ");
					String priceperitem = in.readLine();
					order.setDescription(description);
					order.setId(id);
					order.setItemcode(itemcode);
					order.setPriceperitem(priceperitem);
					order.setQuantity(quantity);
					service.addOrders(order);
				} else if (choice.equals("009")) {
					Tasks task = new Tasks();
					System.out.println("Task ID : ");
					String id = in.readLine();
					System.out.println("Task Code : ");
					String taskcode = in.readLine();
					System.out.println("Task Description : ");
					String description = in.readLine();
					task.setDescription(description);
					task.setId(id);
					task.setTaskcode(taskcode);
					service.addTask(task);

				} else if (choice.equals("010")) {
					System.out.println("Enter Supplier ID : ");
					String supplierID = in.readLine();
					service.deleteCustomerById(supplierID);
				} else if (choice.equals("011")) {
					System.out.println("Enter Order ID : ");
					String OrderID = in.readLine();
					service.deleteCustomerById(OrderID);
				} else if (choice.equals("012")) {
					System.out.println("Enter Task ID : ");
					String taskID = in.readLine();
					service.deleteCustomerById(taskID);
				}

				if (choice.equalsIgnoreCase("close")) {
					System.out.println("Exiting application");
					break;
				}

			}

		} catch (Exception e) {
			throw e;
		}

	}

	public void stop(BundleContext bundleContext) throws Exception {
		bundleContext.ungetService(serviceReference);
		System.out.println("Subscriber Ended");
	}

}
