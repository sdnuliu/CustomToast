package test.nqsky.com.customtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by liuteng on 15/12/11.
 */
public class BaseActivity extends AppCompatActivity {
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void createToastWindow(String text) {
        LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
        View view = inflater.inflate(R.layout.toast_layout, null);
        TextView tv = (TextView) view.findViewById(R.id.pop_view);
        tv.setText(text);
        if (toast == null) {
            toast = new Toast(getApplicationContext());
        }
        toast.setView(view);
        toast.show();
    }
}
