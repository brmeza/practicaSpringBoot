package com.cursospring.curso.dao;

import com.cursospring.curso.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void eliminar(Long id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);
    }

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";// se podria where y es a los objetos de la clase no de la tabla
        return entityManager .createQuery(query).getResultList();

    }

}
