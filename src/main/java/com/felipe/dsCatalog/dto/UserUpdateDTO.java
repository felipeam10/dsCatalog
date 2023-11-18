package com.felipe.dsCatalog.dto;

import com.felipe.dsCatalog.services.validation.UserInsertValid;
import com.felipe.dsCatalog.services.validation.UserUpdateValid;

/* Esta anotation vai verificar se o email inserido já existe no banco de dados */
@UserUpdateValid
public class UserUpdateDTO extends UserDTO{}
