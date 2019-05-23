package inventorydatabase.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import inventorydatabase.model.Customer;
import inventorydatabase.model.Employee;
import inventorydatabase.model.Orders;
import inventorydatabase.model.Salary;
import inventorydatabase.model.Stock;
import inventorydatabase.model.Suppliers;
import inventorydatabase.model.Tasks;
import inventorydatabase.service.InventoryService;

public class InventoryServiceImpl implements InventoryService {

	private static final List<Customer> list = new ArrayList<>();
	private static final List<Orders> listOrder = new ArrayList<>();
	private static final List<Suppliers> listSupplier = new ArrayList<>();
	private static final List<Tasks> listTask = new ArrayList<>();
	private static final List<Stock> listStock = new ArrayList<>();
	private static final List<Salary> listSalary = new ArrayList<>();
	private static final List<Employee> listEmployee = new ArrayList<>();

	public InventoryServiceImpl() {
		Customer customer1 = new Customer("IT100", "suren", "vithanage", "0769391251", "surenanthonyithanage@gmail.com",
				"athurugiriya");
		Customer customer2 = new Customer("IT101", "stephanie", "vithanage", "0769391255", "stephanie@gmail.com",
				"athurugiriya");
		Customer customer3 = new Customer("IT102", "natasha", "vithanage", "0769391252", "natasha@gmail.com", "malabe");
		Customer customer4 = new Customer("IT103", "sam", "sesh", "0769321251", "sam@gmail.com", "kottawa");
		Customer customer5 = new Customer("IT104", "simson", "last", "0763391251", "simson@gmail.com", "moratuwa");

		Orders order1 = new Orders("O001", "OD01", "Order 01", "10", "150");
		Orders order2 = new Orders("O002", "OD02", "Order 02", "12", "250");
		Orders order3 = new Orders("O003", "OD03", "Order 03", "13", "350");
		Orders order4 = new Orders("O004", "OD04", "Order 04", "14", "450");
		Orders order5 = new Orders("O005", "OD05", "Order 05", "15", "550");

		Suppliers supplier1 = new Suppliers("S001", "Ayesh", "Probadhana", "07638491241", "ayeshata@gmail.com",
				"Dehiwala");
		Suppliers supplier2 = new Suppliers("S002", "Himantha", "Krishna", "07638321241", "Himantha@gmail.com",
				"Nuwara");
		Suppliers supplier3 = new Suppliers("S003", "Ayeshanie", "Probadhana", "07638499941", "Ayeshanie@gmail.com",
				"Matale");
		Suppliers supplier4 = new Suppliers("S004", "Dimanthie", "De Silva", "07234491241", "Dimanthie@gmail.com",
				"Piliyandala");
		Suppliers supplier5 = new Suppliers("S005", "Natasha", "Fernando", "07849121241", "Natasha@gmail.com",
				"Ruhuna");

		Tasks task1 = new Tasks("T001", "#001", "Task 01");
		Tasks task2 = new Tasks("T002", "#002", "Task 02");
		Tasks task3 = new Tasks("T003", "#003", "Task 03");
		Tasks task4 = new Tasks("T004", "#004", "Task 04");
		Tasks task5 = new Tasks("T005", "#005", "Task 05");

		Salary salary1 = new Salary("S001", "E001", "Suren", "981231232V", "500000", "15000", "450000");
		Salary salary2 = new Salary("S002", "E002", "Step", "98671232V", "300000", "11000", "40000");
		Salary salary3 = new Salary("S003", "E003", "Natasha", "761231232V", "400000", "13000", "400000");

		Stock stock1 = new Stock("ST01", "Stock 01", "10", "1000", "10000");
		Stock stock2 = new Stock("ST02", "Stock 02", "20", "2000", "20000");
		Stock stock3 = new Stock("ST03", "Stock 03", "30", "3000", "30000");

		Employee emp1 = new Employee("E001", "suren", "vithanage", "60000", "970923823V");
		Employee emp2 = new Employee("E002", "anthony", "vithanage", "80000", "980923823V");
		Employee emp3 = new Employee("E003", "test", "vithanage", "70000", "970963823V");

		// inserting Employee
		listEmployee.add(emp1);
		listEmployee.add(emp2);
		listEmployee.add(emp3);

		// inserting Salary
		listSalary.add(salary1);
		listSalary.add(salary2);
		listSalary.add(salary3);

		// inserting Stock
		listStock.add(stock1);
		listStock.add(stock2);
		listStock.add(stock3);

		// inserting Customers records into an arraylist
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		list.add(customer5);

		// inserting Orders records into an arraylist
		listOrder.add(order1);
		listOrder.add(order2);
		listOrder.add(order3);
		listOrder.add(order4);
		listOrder.add(order5);

		// inserting Suppliers records into an arraylist
		listSupplier.add(supplier1);
		listSupplier.add(supplier2);
		listSupplier.add(supplier3);
		listSupplier.add(supplier4);
		listSupplier.add(supplier5);

		// inserting Tasks records into an arraylist
		listTask.add(task1);
		listTask.add(task2);
		listTask.add(task3);
		listTask.add(task4);
		listTask.add(task5);
	}

	@Override
	public void addCustomer(Customer customer) {
		list.add(customer);
	}

	@Override
	public List<Customer> listCustomer() {
		return list;
	}

	@Override
	public Customer findByCustomerBy(String id) {
		Customer customer = new Customer();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				customer.setId(list.get(i).getId());
				customer.setFirstname(list.get(i).getFirstname());
				customer.setLastname(list.get(i).getLastname());
				customer.setEmail(list.get(i).getEmail());
				customer.setAddress(list.get(i).getAddress());
				customer.setContactno(list.get(i).getContactno());
			}
		}
		return customer;
	}

	@Override
	public String deleteCustomerById(String id) {
		if (list.removeIf(customer -> customer.getId().equals(id))) {
			return "Deleted Successfully";
		} else {
			return "Error Deleting Customer : " + id;
		}
	}

	@Override
	public void addSupplier(Suppliers supplier) {
		listSupplier.add(supplier);

	}

	@Override
	public List<Suppliers> listSupplier() {
		return listSupplier;
	}

	@Override
	public Suppliers findBySupplierId(String id) {
		Suppliers supplier = new Suppliers();
		for (int i = 0; i < listSupplier.size(); i++) {
			if (listSupplier.get(i).getId().equals(id)) {
				supplier.setId(listSupplier.get(i).getId());
				supplier.setFirstname(listSupplier.get(i).getFirstname());
				supplier.setLastname(listSupplier.get(i).getLastname());
				supplier.setEmail(listSupplier.get(i).getEmail());
				supplier.setAddress(listSupplier.get(i).getAddress());
				supplier.setContactno(listSupplier.get(i).getContactno());
			}
		}
		return supplier;
	}

	@Override
	public void addTask(Tasks task) {
		listTask.add(task);

	}

	@Override
	public List<Tasks> listTasks() {
		return listTask;
	}

	@Override
	public void addOrders(Orders order) {
		listOrder.add(order);

	}

	@Override
	public List<Orders> listOrders() {
		return listOrder;
	}

	@Override
	public Tasks findByTaskId(String id) {
		Tasks task = new Tasks();
		for (int i = 0; i < listTask.size(); i++) {
			if (listTask.get(i).getId().equals(id)) {
				task.setId(listTask.get(i).getId());
				task.setTaskcode(listTask.get(i).getTaskcode());
				task.setDescription(listTask.get(i).getDescription());
			}
		}
		return task;
	}

	@Override
	public Orders findByOrderId(String id) {
		Orders order = new Orders();
		for (int i = 0; i < listOrder.size(); i++) {
			if (listOrder.get(i).getId().equals(id)) {
				order.setId(listOrder.get(i).getId());
				order.setItemcode(listOrder.get(i).getItemcode());
				order.setDescription(listOrder.get(i).getDescription());
				order.setPriceperitem(listOrder.get(i).getPriceperitem());
				order.setQuantity(listOrder.get(i).getQuantity());
			}
		}
		return order;
	}

	@Override
	public void addStock(Stock stock) {
		listStock.add(stock);
	}

	@Override
	public List<Stock> listStocks() {
		return listStock;
	}

	@Override
	public Stock findByStockId(String id) {
		for (int i = 0; i < listStock.size(); i++) {
			if (listStock.get(i).getId() == id) {
				return listStock.get(i);
			}
		}
		return null;
	}

	@Override
	public String deleteStock(String id) {
		for (int i = 0; i < listStock.size(); i++) {
			if (listStock.get(i).getId() == id) {
				listStock.remove(i);
				return "Successfully deleted stock";
			}
		}
		return "Unsuccessful to delete stock : " + id;
	}

	@Override
	public void addSalary(Salary salary) {
		listSalary.add(salary);
	}

	@Override
	public List<Salary> listSalary() {
		return listSalary;
	}

	@Override
	public Salary findSalary(String id) {
		for (int i = 0; i < listSalary.size(); i++) {
			if (listSalary.get(i).getId() == id) {
				return listSalary.get(i);
			}
		}
		return null;
	}

	@Override
	public void Employee(Employee employee) {
		listEmployee.add(employee);
	}

	@Override
	public List<Employee> listEmployee() {
		return listEmployee;
	}

	@Override
	public Employee findEmployee(String id) {
		for (int i = 0; i < listEmployee.size(); i++) {
			if (listEmployee.get(i).getId() == id) {
				return listEmployee.get(i);
			}
		}
		return null;
	}

}
