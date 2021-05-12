package cn.kerlin.crm.qo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */
@Setter
@Getter
public class PageResult<T> {
    //两条SQL语句执行的结果
    private List<T> data;//当前页结果集数据
    private Integer totalCount;//总条数
    //计算出来的数据
    private Integer prevPage;//上一页页码
    private Integer nextPage;//下一页页码
    private Integer totalPage;//总页数即末页页码
    //用户输入数据
    private Integer currentPage;//当前页码
    private Integer pageSize;//每页显示条数



    public PageResult(List<T> data, Integer totalCount, Integer currentPage, Integer pageSize) {
        this.data = data;
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        // 计算三个数据
        this.totalPage = (totalCount % pageSize == 0) ? (totalCount / pageSize) : (totalCount / pageSize + 1);
        this.prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1;
        this.nextPage = currentPage + 1 <= this.totalPage ? currentPage + 1 : this.totalPage;

    }
}
