fun main(args:Array<String>)
{
    var map=HashMap<Int,String>()
    map.put(1,"soha")
    map.put(50,"reda")
    map.put(40,"Reda")
    map.put(20,"Mohamed")
    map.put(8,"Ahmed")

   // print(map[40])

    for(key in map.keys){
        println(map[key])
    }
}