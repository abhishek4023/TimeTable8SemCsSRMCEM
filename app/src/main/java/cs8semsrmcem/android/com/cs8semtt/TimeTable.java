package cs8semsrmcem.android.com.cs8semtt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class TimeTable extends AppCompatActivity {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.7F);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        Button cs81btn, cs82btn, cs83btn, cs84btn, btnnotweb, btndev, btntime;
        cs81btn = (Button) findViewById(R.id.btncs81);
        cs82btn = (Button) findViewById(R.id.btncs82);
        cs83btn = (Button) findViewById(R.id.btncs83);
        cs84btn = (Button) findViewById(R.id.btncs84);
        btnnotweb = (Button) findViewById(R.id.btnnotweb);
        btndev = (Button) findViewById(R.id.btndev);
        btntime = (Button) findViewById(R.id.btntim);





        cs81btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent show81 = new Intent("com.abhishekmaurya.timetable.cs81");
                startActivity(show81);
            }
        });

        cs82btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent show81 = new Intent("com.abhishekmaurya.timetable.cs82");
                startActivity(show81);
            }
        });

        cs83btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent show81 = new Intent("com.abhishekmaurya.timetable.cs83");
                startActivity(show81);
            }
        });
        cs84btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent show81 = new Intent("com.abhishekmaurya.timetable.cs84");
                startActivity(show81);
            }
        });

        btnnotweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent show81 = new Intent("com.abhishekmaurya.timetable.notificweb");
                startActivity(show81);
            }
        });

        btndev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent show81 = new Intent("com.abhishekmaurya.timetable.devlopmy");
                startActivity(show81);
            }
        });

        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent show81 = new Intent("com.abhishekmaurya.timetable.timing");
                startActivity(show81);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_time_table, menu);
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
}
