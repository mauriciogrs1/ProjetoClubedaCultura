package br.com.clubedacultura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table (name="tb_usuario")
public class Usuario {
	
	@Column (name = "id_usuario")
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;

	@Column (name= "nome_usuario")
	@NotNull
	private String nome;
	
	@Column (name= "sobrenome_usuario")
	@NotNull
	private String sobrenome;
	
	@Column (name= "email_usuario")
	@NotNull
	private String email;
	
	@Column (name= "senha_usuario")
	@NotNull
	//@Size(min= 6 ,max= 20)
	private String senha;
	
	@Column (name= "tipo_usuario")
	@NotNull
	private String tipo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
