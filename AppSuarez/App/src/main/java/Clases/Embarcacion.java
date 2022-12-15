package Clases;

public class Embarcacion {
    private String Nombre = "0";
    private String Matricula = "0";
    private String Zarpe = "0"; 
    private String Certificado = "0"; 
    private String Puerto_E = "0";
    private String Pesca = "0";
    private String Extintores = "0";
    private String Arqueo = "0";
    private String Eslora = "0";
    private String Manga = "0";
    private String Casco = "0";
    private String Motor = "0";
    private String Origen = "0";
    private String Tripulantes = "0";
    public Embarcacion(){}
    public  Embarcacion(String Matricula, String Nombre, String Zarpe, String Certificado, String Puerto_E)
    {
        this.Matricula = Matricula;
        this.Nombre = Nombre;
        this.Zarpe = Zarpe;
        this.Certificado = Certificado;
        this.Puerto_E = Puerto_E;
    }
    public String getMatricula()
    {
        return this.Matricula;
    }

    public void setMatricula(String Matricula)
    {
        this.Matricula = Matricula;
    }
    public String getNombre()
    {
        return this.Nombre;
    }

    public void setNombre(String Nom)
    {
        this.Nombre = Nom;
    }
    public String getZarpe()
    {
        return this.Zarpe;
    }

    public void setZarpe(String Zarpe)
    {
        this.Zarpe = Zarpe;
    }
    public String getCertificado()
    {
        return this.Certificado;
    }

    public void setCertificado(String Certificado)
    {
        this.Certificado = Certificado;
    }
    public String getPuerto_E()
    {
        return this.Puerto_E;
    }

    public void setPuerto_E(String Puerto_E)
    {
        this.Puerto_E = Puerto_E;
    }
}
