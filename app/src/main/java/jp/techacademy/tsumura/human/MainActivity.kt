package jp.techacademy.tsumura.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human= Human("太郎",40,"プログラミング")
        val human2=Human("花子",20,"寝る")

        human.say()
        human.think()

        human2.say()
        human2.think()
    }
}
