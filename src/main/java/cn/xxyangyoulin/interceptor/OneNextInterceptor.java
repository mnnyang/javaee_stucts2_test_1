package cn.xxyangyoulin.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class OneNextInterceptor implements Interceptor {
    @Override
    public void destroy() {
        System.out.println("OneNextInterceptor destroy");
    }

    @Override
    public void init() {
        System.out.println("OneNextInterceptor init");
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("OneNextInterceptor intercept");
        String invoke = actionInvocation.invoke();
        System.out.println("OneNextInterceptor intercept completed");
        return invoke;
    }
}
