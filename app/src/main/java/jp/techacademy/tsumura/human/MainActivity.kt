package jp.techacademy.tsumura.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human= human("太郎",40,"プログラミング")

        human.say()
        Log.d("kotlin","私の名前は"+human.name+"です。")
        Log.d("kotlin","年は"+human.age+"歳です。")
        human.think()

        val human2=human("花子",20,"寝る")
        human2.say()
        human2.think()
    }

}
