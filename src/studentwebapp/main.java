package studentwebapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class main
 */
// @WebServlet("/main")
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<students> detail = new ArrayList<students>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public main() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Connection con = null;
		connection dat = new connection();
		con = dat.conect(con);
		
		String name = req.getParameter("name");
		if (name != null) {

			int tamil = Integer.parseInt(req.getParameter("tamil"));
			int english = Integer.parseInt(req.getParameter("english"));
			int maths = Integer.parseInt(req.getParameter("maths"));
			int science = Integer.parseInt(req.getParameter("science"));
			int social = Integer.parseInt(req.getParameter("social"));

			students data = new students(name, tamil, english, maths, science,
					social);

			detail.add(data);
		}

		String newname = req.getParameter("searchname");
		if (newname != null) {
			String getname = "";
			int total = 0;
			int avg = 0;
			boolean studentresult = false;
			boolean check = false;

			for (students stud : detail) {
				if (newname.equalsIgnoreCase(stud.getname())) {
					total = stud.gettamil() + stud.getenglish()
							+ stud.getmaths() + stud.getscience()
							+ stud.getsocial();

					avg = total / 5;
					getname = stud.getname();

					if (stud.gettamil() < 40 || stud.getenglish() < 40
							|| stud.getmaths() < 40 || stud.getscience() < 40
							|| stud.getsocial() < 40) {

						studentresult = false;

					} else {

						studentresult = true;
					}
				}
			}

			result store = new result(total, avg, studentresult, getname);
			req.setAttribute("res", store);

		}

		req.getRequestDispatcher("main.jsp").include(req, resp);
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		req.getRequestDispatcher("main.jsp").include(req, resp);
	
	}

}
