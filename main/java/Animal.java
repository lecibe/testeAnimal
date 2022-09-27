public class Animal {

    private String tipoAnimal;

    private String porteAnimal;

    private boolean podeVoar;

    private boolean podeNadar;

    Animal(String tipoAnimal, String porteAnimal, Boolean podeVoar, Boolean podeNadar) {
        this.tipoAnimal = tipoAnimal;
        this.porteAnimal = porteAnimal;
        this.podeVoar = true;
        this.podeNadar = true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipoAnimal='" + tipoAnimal + '\'' +
                ", porteAnimal='" + porteAnimal + '\'' +
                ", podeVoar=" + podeVoar +
                ", podeNadar=" + podeNadar +
                '}';
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getPorteAnimal() {
        return porteAnimal;
    }

    public void setPorteAnimal(String porteAnimal) {
        this.porteAnimal = porteAnimal;
    }

    public boolean isPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }


    public void setPodeNadar(boolean podeNadar) {
        this.podeNadar = podeNadar;
    }
}
