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
public class User {
    private Long id;
    private String username;
    private String password;
}
