package com.example.architecture_spring.manufacturer;

public class Engine {

    private String model;
    private Integer horsepower;
    private Integer cylinders;
    private Double literage;
    private EngineType engineType;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public void setCylinders(Integer cylinders) {
        this.cylinders = cylinders;
    }

    public Double getLiterage() {
        return literage;
    }

    public void setLiterage(Double literage) {
        this.literage = literage;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

}
