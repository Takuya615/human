package jp.techacademy.tsumura.human

import android.util.Log

open class Human:Animal,Thinkable{

    var hobby=String()

    constructor(name:String,age:Int,hobby:String):super(name,age) {
        this.name=""
        this.age=0
        this.hobby=""
    }

    override fun say() {
        Log.d("kotlin", "私の名前は"+this.name + "です。")
        Log.d("kotlin","年は"+this.age+"歳です")
    }

    override fun think(){
        Log.d("kotlin", "私は" + this.hobby + "について考える。")
    }
}