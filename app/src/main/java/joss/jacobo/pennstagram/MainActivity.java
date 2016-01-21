package joss.jacobo.pennstagram;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
    private static final String STATE_PICTURE_TAKEN_BITMAP = "state_picture_taken_bitmap";
    private static final String STATE_PICTURE_URI = "state_picture_uri";
    private static final String IMAGE_NAME = "pennstagram_captured_image";

    private Uri pictureFileUri;
    private Bitmap pictureTakenBitmap;

    private TextView pictureText;
    private ImageView platyImageView;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // STEP 2

        // Set FAB's onClickListener
        // STEP 3

        // Set ImageView's onClickListener
        // STEP 3

        // If the savedInstanceState bundle is not null, it means we saved data in it.
        // Grab the data out and restore the state (i.e. Text, Image, and Button Icon)
        // STEP 9

    }

    /**
     * Set the screen's content depending on whether the user has already taken a picture or not.
     */
    private void setContent() {
        // STEP 7
    }

    private void startImageCapture() {
        // STEP 4
        // create Intent to take a picture and return control to the calling application

        // create a file to save the image

        // start the image capture Intent
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // STEP 6

                // Image captured and saved to pictureFileUri specified in the Intent

                // User cancelled the image capture
                // Image captured and saved to pictureFileUri specified in the Intent

                // Image capture failed, advise user

    }

    private void shareImage() {
        // STEP 8
        // Create Share Intent
    }

    @Nullable
    private Uri getOutputMediaFileUri(Context context, String name) {
        // STEP 5
        // Get external storage directory

        // Get or Create image folder

            // If images folder exists create an image file to save our picture taken
            // and return it's Uri.
        return null;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // STEP 9
        // Save image bitmap and it's uri when activity gets destroyed
        // (i.e. on screen rotation)

    }
}
