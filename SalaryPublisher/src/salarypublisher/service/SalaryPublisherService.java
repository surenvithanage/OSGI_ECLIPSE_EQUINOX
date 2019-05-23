package salarypublisher.service;

import java.util.List;

import inventorydatabase.model.Salary;

public interface SalaryPublisherService {
	public void addSalary(Salary salary);

	public void listSalary();

	public void findSalary(String id);
}
