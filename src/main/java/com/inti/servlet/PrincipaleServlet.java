package com.inti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.UAbonne;
import com.inti.UVip;
import com.inti.Utilisateur;
import com.inti.UtilisateurDetails;
import com.inti.util.HibernateUtil;

/**
 * Servlet implementation class PrincipaleServlet
 */
@WebServlet("/Inscription")
public class PrincipaleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Logger log = LogManager.getLogger(PrincipaleServlet.class);
	private Session s;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrincipaleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		s = HibernateUtil.getSessionFactory().openSession();
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			s.beginTransaction();

			String login = request.getParameter("login");
			String mdp = request.getParameter("mdp");
			
			Utilisateur user1 = null;
			if(request.getParameter("formule").equals("classique")) {
//				user1 = new Utilisateur(login, mdp);
			} else if(request.getParameter("formule").equals("abonne")) {
				user1 = new UAbonne(login, mdp, 2, "truc");
			}else {
				user1 = new UVip(login, mdp, 0.15, 2, 5, 12);
			}
			
			
			UtilisateurDetails userD1 = new UtilisateurDetails(request.getParameter("adresse"),
					request.getParameter("ville"),Integer.valueOf(request.getParameter("cp")),
					request.getParameter("tel"),
					request.getParameter("email"));

			s.save(userD1);
 
			user1.setUtilisateurDetails(userD1);

			s.save(user1);

			log.info("User enregistre");
			s.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			
			log.error("Erreur eregistrement user");
			s.getTransaction().rollback();
		}
		
		doGet(request, response);
	}

}
