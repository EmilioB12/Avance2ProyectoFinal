public class Parqueadero {
    private String lugar;
    private int cantidadEspacio;
    private Espacio espacio;
    public Parqueadero(){

    }

    public Parqueadero(String lugar, int cantidadEspacio, Espacio espacio) {
        this.lugar = lugar;
        this.cantidadEspacio = cantidadEspacio;
        this.espacio = espacio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCantidadEspacio() {
        return cantidadEspacio;
    }

    public void setCantidadEspacio(int cantidadEspacio) {
        this.cantidadEspacio = cantidadEspacio;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }
}
