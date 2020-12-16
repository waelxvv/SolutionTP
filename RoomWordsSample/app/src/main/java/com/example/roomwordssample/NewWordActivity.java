package com.example.roomwordssample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewWordActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.android.roomwordssample.REPLY";
    public static final String EXTRA_REPLY2 = "com.example.android.roomwordssample.REPLY2";
    //public static final String EXTRA_REPLY3 ="com.example.android.roomwordssample.REPLY3";

    private EditText mEditWordView;
    private EditText mEditWordView2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);

        mEditWordView = findViewById(R.id.edit_word);
        mEditWordView2 = findViewById(R.id.edit_word2);


        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(mEditWordView.getText() )&& TextUtils.isEmpty(mEditWordView2.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String word = mEditWordView.getText().toString();
                    String word2 = mEditWordView2.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY, word);
                    replyIntent.putExtra(EXTRA_REPLY2, word2);
                    //replyIntent.putExtra(EXTRA_REPLY3,word2);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }


}