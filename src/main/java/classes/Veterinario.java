package classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veterinario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVeterinario;
	
	private String nome;
	
	private String crmv;
	
	private String cpf;
	
	private String rg;
	
	public Veterinario() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdVeterinario() {
		return idVeterinario;
	}

	public void setIdVeterinario(Long idVeterinario) {
		this.idVeterinario = idVeterinario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
