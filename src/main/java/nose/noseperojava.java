package com.sparky.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Company {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String ruc;
    private LocalDate joinedAt = LocalDate.now();
    private boolean active = true;

    // getters & setters
    // (omito por brevedad; puedes generar con IDE o usar Lombok @Data)
    // --- getters/setters below ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRuc() { return ruc; }
    public void setRuc(String ruc) { this.ruc = ruc; }
    public LocalDate getJoinedAt() { return joinedAt; }
    public void setJoinedAt(LocalDate joinedAt) { this.joinedAt = joinedAt; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
