import kotlin.system.measureTimeMillis
import test1.Operator
class Car {

    fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    var type:String?=null
    var price:Double?=null
    var owner:String?=null
     var MilesDrive:Int?=null

    constructor(type:String, price:Double, owner:String, MilesDrive:Int)
    {
        //println("Type:$type")
        this.type = type
        //println("Price:$price")
        this.price=price
        //println("Owner:$owner")
        this.owner=owner
        //println("MilesDrive:$MilesDrive")
        this.MilesDrive=MilesDrive
    }

    fun GetType():String?
    {
        return this.type!!
    }

    fun GetPrice():Double?
    {
        return this.price!! - this.MilesDrive!!.toDouble()
    }

    fun GetOwner():String?
    {
        return this.owner!!
    }

    fun GetMilesDrive():Int?
    {
        return this.MilesDrive!!
    }
}

fun main(args:Array<String>)
{
    var car1=Car("bmw", 10000.0,"soha",105)
    println("type:"+car1.GetType())
    println("Price: " + car1.GetPrice())
    println("owner: "+ car1.GetOwner())
    println("MilesDrive: "+car1.GetMilesDrive())

    var car2=Car("ka", 15200.0,"sara",200)
    println("type: "+ car2.GetType())
    println("Price: " + car2.GetPrice())
    println("owner: "+ car2.GetOwner())
    println("MilesDrive: "+ car2.GetMilesDrive())

//Package
    var car3=Operator()
   println(car3.sum(5,6))

}