package cn.xxyangyoulin.interceptor;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

    public HelloAction() {
        System.out.println("helloAction init");
    }

    @Override
    public String execute() throws Exception {
        System.out.println("HelloAction ok");
        return super.execute();
    }
}
