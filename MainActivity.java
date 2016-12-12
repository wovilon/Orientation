package wovilon.orientation;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.pm.ActivityInfo;

public class MainActivity extends AppCompatActivity {
static int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getScreenOrientation();

    }


    private void getScreenOrientation(){
        TextView textView=(TextView)findViewById(R.id.textView);
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_PORTRAIT)
        {textView.setText("VERTICAL");}
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE)
        {textView.setText("HORIZONTAL");}
    }


    public void onHorClick(View view) {setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);}
    public void onVertClick(View view) {setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);}
    public void onBtSensorClick(View view) {setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);}
}
