package com.asifk.retrofitjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.text_view_result);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost/api/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<String> call  = jsonPlaceHolderApi.getPosts(new BundleAPI("Bundle15","M","27/06/20","Hyd","In","NA","Pvb1","Transpac","Desc"));

        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (!response.isSuccessful()){
                    textViewResult.setText("Code : "+ response.code());
                }else{

                 String re = response.body();

                        textViewResult.append(re);

                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }
}
