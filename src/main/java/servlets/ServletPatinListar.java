
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.BicicletaController;

/**
 * Servlet implementation class ServletPeliculaListar
 */
@WebServlet(name = "ServletPatinListar", urlPatterns = {"/ServletPatinListar"})
public class ServletPatinListar extends HttpServlet {

  private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
  
   public ServletPatinListar() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        
    BicicletaController bicicleta = new BicicletaController();

        boolean ordenar = Boolean.parseBoolean(request.getParameter("ordenar"));
        String orden = request.getParameter("orden");

        String bicicletaStr = bicicleta.listar(ordenar, orden);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println(bicicletaStr);
        out.flush();
        out.close();
        
        }    


@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
