package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.http.Url;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the

    @SerializedName("Breeze") private List<String> breeds;
    @SerializedName("id")private String id;
    @SerializedName("url")private String url;
    @SerializedName("width")private int width;
    @SerializedName("height")private int height;





    public void setUrl(String url) {
        this.url = url;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }

    public String getUrl() {
        return url;
    }

    public List<String> getBreeds() {
        return breeds;
    }



}
