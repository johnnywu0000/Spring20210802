package com.study.spring.case05.proxy.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//動態代理
public class ProxyUtil {
	private Object object;

	public ProxyUtil(Object object) {
		this.object = object;
	}

	public Object getProxy() {
//		類別載入器
		ClassLoader loader = getClass().getClassLoader();
//		目標值實作之介面
		Class[] interfaces = object.getClass().getInterfaces();
//		處理代理之實現
		InvocationHandler handler = (Object proxy, Method method, Object[] args) -> {
			Object result = null;
			try {
//				前置通知
				MyLogger.before(object.getClass(), method.getName(), args);
/*				System.out.println( "前置 Log: " + object.getClass() + ", " + method.getName() + ", " + Arrays.toString(args));	*/
				result = method.invoke(object, args);	//代理呼叫方法
				return result;
			} catch (Exception e) {
//				e.printStackTrace(System.out);
//				例外異常通知
				MyLogger.throwing(object.getClass(), e.getMessage());
/*				System.out.println("例外 Log: " + object.getClass() + ", " + e);	*/
			} finally {
//				後置通知
				MyLogger.after(object.getClass(), method.getName(), result);
/*				System.out.println("後置 Log: " + object.getClass() + ", " + method.getName() + ", " + result);	*/
			}
			return result;
		};
		Object proxyObj = Proxy.newProxyInstance(loader, interfaces, handler);
		return proxyObj;
	}
}
