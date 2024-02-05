package com.sasi.constant;

public class DBConstant {

    public static final String GET_ALL_USER = "select name, place, phonenumber,qualification from SKUSER";
    public static final String INSERT_USER = "Insert into SKUSER (name, place, phonenumber,qualification) " +
            "values (:NAME,:PLACE,:PHONENUMBER,:QUALIFICATION)";

    public static final String GET_USER_BY_PH_NO = "select name, place, phonenumber,qualification from SKUSER" +
            " where phonenumber = ?";

    public static  final  String DELETE_USER = "delete from SKUSER where phonenumber = ?";

}
