package com.cursospring.curso.controllers;

import com.cursospring.curso.dao.UsuarioDao;
import com.cursospring.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuario(){
        return usuarioDao.getUsuarios();
    }
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("fabian");
        usuario.setApellido("meza");
        usuario.setEmail("fmeza@gmail.com");
        usuario.setTelefono("3221233232");
        return usuario;
    }


    @RequestMapping(value = "usuarioED")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("fabian");
        usuario.setApellido("meza");
        usuario.setEmail("fmeza@gmail.com");
        usuario.setTelefono("3221233232");
        return usuario;
    }
    @RequestMapping(value = "usuarioE")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("fabian");
        usuario.setApellido("meza");
        usuario.setEmail("fmeza@gmail.com");
        usuario.setTelefono("3221233232");
        return usuario;
    }
    @RequestMapping(value = "usuarioB")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("fabian");
        usuario.setApellido("meza");
        usuario.setEmail("fmeza@gmail.com");
        usuario.setTelefono("3221233232");
        return usuario;
    }

}
