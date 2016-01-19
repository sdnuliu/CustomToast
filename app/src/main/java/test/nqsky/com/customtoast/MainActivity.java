package test.nqsky.com.customtoast;

import android.os.Bundle;
import android.view.View;

import test.nqsky.com.customtoast.clog.CLog;

public class MainActivity extends BaseActivity {
    public static final String tag= "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createToastWindow("按钮被点击了！！！");
            }
        });
        CLog.setLogLevel(CLog.LEVEL_VERBOSE);
        CLog.v(tag,"v测试");
        CLog.v(tag,"v测试1,%s,%s","v测试2","v测试3");
        CLog.d(tag,"d测试");
        CLog.d(tag,"d测试1,%s,%s","d测试2","d测试3");
    }
}
