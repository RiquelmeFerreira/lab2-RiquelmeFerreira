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
        int horas = 26 * numeroSemanas;
        if (numeroSemanas > 0 && horasDescanso >= horas){
            return "Descansado";
        } else {
            return "Cansado";
        }
    }
}