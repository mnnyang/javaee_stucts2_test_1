package cn.xxyangyoulin.service.impl;

import cn.xxyangyoulin.dao.impl.EmployeeDao;
import cn.xxyangyoulin.dao.impl.IEmployeeDao;
import cn.xxyangyoulin.entity.Employee;
import cn.xxyangyoulin.service.IEmployeeService;

import java.util.List;


public class EmployeeService implements IEmployeeService {

    private IEmployeeDao employeeDao = new EmployeeDao();

    @Override
    public Employee findById(int id) {
        try {
            return employeeDao.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Employee> getAll() {
        try {
            return employeeDao.getAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(Employee emp) {
        try {
            employeeDao.save(emp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Employee emp) {
        try {
            employeeDao.update(emp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}