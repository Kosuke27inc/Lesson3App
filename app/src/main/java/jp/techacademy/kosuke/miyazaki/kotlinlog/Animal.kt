package jp.techacademy.kosuke.miyazaki.kotlinlog

abstract class Animal //プライマリコンストラクタ
    (var name: String = "aaa" , var age: Int
) {

    abstract fun say()
}