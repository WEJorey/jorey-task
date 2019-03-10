package com.jorey.mytask.singleton.regist;

public enum EnumSingleton {
    INSTANCE;
    Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
