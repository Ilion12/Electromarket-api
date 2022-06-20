# ELECTROMARKET

## Descripción

El proyecto trata sobre la creación de una aplicación para la gestión del stock de una cadena de venta de electrodomésticos, en la que se podrán añadir productos al almacén, darlos de baja del almacén o actualizarlos, así como consultar los productos disponibles. 

## Diagrama de clases de diseño

![Clases de Diseño](https://git.institutomilitar.com/Ilion12/electromarket/-/wikis/imagenes/diagramaClases.png)

## Cumplimiento de requisitos

1. **Herencia:** Se realizó entre `Electrodoméstico` y sus subtipos.

2. **Relación uno a muchos:** Relación entre `Electrodoméstico` y `Almacen`.

3. **Método personalizado:** Devolverá el/los Alamcén/s donde se encuentren las Televisiones de un número de pulgadas de la pantalla y una marca concreta. 

4. **Listado:** Lista de productos almacenados en la forma en la que se muestra en la figura 1.

5. **CRUD:** En la primera pantalla, tal y como se refleja en la figura 1, aparecerá un listado de los productos disponibles en ese almacén, con la posibilidad de actualizar, borrar o consultar los productos. 
En la esquina inferior derecha,  aparecerá el botón de 'Añadir Producto' que, una vez pulsado, hará que aparezca la ventana emergente de la figura 2. Una vez seleccionado el producto a introducir, mostrará el formulario con los campos a rellenar para añadirlo.

6. **URL** del proyecto: 
    
    1. Repositorio del proyecto:
        https://git.institutomilitar.com/Ilion12/electromarket.git
    2. Librería: 
        https://github.com/Ilion12/Electromarket-lib
    
7. **Despliegue** en internet:

    1. API: https://electromarket.herokuapp.com/api
    2. Web: https://electromarket-app.netlify.app/

## Interfaz de Usuario

### Figura 1: 

Inventario del almacén( Listado de productos).

![Almacen](https://git.institutomilitar.com/Ilion12/electromarket/-/wikis/imagenes/almacen.png)

### Figura 2

Ventana emergente con el formulario para añadir nuevos productos.

![Añadir producto](https://git.institutomilitar.com/Ilion12/electromarket/-/wikis/imagenes/aadir_producto.png)



