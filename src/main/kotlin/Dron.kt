class Dron (val codigo:Int, var operativo:Boolean=true) {
    override fun toString(): String {
        if(operativo){
            return "Dron$codigo, estado: operativo"
        }else{
            return "Dron$codigo, estado: malfuncionamiento"
        }

    }
}