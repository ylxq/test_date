package cn.com.tao.dao.impl;

import cn.com.tao.DBUtils.MybaitsUtil;
import cn.com.tao.dao.TestDateDao;
import cn.com.tao.po.DateHandle;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by kdhc on 2015/12/7.
 */
public class TestDateDaoImpl implements TestDateDao {
    @Override
    public DateHandle getFirstMsg() {

        SqlSession session= MybaitsUtil.getSqlSession(true);
        String sql="cn.com.tao.po.dateHandleMapper.getDateHandle";
        List<DateHandle> list=session.selectList(sql);
        return list.get(0);
    }
}
