import javax.swing.JOptionPane;

/**
 *
 * @author James Alzate Jr
 */
public class fCostaDeMarfil extends aPais implements bIFunciones{

    public fCostaDeMarfil() {
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
        fCostaDeMarfil palabra1 = new fCostaDeMarfil();
        fCostaDeMarfil palabra2 = new fCostaDeMarfil();
        fCostaDeMarfil palabra3 = new fCostaDeMarfil();
        fCostaDeMarfil palabra4 = new fCostaDeMarfil();
        fCostaDeMarfil palabra5 = new fCostaDeMarfil();
        fCostaDeMarfil palabra6 = new fCostaDeMarfil();
        fCostaDeMarfil palabra7 = new fCostaDeMarfil();
        fCostaDeMarfil palabra8 = new fCostaDeMarfil();
        fCostaDeMarfil palabra9 = new fCostaDeMarfil();
        fCostaDeMarfil palabra10 = new fCostaDeMarfil();
        
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
