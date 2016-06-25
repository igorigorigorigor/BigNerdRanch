package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Freeman on 24.06.2016.
 */
public class Crime {

    private Date mDate;
    private boolean mSolved;
    private UUID mId;
    private String mTitle;


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String toString(){
        return mTitle;
    }

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
