package com.latihanandroid.hadiah7_1;

public class President {
    private String mName;
    private String mRemarks;
    private String mPhoto;

    public President() {
    }

    public President(String mName, String mRemarks, String mPhoto) {
        this.mName = mName;
        this.mRemarks = mRemarks;
        this.mPhoto = mPhoto;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmRemarks() {
        return mRemarks;
    }

    public void setmRemarks(String mRemarks) {
        this.mRemarks = mRemarks;
    }

    public String getmPhoto() {
        return mPhoto;
    }

    public void setmPhoto(String mPhoto) {
        this.mPhoto = mPhoto;
    }
}
