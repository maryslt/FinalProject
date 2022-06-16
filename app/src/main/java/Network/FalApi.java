package Network;

import com.example.falhafez.falha;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FalApi {


    String BASE_URL = "https://ganjgah.ir/api/ganjoor/hafez/";

    @GET("faal")
    Call<falha> getFal();
}
