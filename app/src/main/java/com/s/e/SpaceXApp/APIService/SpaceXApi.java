package com.s.e.SpaceXApp.APIService;

import com.s.e.SpaceXApp.models.Core;

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

    public XEndpoint getXEndpoint() {
        return retrofit.create( XEndpoint.class );
    }


    public void getAllData() {

        //IF ELSE DATA

        Call<List<Core>> call = getXEndpoint().getAll();

        call.enqueue( new Callback<List<Core>>() {

            @Override
            public void onResponse(Call<List<Core>> call, Response<List<Core>> response) {

                List<Core> coreList = response.body();
            }

            @Override
            public void onFailure(Call<List<Core>> call, Throwable t) {

            }

        } );

    }
}



























