package tw.com.shiaoshia.ex2017122805;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TV1;
    EditText ET1;
    final int REQUEST_CODE01 = 123;
    final int REQUEST_CODE02 = 456;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TV1=findViewById(R.id.textView);
        ET1=findViewById(R.id.editText);

    }

    public void click01(View v){
        TV1.setText(getResources().getString(R.string.textview02));
    }

    public void click02(View v){
        Intent it=new Intent(MainActivity.this,Main2Activity.class);
        it.putExtra("data01",ET1.getText().toString());
        startActivityForResult(it,REQUEST_CODE01);
        //左往右滑出
        //overridePendingTransition(R.anim.slide_left_in,R.anim.slide_right_out);
        //右往左滑出
        overridePendingTransition(R.anim.slide_right_in,R.anim.slide_left_out);
        //縮放效果
        //overridePendingTransition(R.anim.zoomin,R.anim.zoomin);
        //淡入淡出
        //overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
    }

    public void click03(View v){
        Intent it=new Intent();
        it.setAction("DD123123");
        startActivity(it);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE01){
            if(resultCode == RESULT_OK){
                TV1.setText(data.getStringExtra("data02"));
            }
        }
    }
}
