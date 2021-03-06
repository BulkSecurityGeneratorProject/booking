package com.pebo.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Amenity entity.
 */
public class AmenityDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 255)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AmenityDTO amenityDTO = (AmenityDTO) o;
        if (amenityDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), amenityDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AmenityDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
