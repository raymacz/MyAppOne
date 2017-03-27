package com.raymacz.app1.myappone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final int TESTCONST = 21;

    private static final int VALUE = 276; //Rbtm test
    private static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doThis();




        Log.i(LOG_TAG, "onCreate: ");

     //   Document doc = new DDocument();

        Log.i(LOG_TAG, "onCreate");

        for (int i = 0; i < 3; i++) {
            Log.i(LOG_TAG, "onCreate: i=" + i);
        }
    }

    private void doThis() {
        MyTextUtil util1 = new MyTextUtil("Raymond");
        MyTextUtil textUtil = new MyTextUtil();
        textUtil.doSomethingElse();

        Intent intent = new Intent();
            TextView tv = (TextView) findViewById(R.id.myTextView);
            tv.setText("change orig text to Ba LucLuc");

        //debug sample start

//        Intent intent = null;
//        TextView tv = (TextView) findViewById(R.id.myTextView);
//        tv.setText(intent.toString());


        // debug sample end




        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();


    }


    // Exercise from other tutorials



    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG, "onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

    }

   //TODO this is a sample of TODO comment & will be listed below
   // ctrl+/ for comment

    @Override
    protected void onRestart() {
        super.onRestart();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        return super.onOptionsItemSelected(item);
//    }





}
