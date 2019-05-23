package inventorypublisher.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import inventorydatabase.model.Customer;
import inventorydatabase.model.Employee;
import inventorydatabase.model.Orders;
import inventorydatabase.model.Suppliers;
import inventorydatabase.model.Tasks;
import inventorydatabase.service.*;
import inventorydatabase.serviceimpl.InventoryServiceImpl;
import inventorypublisher.service.InventoryPublisherService;

public class InventoryPublisherServiceImpl implements InventoryPublisherService {

	InventoryService servicedetails = new InventoryServiceImpl();

	public InventoryPublisherServiceImpl() {

	}

	@Override
	public void CustomerReport() {
		List<Customer> list2 = new ArrayList<>();
		list2 = servicedetails.listCustomer();
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).getId() + "  " + list2.get(i).getFirstname() + "  "
					+ list2.get(i).getLastname() + "  " + list2.get(i).getEmail() + "  " + list2.get(i).getAddress()
					+ "  " + list2.get(i).getContactno());
		}

	}

	@Override
	public void findCustomerById(String id) {
		Customer customer = new Customer();
		customer = servicedetails.findByCustomerBy(id);
		System.out.println("Customer ID : " + customer.getId());
		System.out.println("Customer First Name :" + customer.getFirstname());
		System.out.println("Customer Last Name :" + customer.getLastname());
		System.out.println("Customer Email :" + customer.getEmail());
		System.out.println("Customer Address :" + customer.getAddress());
		System.out.println("Customer Contact Number :" + customer.getContactno());
	}

	@Override
	public String deleteCustomerById(String id) {
		return servicedetails.deleteCustomerById(id);
	}

	@Override
	public void SupplierReport() {
		List<Suppliers> list2 = new ArrayList<>();
		list2 = servicedetails.listSupplier();
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).getId() + "  " + list2.get(i).getFirstname() + "  "
					+ list2.get(i).getLastname() + "  " + list2.get(i).getEmail() + "  " + list2.get(i).getAddress()
					+ "  " + list2.get(i).getContactno());
		}
	}

	@Override
	public void findSupplierById(String id) {
		Suppliers supplier = new Suppliers();
		supplier = servicedetails.findBySupplierId(id);
		System.out.println("Supplier ID : " + supplier.getId());
		System.out.println("Supplier First Name :" + supplier.getFirstname());
		System.out.println("Supplier Last Name :" + supplier.getLastname());
		System.out.println("Supplier Email :" + supplier.getEmail());
		System.out.println("Supplier Address :" + supplier.getAddress());
		System.out.println("Supplier Contact Number :" + supplier.getContactno());
	}

	@Override
	public void TaskReport() {
		List<Tasks> list2 = new ArrayList<>();
		list2 = servicedetails.listTasks();
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).getId() + "  " + list2.get(i).getId() + "  " + list2.get(i).getTaskcode()
					+ "  " + list2.get(i).getDescription());
		}

	}

	@Override
	public void OrderReport() {
		List<Orders> list2 = new ArrayList<>();
		list2 = servicedetails.listOrders();
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i).getId() + "  " + list2.get(i).getId() + "  " + list2.get(i).getItemcode()
					+ "  " + list2.get(i).getDescription() + "  " + list2.get(i).getPriceperitem() + "  "
					+ list2.get(i).getQuantity());
		}
	}

	@Override
	public void findTaskById(String id) {
		Tasks task = new Tasks();
		task = servicedetails.findByTaskId(id);
		System.out.println("Task ID : " + task.getId());
		System.out.println("Task Code :" + task.getTaskcode());
		System.out.println("Task Description :" + task.getDescription());
	}

	@Override
	public void findOrderById(String id) {
		Orders order = new Orders();
		order = servicedetails.findByOrderId(id);
		System.out.println("Order ID : " + order.getId());
		System.out.println("Order Code :" + order.getItemcode());
		System.out.println("Order Description :" + order.getDescription());
		System.out.println("Price per order item " + order.getPriceperitem());
		System.out.println("Order Quantity :" + order.getQuantity());

	}

	@Override
	public void addCustomer(Customer customer) {
		servicedetails.addCustomer(customer);
	}

	@Override
	public void addSupplier(Suppliers supplier) {
		servicedetails.addSupplier(supplier);
	}

	@Override
	public String deleteSupplier(String id) {
		for (int i = 0; i < servicedetails.listSupplier().size(); i++) {
			if (servicedetails.listSupplier().get(i).getId() == id) {
				servicedetails.listSupplier().remove(i);
				return "Delete Successful";
			}
		}
		return "Delete Unsuccessful for Supplier id : " + id;
	}

	@Override
	public void addTask(Tasks task) {
		servicedetails.addTask(task);
	}

	@Override
	public String deleteTask(String id) {
		for (int i = 0; i < servicedetails.listTasks().size() ; i++) {
			if(servicedetails.listTasks().get(i).getId() == id) {
				servicedetails.listTasks().remove(i);
				return "Successfully Deleted Task";
			}
		}
		return "Unsuccessful to delete task : " + id;
	}

	@Override
	public void addOrders(Orders order) {
		servicedetails.addOrders(order);
	}

	@Override
	public String deleteOrder(String id) {
		for (int i = 0; i < servicedetails.listOrders().size(); i++) {
			if (servicedetails.listOrders().get(i).getId() == id) {
				servicedetails.listOrders().remove(i);
				return "Successfully Deleted Order";
			}
		}
		return "Unsuccessful to delete order :" + id;
	}

	@Override
	public void addEmployee(Employee employee) {
		listEmployee().add(employee);
	}

	@Override
	public Employee findEmployee(String id) {
		for (int i = 0; i < listEmployee().size(); i++) {
			if(listEmployee().get(i).getId() == id) {
				return listEmployee().get(i);
			}
		}
		return null;
	}

	@Override
	public List<Employee> listEmployee() {
		return listEmployee();
	}

}
