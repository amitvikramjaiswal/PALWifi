package com.palwifi.app.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.palwifi.app.R;
import com.palwifi.app.databinding.ActivityLoginBinding;
import com.palwifi.app.viewmodel.LoginViewModel;

public class LoginActivity extends BaseActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        viewModel = new LoginViewModel(getApplicationContext());
        binding.setViewModel((LoginViewModel) viewModel);
    }
}
