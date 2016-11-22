package com.example.user.myapplication;

/**
 * Created by Mariord on 18/11/2016.
        */
public class ActivityComputadoras {

    private String discoduro;
    private String procesador;
    private String ram;
    private String precio;
    private int img;

    public ActivityComputadoras(String discoduro, String procesador, String ram, String precio, int img) {
        this.discoduro = discoduro;
        this.procesador = procesador;
        this.ram = ram;
        this.precio = precio;
        this.img = img;
    }




    public ActivityComputadoras(){

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(String discoduro) {
        this.discoduro = discoduro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
