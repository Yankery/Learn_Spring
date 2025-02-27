package com.pluralsight.springboot.tickets.events;


import java.util.List;

public class EventController {
    private final OrganizerRepository organizerRepository;
    private final EventRepository eventRepository;
    private final ProductRepository productRepository;

    public EventController(OrganizerRepository organizerRepository, EventRepository eventRepository, ProductRepository productRepository) {
        this.organizerRepository = organizerRepository;
        this.eventRepository = eventRepository;
        this.productRepository = productRepository;
    }

    public List<Organizer> getOrganizers() {
        return organizerRepository.findAll();
    }

    public List<Event> getEventsByOrganizer(int organizerId) {
        return eventRepository.findByOrganizerId(organizerId);
    }
}
