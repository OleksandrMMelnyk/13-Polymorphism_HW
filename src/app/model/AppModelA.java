package app.model;

public class AppModelA extends AppBaseModel {
    double variantFirst;
    double variantSecond;

    public AppModelA(String typeModel, double variantFirst, double variantSecond) {
        super(typeModel);
        this.variantFirst = variantFirst;
        this.variantSecond = variantSecond;
    }

    @Override
    public double getResult() {
        return (variantFirst * variantSecond);
    }
}
