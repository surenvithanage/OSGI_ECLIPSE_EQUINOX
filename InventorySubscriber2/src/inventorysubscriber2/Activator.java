package inventorysubscriber2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import inventorypublisher.service.InventoryPublisherService;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Started Inventory Subcriber 2");
		serviceReference = bundleContext.getServiceReference(InventoryPublisherService.class.getName());
		InventoryPublisherService service = (InventoryPublisherService) bundleContext.getService(serviceReference);

		System.out.println("------------------------------------------");
		System.out.println("==========================================");
		System.out.println("  Inventory Management Report Generation  ");
		System.out.println("==========================================");
		System.out.println("------------------------------------------");
		System.out.println("******* Report Menu *********");
		System.out.println(" 001 - Customer Report");
		System.out.println(" 002 - Supplier Report");
		System.out.println(" 003 - Order Report");
		System.out.println(" 004 - Task Report");
		System.out.println("*******  Menu ************");

		System.out.println("\n Enter 'close' to exit the application ");
		String choice = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (true) {
				System.out.println("Enter Menu Item : ");
				choice = in.readLine();

				if (choice.equals("001")) {
					service.CustomerReport();
				}else if (choice.equals("002")) {
					service.SupplierReport();
				}else if(choice.equals("003")){
					service.OrderReport();
				}else if(choice.equals("004")){
					service.TaskReport();
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
		System.out.println("Subscriber 2 Ended");
	}

}
