/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.Jeg.Security.Repository;

import com.portfolio.Jeg.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
 Optional<Usuario> findByNombreUsuario(String nombreUsuario); 
 
 boolean existByNombreUsuario(String nombreUsuario);
 boolean existByEmail(String email);
}
