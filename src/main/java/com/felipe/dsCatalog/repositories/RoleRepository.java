package com.felipe.dsCatalog.repositories;

import com.felipe.dsCatalog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
