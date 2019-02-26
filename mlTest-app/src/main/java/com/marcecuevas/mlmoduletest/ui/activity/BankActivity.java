package com.marcecuevas.mlmoduletest.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.marcecuevas.mlmoduletest.R;
import com.marcecuevas.mlmoduletest.main.MLApplication;
import com.marcecuevas.mlmoduletest.ui.activity.common.BaseActivity;
import com.marcecuevas.mlmoduletest.ui.activity.common.ToolbarActivity;

public class BankActivity extends ToolbarActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_bank;
    }

    @Override
    protected int getFragmentLayout() {
        return R.id.fragment;
    }

    @Override
    protected void injectDependencies(MLApplication application) {

    }

    @Override
    protected String title() {
        return getString(R.string.toolbar_bank);
    }
}