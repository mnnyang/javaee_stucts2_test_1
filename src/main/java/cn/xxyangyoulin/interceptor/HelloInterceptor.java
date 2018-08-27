package cn.xxyangyoulin.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class HelloInterceptor extends AbstractInterceptor {
    /**
     * Tomcat启动就执行结果：
     * Hello Interceptor constructor !
     * Hello Interceptor init !
     *
     * 用户访问HelloAction：
     * helloAction init
     * Hello Interceptor intercept() !
     * HelloAction ok
     * Hello Interceptor end of the business success
     * 再次访问：
     * helloAction init
     * Hello Interceptor intercept() !
     * HelloAction ok
     * Hello Interceptor end of the business success
     */
    public HelloInterceptor() {
        System.out.println("Hello Interceptor constructor !");
    }

    @Override
    public void destroy() {
        System.out.println("Hello Interceptor destroy !");
    }

    @Override
    public void init() {
        System.out.println("Hello Interceptor init !");
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("Hello Interceptor intercept() !");

        /*execute action business or next interceptor*/
        String resultFlag = actionInvocation.invoke();
        /*执行后面的所有Action和Interceptor之后，再返回到这里 栈方式调用*/
        /*resultFlag将会拿到 执行结果*/

        System.out.println("Hello Interceptor end of the business "+resultFlag);

        return resultFlag;
    }
}
