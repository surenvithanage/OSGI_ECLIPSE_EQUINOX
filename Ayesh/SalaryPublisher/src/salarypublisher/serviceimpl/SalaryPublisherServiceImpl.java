package salarypublisher.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import inventorydatabase.model.Salary;
import inventorydatabase.model.Stock;
import inventorydatabase.service.InventoryService;
import inventorydatabase.serviceimpl.InventoryServiceImpl;
import salarypublisher.service.SalaryPublisherService;

public class SalaryPublisherServiceImpl implements SalaryPublisherService{

	InventoryService servicedetails = new InventoryServiceImpl();
	
	@Override
	public void addSalary(Salary salary) {
		servicedetails.addSalary(salary);
	}

	@Override
	public void listSalary() {
		List<Salary> salary = new ArrayList<>();
		int i = 0;
		salary = servicedetails.listSalary();
		while (salary != null) {
			System.out.println("Stock Id : " + salary.get(i).getId());
			System.out.println("Employee ID : " + salary.get(i).getEmpId());
			System.out.println("Employee Name : " + salary.get(i).getEmpName());
			System.out.println("Employee NIC : " + salary.get(i).getEmpNIC());
			System.out.println("Basic Salary : " + salary.get(i).getBasicSalary());
			System.out.println("EPF : " + salary.get(i).getEpf());
			System.out.println("Net Salary : " + salary.get(i).getNetSalary());
			i++;
		}
	}

	@Override
	public void findSalary(String id) {
		Salary salary = new Salary();
		salary = servicedetails.findSalary(id);
		if (salary != null) {
			System.out.println("Stock Id : " + salary.getId());
			System.out.println("Employee ID : " + salary.getEmpId());
			System.out.println("Employee Name : " + salary.getEmpName());
			System.out.println("Employee NIC : " + salary.getEmpNIC());
			System.out.println("Basic Salary : " + salary.getBasicSalary());
			System.out.println("EPF : " + salary.getEpf());
			System.out.println("Net Salary : " + salary.getNetSalary());
		}
	}

}
