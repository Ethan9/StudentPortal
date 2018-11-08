package com.example.ethyl.studentportal;

import android.os.Parcel;
import android.os.Parcelable;

public class Portal implements Parcelable{

    private String mURLName;
    private String mTitle;

    public Portal(String mURLName, String mTitle) {
        this.mURLName = mURLName;
        this.mTitle = mTitle;
    }

    public Portal(Parcel parcel) {
        mTitle = parcel.readString();
        mURLName = parcel.readString();
    }

    public static final Creator<Portal> CREATOR = new Creator<Portal>() {
        @Override
        public Portal createFromParcel(Parcel in) {
            return new Portal(in);
        }

        @Override
        public Portal[] newArray(int size) {
            return new Portal[size];
        }
    };

    public String getmURLName() {
        return mURLName;
    }

    public void setmURLName(String mURLName) {
        this.mURLName = mURLName;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mTitle);
        dest.writeString(mURLName);
    }
}
