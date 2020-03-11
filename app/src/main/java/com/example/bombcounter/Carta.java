package com.example.bombcounter;

public class Carta {
    //Atributos
    private String Carta_Nombre;
    private String Carta_TiempoJuego;
    private String Carta_Descripcion;
    private String Carta_AutoJuego;
    private String Carta_Accion;
    private String Carta_TerminaTurno;
    private String Carta_Cantidad;

    //Constructor
    public Carta(String Carta_Nombre, String Carta_TiempoJuego, String Carta_Descripcion,
                 String Carta_AutoJuego, String Carta_TerminaTurno, String Carta_Accion,
                 String Carta_Cantidad )
    {
        this.Carta_Nombre = Carta_Nombre;
        this.Carta_TiempoJuego = Carta_TiempoJuego;
        this.Carta_Descripcion = Carta_Descripcion;
        this.Carta_AutoJuego = Carta_AutoJuego;
        this.Carta_TerminaTurno = Carta_TerminaTurno;
        this.Carta_Accion = Carta_Accion;
        this.Carta_Cantidad = Carta_Cantidad;
    }

    //Metodos
    public void setCarta_Nombre(String Dato)
    {
        Carta_Nombre = Dato;
    }
    public void setCarta_TiempoJuego(String Dato)
    {
        Carta_TiempoJuego = Dato;
    }
    public void setCarta_Descripcion(String Dato)
    {
        Carta_Descripcion = Dato;
    }
    public void setCarta_AutoJuego(String Dato)
    {
        Carta_AutoJuego = Dato;
    }
    public void setCarta_TerminaTurno(String Dato)
    {
        Carta_TerminaTurno = Dato;
    }
    public void setCarta_Accion(String Dato)
    {
        Carta_Accion = Dato;
    }
    public void setCarta_Cantidad(String Dato)
    {
        Carta_Cantidad = Dato;
    }
}
