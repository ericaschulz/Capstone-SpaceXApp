package com.s.e.SpaceXApp.APIService;

import com.s.e.SpaceXApp.models.Company;
import com.s.e.SpaceXApp.models.CrewMembers;
import com.s.e.SpaceXApp.models.Links;
import com.s.e.SpaceXApp.models.Rockets;
import com.s.e.SpaceXApp.models.Ships;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SpaceXApi {

    private static String SpaceX_BASE_URL;
    private Retrofit retrofit;


    public SpaceXApi() {

        Retrofit retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl( SpaceX_BASE_URL )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();

    }

    public XEndpoints getXEndpoint() {
        return retrofit.create( XEndpoints.class );
    }


    public void getLinks() {
        Call<List<Links>> call = getXEndpoint().getLinks();
        call.enqueue( new Callback<List<Links>>() {

            @Override
            public void onResponse(Call<List<Links>> call, Response<List<Links>> response) {

                List<Links> LinksList = response.body();

            }

            @Override
            public void onFailure(Call<List<Links>> call, Throwable t) {

            }

        } );

    }


    public void getCompanyInfo() {
        Call<Company> call = getXEndpoint().getCompanyInformation();
        call.enqueue( (new Callback<Company>() {

            @Override
            public void onResponse(Call<Company> call, Response<Company> response) {
                Company company = response.body();

            }

            @Override
            public void onFailure(Call<Company> call, Throwable t) {

            }


        }) );
    }

    public void getRockets() {
        Call<List<Rockets>> call = getXEndpoint().getRockets();
        call.enqueue( new Callback<List<Rockets>>() {
            @Override
            public void onResponse(Call<List<Rockets>> call, Response<List<Rockets>> response) {
                List<Rockets> rocketsList = response.body();
            }

            @Override
            public void onFailure(Call<List<Rockets>> call, Throwable t) {

            }
        });
    }

    public void getShips() {
        Call<List<Ships>> call = getXEndpoint().getShips();
        call.enqueue( new Callback<List<Ships>>() {
            @Override
            public void onResponse(Call<List<Ships>> call, Response<List<Ships>> response) {
                List<Ships> shipsList = response.body();
            }

            @Override
            public void onFailure(Call<List<Ships>> call, Throwable t) {

            }
        } );
    }

    public void getCrewMembers(){
        Call<List<CrewMembers>> call = getXEndpoint().getCrewMembers();
        call.enqueue( new Callback<List<CrewMembers>>() {
            @Override
            public void onResponse(Call<List<CrewMembers>> call, Response<List<CrewMembers>> response) {
                List<CrewMembers> crewMembersList = response.body();

            }

            @Override
            public void onFailure(Call<List<CrewMembers>> call, Throwable t) {

            }
        } );
    }
}



























