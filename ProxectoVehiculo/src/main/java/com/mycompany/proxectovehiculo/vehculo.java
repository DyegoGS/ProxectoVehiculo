package com.mycompany.proxectovehiculo;
public class vehculo {
    private String matricula;
    private float quilometros;
    private String propietario;
    private int anos;
    private String descricion;
    private float prezo;

    public vehiculo(String matricula, float quilometros, String propietario, int anos, String descricion, float prezo) {
        this.matricula = matricula;
        this.quilometros = quilometros;
        this.propietario = propietario;
        this.anos = anos;
        this.descricion = descricion;
        this.prezo = prezo;
    }

    public vehiculo() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(float quilometros) {
        this.quilometros = quilometros;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }
    
    
}
