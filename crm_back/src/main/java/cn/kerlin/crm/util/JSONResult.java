package cn.kerlin.crm.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */
@Setter
@Getter
public class JSONResult {

    //定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    //相应业务状态
    private Integer status;

    //响应消息
    private String msg;

    //响应中的数据
    private Object data;

    private String ok;//不使用

    /**
     * 构造方法
     * @param status
     * @param msg
     * @param data
     */
    public JSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    public JSONResult() {
    }

    /**
     * 构建函数
     * @param status
     * @param msg
     * @param data
     * @return
     */
    public static JSONResult build(Integer status,String msg,Object data){
        return new JSONResult(status,msg,data);
    }

    /**
     * 响应函数500
     */
    public static JSONResult errorMsg(String msg) {
        return new JSONResult(500, msg, null);
    }
    /**
     * 响应函数501
     */
    public static JSONResult errorMap(Object data) {
        return new JSONResult(501, "error", data);
    }
    /**
     * 响应函数502
     */
    public static JSONResult errorTokenMsg(String msg) {
        return new JSONResult(502, msg, null);
    }
    /**
     * 响应函数555
     */
    public static JSONResult errorException(String msg) {
        return new JSONResult(555, msg, null);
    }

    public JSONResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    /**
     * 将状态设置为ok
     * @return
     */
    public Boolean isOK() {
        return this.status == 200;
    }

    public static JSONResult ok(Object data) {
        return new JSONResult(data);
    }

    public static JSONResult ok() {
        return new JSONResult(null);
    }

}
