package com.example.api;

import com.example.model.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FlickrAPI {
    @GET("services/rest/?method=flickr.photos.getRecent&api_key=4b76302be380ee7d5dcf8aff0d21c57c&extras=url_s&format=json&nojsoncallback=1")
    Call<Example> getRecent();
    @GET("services/rest/?method=flickr.photos.search&api_key=4b76302be380ee7d5dcf8aff0d21c57c&extras=url_s&format=json&nojsoncallback=1")
    Call<Example> getSearchPhotos(@Query("text") String keyWord);
}
