package com.example.falhafez;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apifal {


    String BASE_URL = "https://ganjgah.ir/api/ganjoor/hafez/";

    @GET("faal")
    Call<falha> getFal();
}
