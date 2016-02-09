package cs8semsrmcem.android.com.cs8semtt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by Abhishek Maurya on 09-02-2016.
 */
public class cs84 extends Activity {

    Spinner Spnday;
    private String[] daystr = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
    TextView t1,t2,t3,t4,t5,t6,t7,btncl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cs81);
        btncl = (TextView) findViewById(R.id.btncls);
        btncl.setText("CS-84");

        t1 = (TextView) findViewById(R.id.txtfirst);
        t2 = (TextView) findViewById(R.id.txtsec);
        t3 = (TextView) findViewById(R.id.txtthir);
        t4 = (TextView) findViewById(R.id.txtfour);
        t5 = (TextView) findViewById(R.id.txtfif);
        t6 = (TextView) findViewById(R.id.txtsix);
        t7 = (TextView) findViewById(R.id.txtsev);

        Spnday = (Spinner) findViewById(R.id.spinnerdays);
        final ArrayAdapter<String> eventAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,daystr);
        eventAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spnday.setAdapter(eventAdapter);


        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        SetTt(day-1);


        Spnday.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                int mem= Spnday.getSelectedItemPosition();
                SetTt(mem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void SetTt(int mem){

        Spnday.setSelection(mem);

        switch(mem)
        {
            case 0 :{
                t1.setText("Enjoy");
                t2.setText("Your");
                t3.setText("HOLIDAY!!!");
                t4.setText("");
                t5.setText("Today");
                t6.setText("Is");
                t7.setText("SUNDAY!!!");


                break;
            }


            case 1 :
            {
                t1.setText("Quiz");
                t2.setText("DIP");
                t3.setText("DDB");
                t4.setText("SDP");
                t5.setText("DS tut");
                t6.setText("Free");
                t7.setText("Free");
                break;
            }


            case 2 :
            {
                t1.setText("DS");
                t2.setText("PA/PR");
                t3.setText("EOE");
                t4.setText("DS LAB");
                t5.setText("DS LAB");
                t6.setText("SDP");
                t7.setText("SDP");
                break;
            }

            case 3 :
            {
                t1.setText("PA/PR");
                t2.setText("EOE");
                t3.setText("DS");
                t4.setText("DIP tut");
                t5.setText("DDB tut");
                t6.setText("Free");
                t7.setText("Free");
                break;
            }


            case 4 :
            {
                t1.setText("DIP");
                t2.setText("PA/PR");
                t3.setText("EOE");
                t4.setText("DIP LAB");
                t5.setText("DIP LAB");
                t6.setText("Project");
                t7.setText("Project");
                break;
            }

            case 5 :
            {
                t1.setText("DIP");
                t2.setText("DS");
                t3.setText("DDB");
                t4.setText("IND LAB");
                t5.setText("IND LAB");
                t6.setText("DMDW tut");
                t7.setText("Free");
                break;
            }

            case 6 :
            {
                t1.setText("Quiz");
                t2.setText("DDB");
                t3.setText("EOE");
                t4.setText("Project");
                t5.setText("Project");
                t6.setText("PA/PR tut");
                t7.setText("Free");
                break;
            }


        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
