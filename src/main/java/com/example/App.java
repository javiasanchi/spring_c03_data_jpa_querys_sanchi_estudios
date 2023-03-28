package com.example;

import com.example.entities.Direccion;
import com.example.entities.Tienda;
import com.example.repositories.DireccionRepository;
import com.example.repositories.TiendaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		TiendaRepository tiendaRepository = context.getBean(TiendaRepository.class);
		DireccionRepository direccionRepository = context.getBean(DireccionRepository.class);

		Tienda tien1 = new Tienda("Expert","08032071",678050472,"javi@expert.es",1245.98,true);
		Tienda tien2 = new Tienda("Manolin","49783634",69000000,"manolin@manolin.com",45.98,true);

		Direccion dir1 = new Direccion("calle1",45,"local1","ciudad1","pais1",28000);
		Direccion dir2 = new Direccion("calle2",5,"local2","ciudad2","pais2",27400);
		direccionRepository.saveAll(List.of(dir1,dir2));
		tiendaRepository.saveAll(List.of(tien1,tien2));
		tien1.

		List<Tienda> tiendas = tiendaRepository.findAll();
		List<Tienda> tiendas1 = tiendaRepository.findAllByNombre("Expert");
		List<Tienda> tiendas2 = tiendaRepository.findAllByCif("08032071");
		List<Tienda> tiendas3 = tiendaRepository.findAllByTelefono(678050472);
		List<Tienda> tiendas4 = tiendaRepository.findAllByEmail("javi@javi.es");
	}

}
