package app.model;

public abstract class AppBaseModel {
    String typeModel;

    public AppBaseModel(String typeModel) {
        this.typeModel = typeModel;
    }

    public abstract double getResult();

}

