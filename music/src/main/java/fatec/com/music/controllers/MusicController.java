package fatec.com.music.controllers;

import java.util.ArrayList;

import fatec.com.music.models.Music;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musics")
public class MusicController {
    private ArrayList<Music> musics = new ArrayList<>();

    // id, name, artist, album, url
    public MusicController() {
        // musics.add(new Music(1L, "Bohemian Rhapsody", "Queen", "A Night at the
        // Opera",
        // "https://www.youtube.com/watch?v=fJ9rUzIMcZQ"));
        // musics.add(new Music(2L, "Stairway to Heaven", "Led Zeppelin", "Led Zeppelin
        // IV",
        // "https://www.youtube.com/watch?v=Q0oTGPtw3KE"));
        // musics.add(new Music(3L, "Hotel California", "Eagles", "Hotel California",
        // "https://www.youtube.com/watch?v=lEcI2dInK_Y"));

        Music m1 = new Music(1L, "Bohemian Rhapsody", "Queen", "A Night at the Opera",
                "https://www.youtube.com/watch?v=fJ9rUzIMcZQ");
        Music m2 = new Music(2L, "Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV",
                "https://www.youtube.com/watch?v=Q0oTGPtw3KE");
        Music m3 = new Music(3L, "Hotel California", "Eagles", "Hotel California",
                "https://www.youtube.com/watch?v=lEcI2dInK_Y");
        Music m4 = new Music(4L, "Imagine", "John Lennon", "Imagine",
                "https://www.youtube.com/watch?v=YkgkThdzX-8");

        Music m5 = new Music(5L, "Smells Like Teen Spirit", "Nirvana", "Nevermind",
                "https://www.youtube.com/watch?v=hTWKbfoikeg");

        Music m6 = new Music(6L, "Billie Jean", "Michael Jackson", "Thriller",
                "https://www.youtube.com/watch?v=Zi_XLOBDo_Y");

        Music m7 = new Music(7L, "Sweet Child O' Mine", "Guns N' Roses", "Appetite for Destruction",
                "https://www.youtube.com/watch?v=1w7OgIMMRc4");

        Music m8 = new Music(8L, "Like a Rolling Stone", "Bob Dylan", "Highway 61 Revisited",
                "https://www.youtube.com/watch?v=IwOfCgkyEj0");

        Music m9 = new Music(9L, "Back in Black", "AC/DC", "Back in Black",
                "https://www.youtube.com/watch?v=pAgnJDJN4VA");

        Music m10 = new Music(10L, "Hey Jude", "The Beatles", "Single",
                "https://www.youtube.com/watch?v=A_MjCqQoLLA");

        musics.add(m1);
        musics.add(m2);
        musics.add(m3);
        musics.add(m4);
        musics.add(m5);
        musics.add(m6);
        musics.add(m7);
        musics.add(m8);
        musics.add(m9);
        musics.add(m10);
    }

    @GetMapping("/{id}")
    public Music getProductById(@PathVariable Long id) {
        return musics.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    @GetMapping
    public ArrayList<Music> getMusics() {
        return musics;
    }
}
