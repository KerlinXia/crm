import cn.kerlin.crm.domain.Department;
import cn.kerlin.crm.mapper.DepartmentMapper;
import cn.kerlin.crm.service.IDepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {
    @Autowired
    private IDepartmentService departmentService;

    @Test
    public void selectAllServicetest(){
        System.out.println(departmentService.selectAllService());
    }

    @Test
    public void testsaveService(){
        Department department = new Department(null,"123","第一个部门");
        departmentService.saveService(department);
        System.out.println();
    }

    @Test
    public void testdeleteService(){
        departmentService.deleteService(17L);

    }

    @Test
    public void testupdateService(){
        Department department = new Department(23L,"234","第二个部门");
        departmentService.updateService(department);
    }

    @Test
    public void testgetOneService(){
        System.out.println(departmentService.getOneService(23L));
    }
}
