package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

//    @Autowired
//    private PictureAuditMapper pictureAuditMapper;
//
//
//    @Override
//    public List<PictureAudit> getPictureAuditList() {
//        PictureAuditExample pictureAuditExample = new PictureAuditExample();
//        PictureAuditExample.Criteria criteria =  pictureAuditExample.createCriteria();
//        criteria.andChannelidIsNotNull();
//        return pictureAuditMapper.selectByExample(pictureAuditExample);
//    }


    @Autowired
    private JdbcTemplate jdbcTemplate;


    //JDBC 查询数据
    @Override
    public List<User> queryAllStudent() {
        //SQL
        String sql = "SELECT *  FROM t_user";
        //结果
        List<User> list = jdbcTemplate.query(sql, new RowMapper<User>() {
            //映射每行数据
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User stu = new User();
//                stu.setId(rs.getInt("id"));
//                stu.se(rs.getInt("user_age"));
//                stu.setUser_name(rs.getString("user_name"));
//                stu.setSex(rs.getInt("sex"));
                return stu;
            }
        });
        //返回结果
        return list;
    }
}
