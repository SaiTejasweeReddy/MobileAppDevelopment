package com.example.saitejasweereddy.sign_insign_up;

/**
 * Created by Sai Tejaswee Reddy on 11/4/2017.
 */

public class Utils {
    //Email Validation pattern
    public static final String regEx = ("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
            "\\@" +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
            "(" +
            "\\." +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
            ")+");

    //Fragments Tags
    public static final String Login_Fragment = "Login_Fragment";
    public static final String SignUp_Fragment = "SignUp_Fragment";
    public static final String ForgotPassword_Fragment = "ForgotPassword_Fragment";

}
