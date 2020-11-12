import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "RegisterFilter", urlPatterns = "/register")
public class RegisterFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String name = req.getParameter("userName");
        if (name != null && RegisterService.getInstance().validate(name)) {
            chain.doFilter(req, resp);
        } else {
            req.getRequestDispatcher("register.html").include(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {
    }

}
