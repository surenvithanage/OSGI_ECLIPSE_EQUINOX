package salarypublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import inventorydatabase.service.InventoryService;
import inventorypublisher.service.InventoryPublisherService;
import inventorypublisher.serviceimpl.InventoryPublisherServiceImpl;

public class Activator implements BundleActivator {
	ServiceReference serviceReference;
	ServiceRegistration serviceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Salary Publisher Started");
		serviceReference = bundleContext.getServiceReference(InventoryService.class.getName());
		InventoryService database = (InventoryService) bundleContext.getService(serviceReference);

		InventoryPublisherService service = new InventoryPublisherServiceImpl();
		serviceRegistration = bundleContext.registerService(InventoryPublisherService.class.getName(), service, null);

	}

	public void stop(BundleContext bundleContext) throws Exception {
		bundleContext.ungetService(serviceReference);
		serviceRegistration.unregister();
		System.out.println("Salary Publisher Stopped");
	}

}
