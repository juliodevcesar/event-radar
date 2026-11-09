package com.juliocesar.eventradar.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.juliocesar.eventradar.model.Event;

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

}
