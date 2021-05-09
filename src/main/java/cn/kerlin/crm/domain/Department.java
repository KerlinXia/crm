package cn.kerlin.crm.domain;

import lombok.*;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long id;
    private String sn;
    private String name;
}
