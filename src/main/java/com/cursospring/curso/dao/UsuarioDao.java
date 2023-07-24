package com.cursospring.curso.dao;

import com.cursospring.curso.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    void eliminar(Long id);

    List<Usuario> getUsuarios();

    void registrar(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
}
