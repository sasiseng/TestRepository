package com.sasi.dao;

import com.sasi.model.SasiSengFeedModel;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SasiSengDao {
    public List<SasiSengFeedModel> getAllUsers();

    void addUser(SasiSengFeedModel ssModel);

    SasiSengFeedModel getUserByPhoneNumber(String phoneNumber);

    void deleteByPhoneNumber(String phoneNumber);
}
