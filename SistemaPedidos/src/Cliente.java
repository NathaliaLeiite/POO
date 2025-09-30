public class Cliente{
    String nome;
    String email;

    public Cliente(String nome, String email){
        this.email = email;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}