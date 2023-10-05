package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import object.UserInfoObj;

/**
 * Servlet implementation class UserListController
 */
@WebServlet("/UserListController")
public class UserListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// List
		
		List<UserInfoObj> userList = new ArrayList<UserInfoObj>();
		
		// userList = service.xxx();
		userList.add(new UserInfoObj("user1","xx","xx","xx","xx","xx","yy"));
		userList.add(new UserInfoObj("user2","xx","xx","xx","xx","xx","yy"));
		userList.add(new UserInfoObj("user3","xx","xx","xx","xx","xx","yy"));
		userList.add(new UserInfoObj("user4","xx","xx","xx","xx","xx","yy"));
		userList.add(new UserInfoObj("user5","xx","xx","xx","xx","xx","yy"));
		
		request.setAttribute("userList", userList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/userList.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
