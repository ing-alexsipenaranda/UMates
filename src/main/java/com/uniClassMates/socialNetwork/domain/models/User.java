package com.uniClassMates.socialNetwork.domain.models;

import lombok.Data;

@Data
public class User {

        private Long id;
        private String nombreUsuario;
        private String correoElectronico;
        private String contrasena;
        private String nombreCompleto;
        private String fechaNacimiento;
        private String genero;
        private String ubicacion;
        private String biografia;
        private String fotoPerfil; //Almacenar la URL
        private String fechaRegistro;

}
