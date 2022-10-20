public class Ascensor {


    private int ubicacion=0;

    public String UsarAsensor(int origen,int destino) throws Exception {
        String respuesta="";
        origen=origen-1;
        destino=destino-1;
        if(VerificarPersona(origen,destino)){
            if(ubicacion==origen){
                if(destino>ubicacion){
                    int recorrido=destino-ubicacion;
                    respuesta=respuesta+"El asensor Sube "+recorrido+" pisos";
                    ubicacion=ubicacion+recorrido;
                }
                else {
                    int recorrido=ubicacion-destino;
                    respuesta=respuesta+"El asensor Baja "+recorrido+" pisos";
                    ubicacion=ubicacion-recorrido;
                }}else{
            if(ubicacion>origen){
                int recorrido =ubicacion-origen;
                respuesta=respuesta+"El asensor Baja "+recorrido+" pisos ";

                ubicacion=ubicacion-recorrido;
                if(destino>ubicacion){
                    recorrido=destino-ubicacion;
                    respuesta=respuesta+"El asensor Baja "+recorrido+" pisos ";
                    ubicacion=ubicacion+recorrido;
                }
                else {
                    recorrido=ubicacion-destino;
                    respuesta=respuesta+"El asensor Sube "+recorrido+" pisos ";
                    ubicacion=ubicacion-recorrido;
                }
            }else {
                int recorrido =origen-ubicacion;
                respuesta=respuesta+"El asensor Sube "+recorrido+" pisos ";
                ubicacion=ubicacion+recorrido;
                if(destino>ubicacion){
                    recorrido=destino-ubicacion;
                    respuesta=respuesta+"El asensor Sube "+recorrido+" pisos ";
                    ubicacion=ubicacion+recorrido;
                }
                else {
                    recorrido=ubicacion-destino;
                    respuesta=respuesta+"El asensor Baja "+recorrido+" pisos ";
                    ubicacion=ubicacion-recorrido;
                }
            }
            }
        }

        return respuesta;
    }
    public int[] CrearPersona(){
        int destino=(int)(Math. random()*3+1);
        int origen=(int)(Math. random()*3+1);
        while(destino==origen){
            origen=(int)(Math. random()*3+1);
        }
        int[] persona={origen,destino};
        return persona;
    }
    public boolean VerificarPersona(int origen, int destino) throws Exception{
        if(origen==destino){
            throw new Exception("el origen y el destino son el mismo");
        }
        return true;
    }
}
