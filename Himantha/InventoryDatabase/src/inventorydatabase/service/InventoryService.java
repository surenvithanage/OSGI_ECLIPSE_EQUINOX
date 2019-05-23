package inventorydatabase.service;

import java.util.List;

import inventorydatabase.model.Customer;
import inventorydatabase.model.Orders;
import inventorydatabase.model.Salary;
import inventorydatabase.model.Stock;
import inventorydatabase.model.Suppliers;
import inventorydatabase.model.Tasks;
import inventorydatabase.model.Employee;

public interface InventoryService {
	public void addCustomer(Customer customer);
	public List<Customer> listCustomer();
	public Customer findByCustomerBy(String id);
	public String deleteCustomerById(String id);
	
	public void addSupplier(Suppliers supplier);
	public List<Suppliers> listSupplier();
	public Suppliers findBySupplierId(String id);
	
	public void addTask(Tasks task);
	public List<Tasks> listTasks();
	public Tasks findByTaskId(String id);
	
	public void addOrders(Orders order);
	public List<Orders> listOrders();
	public Orders findByOrderId(String id);
	
	public void addStock(Stock stock);
	public List<Stock> listStocks();
	public Stock findByStockId(String id);
	public String deleteStock(String id);
	
	public void addSalary(Salary salary);
	public List<Salary> listSalary();
	public Salary findSalary(String id);
	
	public void Employee(Employee employee);
	public List<Employee> listEmployee();
	public Employee findEmployee(String id);
}
