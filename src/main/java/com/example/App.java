package com.example;

import com.example.entities.Direccion;
import com.example.entities.Productos;
import com.example.entities.Tienda;
import com.example.repositories.DireccionRepository;
import com.example.repositories.ProductosRepository;
import com.example.repositories.TiendaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class App {

    static ApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(App.class, args);

        datosDemo();
        findAll();
        findAllByNombre();
        findAllByCif();
        findAllByTelefono();
        findAllByEmail();
        filtroPorCalleYPais();
        filtroPorPrecioEntre();
        filtroPorCaducidadEntre ();


    }

    private static void filtroPorCaducidadEntre (){
        ProductosRepository productosRepository = context.getBean(ProductosRepository.class);
        List<Productos> caducidadEntre = productosRepository.findAllByCaducidadBefore(LocalDate.of(2035,
                Month.JANUARY,1));
        for (Productos productos: caducidadEntre) {
            System.out.println("Caducan en :" + productos);

        }
    }
    private static void filtroPorPrecioEntre(){
        ProductosRepository productosRepository = context.getBean(ProductosRepository.class);
        List<Productos> precioEntre = productosRepository.findAllByPrecioBetween(45D, 250D);

        for (Productos productos: precioEntre){
            System.out.println("Los productos son :" + productos);
        }
    }
    private static void filtroPorCalleYPais() {
        DireccionRepository direccionRepo = context.getBean(DireccionRepository.class);
        System.out.println("==================== FIND ALL BY CALLE Y PAIS ====================");
        List<Direccion> direccionFiltro = direccionRepo.findAllByCalleAndPais("calle2", "pais3");

        for (Direccion direccion : direccionFiltro) {
            System.out.println(direccion);
        }

    }

    private static void findAll() {

        TiendaRepository tiendaRepository = context.getBean(TiendaRepository.class);
        System.out.println("==================== FIND ALL ====================");

        List<Tienda> tiendas = tiendaRepository.findAll();
        {

            for (Tienda tienda : tiendas) {
                System.out.println("Las tiendas son :" + tienda);
            }

        }

    }

    public static void findAllByNombre() {
        TiendaRepository tiendaRepository = context.getBean(TiendaRepository.class);
        System.out.println("==================== FIND ALL BY NOMBRE ====================");
        List<Tienda> tiendas1 = tiendaRepository.findAllByNombre("Expert");
        System.out.println("La tienda por NOMBRE es : " + tiendas1);

    }

    public static void findAllByCif() {
        TiendaRepository tiendaRepository = context.getBean(TiendaRepository.class);
        System.out.println("==================== FIND ALL BY CIF ====================");
        List<Tienda> tiendas2 = tiendaRepository.findAllByCif("08032071");
        System.out.println("La tienda por CIF es :" + tiendas2);

    }

    public static void findAllByTelefono() {
        TiendaRepository tiendaRepository = context.getBean(TiendaRepository.class);
        System.out.println("==================== FIND ALL BY TELEFONO ====================");
        List<Tienda> tiendas3 = tiendaRepository.findAllByTelefono(678050472);
        System.out.println("La tienda por telefo es :" + tiendas3);

    }

    public static void findAllByEmail() {
        TiendaRepository tiendaRepository = context.getBean(TiendaRepository.class);
        System.out.println("==================== FIND ALL BY EMAIL ====================");
        List<Tienda> tiendas4 = tiendaRepository.findAllByEmail("javi@javi.es");
        System.out.println("La tienda por email es :" + tiendas4);

    }

    public static void datosDemo() {

        TiendaRepository tiendaRepository = context.getBean(TiendaRepository.class);
        DireccionRepository direccionRepository = context.getBean(DireccionRepository.class);
        ProductosRepository productosRepository = context.getBean(ProductosRepository.class);


        Tienda tien1 = new Tienda("Expert", "08032071", 678050472, "javi@expert.es", 1245.98, true);
        Direccion dir1 = new Direccion("calle1", 45, "local1", "ciudad1", "pais1", 28000);

        Tienda tien2 = new Tienda("Manolin", "49783634", 69000000, "manolin@manolin.com", 45.98, true);
        Direccion dir2 = new Direccion("calle2", 5, "local2", "ciudad2", "pais2", 27400);

        Tienda tien3 = new Tienda("Estanco", "40935224", 916440000, "estanco@estanco.com", 489.98, true);
        Direccion dir3 = new Direccion("calle3", 6, "local3", "ciudad3", "pais3", 20400);

        Tienda tien4 = new Tienda("Panadería", "73529407", 636195753, "javi@javi.es", 489.98, true);
        Direccion dir4 = new Direccion("calle2", 6, "local3", "ciudad3", "pais3", 50400);

        tien1.setDireccion(dir1);
        tien2.setDireccion(dir2);
        tien3.setDireccion(dir3);
        tien4.setDireccion(dir3);

        direccionRepository.saveAll(List.of(dir1, dir2, dir3, dir4));
        tiendaRepository.saveAll(List.of(tien1, tien2, tien3, tien4));

        var prod1 = new Productos("prod1", "0001", 125.70, 25, true, LocalDate.of(2024, Month.APRIL, 23));
        var prod2 = new Productos("prod2", "0002", 52.70, 500, true, LocalDate.of(2025, Month.MAY, 3));
        var prod3 = new Productos("prod3", "0003", 1200.0, 50, true, LocalDate.of(2045, Month.JANUARY, 30));
        var prod4 = new Productos("prod4", "0004", 16780.0, 20, true, LocalDate.of(2035, Month.NOVEMBER, 20));

        prod1.getTienda().addAll(List.of(tien1, tien2));
        prod2.getTienda().add(tien1);
        prod3.getTienda().addAll(List.of(tien1, tien2));
        prod4.getTienda().add(tien2);

        productosRepository.saveAll(List.of(prod1, prod2, prod3, prod4));

    }

}


