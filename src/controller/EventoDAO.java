package controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import model.Evento;

import utils.JpaUtil;
import utils.TipoEvento;

public class EventoDAO {

	static EntityManagerFactory emf=	JpaUtil.getEntityManagerFactory();
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evento primo = new Evento("primoEv", LocalDate.of(2022, 1, 1), "breve descrione evento", TipoEvento.PUBBLICO, 100);
		//save(primo);
		getById(1l);

	}
	public static void save(Evento e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Evento aggiuto");
	}
	public static Evento getById(Long id) {
		em.getTransaction().begin();
		Evento e = em.find(Evento.class, id);
		em.getTransaction().commit();
		System.out.println("Trovato: " + e);
		return e;
	}
	public static void delete(Evento e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Evento Rimosso");
	}
	public static void refresh() {
		em.getTransaction().begin();
		em.refresh(em);
		em.getTransaction().commit();
		System.out.println("Refresh effettuato");
	}

}
