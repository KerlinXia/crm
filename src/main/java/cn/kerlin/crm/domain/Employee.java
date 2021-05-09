package cn.kerlin.crm.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */

@Setter
@Getter
@ToString
public class Employee {
    private Long id;
    private String username;
    private String realname;
    private String password;
    private String tel;
    private String email;
    private Long deptId;
    private Date inputTime;;
    private String state;
    private Boolean admin;
    private String role;
}
