package com.sasi.service.impl;

import com.sasi.dao.SasiSengDao;
import com.sasi.model.SasiSengFeedModel;
import com.sasi.service.SasiSengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SasiSengServiceImpl implements SasiSengService {

    @Autowired
    private SasiSengDao sasiSengDao;
    public List<SasiSengFeedModel> getAllUsers() {
        return sasiSengDao.getAllUsers();
    }

    @Override
    public void addUser(SasiSengFeedModel ssModel) {
        try {
            sasiSengDao.addUser(ssModel);
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public SasiSengFeedModel getUserByPhoneNumber(String phoneNumber) {
        return sasiSengDao.getUserByPhoneNumber(phoneNumber);
    }

    @Override
    public void deleteByPhoneNumber(String phoneNumber) {
        sasiSengDao.deleteByPhoneNumber(phoneNumber);
    }
}
