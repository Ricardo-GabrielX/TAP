package fatec.com.music.models;

public class Music {
    private Long id;
    // private String lyryc;
    public String name;
    public String artist;
    public String album;
    public String url;

    public Music() {

    }

    public Music(Long id, String name, String artist) {
        this.id = id;
        this.name = name;
        this.artist = artist;
    }

    public Music(Long id, String name, String artist, String album, String url) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
