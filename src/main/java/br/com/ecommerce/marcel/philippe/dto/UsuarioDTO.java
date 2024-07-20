package br.com.ecommerce.marcel.philippe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private String dataCadastro;

}
