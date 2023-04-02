package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import utils.TipoEvento;

@Getter
@Setter
@ToString
@Entity
@Table(name = "evento")
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_evento")
	private Long id;
	@Column(name="titolo",nullable=false)
	private String titolo;
	@Column(name="data_evento",nullable=false)
	private LocalDate dataEvento;
	@Column(name="descrizione",nullable=false)
	private String descrizione;
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_evento",nullable=false)
	private TipoEvento tipoEvento;
	@Column(name="num_max_partecipanti",nullable=false)
	private int numMaxParteciapanti;
	public Evento() {}

	public Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numMaxParteciapanti) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numMaxParteciapanti = numMaxParteciapanti;
	}

	public Evento(Long id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numMaxParteciapanti) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numMaxParteciapanti = numMaxParteciapanti;
	}

}
