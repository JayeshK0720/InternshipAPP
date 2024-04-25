package com.jktech.edutransit_app;

public class ReadWriteUserDetails {
    public String email, gender, mobile;

    // empty constructor
    public ReadWriteUserDetails(){};

    public ReadWriteUserDetails(String textEmail, String textGender, String textMobile){
        this.email = textEmail;
        this.gender = textGender;
        this.mobile = textMobile;
    }

    public ReadWriteUserDetails(String textGender, String textMobile) {
        this.gender = textGender;
        this.mobile = textMobile;
    }
}
