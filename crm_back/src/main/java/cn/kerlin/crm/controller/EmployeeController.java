package cn.kerlin.crm.controller;

import cn.kerlin.crm.domain.Department;
import cn.kerlin.crm.domain.Employee;
import cn.kerlin.crm.qo.EmployeeQueryObject;
import cn.kerlin.crm.qo.PageResult;
import cn.kerlin.crm.qo.QueryObject;
import cn.kerlin.crm.service.IDepartmentService;
import cn.kerlin.crm.service.IEmployeeService;
import cn.kerlin.crm.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */
@Controller
@RequestMapping("/employee")
@CrossOrigin//解决跨域问题
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    //新增或者修改信息
    @RequestMapping("/saveorUpdate")
    @ResponseBody//返回json数据
    public JSONResult saveorUpdate(Employee employee){
        if (employee.getId() == null){
            employeeService.insert(employee);

        }else {
            employeeService.update(employee);
        }

        return JSONResult.ok();
    }

    //删除信息 返回列表
    @RequestMapping("/delete")
    @ResponseBody//返回json数据
    public JSONResult delete(Long id){
        if(id!=null){
            employeeService.delete(id);
        }
        return JSONResult.ok();
    }

    //查询所有
    @RequestMapping("/selectAll")
    @ResponseBody//返回json数据
    public JSONResult selectAll(){
        EmployeeQueryObject qo=new EmployeeQueryObject();
        PageResult<Employee> pageResult = employeeService.queryByPage(qo);
        return  JSONResult.ok(pageResult);
    }
}
