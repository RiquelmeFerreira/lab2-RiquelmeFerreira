package lab2;

public class Descanso {
    private int horasDescanso;
    private int horasSemana;

    public void defineHorasDescanso(){
        this.horasDescanso = horasDescanso;
    }
    public void defineHorasSemanas(){
        this.horasSemana = horasSemana;
    }
    public String verificaEstado(){
        if (horasDescanso >= 26){
            return "Descansado";
        } else {
            return "Cansado";
        }
    }
}