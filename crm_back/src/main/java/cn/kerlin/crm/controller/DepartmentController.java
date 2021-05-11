package cn.kerlin.crm.controller;

import cn.kerlin.crm.domain.Department;
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
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;


    //查询所有
    @RequestMapping("/selectAll")
    @ResponseBody//返回json数据
    @CrossOrigin//解决跨域问题
    public JSONResult selectAll(){
        List<Department>list = departmentService.selectAllService();
        return  JSONResult.ok(list);
    }

    //删除信息 返回列表
    @RequestMapping("/delete")
    public JSONResult delete(Long id){
        if(id!=null){
            departmentService.deleteService(id);
        }
        return JSONResult.ok();
    }

    //新增或者修改信息
    @RequestMapping("/saveorUpdate")
    public String saveorUpdate(Department department){
        if (department.getId() == null){
            departmentService.saveService(department);

        }else {
            departmentService.updateService(department);
        }

        return "redirect:/department/selectAll";
    }

    //增加修改页面
    @RequestMapping("/input")
    public String input(Long id,Model model){
        if (id!=null){
            Department department = departmentService.getOneService(id);
            model.addAttribute("department",department);
        }

        return "/department/input";
    }
}
