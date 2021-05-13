package cn.kerlin.crm.controller;

import cn.kerlin.crm.domain.Department;
import cn.kerlin.crm.qo.PageResult;
import cn.kerlin.crm.qo.QueryObject;
import cn.kerlin.crm.service.IDepartmentService;
import cn.kerlin.crm.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */

@Controller
@RequestMapping("/department")
@CrossOrigin//解决跨域问题
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;



//    @RequestMapping("/selectAll")
//    @ResponseBody//返回json数据
//    public JSONResult selectAll(){
//        List<Department>list = departmentService.selectAllService();
//        return  JSONResult.ok(list);
//    }

    //查询所有
    @RequestMapping("/selectAll")
    @ResponseBody//返回json数据
    public JSONResult selectAll(){
        QueryObject qo=new QueryObject();
        PageResult<Department> pageResult = departmentService.queryByPage(qo);
        return  JSONResult.ok(pageResult);
    }

    //删除信息 返回列表
    @RequestMapping("/delete")
    @ResponseBody//返回json数据
    public JSONResult delete(Long id){
        if(id!=null){
            departmentService.deleteService(id);
        }
        return JSONResult.ok();
    }

    //新增或者修改信息
    @RequestMapping("/saveorUpdate")
    @ResponseBody//返回json数据
    public JSONResult saveorUpdate(Department department){
        if (department.getId() == null){
            departmentService.saveService(department);

        }else {
            departmentService.updateService(department);
        }

        return JSONResult.ok();
    }

}
