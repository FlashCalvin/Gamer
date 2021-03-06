package com.example.gamer;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        findViewById(R.id.button_up).setOnClickListener(this);
//        findViewById(R.id.button_down).setOnClickListener(this);
//        findViewById(R.id.button_left).setOnClickListener(this);
//        findViewById(R.id.button_right).setOnClickListener(this);
        findViewById(R.id.iup).setOnClickListener(this);
        findViewById(R.id.idown).setOnClickListener(this);
        findViewById(R.id.ileft).setOnClickListener(this);
        findViewById(R.id.iright).setOnClickListener(this);
        gameView = findViewById(R.id.game);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
//            case R.id.button_up:
//                Log.d("MainActivity", "onClick:up");
//            case R.id.button_down:
//                Log.d("MainActivity", "onClick:up");
//            case R.id.button_left:
//                Log.d("MainActivity", "onClick:up");
//            case R.id.button_right:
//                Log.d("MainActivity", "onClick:up");
            case R.id.iup:
                Log.d("MainActivity", "onClick:up");
//                gameView.moveUp();
                gameView.setPosY(gameView.getPosY()-50);
                gameView.invalidate();
                break;
            case R.id.idown:
                Log.d("MainActivity", "onClick:down");
//                gameView.moveDown();
                gameView.setPosY(gameView.getPosY()+50);
                gameView.invalidate();
                break;
            case R.id.ileft:
                Log.d("MainActivity", "onClick:left");
                gameView.moveLeft();
                gameView.invalidate();
                break;
            case R.id.iright:
                Log.d("MainActivity", "onClick:right");
                gameView.moveRight();
                gameView.invalidate();
                break;
        }
    }
}
