package com.example.prak8_1918094_arkan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiUtilities {
    private static Retrofit retrofit=null;
    public static ApiInterface getApiInterface()
    {
        if (retrofit==null)
        {
            retrofit = new
                    Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }
}