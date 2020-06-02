package jp.techacademy.tsumura.human

import android.util.Log

open class human:Animal {
    var hobby= String
    constructor(name:String,age:Int,hobby:String):super(name,age) {}


    override fun say() {
        Log.d("kotlin", name + "(" + age + "歳)")
    }
    fun think(){
        Log.d("kotlin", "私は" + hobby + "について考える。")

    }



}
