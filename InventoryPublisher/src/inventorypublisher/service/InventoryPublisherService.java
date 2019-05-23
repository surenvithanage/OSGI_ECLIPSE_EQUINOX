package inventorypublisher.service;

import java.util.List;

import inventorydatabase.model.Customer;
import inventorydatabase.model.Employee;
import inventorydatabase.model.Orders;
import inventorydatabase.model.Suppliers;
import inventorydatabase.model.Tasks;

public interface InventoryPublisherService {

	public void CustomerReport();

	public void findCustomerById(String id);

	public String deleteCustomerById(String id);

	public void addCustomer(Customer customer);

	public void SupplierReport();

	public void findSupplierById(String id);

	public void addSupplier(Suppliers supplier);

	public String deleteSupplier(String id);

	public void TaskReport();

	public void findTaskById(String id);

	public void addTask(Tasks task);

	public String deleteTask(String id);

	public void OrderReport();

	public void findOrderById(String id);

	public void addOrders(Orders order);

	public String deleteOrder(String id);
	
	public void addEmployee(Employee employee);
	
	public Employee findEmployee(String id);
	
	public List<Employee> listEmployee();

}
