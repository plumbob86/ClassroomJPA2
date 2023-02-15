package edu.dmacc.classroom.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.dmacc.classroom.model.ClassroomModel;

/**
 * Servlet implementation class ClassroomPersistServlet
 */
@WebServlet({ "/persistClassroom"})
public class ClassroomPersistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassroomPersistServlet() {
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
		ClassroomModel model = new ClassroomModel();
		model.setClassroomNumber(new Integer(request.getParameter("classroomNumber")));
		model.setTeacherName(request.getParameter("teacherName"));
		model.setMaxStudents(new Integer(request.getParameter("maxStudents")));
		ClassroomHelper controller = new ClassroomHelper();
		try {
			controller.persistClassroom(model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
