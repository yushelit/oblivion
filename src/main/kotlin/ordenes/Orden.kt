package ordenes

abstract class Orden(var completado:Boolean = false,x:Int,y:Int){

   abstract fun resumenOrden():String
}