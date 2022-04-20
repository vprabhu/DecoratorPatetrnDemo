package com.vpdevs;

public class ButtonDecorator extends ViewDecorator {


    public ButtonDecorator(View declaredView) {
        super(declaredView);
    }

    @Override
    public void draw() {
        super.draw();
        addButtonBorder(declaredView);
        addClickListener(declaredView);
    }

    private void addButtonBorder(View view) {
        System.out.println("Add borders to " + getClassName(view));
    }

    public void addClickListener(View view) {
        System.out.println("Add listener to " + getClassName(view));
    }

    private String getClassName(View view) {
        return view.getClass().getSimpleName();
    }
}
