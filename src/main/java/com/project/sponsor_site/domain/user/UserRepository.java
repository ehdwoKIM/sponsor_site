package com.project.sponsor_site.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

// <Entity, Entity-id>
public interface UserRepository extends JpaRepository<com.project.sponsor_site.domain.user.User, Integer> {
    com.project.sponsor_site.domain.user.User findByUsername(String username);
}
