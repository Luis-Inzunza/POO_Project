package Clases;

public class Cliente {
    private int barcos = 0;
    private String Nombre = "0";
    private String Ape = "0"; 
    private String Correo = "0"; 
    private String Telefono = "0";
    private String Fecha = "0";
    public Cliente(){}
    public  Cliente(int barcos, String Nombre, String Ape, String Correo, String Telefono, String Fecha)
    {
        this.barcos = barcos;
        this.Nombre = Nombre;
        this.Ape = Ape;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Fecha = Fecha;
    }
    public String getFecha()
    {
        return this.Fecha;
    }

    public void setFecha(String Nom)
    {
        this.Fecha = Nom;
    }

    public int getbarcos()
    {
        return this.barcos;
    }

    public void setbarcos(int barcos)
    {
        this.barcos = barcos;
    }
    public String getNombre()
    {
        return this.Nombre;
    }

    public void setNombre(String Nom)
    {
        this.Nombre = Nom;
    }
    public String getApe()
    {
        return this.Ape;
    }

    public void setApe(String Ape)
    {
        this.Ape = Ape;
    }
    public String getCorreo()
    {
        return this.Correo;
    }

    public void setCorreo(String Correo)
    {
        this.Correo = Correo;
    }
    public String getTelefono()
    {
        return this.Telefono;
    }

    public void setTelefono(String Telefono)
    {
        this.Telefono = Telefono;
    }
}
