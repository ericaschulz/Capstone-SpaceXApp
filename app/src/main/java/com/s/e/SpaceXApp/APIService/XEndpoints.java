package com.s.e.SpaceXApp.APIService;

import com.s.e.SpaceXApp.models.Company;
import com.s.e.SpaceXApp.models.CrewMembers;
import com.s.e.SpaceXApp.models.Links;
import com.s.e.SpaceXApp.models.Rockets;
import com.s.e.SpaceXApp.models.Ships;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface XEndpoints {


    @GET("company")
    Call<Company> getCompanyInformation();

    @GET("rockets")
    Call<List<Rockets>> getRockets();

    @GET("crew")
    Call<List<CrewMembers>> getCrewMembers();

    @GET("ships")
    Call<List<Ships>> getShips();

    @GET("latest")
    Call<List<Links>> getLinks();

}
