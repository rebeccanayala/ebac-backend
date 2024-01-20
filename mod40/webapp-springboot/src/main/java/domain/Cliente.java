package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_CLIENTE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "NOME", nullable = false)
    private String nome;
    
    @Columns(name = "CPF", unique = true, nullable = false, length = 14) // CPF como String
    private String cpf;
    
    @Column(name = "TEL", nullable = false, length = 20) // Número de telefone como String
    private String tel;
    
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;
    
    @Column(name = "ENDERECO", nullable = false, length = 255)
    private String endereco;
    
    @Column(name = "NUMERO", nullable = false)
    private Integer numero;
    
    @Column(name = "CIDADE", nullable = false, length = 100)
    private String cidade;
    
    @Columns(name = "ESTADO", nullable = false, length = 100)
    private String estado;

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}

