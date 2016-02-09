package cs8semsrmcem.android.com.cs8semtt;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Abhishek Maurya on 09-02-2016.
 */
public class notificweb extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notwebv);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://docs.google.com/document/d/17wv73910CmyDmINUK8V81vGz1YH9wSJ_PU97hCXsSYM/pub");

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
