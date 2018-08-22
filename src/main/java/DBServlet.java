import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DBServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String[] fields = req.getParameterValues("fields[]");

        UsersCRUD usersCRUD = new UsersCRUD();
        List<User> users = usersCRUD.getAll();

        PrintWriter writer = resp.getWriter();
        writer.print("<table>");
        writer.print("<tr>");
        writer.print("<th>Name</th>");
        writer.print("<th>Email</th>");
        writer.print("</tr>");

        for (User user : users) {
            writer.print("<tr>");
            writer.print("<td>" + user.getName() + "</td>");
            writer.print("<td>" + user.getEmail() + "</td>");
            writer.print("</tr>");
        }

        writer.print("</table>");
        writer.close();
    }
}
