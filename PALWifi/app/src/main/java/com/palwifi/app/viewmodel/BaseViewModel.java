package com.palwifi.app.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by amitvikramjaiswal on 01/11/16.
 */

public abstract class BaseViewModel {

    private static final String TAG = BaseViewModel.class.getSimpleName();
    protected Context context;

    public BaseViewModel(Context context) {
        this.context = context;
    }

    protected void destroy() {
        context = null;
    }

    public interface DataListener {
        void showProgress();

        void hideProgress();

        void startActivity(Intent startIntent);

        void startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options);
    }

}
