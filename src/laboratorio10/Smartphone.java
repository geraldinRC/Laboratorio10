/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio10;

/**
 *
 * @author usuario
 */
public class Smartphone implements Camara, Navegadordeinternet, ReproductordeMusica {
    private String marca;
    private String modelo;
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void tomarfoto() {
        System.out.println("Tomate una foto");
    }

    @Override
    public void grabarvideo() {
        System.out.println("Graba un video");
    }

    @Override
    public void buscar() {
        System.out.println("Realiza una busqueda");
    }

    @Override
    public void actualizar() {
        System.out.println("Se esta actualizando");
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduce una musica");
    }

    @Override
    public void detener() {
        System.out.println(" Ponle stop a la musica");
    }
    
}
