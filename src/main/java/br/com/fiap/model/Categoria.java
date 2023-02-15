package br.com.fiap.model;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIAS",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"NOME"},
                        name = "UK_NOME_CATEGORIA")
        },
        indexes = {
                @Index(
                        columnList = "NOME",
                        name = "IDX_NOME_CATEGORIA"
                )
        }
)
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CATEGORIAS")
    @SequenceGenerator(name = "SEQ_CATEGORIAS", sequenceName = "SEQ_CATEGORIAS", allocationSize = 1, initialValue = 1)
    private Long id;

    @Column(name = "NOME")
    private String nome;


    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public Categoria(String nome) {
        this.nome = nome;
    }


    public Categoria() {
    }

    public Long getId() {
        return id;
    }

    public Categoria setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Categoria setNome(String nome) {
        this.nome = nome;
        return this;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Categoria{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria categoria)) return false;
        return getNome().equals(categoria.getNome());
    }

    @Override
    public int hashCode() {
        return getNome().hashCode();
    }

}
