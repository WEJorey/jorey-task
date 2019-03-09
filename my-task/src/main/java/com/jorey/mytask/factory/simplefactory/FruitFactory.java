package com.jorey.mytask.factory.simplefactory;

import com.jorey.mytask.factory.Apple;
import com.jorey.mytask.factory.IFruit;

public class FruitFactory {
    public IFruit create(String name){
        if("apple".equals(name)){
            return new Apple();
        }else{
            return null;
        }
    }
}
