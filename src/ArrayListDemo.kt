import java.util.*
import kotlin.collections.ArrayList

fun main(args:Array<String>){
    var arrList=ArrayList<String>()
    arrList.add("soha")
    arrList.add("sara")
    arrList.add("mohamed")

//With index
    for(item in 0..arrList.size-1)
    {
        println(arrList[item])
    }


//without index
    for(i in arrList){
        print(i)
    }
}