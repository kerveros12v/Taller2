package clinica_veterinaria;

public class Mascota {

    private String nombre, especie, raza;
    private int edad;
    private double peso;

    public Mascota(String nombre, String especie, String raza, int edad, double peso) {

        this.setNombre(nombre);
        this.setEspecie(especie);
        this.setRaza(raza);
        this.setEdad(edad);
        this.setPeso(peso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = (nombre == null || nombre.trim().isEmpty()) ? "Sin nombre" : nombre.trim();

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = (especie == null || especie.trim().isEmpty()) ? "Desconocida" : especie.trim();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = (raza == null || raza.trim().isEmpty()) ? "Mestizo" : raza.trim();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = (edad > 0) ? edad : 0;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = (peso > 0) ? peso : 0.1;
    }

    @Override
    public String toString() {

        return "Nombre: " + this.nombre + "\nEspecie: " + this.especie
                + "\nRaza: " + this.raza + "\nEdad: " + this.edad + "\nPeso: " + this.peso;
    }

    public boolean esAdulto() {
        return (this.edad > 3) ? true : false;
    }

    public boolean estaEnPesoNormal(double pesoMin, double pesoMax) {
        return (peso >= pesoMin && peso <= pesoMax) ? true : false;
    }

}
