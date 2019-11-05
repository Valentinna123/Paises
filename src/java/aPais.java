
import java.io.Serializable;

/**
 *
 * @author James Alzate Jr
 */
public class aPais implements Serializable{
    private String pais;
    private String capital;
    private String gentilicio;
    private String idioma;
    private String moneda;
    private double pesos;
    private double conversor;
    private String palabra;
    private String traduccion;
    private String ingreso;
    
    public aPais() {
    }

    public aPais(String pais, String capital, String gentilicio, String idioma, String moneda) {
        this.pais = pais;
        this.capital = capital;
        this.gentilicio = gentilicio;
        this.idioma = idioma;
        this.moneda = moneda;
    }
    
    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the capital
     */
    public String getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * @return the gentilicio
     */
    public String getGentilicio() {
        return gentilicio;
    }

    /**
     * @param gentilicio the gentilicio to set
     */
    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the pesos
     */
    public double getPesos() {
        return pesos;
    }

    /**
     * @param pesos the pesos to set
     */
    public void setPesos(double pesos) {
        this.pesos = pesos;
    }

    /**
     * @return the conversor
     */
    public double getConversor() {
        return conversor;
    }

    /**
     * @param conversor the conversor to set
     */
    public void setConversor(double conversor) {
        this.conversor = conversor;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the traduccion
     */
    public String getTraduccion() {
        return traduccion;
    }

    /**
     * @param traduccion the traduccion to set
     */
    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    /**
     * @return the ingreso
     */
    public String getIngreso() {
        return ingreso;
    }

    /**
     * @param ingreso the ingreso to set
     */
    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }
}