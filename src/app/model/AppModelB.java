package app.model;

import app.utils.Constants;

public class AppModelB extends AppBaseModel{
    double variantFirst;
    double variantSecond;

    public AppModelB(String typeModel, double variantFirst, double variantSecond) {
        super(typeModel);
        this.variantFirst = variantFirst;
        this.variantSecond = variantSecond;
    }

    @Override
    public double getResult() {
        return ((variantFirst + variantSecond) * Constants.coef);
    }
}
