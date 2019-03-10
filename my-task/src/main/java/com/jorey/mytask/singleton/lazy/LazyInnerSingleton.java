package com.jorey.mytask.singleton.lazy;

//静态内部类单例模式
//
public class LazyInnerSingleton {
    private LazyInnerSingleton(){

    }
    //static为了使单例空间共享
    //final保证这个方法不会被重写
    public static final LazyInnerSingleton getInstance(){
        return Holder.lazySingleton;
    }

    private static class Holder{
        private static final LazyInnerSingleton lazySingleton = new LazyInnerSingleton();
    }
}
