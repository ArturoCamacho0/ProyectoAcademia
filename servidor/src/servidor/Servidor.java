package servidor;



public class Servidor{
    public static void main(String[] args) {
        Querys query = new Querys();
        
        query.select("SELECT * FROM profesor_candidato", 4);
    }
}