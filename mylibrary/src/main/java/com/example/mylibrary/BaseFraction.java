package com.example.mylibrary;

import ohos.aafwk.ability.fraction.Fraction;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.LayoutScatter;

public abstract class BaseFraction extends Fraction {
    @Override
    protected Component onComponentAttached(LayoutScatter scatter, ComponentContainer container, Intent intent) {
        ComponentContainer componentContainer = (ComponentContainer) scatter.parse(layoutId(), container, false);
        return componentContainer;
    }

    protected abstract int layoutId();

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
