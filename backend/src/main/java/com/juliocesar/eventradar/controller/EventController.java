package com.juliocesar.eventradar.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.juliocesar.eventradar.model.Event;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.juliocesar.eventradar.service.EventService;

@RestController
@RequestMapping("/eventos")
public class EventController {
	
	private final EventService eventService;
	
	public EventController(EventService eventService) {
		this.eventService = eventService;
	}
	
	@GetMapping
	public List<Event> listarEventos() {
		return eventService.listarEventos();
	}
	
	@PostMapping
	public Event cadastrarEvento(@RequestBody Event evento) {
		return eventService.salvarEvento(evento);
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<Event> buscarEventoPorId(@PathVariable Long id) {
		return eventService.buscarEventosPorId(id)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
}


}
