package com.vpdevs;

public abstract class ViewDecorator implements View {

    View declaredView;

    public ViewDecorator(View declaredView) {
        this.declaredView = declaredView;
    }

    @Override
    public void draw() {
        declaredView.draw();
    }
}
