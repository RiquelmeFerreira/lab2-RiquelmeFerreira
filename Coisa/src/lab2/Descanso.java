package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public void defineHorasDescanso(int valorHorasDescanso){
        this.horasDescanso = valorHorasDescanso;
    }

    public void defineNumeroSemanas(int valorNumeroSemanas){
        this.numeroSemanas = valorNumeroSemanas;
    }

    public String getStatusGeral(){

        if (horasDescanso >= 26){
            return "Descansado";
        } else {
            return "Cansado";
        }
    }
}