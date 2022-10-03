package ordenes

import kotlin.random.Random

class OrdenExploracion:Orden {
    var area:Int = 0
    var obtenido:String=""
    var x:Int = 0
    var y:Int = 0

    constructor(c:Int,x:Int,y:Int):super(false,x,y){
        this.area = Random.nextInt(1,21)
        this.obtenido = "Sin determinar"
    }

    override fun resumenOrden():String {
        if (completado) {
            return "Orden de exploracion en el area $area en el cuadrante $x,$y  finalizada"
        } else {
            return "Orden de exploracion en el area $area en el cuadrante $x,$y  en proceso"
        }
    }
}