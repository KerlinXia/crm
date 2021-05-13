package cn.kerlin.crm.mapper;

import cn.kerlin.crm.domain.Employee;
import cn.kerlin.crm.qo.EmployeeQueryObject;
import cn.kerlin.crm.qo.QueryObject;

import java.util.List;

public interface EmployeeMapper {
    /**
     * 保存员工信息
     * @param employee
     */
    void insert(Employee employee);

    /**
     * 删除员工信息
     */

    void delete(Long id);
    /***
     * 更新员工信息
     * @param employee
     */
    void update(Employee employee);

    /**
     * 查询单个信息
     * @param id
     * @return
     */
    Employee selectById(Long id);

    /**
     *查询总条数
     * @param qo
     * @return
     */
     int queryCount(QueryObject qo);

    /**
     * 查询分页数据
     * @param qo
     * @return
     */
    List<Employee> queryListByPage(EmployeeQueryObject qo);

    //List<Employee> selectAll();




}
