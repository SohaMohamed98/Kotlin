fun main(args:Array<String>)
{
    var arrayInt = Array<Int>(5){0}
    for(index in 0..4)
    {
        print("Enter Items:")
        arrayInt[index]= readLine()!!.toInt()
    }

    println("The items are")
    for(item in 0..4)
    {
        println(arrayInt[item])
    }
}