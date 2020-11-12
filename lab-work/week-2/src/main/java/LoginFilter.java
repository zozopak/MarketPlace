import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter", urlPatterns = "/login")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String name = req.getParameter("userName");
        String password = req.getParameter("userPass");
        if (name != null) {
            if (RegisterService.getInstance().login(name, password)) {
                chain.doFilter(req, resp);
            } else {
                req.getRequestDispatcher("register.html").include(req, resp);
            }
        } else {
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }
}
