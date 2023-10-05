package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import object.UserInfoObj;

/**
 * Servlet implementation class RukutenMain
 */
@WebServlet("/RakutenMain")
public class RakutenMain extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RakutenMain() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		// 在 Servlet 中
		RequestDispatcher dispatcher = request.getRequestDispatcher("/RakutenLogin.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 取到入力画面的入力值，并跳转到确认画面
//		System.out.println(9999);
//		String email = request.getParameter("email");
//		System.out.println(email);
//		String userId = request.getParameter("user");
//		System.out.println(userId);
//		String password = request.getParameter("password");
//		System.out.println(password);
//		String nameSei = request.getParameter("sei");
//		System.out.println(nameSei);
//		String nameMei = request.getParameter("mei");
//		System.out.println(nameMei);
//		String nameSeiKata = request.getParameter("seiKata");
//		System.out.println(nameSeiKata);
//		String nameMeiKata = request.getParameter("meiKata");
//		System.out.println(nameMei);
		
		UserInfoObj userInfoObj = new UserInfoObj();
		
		userInfoObj.setEmail(request.getParameter("email"));
        userInfoObj.setUserId(request.getParameter("userId"));
        userInfoObj.setPassword(request.getParameter("password"));
        userInfoObj.setNameSei(request.getParameter("sei"));
        userInfoObj.setNameMei(request.getParameter("mei"));
        userInfoObj.setNameSeiKata(request.getParameter("seiKata"));
        userInfoObj.setNameMeiKata(request.getParameter("meiKata"));
		
		request.setAttribute("userInfoObj", userInfoObj);
		
		 // 将值存储在 session 中
        HttpSession session = request.getSession();
        session.setAttribute("userInfoObj", userInfoObj);
	    
		RequestDispatcher dispatcher = request.getRequestDispatcher("/rakutenKakuni.jsp");
		dispatcher.forward(request, response);
	}

}
