package com.example.fangwang.mrfangdemo;

import android.os.Parcel;
import android.os.Parcelable;

public class DemoBean implements Parcelable {
    private String name;
    private String password;
    private String textStr;
    private String textStr2;

    private String getTextStr(){
        return textStr;
    }

    private void setTextStr(String textStr){
        this.textStr =  textStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.password);
    }

    public DemoBean() {
    }

    protected DemoBean(Parcel in) {
        this.name = in.readString();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<DemoBean> CREATOR = new Parcelable.Creator<DemoBean>() {
        @Override
        public DemoBean createFromParcel(Parcel source) {
            return new DemoBean(source);
        }

        @Override
        public DemoBean[] newArray(int size) {
            return new DemoBean[size];
        }
    };
}
