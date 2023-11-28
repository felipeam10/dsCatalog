package com.felipe.dsCatalog.dto;

import com.felipe.dsCatalog.services.validation.UserInsertValid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/* Esta anotation vai verificar se o email inserido já existe no banco de dados */
@UserInsertValid
public class UserInsertDTO extends UserDTO{

    @NotBlank(message = "Campo requerido")
    @Size(min = 8, message = "Deve ter no mínimo 8 caracteres")
    /*@Pattern(regexp = ) pode tbm utilizar regex para validação de senhas */
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
