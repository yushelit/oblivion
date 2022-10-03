package ordenes

import Dron
import kotlin.random.Random

class OrdenReparacion : Orden {
    var numDron:Int=0
    var x:Int = 0
    var y:Int = 0
    constructor(c:Int,x:Int,y:Int):super(false,x,y){
        this.numDron = c
    }

    fun repararDron(d:Dron) : Dron{
        var probabilidad = Random.nextInt(1,3)
        if(probabilidad==1){
            d.operativo = true
            return d
        }else{
            return d
        }
    }

    override fun resumenOrden():String {
        if(completado){
            return "Orden de reparación del dron $numDron del cuadrante $x,$y finalizada"
        }else{
            return "Orden de reparación del dron $numDron del cuadrante $x,$y en proceso"
        }

    }
}