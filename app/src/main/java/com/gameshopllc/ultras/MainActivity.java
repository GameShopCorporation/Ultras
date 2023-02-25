package com.gameshopllc.ultras;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jme3.app.LegacyApplication;
import com.jme3.app.jmeSurfaceView.JmeSurfaceView;
import com.jme3.app.jmeSurfaceView.OnExceptionThrown;
import com.jme3.app.jmeSurfaceView.OnRendererCompleted;
import com.jme3.system.AppSettings;

/**
 * @author lyndenjayevans
 */
public final class MainActivity extends AppCompatActivity implements OnRendererCompleted, OnExceptionThrown {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*define the android view with it's id from xml*/
        final JmeSurfaceView jmeSurfaceView = findViewById(R.id.jmeSurfaceView);
        jmeSurfaceView.setDestructionPolicy(JmeSurfaceView.DestructionPolicy.KEEP_WHEN_FINISH);
        /*set the jme game*/
        jmeSurfaceView.setLegacyApplication(new AppMain());
        jmeSurfaceView.setOnExceptionThrown(this);
        jmeSurfaceView.setOnRendererCompleted(this);
        /*start the game*/
        jmeSurfaceView.startRenderer(500);
    }


    @Override
    public void onExceptionThrown(Throwable e) {
        Toast.makeText(MainActivity.this, "User's Delay Finished w/ exception : " + e.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRenderCompletion(LegacyApplication application, AppSettings appSettings) {
        Toast.makeText(MainActivity.this, "User's Delay Finished w/o errors !" + application.getContext() + " " + appSettings.getFrameRate(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        /*get the view from the current activity*/
        final View decorView = MainActivity.this.getWindow().getDecorView();
        /*hide navigation bar, apply fullscreen, hide status bar, immersive sticky to disable the system bars(nav and status) from showing up when user wipes the screen*/
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
}