package com.example.falhafez;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface apisher {

    @GET ("api/ganjoor/poets")
    Call <List<shaer>> getData();
}
