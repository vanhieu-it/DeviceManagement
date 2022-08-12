package com.example.devicemanagement.Loading;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.text.Layout;
import android.view.LayoutInflater;

import com.example.devicemanagement.R;

public class LoadingDialog {
    private Activity activity;
    private AlertDialog dialog;

    public LoadingDialog(Activity myActivity){
        activity=myActivity;
    }
    public void startLoadingDialog(){
        AlertDialog.Builder builder= new AlertDialog.Builder(activity);
        LayoutInflater inflater= activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_loading,null));
        builder.setCancelable(true);

        dialog=builder.create();
        dialog.show();
    }
    public void dismissDialog(){
        dialog.dismiss();
    }
}
