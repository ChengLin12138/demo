package com.example.lenovo.day01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        //TODO 声明控件
        button = findViewById(R.id.main_btn);
        imageView = findViewById(R.id.main_img);
        //TODO 按钮的点击事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO 调用相机的方法
                initData();
                //TODO 将拍照好的照片放到Activity中的ImageView里显示
                imageView.setImageResource(R.drawable.ic_launcher_foreground);
            }
        });
    }
    //TODO 调用系统相机的方法
    private void initData() {



    }
}
