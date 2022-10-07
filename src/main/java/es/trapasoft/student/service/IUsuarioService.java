package es.trapasoft.student.service;

import es.trapasoft.student.entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUserPassword(String user, String password);
	
	public Usuario findById(Long id);

}
