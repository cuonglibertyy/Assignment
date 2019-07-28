package com.example.assignment;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    public static Service service;

    public static Service getInstance(){

        if (service==null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://asian.dotplays.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            service = retrofit.create(Service.class);
        }


         return service;
    }
    
}
