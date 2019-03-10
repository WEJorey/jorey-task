package com.jorey.mytask.singleton.lazy;

public class LazySingleton {

    public static  LazySingleton LAZY_SINGLETON=null;

    private LazySingleton(){

    }

    public LazySingleton getInstance(){
        if(null==LAZY_SINGLETON){
            LAZY_SINGLETON=new LazySingleton();
        }
        return LAZY_SINGLETON;
    }
}
