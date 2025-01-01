/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Fabrizio
 */
public class Cliente {
    //Atributos
    public int id_cli;
    public String nombre_cli;
    public String apellido_cli;
    public String direccion_principal_cli;
    public String direccion_secundaria_cli;
    public int telefono_principal_cli;
    public int telefono_secundario_cli;
    public String correoElectronico_cli;
    
    //Constructor vacio
    public Cliente() {
    }

    //Constructor paramtrizado
    public Cliente(int id_cli, String nombre_cli, String apellido_cli, String direccion_principal_cli, String direccion_secundaria_cli, int telefono_principal_cli, int telefono_secundario_cli, String correoElectronico_cli) {
        this.id_cli = id_cli;
        this.nombre_cli = nombre_cli;
        this.apellido_cli = apellido_cli;
        this.direccion_principal_cli = direccion_principal_cli;
        this.direccion_secundaria_cli = direccion_secundaria_cli;
        this.telefono_principal_cli = telefono_principal_cli;
        this.telefono_secundario_cli = telefono_secundario_cli;
        this.correoElectronico_cli = correoElectronico_cli;
    }

    //Metodos Getter & Setter
    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getApellido_cli() {
        return apellido_cli;
    }

    public void setApellido_cli(String apellido_cli) {
        this.apellido_cli = apellido_cli;
    }

    public String getDireccion_principal_cli() {
        return direccion_principal_cli;
    }

    public void setDireccion_principal_cli(String direccion_principal_cli) {
        this.direccion_principal_cli = direccion_principal_cli;
    }

    public String getDireccion_secundaria_cli() {
        return direccion_secundaria_cli;
    }

    public void setDireccion_secundaria_cli(String direccion_secundaria_cli) {
        this.direccion_secundaria_cli = direccion_secundaria_cli;
    }

    public int getTelefono_principal_cli() {
        return telefono_principal_cli;
    }

    public void setTelefono_principal_cli(int telefono_principal_cli) {
        this.telefono_principal_cli = telefono_principal_cli;
    }

    public int getTelefono_secundario_cli() {
        return telefono_secundario_cli;
    }

    public void setTelefono_secundario_cli(int telefono_secundario_cli) {
        this.telefono_secundario_cli = telefono_secundario_cli;
    }

    public String getCorreoElectronico_cli() {
        return correoElectronico_cli;
    }

    public void setCorreoElectronico_cli(String correoElectronico_cli) {
        this.correoElectronico_cli = correoElectronico_cli;
    }
    
    //Salida
    //To code here
}
