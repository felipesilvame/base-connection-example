public class Libro {
    private String id;
    private String nombre;
    private String editorial;
    private String genero;
    private String photo;
    private int author;

    public Libro(String id, String nombre, String editorial, String genero,
        String photo, int author){
        this.id = id;
        this.author = author;
        this.editorial = editorial;
        this.genero = genero;
        this.photo = photo;
        this.nombre = nombre;

    }

    public String getId(){
        return id;
    }

    public int getAuthor() {
        return author;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPhoto() {
        return photo;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
