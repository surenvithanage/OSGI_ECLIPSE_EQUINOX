package salarysubscriber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import inventorydatabase.model.Salary;
import salarypublisher.service.SalaryPublisherService;

public class Activator implements BundleActivator {
	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Started Salary Subcriber");
		serviceReference = bundleContext.getServiceReference(SalaryPublisherService.class.getName());
		SalaryPublisherService service = (SalaryPublisherService) bundleContext.getService(serviceReference);

		System.out.println("------------------------------------------");
		System.out.println("==========================================");
		System.out.println("       Inventory Management System        ");
		System.out.println("==========================================");
		System.out.println("------------------------------------------");
		System.out.println("******* Salary Menu ************");
		System.out.println(" 001 - Create Stock");
		System.out.println(" 002 - Generate Salary Report");
		System.out.println(" 003 - Find Salary Details");

		System.out.println("\n Enter a blank line to exit");
		String choice = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (true) {
				System.out.println("Enter Menu Item : ");
				choice = in.readLine();

				if (choice.equals("001")) {
					Salary salary = new Salary();
					System.out.println("Enter Salary ID : ");
					String id = in.readLine();
					System.out.println("Enter Employee ID : ");
					String empId = in.readLine();
					System.out.println("Enter Employee Name : ");
					String name = in.readLine();
					System.out.println("Enter Employee NIC : ");
					String nic = in.readLine();
					System.out.println("Enter Employee Basic Salary : ");
					String basic = in.readLine();
					System.out.println("Enter Employee EPF : ");
					String netSalary = in.readLine();
					System.out.println("Enter Employee Net Salary : ");
					String totalCost = in.readLine();
					salary.setId(id);
					salary.setEmpId(empId);
					salary.setBasicSalary(basic);
					salary.setEmpName(name);
					salary.setEpf(netSalary);
					salary.setNetSalary(totalCost);
					service.addSalary(salary);
				} else if (choice.equals("002")) {
					service.listSalary();
				} else if (choice.equals("003")) {
					System.out.println("Enter Salary ID : ");
					String id = in.readLine();
					service.findSalary(id);
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
