package cn.kerlin.crm.qo;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */

public class QueryObject {
    private Integer currentPage=1;// 当前页码，要跳转到哪一页的页码（需要给默认值）
    private Integer pageSize=5;// 每页显示条数（需要给默认值）
    private Integer startIndex;// 用于 Limit 子句第一个 ? 取值

    public Integer getStartIndex(){
        return (this.currentPage-1) * this.pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }
}
