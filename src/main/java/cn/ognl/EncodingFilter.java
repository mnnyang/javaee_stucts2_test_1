package cn.ognl;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * author: xxyangyoulin
 */
public class EncodingFilter implements Filter {

    private String charSet;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        this.charSet = filterConfig.getInitParameter("charset");

        System.out.println(this.charSet);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(this.charSet);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
