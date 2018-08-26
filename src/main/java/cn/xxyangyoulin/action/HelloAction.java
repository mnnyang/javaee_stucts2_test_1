package cn.xxyangyoulin.action;

import cn.xxyangyoulin.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class HelloAction extends ActionSupport {

    private User user;
    private String age;

    public void setAge(String age) {
        this.age = age;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {

//        System.out.println("username=" + getUser().getName());
//        System.out.println("pwd=" + getUser().getPwd());

        ActionContext context = ActionContext.getContext();
        Map<String, Object> contextMap = context.getContextMap();
        Map<String, Object> session = context.getSession();
        Map<String, Object> application = context.getApplication();

        contextMap.put("key", "value");
        session.put("key", "value");
        application.put("key", "value");

        return "success";
    }
}
