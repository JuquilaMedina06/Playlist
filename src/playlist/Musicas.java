/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist;

/**
 *
 * @author juqui
 */
public class Musicas {
    String title;
    String album;
    String date;
    int time;
    
    
    /* public void Musicas(String _title, String _album, String _date, int _time){
        title=_title;
        album=_album;
        date=_date;
        time=_time;
    }*/
    
    public Musicas(String title, String album, String date, int time){
        this.title=title;
        this.album=album;
        this.date=date;
        this.time=time;           
    }
    
    public void ShowPlaylist(){
        System.out.println("Title "+title);
        System.out.println("Album "+album);
        System.out.println("Date "+date);
        System.out.println("Time "+time);     
    }
}
