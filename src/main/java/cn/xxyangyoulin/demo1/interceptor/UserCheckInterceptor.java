package cn.xxyangyoulin.demo1.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UserCheckInterceptor extends AbstractInterceptor {

    @Override
    public void init() {
        super.init();
        System.out.println("was init");
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        ActionContext ac = actionInvocation.getInvocationContext();

        ActionProxy proxy = actionInvocation.getProxy();
        String method = proxy.getMethod();

        if (!"login".equals(method)) {
            Object userInfo = ac.getSession().get("userInfo");

            if (userInfo == null) {
                System.out.println("userinfo == null");
                return "input";
            } else {
                System.out.println("已登录");
                return actionInvocation.invoke();
            }
        } else {
            System.out.println("is login");
            return actionInvocation.invoke();
        }
    }
}
