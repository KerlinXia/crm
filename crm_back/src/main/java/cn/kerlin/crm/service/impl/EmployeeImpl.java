package cn.kerlin.crm.service.impl;

import cn.kerlin.crm.domain.Department;
import cn.kerlin.crm.domain.Employee;
import cn.kerlin.crm.mapper.EmployeeMapper;
import cn.kerlin.crm.qo.EmployeeQueryObject;
import cn.kerlin.crm.qo.PageResult;
import cn.kerlin.crm.qo.QueryObject;
import cn.kerlin.crm.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */
@Service
public class EmployeeImpl implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public void insert(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public void delete(Long id) {
        employeeMapper.delete(id);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }

    @Override
    public PageResult<Employee> queryByPage(EmployeeQueryObject bqo) {
        int totalCount=employeeMapper.queryCount(bqo);
        PageResult<Employee> pageResult=null;
        if (totalCount==0){
            pageResult=new PageResult<Employee>(new ArrayList<Employee>(),0,bqo.getCurrentPage(),bqo.getPageSize());
        }else {
            List<Employee> bookList=employeeMapper.queryListByPage(bqo);
            pageResult=new PageResult<Employee>(bookList,totalCount,bqo.getCurrentPage(),bqo.getPageSize());
        }
        return pageResult;
    }

    @Override
    public Employee selectById(Long id) {
        Employee employee=employeeMapper.selectById(id);
        return employee;
    }

    @Override
    public List<Employee> selectAll() {
        List<Employee> employeeList=employeeMapper.selectAll();
        return employeeList;
    }
}
