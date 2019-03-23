package com.jorey.mytask.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        //jdk动态代理测试
        VehicleObject object = new JDKDynamicProxy(new RealVehicle()).getProxy();
        object.doSomething();
    }
}
