package com.selimhatipoglu.deneme;

class araba{

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getMotor() {
        return motor;
    }
    public void setMotor(int motor) {
        this.motor = motor;
    }
    public int getKapı() {
        return kapı;
    }
    public void setKapı(int kapı) {
        this.kapı = kapı;
    }
    public int getTeker() {
        return teker;
    }
    public void setTeker(int teker) {
        this.teker = teker;
    }
    private String model;
    private int motor;
    private int kapı;
    private int teker;

    public araba(String model, int motor, int kapı, int teker) {
        super();
        this.model = model;
        this.motor = motor;
        this.kapı = kapı;
        this.teker = teker;
    }



}

class BMW extends araba{

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getMotor() {
        return super.getMotor();
    }

    @Override
    public void setMotor(int motor) {
        super.setMotor(motor);
    }

    @Override
    public int getKapı() {
        return super.getKapı();
    }

    @Override
    public void setKapı(int kapı) {
        super.setKapı(kapı);
    }

    @Override
    public int getTeker() {
        return super.getTeker();
    }

    @Override
    public void setTeker(int teker) {
        super.setTeker(teker);
    }



    public BMW(String model, int motor, int kapı, int teker) {
        super(model, motor, kapı, teker);

    }


}

class audi extends araba {

    @Override
    public String getModel() {
        // TODO Auto-generated method stub
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        // TODO Auto-generated method stub
        super.setModel(model);
    }

    @Override
    public int getMotor() {
        // TODO Auto-generated method stub
        return super.getMotor();
    }

    @Override
    public void setMotor(int motor) {
        // TODO Auto-generated method stub
        super.setMotor(motor);
    }

    @Override
    public int getKapı() {
        // TODO Auto-generated method stub
        return super.getKapı();
    }

    @Override
    public void setKapı(int kapı) {
        // TODO Auto-generated method stub
        super.setKapı(kapı);
    }

    @Override
    public int getTeker() {
        // TODO Auto-generated method stub
        return super.getTeker();
    }

    @Override
    public void setTeker(int teker) {
        // TODO Auto-generated method stub
        super.setTeker(teker);
    }

    public audi(String model, int motor, int kapı, int teker) {
        super(model, motor, kapı, teker);
        // TODO Auto-generated constructor stub
    }


}


class mercedes extends araba {

    @Override
    public String getModel() {
        // TODO Auto-generated method stub
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        // TODO Auto-generated method stub
        super.setModel(model);
    }

    @Override
    public int getMotor() {
        // TODO Auto-generated method stub
        return super.getMotor();
    }

    @Override
    public void setMotor(int motor) {
        // TODO Auto-generated method stub
        super.setMotor(motor);
    }

    @Override
    public int getKapı() {
        // TODO Auto-generated method stub
        return super.getKapı();
    }

    @Override
    public void setKapı(int kapı) {
        // TODO Auto-generated method stub
        super.setKapı(kapı);
    }

    @Override
    public int getTeker() {
        // TODO Auto-generated method stub
        return super.getTeker();
    }

    @Override
    public void setTeker(int teker) {
        // TODO Auto-generated method stub
        super.setTeker(teker);
    }

    public mercedes(String model, int motor, int kapı, int teker) {
        super(model, motor, kapı, teker);
        // TODO Auto-generated constructor stub
    }




}







