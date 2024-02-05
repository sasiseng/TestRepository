package com.sasi.service;

import com.sasi.model.SasiSengFeedModel;

import java.util.List;

public interface SasiSengService {
    public List<SasiSengFeedModel> getAllUsers();

    void addUser(SasiSengFeedModel ssModel);

    SasiSengFeedModel getUserByPhoneNumber(String phoneNumber);

    void deleteByPhoneNumber(String phoneNumber);
}
