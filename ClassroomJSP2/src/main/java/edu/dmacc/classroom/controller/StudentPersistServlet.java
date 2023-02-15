package edu.dmacc.classroom.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.dmacc.classroom.model.ClassroomModel;
import edu.dmacc.classroom.model.StudentModel;

/**
 * Servlet implementation class StudentPersistServlet
 */
@WebServlet("/persistStudent")
public class StudentPersistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentPersistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentModel model = new StudentModel();
		ClassroomModel classroomModel = new ClassroomModel();
		classroomModel.setId(new Integer(request.getParameter("classroomId")));
		model.setClassroomId(classroomModel);
		model.setName(request.getParameter("name"));
		ClassroomHelper controller = new ClassroomHelper();
		try {
			controller.persistStudent(model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
