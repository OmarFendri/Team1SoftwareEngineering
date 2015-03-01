package com.cs410g1.yoga;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.opengl.GLSurfaceView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class LessonOneActivity extends Activity {

    /** Hold a reference to our GLSurfaceView */
    private GLSurfaceView mGLSurfaceView;

    private String TAG = "LessonOneActivity";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        Log.d(TAG, "Activity created");
        super.onCreate(savedInstanceState);

        mGLSurfaceView = new MyGLSurfaceView(this);

        setContentView(mGLSurfaceView);
    }

    class MyGLSurfaceView extends GLSurfaceView {

        private final LessonOneRenderer mRenderer;

        public MyGLSurfaceView(Context context){
            super(context);

            // Create an OpenGL ES 2.0 context
            setEGLContextClientVersion(2);

            mRenderer = new LessonOneRenderer();


            super.setEGLConfigChooser(8 , 8, 8, 8, 16, 0);

            // Set the Renderer for drawing on the GLSurfaceView
            setRenderer(mRenderer);
        }
    }
}
