package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public void defineHorasDescanso(){
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(){
        this.numeroSemanas = numeroSemanas;
    }

    public String getStatusGeral(){

        if (horasDescanso >= 26){
            return "Descansado";
        } else {
            return "Cansado";
        }
    }
}