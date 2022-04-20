package com.vpdevs;

public class CircularImageViewDecorator extends ViewDecorator {


    public CircularImageViewDecorator(View declaredView) {
        super(declaredView);
    }

    @Override
    public void draw() {
        super.draw();
        addCircleTmageView(declaredView);
        addCircleBorder(declaredView);
    }

    private void addCircleTmageView(View view) {
        System.out.println("add circle to " + getClassName(view));
    }

    private void addCircleBorder(View view) {
        System.out.println("add border color to " + getClassName(view));
    }

    private String getClassName(View view) {
        return view.getClass().getSimpleName();
    }

}
