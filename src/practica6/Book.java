/*  
Tarea: Práctica 6 - Menú
Alumno: Plascencia Lozano Daniel Eduardo
Registro: 21110156
Grado Y Grupo: 3° - P
Turno: Matutino
Fecha de Entrega: Jueves, 5 de Mayo de 2022
*/

public class Book {
    private int ID;
    private int paginas;
    private String nombre;
    private String genero;

    public Book(int ID, int paginas, String nombre, String genero) {
        this.ID = ID;
        this.paginas = paginas;
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public Book(){
        
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public int getNumPaginas() {
        return paginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.paginas = numPaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    } 
}
