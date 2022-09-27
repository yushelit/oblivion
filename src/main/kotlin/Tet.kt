class Tet {
    val almacen = Array<Dron?>(200) {null}
    constructor(){
        for(i in 0..almacen.count()) almacen[i] = Dron(i,true)
    }
}