/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
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


@WebServlet(urlPatterns = {"/palabra"})
public class palabra extends HttpServlet {
public static String pais;


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
            out.println("<title>Servlet palabra</title>");            
            out.println("</head>");
            out.println("<body>");
            
            conversor.pais=pais;
            String palabra= request.getParameter("p2");
       
            if(pais.equals("Madagascar")){
                cMadagascar ob= new cMadagascar();
                
                out.println(ob.traductor(palabra));
                
            }else if(pais.equals("Marruecos")){
                dMarruecos ob= new  dMarruecos();
                
                out.println(ob.traductor(palabra));
                
            }else if(pais.equals("Chad")){
                 eChad ob= new  eChad();
                
                out.println(ob.traductor(palabra));
               
            }else if(pais.equals("Costa de Marfil")){
                fCostaDeMarfil ob= new   fCostaDeMarfil();
                
                out.println(ob.traductor(palabra));
               
            }else if(pais.equals("Senegal")){
                
                gSenegal ob= new gSenegal();
                
                out.println(ob.traductor(palabra));
               
            }
            
            
            
            out.println("</body>");
            out.println("</html>");
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