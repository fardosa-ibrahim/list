fun main() {
 names(listOf("fatama","jane","cathrine","jame","janet","sum","tine","jacob","salma","saida"))
    height(listOf(23,45,65,35,56,87,58))
    var person1=Person("Fatma",34,60,"7inches")
    var person2=Person("Jane",28,54,"5.4inches")
    var sort= listOf(person1,person2)
    var sorted=sort.sortedBy { person -> person.age }
    println(sorted)
    var c1=Car("toyota",32431)
    var c2=Car("sita",532)
    var total= listOf(c1,c2)
    println(total)
}
fun names(name:List<String>):List<String>{
    name.forEachIndexed(){index, y ->
        if (index % 2 ==0){
            println(y)
        }
    }
    return name
}
fun height(hght:List<Int>) {
    var sum=hght.sum()
    var average=hght.average()
    var both= println( "$average ,$sum" )
   return both
}
open class Person(var name:String,var age:Int,var weight:Int,var height:String){
       fun ages(age:List<Any>):List<Int>{
           return listOf()
       }

    }


    data class Car(var regestration:String,var mileage:Int){

        fun cars(c:List<Car>):Int{
            var carz=0
            for (s in c){
                carz+=mileage
                var totals=carz.countOneBits()
                return totals
            }

        }
    }
