package com.felipe.dsCatalog.services;

import com.felipe.dsCatalog.dto.EmailDTO;
import com.felipe.dsCatalog.entities.PasswordRecover;
import com.felipe.dsCatalog.entities.User;
import com.felipe.dsCatalog.repositories.PasswordRecoverRepository;
import com.felipe.dsCatalog.repositories.UserRepository;
import com.felipe.dsCatalog.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.UUID;

@Service
public class AuthService {

    @Value("${email.password-recover.token.minutes}")
    private Long tokenMinutes;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordRecoverRepository passwordRecoverRepository;
    @Transactional
    public void createRecoverToken(EmailDTO body){

        User user = userRepository.findByEmail(body.getEmail());
        if (user == null) {
            throw new ResourceNotFoundException("Email não encontrado");
        }

        PasswordRecover entity = new PasswordRecover();
        entity.setEmail(body.getEmail());
        entity.setToken(UUID.randomUUID().toString());
        entity.setExpiration(Instant.now().plusSeconds(tokenMinutes * 60L));
        entity = passwordRecoverRepository.save(entity);
    }
    
}
