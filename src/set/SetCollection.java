package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class SetCollection {

  public static void main(String[] args) {
    addUsuarios();
  }
  private static void addUsuarios() {
    Set<Usuario> usuarios = new HashSet<>();
    usuarios.add(new Usuario ("Beatriz", "234949303-10", 10));
    usuarios.add(new Usuario ("BeatriZ", "403204023-01", 34));
    usuarios.add(new Usuario ("Daniel", "237483421-43", 15));

    List<Usuario> usuariosOrdenado = usuarios.stream()
        .sorted(Comparator.comparing(Usuario::getIdade))
        .collect(Collectors.toList());


    System.out.println(usuariosOrdenado);

    usuariosOrdenado.sort(Comparator.comparing(Usuario::getNome, String.CASE_INSENSITIVE_ORDER));

    System.out.println(usuariosOrdenado);

  }

  static class Usuario {
    private String nome;
    private String cpf;
    private int idade;

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getCpf() {
      return cpf;
    }

    public void setCpf(String cpf) {
      this.cpf = cpf;
    }

    public int getIdade() {
      return idade;
    }

    public void setIdade(int idade) {
      this.idade = idade;
    }

    public Usuario (String nome, String cpf, int idade){
      this.nome = nome;
      this.cpf = cpf;
      this.idade = idade;


    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Usuario usuario = (Usuario) o;
      return nome.equals(usuario.nome);
    }

    @Override
    public int hashCode() {
      return Objects.hash(nome);
    }

    @Override
    public String toString() {
      return "Usuario{" +
          "nome='" + nome + '\'' +
          ", cpf='" + cpf + '\'' +
          ", idade=" + idade +
          '}';
    }
  }
}
