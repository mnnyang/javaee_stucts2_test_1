package cn.xxyangyoulin.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class PageAction implements RequestAware, SessionAware {
    public String page1() {
        System.out.println("page1");

        return "page1";
    }

    public String page2() {
        System.out.println("page2");



        //struts 对数据操作，直接拿到servletApi,
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();

        ServletContext servletContext = ServletActionContext.getServletContext();
        request.setAttribute("key", "value");
        session.setAttribute("sessionKey", "sessionValue");
        servletContext.setAttribute("appKey", "appValue");


        String realPath = servletContext.getRealPath("/");
        String contextPath = request.getContextPath();

        System.out.println("realPath="+realPath);
        System.out.println("contextPath="+contextPath);

        return "page2";
    }

    private Map<String, Object> request;
    private Map<String, Object> session;

    @Override
    public void setRequest(Map<String, Object> map) {
        this.request = map;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
