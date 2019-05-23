package warehousesubscriber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import inventorydatabase.model.Stock;
import warehousepublisher.service.WarehousePublisherService;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Started Warehouse Subcriber");
		serviceReference = bundleContext.getServiceReference(WarehousePublisherService.class.getName());
		WarehousePublisherService service = (WarehousePublisherService) bundleContext.getService(serviceReference);

		System.out.println("------------------------------------------");
		System.out.println("==========================================");
		System.out.println("       Inventory Management System        ");
		System.out.println("==========================================");
		System.out.println("------------------------------------------");
		System.out.println("******* WareHouse Menu ************");
		System.out.println(" 001 - Add Stock");
		System.out.println(" 002 - Find Stock");
		System.out.println(" 003 - Generate Stock Report");
		System.out.println(" 004 - Delete Stock");

		System.out.println("\n Enter a blank line to exit");
		String choice = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (true) {
				System.out.println("Enter Menu Item : ");
				choice = in.readLine();

				if (choice.equals("001")) {
					Stock stock = new Stock();
					System.out.println("Enter Stock ID : ");
					String id = in.readLine();
					System.out.println("Enter Stock Description : ");
					String description = in.readLine();
					System.out.println("Enter Stock Quantity : ");
					String quantity = in.readLine();
					System.out.println("Enter Stock Price Per Item : ");
					String pricePerStock = in.readLine();
					System.out.println("Enter Stock Total Cost : ");
					String totalCost = in.readLine();
					stock.setId(id);
					stock.setDescription(description);
					stock.setQuantity(quantity);
					stock.setPricePerStock(pricePerStock);
					stock.setTotalCost(totalCost);
					service.addStock(stock);
				} else if (choice.equals("002")) {
					System.out.println("Enter Stock ID : ");
					String id = in.readLine();
					service.findByStockId(id);
				} else if (choice.equals("003")) {
					service.listStocks();
				} else if (choice.equals("004")) {
					System.out.println("Enter Stock ID : ");
					String id = in.readLine();
					service.deleteStock(id);
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
		System.out.println("WareHouse Subscriber Ended");
	}

}
