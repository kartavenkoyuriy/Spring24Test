package com.test24spring.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Component
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private String selectAll = "SELECT * FROM db_users";



    public List<UserDto> getAllUsersFromResultSet(){

        return jdbcTemplate.query(selectAll, new RowMapper<UserDto>() {
            @Override
            public UserDto mapRow(ResultSet resultSet, int i) throws SQLException {
                UserDto user = new UserDto();
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        });
    }

    public List<Map<String, Object>> getAllUsers() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(selectAll);

        return maps;
    }

}
