package com.example.myfirstandersenlabproject

class MainActivity2 {

}

open class Animal(val name: String) {
    open fun makeSound() {
        println("Some generic sound")
    }
}


class Dog(name: String, val breed: String) : Animal(name) {

    fun bark() {
        println("Woof, woof!")
    }


    override fun makeSound() {
        println("Barking loudly!")
    }
}


class Cat(name: String, val color: String) : Animal(name) {

    fun meow() {
        println("Meow, meow!")
    }


    override fun makeSound() {
        println("Purring softly.")
    }
}

fun main() {
    val dog = Dog("Buddy", "Golden Retriever")
    dog.makeSound() // Выводит: Barking loudly!
    dog.bark() // Выводит: Woof, woof!

    val cat = Cat("Whiskers", "Calico")
    cat.makeSound() // Выводит: Purring softly.
    cat.meow() // Выводит: Meow, meow!
}