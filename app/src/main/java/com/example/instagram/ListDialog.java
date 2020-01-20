package com.example.instagram;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.annotation.NonNull;

public class ListDialog extends Dialog {

    Context mContext;
    Button hidebutton, deletebutton, modifybutton, hidefolerbutton, cancelbutton;
    clickListener mClickListener;

    public ListDialog(@NonNull Context context, clickListener clickListener) {
        super(context);
        mClickListener = clickListener;
        mContext = context;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.list_dialog);

        hidebutton = findViewById(R.id.hidebutton);
        deletebutton = findViewById(R.id.deletebutton);
        modifybutton = findViewById(R.id.modifybuton);
        hidefolerbutton = findViewById(R.id.hidefolderbutton);
        cancelbutton = findViewById(R.id.cancelbutton);

        hidebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClickListener.hideclick();
                dismiss();
            }
        });
        modifybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClickListener.modifyclick();
                dismiss();
            }
        });
        hidefolerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClickListener.hidefolerclick();
                dismiss();
            }
        });
        cancelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

    public interface clickListener{
        public void hideclick();
        public void modifyclick();
        public void hidefolerclick();
    }
}

//    void customOnClick(View v){
//        switch (v.getId()){
//            case R.id.hidebutton:
//                mClickListener.click();
//                dismiss();
//                break;
//            case R.id.deletebutton:
//                break;
//            case R.id.modifybuton:
//                break;
//            case R.id.cancelbutton:
//                break;
//        }
//    }
