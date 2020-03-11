package com.example.bombcounter;

import java.util.List;

public class Jugador {
    private String Jugador_Nombre;
    private String Jugador_Imagen;
    private int Jugador_Vida = 100;
    private int Jugador_NumCartas = 3;

    //Constructor
    public Jugador(String Jugador_Nombre, String Jugador_Imagen, int Jugador_Vida,
                   int Jugador_NumCartas)
    {
        this.Jugador_Nombre = Jugador_Nombre;
        this.Jugador_Vida = Jugador_Vida;
        this.Jugador_Imagen = Jugador_Imagen;
        this.Jugador_NumCartas = Jugador_NumCartas;
    }

    //Metodos
    public void setJugador_Nombre(String Dato)
    {
        Jugador_Nombre = Dato;
    }
    public void setJugador_Imagen(String Dato)
    {
        Jugador_Imagen = Dato;
    }
    public void setJugador_Vida(int Dato, int Cantidad)
    {
        Jugador_Vida = Dato;
    }
    public void setJugador_Cartas(int Dato)
    {
        Jugador_NumCartas = Dato;
    }

    //Metodos de jugador
    public void Morir(String lugar)
    {
        Jugador_Vida = 0;
        Jugador_NumCartas = 0;
        Jugador_Imagen = lugar;
    }

    public List<Jugador> Perder(List<Jugador> Lista_Jugadores)
    {
        Lista_Jugadores.remove(Lista_Jugadores.contains(Jugador_Nombre));
        return Lista_Jugadores;
    }

    public int Perder_Vida(int Dato, String lugar)
    {
        //Verificar si pierde
        if (Dato >= Jugador_Vida)
        {
            Morir(lugar);
            return 0;
        }
        return  Jugador_Vida - Dato;
    }

    public int Ganar_Vida(int Dato)
    {
        //Verificar si pierde
        if (Dato + Jugador_Vida >= 100)
        {
            return 100;
        }
        return Jugador_Vida + Dato;
    }
}
