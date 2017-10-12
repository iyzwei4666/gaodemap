package com.wyz.mylibrary;

/**
 * Created by WYZ on 2017/10/12.
 */

public  class OfflineMapCity {
    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private  String city;
    private  String url;
    private long size;
    private int state;
    private int completeCode;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getcompleteCode() {
        return completeCode;
    }

    public void setCompleteCode(int completeCode) {
        this.completeCode = completeCode;
    }

    //    public String getUrl() {
//        return this.a;
//    }
//
//    public void setUrl(String var1) {
//        this.a = var1;
//    }
//
//    public long getSize() {
//        return this.b;
//    }
//
//    public void setSize(long var1) {
//        this.b = var1;
//    }
//
//    public int getState() {
//        return this.c;
//    }
//
//    public void setState(int var1) {
//        this.c = var1;
//    }
//
//    public String getVersion() {
//        return this.d;
//    }
//
//    public void setVersion(String var1) {
//        this.d = var1;
//    }
//
//    public int getcompleteCode() {
//        return this.e;
//    }
//
//    public void setCompleteCode(int var1) {
//        this.e = var1;
//    }

    public int describeContents() {
        return 0;
    }
}
