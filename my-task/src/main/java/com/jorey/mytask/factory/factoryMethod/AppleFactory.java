package com.jorey.mytask.factory.factoryMethod;

import com.jorey.mytask.factory.Apple;
import com.jorey.mytask.factory.IFruit;

public class AppleFactory implements IFruitFactory{
    public IFruit create(){
        return new Apple();
    }
}
