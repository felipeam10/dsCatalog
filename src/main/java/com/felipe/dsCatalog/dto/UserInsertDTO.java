package com.felipe.dsCatalog.dto;

import com.felipe.dsCatalog.services.validation.UserInsertValid;

/* Esta anotation vai verificar se o email inserido já existe no banco de dados */
@UserInsertValid
public class UserInsertDTO extends UserDTO{

    private String password;

    public UserInsertDTO(){
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
