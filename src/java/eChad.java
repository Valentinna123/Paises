import javax.swing.JOptionPane;

/**
 *
 * @author James Alzate Jr
 */
public class eChad extends aPais implements bIFunciones{

    public eChad() {
    }
    
    @Override
    public double conversor(int x) {
        try{
            setPesos(x);
            setConversor(getPesos()*0.18);
            return getConversor();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El formato es erroneo."+ex.getMessage());
        }
        return 0;
    }

    @Override
    public String traductor(String pal) {
        eChad palabra1 = new eChad();
        eChad palabra2 = new eChad();
        eChad palabra3 = new eChad();
        eChad palabra4 = new eChad();
        eChad palabra5 = new eChad();
        eChad palabra6 = new eChad();
        eChad palabra7 = new eChad();
        eChad palabra8 = new eChad();
        eChad palabra9 = new eChad();
        eChad palabra10 = new eChad();
        
        palabra1.setPalabra("Dos");
        palabra1.setTraduccion("Ethnan");
        
        palabra2.setPalabra("Martes");
        palabra2.setTraduccion("Thulathaa");
        
        palabra3.setPalabra("Manzana");
        palabra3.setTraduccion("Tuffah");
        
        palabra4.setPalabra("Rojo");
        palabra4.setTraduccion("Ahmar");
        
        palabra5.setPalabra("Almuerzo");
        palabra5.setTraduccion("Ghadaa");
        
        palabra6.setPalabra("Frio");
        palabra6.setTraduccion("Bared");
        
        palabra7.setPalabra("Hombre");
        palabra7.setTraduccion("Rajul");
        
        palabra8.setPalabra("Casa");
        palabra8.setTraduccion("Manzel");
        
        palabra9.setPalabra("Perro");
        palabra9.setTraduccion("Kalb");
        
        palabra10.setPalabra("Libro");
        palabra10.setTraduccion("Kutub");
        
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
               return palabra5.getTraduccion() ;
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
