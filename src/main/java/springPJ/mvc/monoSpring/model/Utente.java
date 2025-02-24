package springPJ.mvc.monoSpring.model;


import java.sql.Date;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name = "utenti")
public class Utente {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremento
    private int id;

    @Column(length = 30, nullable = false)
    @NotNull(message = "Il nome è obbligatorio")
    @NotBlank(message = "Il nome è obbligatorio")
    private String nome;

    @Column(length = 30, nullable = false)
    @NotNull(message = "Il cognome è obbligatorio")
    @NotBlank(message = "Il cognome è obbligatorio")
    private String cognome;

    @Column(length = 30, nullable = false)
    @NotNull(message = "L'email è obbligatoria")
    @NotBlank(message = "L'email è obbligatoria")
    private String email;

    @Column(length = 30, nullable = false)
    @NotNull(message = "Il sesso è obbligatorio")
    @NotBlank(message = "Il sesso è obbligatorio")
    private String sesso;

    @Column(length = 30, nullable = false)
    @NotNull(message = "La posizione lavorativa è obbligatoria")
    @NotBlank(message = "La posizione lavorativa è obbligatoria")
    private String posizioneLavorativa;

    @Column(nullable = false)
    @NotNull(message = "La data è obbligatoria")
    private Date dataNascita;


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	
	
	public String getPosizioneLavorativa() {
		return posizioneLavorativa;
	}
	public void setPosizioneLavorativa(String posizioneLavorativa) {
		this.posizioneLavorativa = posizioneLavorativa;
	}
	
	
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

}
