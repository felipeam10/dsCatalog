package com.felipe.dsCatalog.services;

import com.felipe.dsCatalog.dto.EmailDTO;
import com.felipe.dsCatalog.entities.User;
import com.felipe.dsCatalog.repositories.UserRepository;
import com.felipe.dsCatalog.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;
    @Transactional
    public void createRecoverToken(EmailDTO body){

        User user = userRepository.findByEmail(body.getEmail());
        if (user == null) {
            throw new ResourceNotFoundException("Email não encontrado");
        }
    }
    
}
