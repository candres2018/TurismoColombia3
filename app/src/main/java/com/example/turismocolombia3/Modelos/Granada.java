package com.example.turismocolombia3.Modelos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Granada {

    @SerializedName("nombre_del_sitio_turistico")
    @Expose
    private String nombre_del_sitio_turistico;
    @SerializedName("descripci_n")
    @Expose
    private String descripci_n;
    @SerializedName("ubicaci_n")
    @Expose
    private String ubicaci_n;


    public Granada(String nombre_del_sitio_turistico,
                   String descripci_n,
                   String ubicaci_n)

    {
        super();
        this.nombre_del_sitio_turistico=nombre_del_sitio_turistico;
        this.descripci_n=descripci_n;
        this.ubicaci_n=ubicaci_n;
    }

    public String getNombre_del_sitio_turistico() {
        return nombre_del_sitio_turistico;
    }

    public void setNombre_del_sitio_turistico(String nombre_del_sitio_turistico) {
        this.nombre_del_sitio_turistico = nombre_del_sitio_turistico;
    }

    public String getDescripci_n() {
        return descripci_n;
    }

    public void setDescripci_n(String descripci_n) {
        this.descripci_n = descripci_n;
    }

    public String getUbicaci_n() {
        return ubicaci_n;
    }

    public void setUbicaci_n(String ubicaci_n) {
        this.ubicaci_n = ubicaci_n;
    }
}
