package controlador;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DTO.BO.UsuarioBO;
import advancesIqtools.Datetron;
import classes.modelo.dao.UsuarioDaoImp;
import classes.modelo.objetos.Usuario;
import controlador.TesterinoBOs;

@WebServlet("/servlet")
public class ServleteMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UsuarioBO usuarioBO= new UsuarioBO();
	
	UsuarioDaoImp usuarioDao = new UsuarioDaoImp();
      
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
		
		
		System.out.println("Si esta conectado pasarle sus datos de sesion");
		HttpSession sesion= (HttpSession) request.getSession();
		//String asunto = request.getParameter("asunto");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idForm = request.getParameter("idForm");
		System.out.println("idForm: "+idForm);
		HttpSession sesion= (HttpSession) request.getSession();
		System.out.println("\n\n\n\n\n");
		
		switch(idForm) {
		  case "crearCuenta":
			  System.out.println("Switch crearCuenta");
			  getServletContext().getRequestDispatcher("/JSP/crearCuenta.jsp").forward(request, response);
			  
			  break;
		  case "loging":
			  
			  System.out.println("Switch loguearse");
			  
			  String usuario = request.getParameter("usuario");
			  String contraseña = request.getParameter("contraseña");
			  
			  if(usuarioBO.encontrarUsuarioPorNombre(usuario)==null) {
				  getServletContext().getRequestDispatcher("/JSP/logfail.jsp").forward(request, response);
				  
				  System.out.println("usuario incorrecto");
				  
			  }else if(usuarioBO.encontrarUsuarioPorNombre(usuario).getContraseña().equals(contraseña) ) {
				  System.out.println("DEBO RETORNARLE LOS DATOS DE SESION AL CTM");
				  sesion.setAttribute("conexion", usuarioBO.encontrarUsuarioPorNombre(usuario));
				  
				  System.out.println(usuarioBO.encontrarUsuarioPorNombre(usuario).getTipo());
				  
				  switch(usuarioBO.encontrarUsuarioPorNombre(usuario).getTipo()) {
				  		case "cliente":
				  			System.out.println("?");
				  			getServletContext().getRequestDispatcher("/JSP/cliente.jsp").forward(request, response);
				  			
				  			break;
				  		case "admin":
				  			break;
				  		case "profesional":
				  			break;
				  }
				  
			  }else {
				  System.out.println("contraseña incorrecta");
			  }
			  
			  
			  break;
		  case "loguearse":
			  getServletContext().getRequestDispatcher("/JSP/loging.jsp").forward(request, response);
			  break;
		  case "solicitarCreacionDeCuenta":
			  System.out.println("Switch solicitarCreacionDeCuenta");
			  
			  
			  System.out.println();
			  System.out.println();
			  System.out.println();
			  
			  System.out.println("COMPROBAR INEXISTENCIA DEL NOMBRE DE USUARIO");

			  System.out.println("COMPROBAR INEXISTENCIA DEL NOMBRE DE USUARIO");

			  
			  usuarioDao.agregarUsuario(
					  usuarioBO.getFilasLenght(),
					  "cliente",
					  request.getParameter("usuario"),
					  request.getParameter("contraseña"),
					  usuarioBO);
			  
			  getServletContext().getRequestDispatcher("/JSP/index.jsp").forward(request, response);

			  
			  break;
			  
		  case "enviarReporteAccidente":
              System.out.println("Switch ReprortarAccidente");
             
              request.getParameter("involucrados");
              request.getParameter("ubicacion");
              request.getParameter("actividad");
              request.getParameter("descripcion");
              
              
              break;

          case "interfaceReportarAccidentes":
              System.out.println("Switch Reportar Accidentes");
              getServletContext().getRequestDispatcher("/JSP/cliente.reportarAccidente.jsp").forward(request, response);
              break;

          case "verSolicitudesAsesoria":
              System.out.println("Switch Reportar Accidentes");
              getServletContext().getRequestDispatcher("/JSP/cliente.reportarAccidente.jsp").forward(request, response);
              break;

          case "verAsesoriasTomadas":
              System.out.println("Switch Reportar Accidentes");
              getServletContext().getRequestDispatcher("/JSP/cliente.reportarAccidente.jsp").forward(request, response);
              break;
			  
			  
			  
			  
			  
			  
		  default:
			  System.out.println("posible intento de vulneracion");
		}

	}

}
