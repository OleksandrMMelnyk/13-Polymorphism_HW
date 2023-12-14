package app.controller;

import app.view.AppView;
import app.model.AppModelA;
import app.model.AppModelB;
import app.utils.Rounder;

public class AppController {

    public static void getCalculate() {
        AppView view = new AppView();
        int modelType = view.getData();
        double[] variant = view.getVariant();
        String typeModel;
        double variantFirst;
        double variantSecond;
        String result;
        String output;

        switch (modelType) {
            case 1: {
                typeModel = "Device MODEL_A";
                variantFirst = variant[0];
                variantSecond = variant[1];
                AppModelA model = new AppModelA(typeModel, variantFirst, variantSecond);
                result = Rounder.roundValue(model.getResult());
                output = "DEVICE: " + typeModel + ";" +
                        "\nTOTAL RESULT: " + result + ".";
                view.getOutput(output);
            }

            case 2: {
                typeModel = "Device MODEL_B";
                variantFirst = variant[0];
                variantSecond = variant[1];
                AppModelB model = new AppModelB(typeModel, variantFirst, variantSecond);
                result = Rounder.roundValue(model.getResult());
                output = "DEVICE: " + typeModel + ";" +
                        "\nTOTAL RESULT: " + result + ".";
                view.getOutput(output);
            }
        }
    }
}

