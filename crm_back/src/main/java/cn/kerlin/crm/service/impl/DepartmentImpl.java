package cn.kerlin.crm.service.impl;

import cn.kerlin.crm.domain.Department;
import cn.kerlin.crm.mapper.DepartmentMapper;
import cn.kerlin.crm.qo.PageResult;
import cn.kerlin.crm.qo.QueryObject;
import cn.kerlin.crm.service.IDepartmentService;
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

    @Override
    public PageResult<Department> queryByPage(QueryObject qo) {
        Integer totalCount=departmentMapper.queryCount(qo);
        PageResult<Department> pageResult=null;
        if (totalCount==0){
            pageResult=new PageResult<>(new ArrayList<>(),0,qo.getCurrentPage(),qo.getPageSize());
        }else {
            List<Department> directoryList=departmentMapper.queryListByPage(qo);
            pageResult=new PageResult<>(directoryList,totalCount,qo.getCurrentPage(),qo.getPageSize());
        }
        return pageResult;
    }
}
