package es.trapasoft.student.repository;

import es.trapasoft.student.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;



public interface IUsuarioRepository extends CrudRepository<Usuario, Long>{
    
    @Query("select c from Usuario c where c.usuario = ?1 and c.clave = ?2")
	Usuario findByUserPassword(String usuario, String clave);
}
