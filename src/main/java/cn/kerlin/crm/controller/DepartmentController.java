package cn.kerlin.crm.controller;

import cn.kerlin.crm.domain.Department;
import cn.kerlin.crm.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String selectAll(Model model){
        List<Department>list = departmentService.selectAllService();
        model.addAttribute("departmentlist",list);
        System.out.println("执行到这一步");
        return "redirect:/index.jsp";
    }
}
