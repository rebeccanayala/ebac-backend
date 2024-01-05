package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
    @SequenceGenerator(name = "marca_seq", sequenceName = "sq_marca", initialValue = 10,
            allocationSize = 1)
    private Long id;

    @Column(name = "nome", length = 30, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_carro_fk",
            foreignKey = @ForeignKey(name = "fk_carro_marca"),
            referencedColumnName = "id", nullable = false
    )
    private Carro carro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
