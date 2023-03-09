fun main() {
    val car=Car("Toyota","camry","grey",6)
    car.carry(9)
    car.identity()
   val result= car.calculateParkingFee(3)
    println(result)

    val city=Bus("kenyampya","hfvc","yellow",66)
    val res=city.maxTripFare(150.0)
    println(res)

    var pking=city.calculateParkingFee(4)
    println(pking)






}

//No 1
open class Car(val make:String,val model:String,val color:String,val capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if (people==capacity)
        println("Carrying $people passengers")

    else if(people>capacity){
        println("Over capacity by $x people")
    }

}
    fun identity(){
        println("i am a $color $make $model")
    }
     open fun calculateParkingFee(hours:Int):Int{
        var fee=hours*20
        return fee

    }
}

//No 2
    class Bus(make:String,model: String,color:String,capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var calc=capacity*fare
        return calc

    }

      override fun calculateParkingFee(hours:Int):Int{
          var fees=hours*capacity
          return fees

    }


}