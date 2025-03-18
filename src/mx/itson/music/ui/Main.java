/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.music.entidades.Album;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Canción;
import mx.itson.music.enums.Género;

/**
 *
 * @author janto
 */
public class Main {
    
    public static void main(String[] args) {
        
        Artista artista = new Artista();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe el nombre del álbum: ");
        String nombreAlbum = scanner.nextLine();
        artista.setNombre(nombreAlbum);
        
         System.out.println("Escribe el sitio web: ");
        String sitioWeb = scanner.nextLine();
        artista.setSitioWeb(sitioWeb);
         
         
         
        Album a = new Album();
        a.setArtista(artista);
        a.setNombre("Debí tirar más fotos");
        a.setLanzamiento(2025);
        a.setGénero(Género.OTRO);
        
        List<Canción> canciones = new ArrayList<>();
        
        Canción canción1 = new Canción();
        canción1.setNombre("DTMF");
        canción1.setOrden(1);
        canción1.setDuración(237);
        
        Canción canción2 = new Canción();
        canción2.setNombre("Mudanza");
        canción2.setOrden(2);
        canción2.setDuración(213);
        
        
       canciones.add(canción1);
       canciones.add(canción2);
       
       a.setCanciones(canciones);
       
       for(Canción c : a.getCanciones()){
           System.out.println(c.getOrden());
           System.out.println(c.getNombre());
           System.out.println(c.getDuración());
       }
  
    }
}
