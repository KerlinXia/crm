package cn.kerlin.crm.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */

@Setter
@Getter
@ToString
public class Customer {
    private Long id;
    private String name;
    private Long age;
    private String gender;
    private Long tel;
    private String email;
    private String qq;
    private String wechat;
    private String job;
    private BigDecimal salaryLevel;
    private String source;
    private String seller;
    private String inputUser;
    private Date inputTime;
    private Long status;
    private Date positiveTime;
}
