import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private static final double PAGE_SIZE = 2.0;
    List<String> model = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("userName");
        String page = request.getParameter("page");
        int pageNum = page == null ? 1 : Integer.parseInt(page);
        if(name != null) {
            model.add(name);
        }
        PrintWriter out = response.getWriter();
        out.write("<!DOCTYPE html>");
        out.write("<html lang=\"en\">");
        out.write("<body>");
        for (int i = (int) ((pageNum-1) * PAGE_SIZE); i < Math.min(pageNum * PAGE_SIZE,model.size()); i++) {
            out.write("<p>" + model.get(i) + "</p>");
        }
        out.write("<p>");
        for (int i=0;i<Math.ceil(model.size()/PAGE_SIZE) ;i++){
            out.write("<a href='/login?page=" + (i+1) + "'>"+(i+1)+"</a>&nbsp;");
        }
        out.write("</p>");
        out.write("<a href='/register.html'>Return</a>");
        out.write("</body>");
        out.write("</html>");
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
