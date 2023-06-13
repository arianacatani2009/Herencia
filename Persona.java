public class Persona {
    private int ci;
    private String telefono;
    private String nombre;
    private String apellido;
    private String direccion;
    private int anio;
    private String signo;
    private String semestre;
    private int entrena;
    public Persona(int ci, String telefono, String nombre, String apellido, String direccion){
    }

    public Persona(int ci, String telefono, String nombre, String apellido, String direccion,int anio,String signo,String semestre,int entrena) {
        this.ci = ci;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.semestre=semestre;
        this.anio=anio;
        this.signo=signo;
        this.entrena=entrena;
    }

    public int getEntrena() {
        return entrena;
    }

    public void setEntrena(int entrena) {
        this.entrena = entrena;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void caminar(){
        System.out.println("Este es el metodo caminar");
    }
    public  void trabajar(){
        System.out.println("Este es el metodo trabajar");
    }
    public void trabajare(){
        System.out.println("Este es el metodo trabajar empleados");
    }
    public void tramitar(){
        System.out.println("Este es el metodo tramitar");
    }
    public void examinar(){
        System.out.println("Este es el metodo examinar");
    }
    public void curar(){
        System.out.println("Este es el metodo cura");
    }
    public void correr(){
        System.out.println("Este es el metodo corre");
    }
    public void defender(){
        System.out.println("Este es el metodo defiende");
    }
    public void leer(){
        System.out.println("Este es el metodo cura");
    }
    public void estudiar(){
        System.out.println("Este es el metodo corre");
    }
    public void memorizar(){
        System.out.println("Este es el metodo defiende");
    }
}
