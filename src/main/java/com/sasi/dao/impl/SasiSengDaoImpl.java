package com.sasi.dao.impl;

import com.sasi.constant.DBConstant;
import com.sasi.dao.SasiSengDao;
import com.sasi.dao.rowmapper.SasiSengRowMapper;
import com.sasi.model.SasiSengFeedModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SasiSengDaoImpl implements SasiSengDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<SasiSengFeedModel> getAllUsers() {
        return jdbcTemplate.query(DBConstant.GET_ALL_USER, new SasiSengRowMapper());
    }

    public void addUser(SasiSengFeedModel ssModel) {
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("NAME", ssModel.getName());
        param.addValue("PLACE", ssModel.getPlace());
        param.addValue("PHONENUMBER", ssModel.getPhoneNumber());
        param.addValue("QUALIFICATION", ssModel.getQualification());
        namedParameterJdbcTemplate.update(DBConstant.INSERT_USER,param);
    }

    @Override
    public SasiSengFeedModel getUserByPhoneNumber(String phoneNumber) {
        return jdbcTemplate.queryForObject(DBConstant.GET_USER_BY_PH_NO, new SasiSengRowMapper(), phoneNumber);
    }

    @Override
    public void deleteByPhoneNumber(String phoneNumber) {
        jdbcTemplate.update(DBConstant.DELETE_USER, phoneNumber);
    }
}
