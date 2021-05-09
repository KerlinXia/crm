package cn.kerlin.crm.service.impl;

import cn.kerlin.crm.domain.Department;
import cn.kerlin.crm.mapper.DepartmentMapper;
import cn.kerlin.crm.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */
@Service
public class DepartmentImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;


    @Override
    public List<Department> selectAllService() {
        return departmentMapper.selectAll();
    }

    @Override
    public void deleteService(Long id) {
        departmentMapper.delete(id);
    }

    @Override
    public void saveService(Department department) {
        departmentMapper.save(department);
    }

    @Override
    public void updateService(Department department) {
        departmentMapper.update(department);
    }

    @Override
    public Department getOneService(Long id) {
        return departmentMapper.getOne(id);
    }
}
