package cn.kerlin.crm.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @Description:
 * @Author:kerlin
 * @Date
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory=null;
    private MybatisUtil(){}

    static {
        try {
            InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory=builder.build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
