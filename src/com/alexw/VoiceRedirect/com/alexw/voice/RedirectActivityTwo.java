package com.alexw.VoiceRedirect.com.alexw.voice;

import com.alexw.VoiceRedirect.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RedirectActivityTwo extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        Intent intent = new Intent(Intent.ACTION_VOICE_COMMAND);
        startActivity(intent);
        finish();
    }
}