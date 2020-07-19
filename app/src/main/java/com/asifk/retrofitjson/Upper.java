package com.asifk.retrofitjson;

import com.google.gson.annotations.SerializedName;

public class Upper {
    @SerializedName("Response")
    private Lower lower;

    public Lower getLower() {
        return lower;
    }
}
