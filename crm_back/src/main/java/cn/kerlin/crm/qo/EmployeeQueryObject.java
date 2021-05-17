package cn.kerlin.crm.qo;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */
@Getter
@Setter
public class EmployeeQueryObject extends QueryObject {
    private String keyword;
    private Long deptId;
}
