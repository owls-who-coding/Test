package com.example.testrestapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.w3c.dom.Text;

import okhttp3.internal.Version;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Button get_bnt;
    TextView get_tv;
    private  NetworkService networkService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApplicationController application = ApplicationController.getInstance();
        application.buildNetworkService("b612-118-222-88-117.jp.ngrok.io");
        networkService=ApplicationController.getInstance().getNetworkService();

        get_bnt=(Button) findViewById(R.id.btn_get);
        get_tv=(TextView) findViewById(R.id.tv_get);

        get_bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<JsonObject> versionCall = networkService.get_value();
                versionCall.enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                        if(response.isSuccessful()){
                            JsonObject jsonVal = response.body();

                            String version_txt="";
                            get_tv.setText(jsonVal.toString());

                        }
                        else{
                            int statusCode=response.code();
                            Log.i(ApplicationController.TAG, "Status Code : " + statusCode);
                        }
                    }

                    @Override
                    public void onFailure(Call<JsonObject> call, Throwable t) {

                    }
                });
            }
        });
    }
}