package inventorydatabase;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import inventorydatabase.service.InventoryService;
import inventorydatabase.serviceimpl.InventoryServiceImpl;

public class Activator implements BundleActivator {
	
	//Registering the inventory database service
	ServiceRegistration serviceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Started Inventory Database ");
		InventoryService inventoryService = new InventoryServiceImpl();
		serviceRegistration = bundleContext.registerService(InventoryService.class.getName(), inventoryService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Ended Inventory Database");
		serviceRegistration.unregister();
	}

}
