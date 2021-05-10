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
public class Menu {
    private Long id;
    private Integer parentId;
    private String title;
    private String icon;
    private String href;
    private boolean spread;
    private String target;
    private Integer sort;

}
