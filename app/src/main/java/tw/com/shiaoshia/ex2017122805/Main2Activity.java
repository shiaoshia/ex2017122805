package tw.com.shiaoshia.ex2017122805;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText ET2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ET2=findViewById(R.id.editText2);
        Intent it=getIntent();
        ET2.setText(it.getStringExtra("data01"));
    }

    public void click01(View v){
        Intent it=new Intent();
        it.putExtra("data02",ET2.getText().toString());
        setResult(RESULT_OK,it);
        finish();
        //左往右滑出
        overridePendingTransition(R.anim.slide_left_in,R.anim.slide_right_out);
        //縮放效果
        //overridePendingTransition(R.anim.zoomout,R.anim.zoomout);
    }

}
