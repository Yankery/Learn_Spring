package com.pluralsight.springboot.tickets.events;

import java.util.List;
import java.util.Optional;

public class VenueRepository {
    private final List<Venue> venues = List.of(
            new Venue(201, "Global Office", "Test Street", "NY", "USA"),
            new Venue(202, "Sea Hotel", "Run Street", "LA", "USA")
    );

    public Optional<Venue> findById(int id) {
        return venues.stream().filter(venue -> venue.id() == id).findAny();
    }
}
