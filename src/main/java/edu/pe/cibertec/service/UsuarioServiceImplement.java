package edu.pe.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.cibertec.model.Usuario;
import edu.pe.cibertec.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImplement implements IUsuarioService{
	@Autowired
	private IUsuarioRepository repositorio;
	
	@Override
	public List<Usuario> listarUsuarios() {
		return repositorio.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public Optional<Usuario> buscarUsuario(int codigo) {
		return repositorio.findById(codigo);
	}

	@Override
	public void eliminarUsuario(int codigo) {
		repositorio.deleteById(codigo);
	}
	
}
