package com.cursospring.curso.controllers;

import com.cursospring.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(001L);
        usuario.setNombre("nathalia");
        usuario.setApellido("rosas");
        usuario.setEmail("nrosas@gmail.com");
        usuario.setTelefono("3221233212");

        Usuario usuario2 = new Usuario();
        usuario2.setId(002L);
        usuario2.setNombre("fabian");
        usuario2.setApellido("meza");
        usuario2.setEmail("fmeza@gmail.com");
        usuario2.setTelefono("3221233232");

        Usuario usuario3 = new Usuario();
        usuario3.setId(003L);
        usuario3.setNombre("david");
        usuario3.setApellido("visval");
        usuario3.setEmail("dvisval@gmail.com");
        usuario3.setTelefono("3221233252");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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
