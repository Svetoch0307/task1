package com.example.my1application.task
import com.example.my1application.task.Carnivorous
import com.example.my1application.task.Herbivore

fun main (){
val animalCarnivorous1 = Carnivorous(animalname = "Лев", diet = "мясо" )
    val animalCarnivorous2 = Carnivorous(animalname = "Медведь", diet = "рыба")
    val herbivore1 = Herbivore(herbivorename = "Свинья", animalclass = true)
    val herbivore2 = Herbivore(herbivorename = "Лошадь", animalclass = false)

}