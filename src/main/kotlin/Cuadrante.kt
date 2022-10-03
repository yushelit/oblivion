import ordenes.*
import kotlin.random.Random

class Cuadrante {
    //var tierra =Array(3){Array<cuadrante?>(3){null} }
    var drones =Array<Dron?>(3){null}
    var mecanico : String = ""
    var supervisora : String = ""
    var misionesPendientes = ArrayList<Orden>()

    constructor(d:Dron,m:String,s:String){
        this.mecanico = "Jack$m"
        this.supervisora = "Vika$s"
        var num = Random.nextInt(1,4)
        for(i in 0 .. num){
            this.drones[i] = d
        }
    }

    fun necesitaReparaciones(): Dron? {
        for(i in 0..drones.size) if(!drones[i]!!.operativo) return drones[i]
        return null
    }

    fun organizarMisiones(orden: Orden):String{
        misionesPendientes.add(orden)
        return "tiene ${misionesPendientes.size} misiones en total"
    }

    fun realizarMisiones():Int{
        var misionesRealizadas:Int = 0
        var encuentros = arrayOf("Animales","Vegetales","Radiación")
        for (elemento in misionesPendientes) {
            if (elemento is OrdenReparacion) {
                val exito: Int = Random.nextInt(1, 3)
                val dronEstropeado: Dron? = necesitaReparaciones()
                if (exito == 1 && necesitaReparaciones() != null) {
                    dronEstropeado!!.operativo = true
                    elemento.completado = true
                }
            } else if (elemento is OrdenExploracion) {
                var dado = Random.nextInt(0, encuentros.size)
                elemento.obtenido = encuentros[dado]
                elemento.completado = true
            }
            misionesRealizadas++
        }
        return misionesRealizadas
    }
}