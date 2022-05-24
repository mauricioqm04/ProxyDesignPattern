package com.autentia.adictos.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
 
public class ManagerHandler implements InvocationHandler {
    
    Manager realManager = null;
    
    public ManagerHandler(Manager realManager) {
        this.realManager = realManager;
    }
    
    /* Este es el método callback que será invocado previamente a cada método de          los managers. */
    public Object invoke(Object proxy, Method method, Object[] args) 
        throws Throwable {        
        
        System.out.println("A Manager is being invoked:"+method.getName());
        
        // Continuamos invocando al Manager real.
        return method.invoke(realManager,args);
    }
 
}
