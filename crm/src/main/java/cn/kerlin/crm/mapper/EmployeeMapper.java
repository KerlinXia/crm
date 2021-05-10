package cn.kerlin.crm.mapper;

import cn.kerlin.crm.domain.Employee;

import java.util.List;

public interface EmployeeMapper {
    /**
     * 删除员工信息
     */
    void delete(Long id);

    /**
     * 查询单个信息
     * @param id
     * @return
     */
    Employee getOne(Long id);

    /**
     * 得到员工单独的信息
     * @param id
     * @return
     */
    Employee getOneService(Long id);

    /**
     * 保存员工信息
     * @param employee
     */
    void save(Employee employee);

    /***
     * 更新员工信息
     * @param employee
     */
    void update(Employee employee);
}
