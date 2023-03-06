package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.Commande;
import com.inti.Role;
import com.inti.Utilisateur;
import com.inti.util.HibernateUtil;

/**
 * Servlet implementation class RoleServlet
 */
@WebServlet("/RoleServlet")
public class RoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Logger log = LogManager.getLogger(CommandeServlet.class);
	private Session s;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		s = HibernateUtil.getSessionFactory().openSession();
		log.info("Connection à la base de données");
		this.getServletContext().getRequestDispatcher("/WEB-INF/role.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			s.beginTransaction();
			
			
			
			List<Role> listeR = new ArrayList<>();
			String[] tabR = request.getParameterValues("role");
			
			for(int i=0; i < tabR.length; i++) {
				listeR.add(new Role(tabR[i]));
			}
			
			Utilisateur u1 = s.get(Utilisateur.class, Integer.valueOf(request.getParameter("idUser")));
			u1.setListeRole(listeR);
			
			s.saveOrUpdate(u1);
			log.info("Role enregistrée");
			
			s.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			log.info("Role annulée");
			s.getTransaction().rollback();
		}
	}

}
