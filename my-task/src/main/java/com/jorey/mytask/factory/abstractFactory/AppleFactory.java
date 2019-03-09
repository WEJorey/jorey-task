package com.jorey.mytask.factory.abstractFactory;

import com.jorey.mytask.factory.Apple;
import com.jorey.mytask.factory.IFruit;

public class AppleFactory implements IFruitFactory {
    @Override
    public IFruit create() {
        return new Apple();
    }
}
