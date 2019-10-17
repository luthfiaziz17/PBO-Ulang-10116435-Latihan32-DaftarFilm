/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.latihan32.daftarfilm;

/**
 *
 * @author Luthfi
 */
public class PBOUlang10116435Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Daftar Film Sedang Tayang===");
        Film movie = new Film();
        movie.nowPlaying("Venom", "Action, Horror, Sci-fi", 8.5, 120);
        movie.nowPlaying("Angel Has Fallen", "Action", 9.0, 96);
        movie.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
        movie.nowPlaying("Danur", "Horror", 6.0, 100);
    }
    
}
