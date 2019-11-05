/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sebastian salamanca
 */
@WebServlet(urlPatterns = {"/pais"})
public class pais extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet pais</title>");            
            out.println("</head>");
            out.println("<body>");
            
            FileOutputStream datos1 = null;
        
        
        
            String pais = request.getParameter("p1");
            
            
        aPais pais1 = new aPais("Madagascar", "Antananarivo", "Malgache", "Malgache & Fránces", "Ariary Malgache");
        aPais pais2 = new aPais("Marruecos", "Rabat", "Marroquí", "Árabe & lenguas bereberes", "Dirham Marroquí");
        aPais pais3 = new aPais("Chad", "Yamena", "Chadiano", "Fránces & Árabe", "Franco CFA de África Central");
        aPais pais4 = new aPais();
        aPais pais5 = new aPais();
        
        pais4.setPais("Costa de Marfil");
        pais4.setCapital("Yamusukro");
        pais4.setGentilicio("Marfileño");
        pais4.setIdioma("Fránces");
        pais4.setMoneda("Franco CFA de África Occidental");
        
        pais5.setPais("Senegal");
        pais5.setCapital("Dakar");
        pais5.setGentilicio("Senegalés");
        pais5.setIdioma("Francés");
        pais5.setMoneda("Franco CFA de África Occidental");
        
        String cadena= pais1.getCapital()+"/"+pais1.getGentilicio()+"/"+pais1.getIdioma()+"/"+pais1.getMoneda()+"/"+pais1.getPais();
        String cadena2= pais2.getCapital()+"/"+pais2.getGentilicio()+"/"+pais2.getIdioma()+"/"+pais2.getMoneda()+"/"+pais2.getPais();
        String cadena3= pais3.getCapital()+"/"+pais3.getGentilicio()+"/"+pais3.getIdioma()+"/"+pais3.getMoneda()+"/"+pais3.getPais();
        String cadena4= pais4.getCapital()+"/"+pais4.getGentilicio()+"/"+pais4.getIdioma()+"/"+pais4.getMoneda()+"/"+pais4.getPais();
        String cadena5= pais5.getCapital()+"/"+pais5.getGentilicio()+"/"+pais5.getIdioma()+"/"+pais5.getMoneda()+"/"+pais5.getPais(); 
        
        if(pais.equals("Madagascar")){
                palabra.pais="Madagascar";
                out.println(pais1.getPais());
                out.println("<br>");
                out.println(pais1.getCapital());
                out.println("<br>");
                out.println(pais1.getGentilicio());
                out.println("<br>");
                out.println(pais1.getIdioma());
                out.println("<br>");
                out.println(pais1.getMoneda());
                out.println("<br>");
                
                crear("C:\\Users\\sebastian salamanca\\Desktop\\ARCHIVO.txt", cadena);
           
            }else if(pais.equals("Marruecos")){
                palabra.pais="Marruecos";
                out.println(pais2.getPais());
                out.println("<br>");
                out.println(pais2.getCapital());
                out.println("<br>");
                out.println(pais2.getGentilicio());
                out.println("<br>");
                out.println(pais2.getIdioma());
                out.println("<br>");
                out.println(pais2.getMoneda());
                out.println("<br>");
                
                crear("C:\\Users\\sebastian salamanca\\Desktop\\ARCHIVO.txt", cadena2);
            }else if(pais.equals("Chad")){
                palabra.pais="Chad";
                out.println(pais3.getPais());
                out.println("<br>");
                out.println(pais3.getCapital());
                out.println("<br>");
                out.println(pais3.getGentilicio());
                out.println("<br>");
                out.println(pais3.getIdioma());
                out.println("<br>");
                out.println(pais3.getMoneda());
                out.println("<br>");
                
                crear("C:\\Users\\sebastian salamanca\\Desktop\\ARCHIVO.txt", cadena3);
                
            }else if(pais.equals("Costa de Marfil")){
                palabra.pais="Costa de Marfil";
                out.println(pais4.getPais());
                out.println("<br>");
                out.println(pais4.getCapital());
                out.println("<br>");
                out.println(pais4.getGentilicio());
                out.println("<br>");
                out.println(pais4.getIdioma());
                out.println("<br>");
                out.println(pais4.getMoneda());
                out.println("<br>");
                
                crear("C:\\Users\\sebastian salamanca\\Desktop\\ARCHIVO.txt", cadena4);
            }else if(pais.equals("Senegal")){
                palabra.pais="Senegal";
                out.println(pais5.getPais());
                out.println("<br>");
                out.println(pais5.getCapital());
                out.println("<br>");
                out.println(pais5.getGentilicio());
                out.println("<br>");
                out.println(pais5.getIdioma());
                out.println("<br>");
                out.println(pais5.getMoneda());
                out.println("<br>");
                
                crear("C:\\Users\\sebastian salamanca\\Desktop\\ARCHIVO.txt", cadena5);
            }
                
                
                out.println(" <h1>Digite la palabra</h1>");
                out.println("-Dos");
                out.println("<br>");
                out.println("-Martes");
                out.println("<br>");
                out.println("-Manzana");
                out.println("<br>");
                out.println("-Rojo");
                out.println("<br>");
                out.println("-Almuerzo");
                out.println("<br>");
                out.println("-Frio");
                out.println("<br>");
                out.println("-Hombre");
                out.println("<br>");
                out.println("-Casa");
                out.println("<br>");
                out.println("-Perro");
                out.println("<br>");
                out.println("-Libro");
                out.println("<br>");
         out.println("<br>");
         out.println("<form method =\"POST\" action =\"palabra\">"+"palabra: <input type=\"text\" name=\"p2\" id=\"idp1\"/>"
         + ""+" <input type=\"submit\" name=\"boton\" id=\"Buscar\"/>"+" </form>");
         
         
         out.println("<br>");
          out.println("<form method =\"POST\" action =\"conversor\">"+"conversor: <input type=\"text\" name=\"p3\" id=\"idp1\"/>"
         + ""+" <input type=\"submit\" name=\"boton\" id=\"Buscar\"/>"+" </form>");
            
        out.println("</body>");
            
            
            out.println("</html>");
        }
       
        
    }
    
    private void crear(String direccion, String texto) {
        String cadena;
        cadena = texto;
        FileWriter fichero = null;
        PrintWriter linea = null;

        try {
            fichero = new FileWriter(direccion, true);
            linea = new PrintWriter(fichero);

            linea.println(cadena);

        } catch (IOException e) {
            System.out.print("Error creando archivo");
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException e1) {
                System.out.print("Error cerrando archivo");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

}

