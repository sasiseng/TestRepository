package com.sasi.controller;

import com.sasi.model.SasiSengFeedModel;
import com.sasi.service.SasiSengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SasiSengController {

    @Autowired
    private SasiSengService sasiSengService;

    @GetMapping("/getUser")
    public ResponseEntity<List> getUserDetails() {
        List<SasiSengFeedModel> allUsers = sasiSengService.getAllUsers();
        return new ResponseEntity<List>(allUsers,HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody SasiSengFeedModel ssModel){
        sasiSengService.addUser(ssModel);
    }

    @GetMapping("/getUserByPhoneNumber")
    public ResponseEntity<SasiSengFeedModel> getUserByPhoneNumber(@RequestParam(name = "phonenumber") String phoneNumber){
        SasiSengFeedModel userDetails = sasiSengService.getUserByPhoneNumber(phoneNumber);
        return new ResponseEntity<SasiSengFeedModel>(userDetails, HttpStatus.OK);
    }

    @DeleteMapping("/deleteByPhoneNumber")
    public void deleteByPhoneNumber(@RequestParam(name = "phonenumber") String phoneNumber){
        sasiSengService.deleteByPhoneNumber(phoneNumber);
    }
    @GetMapping("/dummyEndPoint")
    public void dummyEndPoint(){
        System.out.println("dummyEndPoint");
    }

}
