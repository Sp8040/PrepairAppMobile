package com.example.prepairapp.ApiFiles;

import com.example.prepairapp.LoginFiles.LoginRequest;
import com.example.prepairapp.LoginFiles.LoginResponse;
import com.example.prepairapp.RegisterFiles.RegisterRequest;
import com.example.prepairapp.RegisterFiles.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/auth/login")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);

    @POST("/auth/register")
    Call<RegisterResponse> registerUser(@Body RegisterRequest registerRequest);

}
