import javax.swing.JOptionPane;

/**
 *
 * @author James Alzate Jr
 */
public class dMarruecos extends aPais implements bIFunciones{

    public dMarruecos() {
    }

    @Override
    public double conversor(int x) {
        try{
            setPesos(x);
            setConversor(getPesos()*0.0030);
           return getConversor();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El formato es erroneo."+ex.getMessage());
        }
        return 0;
    }

    @Override
    public String traductor(String pal) {
        dMarruecos palabra1 = new dMarruecos();
        dMarruecos palabra2 = new dMarruecos();
        dMarruecos palabra3 = new dMarruecos();
        dMarruecos palabra4 = new dMarruecos();
        dMarruecos palabra5 = new dMarruecos();
        dMarruecos palabra6 = new dMarruecos();
        dMarruecos palabra7 = new dMarruecos();
        dMarruecos palabra8 = new dMarruecos();
        dMarruecos palabra9 = new dMarruecos();
        dMarruecos palabra10 = new dMarruecos();
        
        palabra1.setPalabra("Dos");
        palabra1.setTraduccion("Wahed");
        
        palabra2.setPalabra("Martes");
        palabra2.setTraduccion("Tlaat");
        
        palabra3.setPalabra("Manzana");
        palabra3.setTraduccion("Teffah");
        
        palabra4.setPalabra("Rojo");
        palabra4.setTraduccion("Hmer");
        
        palabra5.setPalabra("Almuerzo");
        palabra5.setTraduccion("Ghda");
        
        palabra6.setPalabra("Frio");
        palabra6.setTraduccion("Bared");
        
        palabra7.setPalabra("Hombre");
        palabra7.setTraduccion("Rajel");
        
        palabra8.setPalabra("Casa");
        palabra8.setTraduccion("Dar");
        
        palabra9.setPalabra("Perro");
        palabra9.setTraduccion("Kelb");
        
        palabra10.setPalabra("Libro");
        palabra10.setTraduccion("Ktuba");
        
        try{
            setIngreso(pal);
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "El formato es erroneo."+ex.getMessage());
        }
        
        switch(getIngreso()){
            case "Dos":
                return palabra1.getTraduccion();
                
            case "Martes":
               return palabra2.getTraduccion();
              
            case "Manzana":
                return palabra3.getTraduccion();
            case "Rojo":
                return palabra4.getTraduccion();
            case "Almuerzo":
                return palabra5.getTraduccion();
            case "Frio":
                return palabra6.getTraduccion();
            case "Hombre":
                return palabra7.getTraduccion();
            case "Casa":
                return palabra8.getTraduccion();
            case "Perro":
                return palabra9.getTraduccion();
            case "Libro":
                return palabra10.getTraduccion(); 
        }
        return null;
    }
}
