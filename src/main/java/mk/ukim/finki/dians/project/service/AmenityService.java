package mk.ukim.finki.dians.project.service;

import mk.ukim.finki.dians.project.model.Amenity;

import java.util.List;
import java.util.Optional;

public interface AmenityService {
    Optional<Amenity> findById(String id);
    List<Amenity> findByType(String type);
    List<Amenity> findByName(String name);
    List<Amenity> search(String text);
}
