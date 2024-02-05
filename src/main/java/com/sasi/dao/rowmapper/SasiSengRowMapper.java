package com.sasi.dao.rowmapper;

import com.sasi.model.SasiSengFeedModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SasiSengRowMapper implements RowMapper<SasiSengFeedModel> {

    @Override
    public SasiSengFeedModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        SasiSengFeedModel sasiSengFeedModel = new SasiSengFeedModel();
        sasiSengFeedModel.setName(rs.getString("name"));
        sasiSengFeedModel.setPlace(rs.getString("place"));
        sasiSengFeedModel.setPhoneNumber(rs.getString("phonenumber"));
        sasiSengFeedModel.setQualification(rs.getString("qualification"));
        return sasiSengFeedModel;
    }
}
