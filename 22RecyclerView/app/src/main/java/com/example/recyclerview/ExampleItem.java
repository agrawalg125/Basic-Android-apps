package com.example.recyclerview;

public class ExampleItem {
    private int mImageresource;
    private String mText;

    public ExampleItem(int Imageresource,String Text)
    {
        mImageresource=Imageresource;
        mText=Text;
    }

    public int getmImageresource() {
        return mImageresource;
    }

    public String getmText() {
        return mText;
    }
}
