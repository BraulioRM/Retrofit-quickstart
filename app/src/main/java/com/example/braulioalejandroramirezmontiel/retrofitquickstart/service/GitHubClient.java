package com.example.braulioalejandroramirezmontiel.retrofitquickstart.service;

import com.example.braulioalejandroramirezmontiel.retrofitquickstart.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by braulioalejandroramirezmontiel on 6/24/17.
 */

public interface GitHubClient {
    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUser(
            @Path("user") String user
    );

}
