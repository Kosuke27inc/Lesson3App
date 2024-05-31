package jp.techacademy.kosuke.miyazaki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log //ここを追加

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Log.d("kotlintest", "ログへの出力テスト") //ここを追加
//
//        //整数型の変数をnumという名前で作成して、10を代入する
//        var num = 10
//        Log.d("kotlintest", Integer.toString(num))
//
//        //numに50を代入する
//        //変数や定数に.toString()と記述する方法もある
//        num = 50
//        Log.d("kotlintest", num.toString())//こちらの書き方が一般的
//
//        //演算子
//        val num1 = 10 + 5 - 2 * 4 / 2
//        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)
//
//        val flag1 = true
//        val flag2 = false
//        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
//        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))
//
//        val num2 = 10
//        val num3 = 20
//        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))
//
//        //条件分岐(if)
//        num = 98
//
//        if (num >= 90) {
//            Log.d("kotlintest", "優")
//        } else if (num >= 75) {
//            Log.d("kotlintest", "良")
//        } else if (num >= 60) {
//            Log.d("kotlintest", "可")
//        } else {
//            Log.d("kotlintest", "不可")
//        }
//
//        //条件分岐(when)
//        val drink = 1
//
//        when (drink) {
//            0 -> {
//                Log.d("kotlintest", "コーヒーを注文しました")
//            }
//            1 -> Log.d("kotlintest", "紅茶を注文しました")
//            2 -> Log.d("kotlintest", "ミルクを注文しました")
//            else -> Log.d("kotlintest", "オーダーミスです")
//        }
//
//        //繰り返し処理
//        for (i in 1 until 6) {
//            Log.d("kotlintest", "for文の" + i + "回目")
//        }
//
//        var num4 = 1
//
//        while (num4 < 6) {
//            Log.d("kotlintest", "while文の" + num4 + "回目")
//            num4++
//        }
//
//        //1から3まで
//        for (i in 1..3) {
//            Log.d("kotlintest", "..演算子の" + i + "の回")
//        }
//
//        //6から2飛ばしずつ0まで
//        for (i in 6 downTo 0 step 2) {
//            Log.d("kotlintest", "downTo関数の" + i + "の回")
//        }
//
//        //配列
//        //Array<int>型の配列が作成される
//        val points = arrayOf(10, 6, 15, 23, 17)
//
//        for (i in points) {
//            Log.d("kotlintest", i.toString())
//        }
//
//        //例外処理
//        val numA = 100
//        val numB = 0
//        var ans = 0
//
//        try{
//            ans = numA / numB
//        } catch (e : Exception) {
//            Log.d("kotlintest", "0で割ろうとしました")
//            //例外情報から、メッセージを表示
//            Log.d("kotlintest", e.message.toString())
//        } finally {
//            Log.d("kotlintest", "ans = " + ans.toString())
//        }
//
//        //引数に50と1000を指定してtotal関数を呼び出す
//        //total(50, 1000)
//        //引数の値を変えることで処理内容を簡単に変更できる
//        //total(1, 1111)
//
//        val t = total(50, 1000) //ここでtotalからsumを返してもらう
//        Log.d("kotlintest", t.toString())
//
//        //クラス
//        val dog = Dog("ポチ", 3) //名前をポチ、年齢3歳で、Dogのインスタンスを作る
//
//        dog.say() //ポチが吠えます（ログ出力）
//        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
//        Log.d("kotlintest", "犬の年練は" + dog.age + "歳です。")
//
//        val dog2 = Dog("ハチ", 10) //名前をハチ、年齢10歳で、Dogインスタンスを作る
//        dog2.say() //ハチが吠えます（ログ出力）
//        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")
//
//        val bigdog = BigDog("ヨーゼフ", 15) //名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る
//
//        bigdog.say()
//        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")
//
//        dog.move()
        println("====kotlintest : ここからログを出す=====")

        val man = Human("ウェルテル", 16, "シャルロッテ")
        man.say()
        //Log.d("kotlintest", "私の名前は" + man.name + "です。年は" + man.age + "歳です。")
        man.think()

        val str: String? = "kotlin"
        Log.d("kotlintest", str.length.toString())//nullの可能性があるためエラーになる

        if (str != null){
            //nullでない場合のみ処理が行われるのでエラーにならない
            Log.d("kotlintest", str.length.toString())
        }

        var str: String? = null
        if(str?.length == null){
            Log.d("kotlintest", "str.lengthの結果はnull")
        } else {
            Log.d("kotlintest", "str.lengthの結果は" + str.length)
        }

//        var str1 = "Hello"
//        var str2 = "Hello"
//        var str3 = "Hello"
//
//        //今回の条件
//        val condition = str1 != str2
//
//        if (condition) {
//            Log.d("kotlintest", "str1とstr2は一緒です")
//        } else {
//            Log.d("kotlintest", "str1とstr2は異なります")
//        }
//
//        if (condition) {
//            Log.d("kotlintest", "str1とstr3は一緒です")
//        } else {
//            Log.d("kotlintest", "str1とstr3は異なります")
//        }

        //Log.d("kotlintest", "私は" + man.hobby + "について考える。")

//        val str1 = "Hello"
//        val str2 = "World"
//        val str3 = "Hello"
//
//        if (str1.equals(str2)) {
//            Log.d("kotlintest", "str1とstr2は一緒です")
//        } else {
//            Log.d("kotlintest", "str1とstr2は異なります")
//        }
//
//        if (str1.equals(str3)) {
//            Log.d("kotlintest", "str1とstr3は一緒です")
//        } else {
//            Log.d("kotlintest", "str1とstr3は異なります")
//        }
//
//        val i = 100
//        val str = i.toString() + " * 100 = ${i * 100}"
//        Log.d("kotlintest",str)
//    }
//
//    override fun onResume() {
//        super.onResume()
//        val t = total(50, 1000) //ここでtotalからsumを返してもらう
//        Log.d("kotlintest", t.toString())
//    }
//
//    //firstとlast、2つの引数と戻り値の型（Int）を指定した関数に修正
//    private fun total(first: Int, last: Int): Int {
//        var sum = 0
//        for (i in first..last) {
//            sum += i
//        }
//
//        return sum
    }
}