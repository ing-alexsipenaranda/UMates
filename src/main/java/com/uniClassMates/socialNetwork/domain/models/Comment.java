package com.uniClassMates.socialNetwork.domain.models;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class Comment {
    private Long id;
    private User autor;
    private String contenido;
    private Date fechaComentario;
    private List<ResponseComment> respuestas;
}
