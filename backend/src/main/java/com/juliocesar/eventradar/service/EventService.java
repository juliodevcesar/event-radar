package com.juliocesar.eventradar.service;

import org.springframework.stereotype.Service;
import com.juliocesar.eventradar.repository.EventRepository;
import java.util.List;
import com.juliocesar.eventradar.model.Event;
import java.util.Optional;

@Service
public class EventService {
	
	private final EventRepository eventRepository;
	
	public EventService(EventRepository eventRepository) {		
		this.eventRepository = eventRepository; 
	
	}

	public List<Event> listarEventos() {
		return eventRepository.findAll();
	}
	
	public Event salvarEvento(Event evento) {
		return eventRepository.save(evento);
		
	}
	
	public Optional<Event> buscarEventosPorId(Long id) {
		return eventRepository.findById(id);
	}
	
}
 