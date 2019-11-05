import javax.swing.JOptionPane;

/**
 *
 * @author James Alzate Jr
 */
public class gSenegal extends aPais implements bIFunciones{

    public gSenegal() {
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
        gSenegal palabra1 = new gSenegal();
        gSenegal palabra2 = new gSenegal();
        gSenegal palabra3 = new gSenegal();
        gSenegal palabra4 = new gSenegal();
        gSenegal palabra5 = new gSenegal();
        gSenegal palabra6 = new gSenegal();
        gSenegal palabra7 = new gSenegal();
        gSenegal palabra8 = new gSenegal();
        gSenegal palabra9 = new gSenegal();
        gSenegal palabra10 = new gSenegal();
        
        palabra1.setPalabra("Dos");
        palabra1.setTraduccion("Deux");
        
        palabra2.setPalabra("Martes");
        palabra2.setTraduccion("Mardi");
        
        palabra3.setPalabra("Manzana");
        palabra3.setTraduccion("Pommes");
        
        palabra4.setPalabra("Rojo");
        palabra4.setTraduccion("Rouge");
        
        palabra5.setPalabra("Almuerzo");
        palabra5.setTraduccion("Déjeuner");
        
        palabra6.setPalabra("Frio");
        palabra6.setTraduccion("Froid");
        
        palabra7.setPalabra("Hombre");
        palabra7.setTraduccion("Frére");
        
        palabra8.setPalabra("Casa");
        palabra8.setTraduccion("Maison");
        
        palabra9.setPalabra("Perro");
        palabra9.setTraduccion("Chien");
        
        palabra10.setPalabra("Libro");
        palabra10.setTraduccion("Livres");
        
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

