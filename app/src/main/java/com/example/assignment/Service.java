package com.example.assignment;

import com.example.assignment.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Service {

    @GET("wp-json/wp/v2/posts")
    Call<List<Post>> getPost();
}
