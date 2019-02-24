package com.example.biddutkumar.retrofitsample;

import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("name")
    private String Name;

    @SerializedName("email")
    private String Email;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
