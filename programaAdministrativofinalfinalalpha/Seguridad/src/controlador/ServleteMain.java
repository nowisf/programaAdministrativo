package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.BO.UsuarioBO;
import controlador.TesterinoBOs;

@WebServlet("/servlet")
public class ServleteMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UsuarioBO usuarioBO= new UsuarioBO();
	
      
    public ServleteMain() {
        super();
        System.out.println("--Iniciando Servlet ");
        
        //System.out.println("ejecutando testerino");
        //TesterinoBOs.ejecutarTesterinoBOs();
        //System.out.println("syso terminado");
        
   
        usuarioBO.inicializar();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		getServletContext().getRequestDispatcher("/JSP/index.jsp").forward(request, response);
		
		//String asunto = request.getParameter("asunto");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idForm = request.getParameter("idForm");
		System.out.println("idForm: "+idForm);
		

		
		switch(idForm) {
		  case "crearCuenta":
			  System.out.println("Switch crearCuenta");
			  getServletContext().getRequestDispatcher("/JSP/crearCuenta.jsp").forward(request, response);
			  
			  break;
		  case "loguearse":
			  System.out.println("Switch loguearse");
			  
			  break;
		  case "solicitarCreacionDeCuenta":
			  System.out.println("Switch solicitarCreacionDeCuenta");
			  
			  break;
		  default:
			  System.out.println("posible intento de vulneracion");
		}

	}

}
