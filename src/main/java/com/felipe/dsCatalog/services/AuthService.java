package com.felipe.dsCatalog.services;

import com.felipe.dsCatalog.dto.*;
import com.felipe.dsCatalog.entities.Role;
import com.felipe.dsCatalog.entities.User;
import com.felipe.dsCatalog.projections.UserDetailsProjection;
import com.felipe.dsCatalog.repositories.RoleRepository;
import com.felipe.dsCatalog.repositories.UserRepository;
import com.felipe.dsCatalog.services.exceptions.DataBaseException;
import com.felipe.dsCatalog.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AuthService {


    public void createRecoverToken(EmailDTO body){

    }
    
}
