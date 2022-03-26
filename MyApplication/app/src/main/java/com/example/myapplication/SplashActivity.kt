package com.example.myapplication


import com.example.zhcalculator.MainActivity


import android.content.Intent

import android.R

import android.view.WindowManager


import android.os.Bundle

import android.app.Activity
import java.lang.Exception


 class SplashActivity : Activity() {
    // private final int SPLASH_DISPLAY_LENGHT = 2000; // 两秒后进入系统
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN) //隐藏状态栏
        //getSupportActionBar().hide();//隐藏标题栏
        setContentView(R.layout.activity_list_item)
        val myThread: Thread = object : Thread() {
            //创建子线程
            override fun run() {
                try {
                    sleep(5000) //使程序休眠五秒
                    val it = Intent(applicationContext, MainActivity::class.java) //启动MainActivity
                    startActivity(it)
                    finish() //关闭当前活动
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        myThread.start() //启动线程
    }
}