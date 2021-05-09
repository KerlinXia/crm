package cn.kerlin.crm.service;

import cn.kerlin.crm.domain.Department;

import java.util.List;

public interface IDepartmentService {
    //查询所有信息
    List<Department> selectAllService();

    //删除数据
    void deleteService(Long id);

    //增加数据
    void saveService(Department department);

    //更新数据
    void updateService(Department department);

    //得到单独信息
    Department getOneService(Long id);
}
