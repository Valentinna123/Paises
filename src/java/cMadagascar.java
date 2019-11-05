import javax.swing.JOptionPane;

/**
 *
 * @author James Alzate Jr
 */
public class cMadagascar extends aPais implements bIFunciones{
    
    public cMadagascar() {
    }
    
    @Override
    public double conversor(int x) {
        try{
            setPesos(x);
            setConversor(getPesos()*0.13);
            return getConversor();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "El formato es erroneo."+ex.getMessage());
        } 
        return 0;
    }

    @Override
    public String traductor( String pal) {
        cMadagascar palabra1 = new cMadagascar();
        cMadagascar palabra2 = new cMadagascar();
        cMadagascar palabra3 = new cMadagascar();
        cMadagascar palabra4 = new cMadagascar();
        cMadagascar palabra5 = new cMadagascar();
        cMadagascar palabra6 = new cMadagascar();
        cMadagascar palabra7 = new cMadagascar();
        cMadagascar palabra8 = new cMadagascar();
        cMadagascar palabra9 = new cMadagascar();
        cMadagascar palabra10 = new cMadagascar();
        
        palabra1.setPalabra("Dos");
        palabra1.setTraduccion("Roa");
        
        palabra2.setPalabra("Martes");
        palabra2.setTraduccion("Talata");
        
        palabra3.setPalabra("Manzana");
        palabra3.setTraduccion("Paoma");
        
        palabra4.setPalabra("Rojo");
        palabra4.setTraduccion("Mena");
        
        palabra5.setPalabra("Almuerzo");
        palabra5.setTraduccion("Sakafo Atoandro");
        
        palabra6.setPalabra("Frio");
        palabra6.setTraduccion("Mangatsiaka");
        
        palabra7.setPalabra("Hombre");
        palabra7.setTraduccion("Lehilahy");
        
        palabra8.setPalabra("Casa");
        palabra8.setTraduccion("Trano");
        
        palabra9.setPalabra("Perro");
        palabra9.setTraduccion("Alika");
        
        palabra10.setPalabra("Libro");
        palabra10.setTraduccion("Boky");
        
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