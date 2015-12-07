package cn.com.tao.DBUtils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by kdhc on 2015/11/18.
 */
public class MybaitsUtil {

    public static SqlSessionFactory getSqlSessionFactory(){
        InputStream inputStream=ClassLoader.getSystemResourceAsStream("conf.xml");
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSession getSqlSession(){
        return getSqlSessionFactory().openSession();
    }

    public static SqlSession getSqlSession(boolean isAutoCommit){
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
}
