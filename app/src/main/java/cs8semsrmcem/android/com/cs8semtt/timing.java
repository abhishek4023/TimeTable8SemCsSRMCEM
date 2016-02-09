package cs8semsrmcem.android.com.cs8semtt;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Abhishek Maurya on 09-02-2016.
 */
public class timing extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timing);
    }

    protected void onPause() {
        super.onPause();
        finish();
    }
}
