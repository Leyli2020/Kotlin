package com.example.myfirstandersenlabproject

open class Person(){
    var name:String="Name"
    open var surname:String="Surname"
    var age:Int=12
    public var isMarried: Boolean=false
    private var salary:Int=0
    protected var job:String="Unemployed"

    fun write(){
        println("Write about yourself")
    }
    protected class Nested{
        public val e:Int=5
    }
}
class Student: Person(){
//override var name="Mamed"
    override var surname="Mamedov"
    //override var age=24
   // override var isMarried=true

}
fun main(){

}