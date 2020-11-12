import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("userName");
        String password = request.getParameter("userPass");
        RegisterService.getInstance().addUser(name, password);
        request.getRequestDispatcher("/register.html").forward(request, response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("hello world");
    }
}

