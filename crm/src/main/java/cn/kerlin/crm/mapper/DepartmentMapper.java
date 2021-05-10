package cn.kerlin.crm.mapper;

import cn.kerlin.crm.domain.Department;

import java.util.List;

public interface DepartmentMapper {
    //查询数据
    List<Department> selectAll();

    //删除数据
    void delete(Long id);

    //增加数据
    void save(Department department);

    //更新数据
    void update(Department department);

    //得到单独信息
    Department getOne(Long id);
}
