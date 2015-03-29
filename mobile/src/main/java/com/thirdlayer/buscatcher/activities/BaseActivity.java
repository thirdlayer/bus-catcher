package com.thirdlayer.buscatcher.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.thirdlayer.buscatcher.Application;

/**
 * Created by harry on 3/24/15.
 */
public class BaseActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inject dependencies
        ((Application) getApplication()).inject(this);
    }
}
