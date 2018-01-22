package com.zc.dialogpassvaluetoactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.zc.dialogpassvaluetoactivity.dialog.CustomDialog;

/**
 * https://www.jianshu.com/p/ee6d7fe360d2
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view){
        final CustomDialog dialog=new CustomDialog(this,R.style.customDialog,R.layout.dialog);
        dialog.show();//显示dialog
        TextView tvCancel = dialog.findViewById(R.id.cancel);
        TextView tvOk = dialog.findViewById(R.id.ok);
        tvOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(getApplicationContext(), "恭喜你！你是大神了！", Toast.LENGTH_SHORT).show();
            }
        });
        tvCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

}
