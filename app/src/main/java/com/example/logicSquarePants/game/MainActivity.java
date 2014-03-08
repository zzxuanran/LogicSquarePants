package com.example.app.game;

<<<<<<< HEAD:app/src/main/java/com/example/logicSquarePants/game/MainActivity.java
=======
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
>>>>>>> 9c3e931959dc95e565deb13feabeae63eea487ee:app/src/main/java/com/example/app/game/MainActivity.java
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.app.R;
import com.example.app.data.DataModel;
import com.example.app.data.XMLParser;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        DataModel model;
        XMLParser parser = new XMLParser();

        model = parser.parseDataFromXML(getResources(), R.xml.example);

        super.onCreate(savedInstanceState);
        DrawView screen = new DrawView(this);
        setContentView(screen);
<<<<<<< HEAD:app/src/main/java/com/example/logicSquarePants/game/MainActivity.java
=======
        ///////////////////////////////////preliminaries done
        // init the DataModel so it knows screen dimensions
        DataModel.getDataModel();
        spriteManager = new SpriteManager();
        XMLParser parser = new XMLParser();
        parser.parseDataFromXML(getResources(), R.xml.level1);
        Bitmap b = Bitmap.createBitmap(1,1, Bitmap.Config.ARGB_8888);
        Canvas backgroundCanvas = new Canvas(b);
        Paint p = new Paint();
        p.setColor(Color.rgb(200,200,200));
        backgroundCanvas.drawRect(0,0,1,1, p);
        spriteManager.initBackground(b);

>>>>>>> 9c3e931959dc95e565deb13feabeae63eea487ee:app/src/main/java/com/example/app/game/MainActivity.java
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_main, container, false);
            return rootView;
        }
    }

}
