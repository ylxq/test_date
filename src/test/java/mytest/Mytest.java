package mytest;

import cn.com.tao.dao.TestDateDao;
import cn.com.tao.dao.impl.TestDateDaoImpl;
import org.junit.Test;

/**
 * Created by kdhc on 2015/12/7.
 */
public class Mytest {
    @Test
    public void test1(){
        TestDateDao t=new TestDateDaoImpl();
        System.out.println(t.getFirstMsg().getDateString());
    }
}
