package com.example.tene.zetsushin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity  {

    private View mLoginFormView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.

    }


    /*

    追加

     */
    public void onNextButtonTapped(View view) {

        EditText edit = (EditText)findViewById(R.id.id);
        String text = edit.getText().toString();
        SpannableStringBuilder sp = (SpannableStringBuilder)edit.getText();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("InputID", text);

        startActivity(intent);
    }
    /*

     ここまで

     */

}

