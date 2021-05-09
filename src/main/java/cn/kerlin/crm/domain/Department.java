package cn.kerlin.crm.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */

@Setter
@Getter
@ToString
public class Department {
    private Long id;
    private String sn;
    private String name;
}
