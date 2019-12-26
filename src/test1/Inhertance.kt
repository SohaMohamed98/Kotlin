package test1

open class Operators {
    fun sum(n1:Int, n2:Int):Int
    {
        return n1 + n2
    }

    open fun sub(n1:Int, n2:Int):Int
    {
        return n1 - n2
    }
}


class MulOperators(): Operators()
{
    fun mul(n1:Int, n2:Int):Int
    {
        return n1 * n2
    }

    fun div(n1:Int, n2:Int):Double
    {
        return n1.toDouble() / n2.toDouble()
    }

    override fun sub(n1:Int, n2:Int):Int
    {
        return n1 - n2 + 15
    }
}


fun main(args:Array<String>)
{
    var O1= Operators()
    println( O1.sum(8,4))
    println(O1.sub(8,4))

    var O2= MulOperators() as Operators  //Casting
    println(O2.sum(8,4))
    println(O2.sub(8,4))
  //  println(O2.mul(8,4))
   // println( O2.div(8,4))

}