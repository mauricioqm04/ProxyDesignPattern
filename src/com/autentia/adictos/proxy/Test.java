package com.autentia.adictos.proxy;

public class Test {
    
    public static void main(String[] args) {
        // Creamos ahora la factoria
        FactoryManager factory = new FactoryManager();
        
        // Usamos la factoria para crear un Proxy sobre UserManagerImpl
        Manager manager = factory.createManager(UserManagerImpl.class);
        
        Object obj = new Object();
        // Invocamos a los métodos:
        manager.save(obj);
        manager.remove(1);
        
    }
 
}