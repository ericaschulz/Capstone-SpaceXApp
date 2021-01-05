package com.s.e.SpaceXApp.APIService;

import com.s.e.SpaceXApp.models.Core;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface XEndpoint {


    @GET("latest")
    Call<List<Core>> getAll();

}
