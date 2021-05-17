package cn.kerlin.crm.service;

import cn.kerlin.crm.domain.Department;
import cn.kerlin.crm.domain.Employee;
import cn.kerlin.crm.qo.EmployeeQueryObject;
import cn.kerlin.crm.qo.PageResult;
import cn.kerlin.crm.qo.QueryObject;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IEmployeeService {
    /**
     * 增加
     * @param employee
     */
    void insert(Employee employee);

    /**
     * 删除
     * @param id
     */
    void delete(Long id);

    /**
     * 修改
     * @param employee
     */
    void update(Employee employee);
    /**
     * 分页
     * @param bqo
     * @return
     */
    PageResult<Employee> queryByPage(EmployeeQueryObject bqo);
    Employee selectById(Long id);
    List<Employee> selectAll();
}
