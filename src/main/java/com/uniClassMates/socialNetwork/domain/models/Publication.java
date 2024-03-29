package com.uniClassMates.socialNetwork.domain.models;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Publication {
    private Long id;
    private User autor;
    private String contenido;
    private Date fechaPublicacion;
    private List<Comment> comentarios; // Lista de comentarios asociados a la publicación

}
