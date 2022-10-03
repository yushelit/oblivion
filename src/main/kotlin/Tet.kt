import ordenes.Orden
import ordenes.OrdenExploracion
import ordenes.OrdenReparacion

class Tet {
    val almacen = Array<Dron?>(200) {null}
    constructor(){
        for(i in 0..almacen.count()) almacen[i] = Dron(i+1,true)
    }
    fun sacarDron() : Dron? {
        var sacado : Dron? = null
        for (i in 0..almacen.count()) {
            if(almacen[i]!=null) {
                sacado=almacen[i]
                almacen[i] = null
                return sacado
            }
        }
        return null
    }
    fun otorgarOrdenReparacion(d:Dron,x:Int,y:Int):OrdenReparacion{
        return OrdenReparacion(d.codigo,x,y)
    }
}