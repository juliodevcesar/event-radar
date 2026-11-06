package com.juliocesar.eventradar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.juliocesar.eventradar.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
