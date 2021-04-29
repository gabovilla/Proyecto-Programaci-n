/*
Universidad Fidelitas
Gabriel Villalobos
Introduccion a la programación 
Proyecto Programación
Titulo: Pizzeria El Gran Slice
 */
package pizzeriaelgranslice;

import javax.swing.JOptionPane;

public class PizzeriaElGranSlice {

    public String[] nombresRandom = {"Gabriel", "Jose", "Sergio", "Luciana", "Nathalia", "Jim", "Michael", "Emanuel", "Dylana", "Marco", "Alberto", "Daniela", "Maria", "David", "Ashley"};
    public String[] tipoEmpleados = {"Cocinero", "Repartidor", "Gerente", "Administrador", "Cajero", "Mesero", "Conserje"};
    public int[] salarioEmpleado = {200000, 100000, 500000, 400000, 110000, 125000, 50000};
    public Empleados[] listaEmpleados;
    public Ordenes[] ordenesRestaurante = new Ordenes[9];
    public Ordenes[] pedidosExpress;
    public int cantidadOrdenes = 0;
    public int cantidadOrdenesExpress = 0;

    public void generarEmpleados(PizzeriaElGranSlice pizzeria, int cantidadEmpleados) {
        pizzeria.listaEmpleados = new Empleados[cantidadEmpleados];
        int identificador = 0;
        int antiguedad = 0;
        int edad = 0;
        int telefono = 0;
        for (int i = 0; i < cantidadEmpleados; i++) {
            identificador = (int) Math.floor(Math.random() * pizzeria.tipoEmpleados.length);
            antiguedad = (int) Math.floor(Math.random() * 8);
            edad = (int) Math.floor(Math.random() * (30 - 18 + 1) + 18);
            telefono = (int) Math.floor(Math.random() * 10000000);
            pizzeria.listaEmpleados[i] = new Empleados(pizzeria.nombresRandom[(int) Math.floor(Math.random() * pizzeria.nombresRandom.length)],
                    pizzeria.tipoEmpleados[identificador], pizzeria.salarioEmpleado[identificador], antiguedad, edad, telefono);
        }
    }

    public void llenarInventario(Inventario inventario) {
        inventario.setAceite((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
        inventario.setCebolla((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
        inventario.setChileDulce((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
        inventario.setHarina((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
        inventario.setJamon((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
        inventario.setHongos((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
        inventario.setPepperoni((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
        inventario.setPiña((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
        inventario.setSal((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
        inventario.setSalsas((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
        inventario.setTomate((int) Math.floor(Math.random() * (200 - 100 + 1) + 100));
    }

    public void hacerPizzas(Pizzas pizza) {
        pizza.setHawaiana((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        pizza.setJamon((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        pizza.setJamonHongos((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        pizza.setPepperoni((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        pizza.setSuprema((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
    }

    public void activosPizzeria(MueblesDeCocina cocina, PizzeriaElGranSlice pizzeria) {
        cocina.setMesas(9);
        cocina.setPlatos((cocina.getMesas() * 4));
        cocina.setServilletas((cocina.getMesas() * 8));
        cocina.setVasos((cocina.getMesas() * 8));
        cocina.setSillas((cocina.getMesas() * 4));
        cocina.setManteles((cocina.getMesas() * 4));
        cocina.setCubiertos((cocina.getMesas() * 8));
    }

    public void llenarRefri(Refrescos refrescos) {
        refrescos.setCocaCola((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        refrescos.setCocaColaLight((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        refrescos.setCocaColaZero((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        refrescos.setFantaColita((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        refrescos.setFantaNaranja((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        refrescos.setFresca((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        refrescos.setTeFrio((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
        refrescos.setZarza((int) Math.floor(Math.random() * (20 - 10 + 1) + 10));
    }

    public void actualizarMenuPersonal(Menu menu, Refrescos refrescos, Pizzas pizzas) {
        actualizarFrescosPersonal(menu, refrescos);
        actualizarPizzasPersonal(menu, pizzas);
    }

    public void actualizarFrescosPersonal(Menu menu, Refrescos refrescos) {
        menu.setRefresco(" Coca Cola Regular: " + refrescos.getCocaCola()
                + "\n Coca Cola Light: " + refrescos.getCocaColaLight()
                + "\n Coca Cola Zero: " + refrescos.getCocaColaZero()
                + "\n Fanta Colita: " + refrescos.getFantaColita()
                + "\n Fanta Naranja: " + refrescos.getFantaNaranja()
                + "\n Fresca: " + refrescos.getFresca()
                + "\n Te Frío: " + refrescos.getTeFrio()
                + "\n Zarza: " + refrescos.getZarza());
    }

    public void actualizarPizzasPersonal(Menu menu, Pizzas pizzas) {
        menu.setPizzas(" Pizza Hawaina: " + pizzas.getHawaiana()
                + "\n Pizza de Jamon: " + pizzas.getJamon()
                + "\n Pizza de Jamon y Hongos: " + pizzas.getJamonHongos()
                + "\n Pizza de Pepperoni: " + pizzas.getPepperoni()
                + "\n Pizza Suprema: " + pizzas.getSuprema());
    }

    public void asignarMenu(Menu menu) {
        asignarFrescos(menu);
        asignarPizzas(menu);
    }

    public void asignarFrescos(Menu menu) {
        menu.setRefresco(" Coca Cola Regular"
                + "\n Coca Cola Light"
                + "\n Coca Cola Zero"
                + "\n Fanta Colita"
                + "\n Fanta Naranja"
                + "\n Fresca"
                + "\n Te Frío"
                + "\n Zarza");
    }

    public void asignarPizzas(Menu menu) {
        menu.setPizzas(" Pizza Hawaina"
                + "\n Pizza de Jamon"
                + "\n Pizza de Jamon y Hongos"
                + "\n Pizza de Pepperoni"
                + "\n Pizza Suprema");
    }

    public void maxPedidosExpress() {
        int maxPedidos = 0;
        for (Empleados listaEmpleado : listaEmpleados) {
            if (listaEmpleado.getTipoEmpleado() == "Repartidor") {
                maxPedidos++;
            }
        }
        pedidosExpress = new Ordenes[(maxPedidos * 2)];
    }

    public void mostrarMenu(Menu menu) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(" Pizzeria el Gran Slice."
                + "\n 1. Refrescos"
                + "\n 2. Pizzas"));
        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, " Pizzeria el Gran Slice."
                        + "\n" + menu.getRefresco());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, " Pizzeria el Gran Slice."
                        + "\n" + menu.getPizzas());
                break;
        }
    }

    public String ordenarPizza(Pizzas pizza) {
        String mensaje = "";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ordenar pizza?"
                + "\n 1. Si"
                + "\n 2. No"));
        switch (opcion) {
            case 1:
                mensaje = tiposPizza(pizza);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, " De acuerdo, gracias.");
                mensaje = "Nada";
                break;
        }
        return mensaje;
    }

    public String tiposPizza(Pizzas pizza) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(" Pizzeria el Gran Slice."
                + "\n 1. Pizza Hawaina"
                + "\n 2. Pizza de Jamon"
                + "\n 3. Pizza de Jamon y Hongos"
                + "\n 4. Pizza de Pepperoni"
                + "\n 5. Pizza Suprema"));
        int cantidadPizzas = 0;
        String mensaje = "";
        switch (opcion) {
            case 1:
                cantidadPizzas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pizzas"));
                if (pizza.getHawaiana() >= cantidadPizzas) {
                    pizza.setHawaiana(pizza.getHawaiana() - cantidadPizzas);
                } else {
                    realizarPizza("hawaina", (cantidadPizzas - pizza.getHawaiana()));
                    pizza.setHawaiana(0);
                }
                mensaje = cantidadPizzas + " Pizzas Supremas";
                break;
            case 2:
                cantidadPizzas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pizzas"));
                if (pizza.getJamon() >= cantidadPizzas) {
                    pizza.setJamon(pizza.getJamon() - cantidadPizzas);
                } else {
                    realizarPizza("jamon", (cantidadPizzas - pizza.getJamon()));
                    pizza.setJamon(0);
                }
                mensaje = cantidadPizzas + " Pizzas de Jamon";
                break;
            case 3:
                cantidadPizzas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pizzas"));
                if (pizza.getJamonHongos() >= cantidadPizzas) {
                    pizza.setJamonHongos(pizza.getJamonHongos() - cantidadPizzas);
                } else {
                    realizarPizza("jamon y hongos", (cantidadPizzas - pizza.getJamonHongos()));
                    pizza.setJamonHongos(0);
                }
                mensaje = cantidadPizzas + " Jamon y Hongos";
                break;
            case 4:
                cantidadPizzas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pizzas"));
                if (pizza.getPepperoni() >= cantidadPizzas) {
                    pizza.setPepperoni(pizza.getPepperoni() - cantidadPizzas);
                } else {
                    realizarPizza("pepperoni", (cantidadPizzas - pizza.getPepperoni()));
                    pizza.setPepperoni(0);
                }
                mensaje = cantidadPizzas + " Pizzas de Pepperoni";
                break;
            case 5:
                cantidadPizzas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de pizzas"));
                if (pizza.getSuprema() >= cantidadPizzas) {
                    pizza.setSuprema(pizza.getSuprema() - cantidadPizzas);
                } else {
                    realizarPizza("suprema", (cantidadPizzas - pizza.getSuprema()));
                    pizza.setSuprema(0);
                }
                mensaje = cantidadPizzas + " Pizzas Supremas";
                break;
        }
        return mensaje;
    }

    public void realizarPizza(String tipoPizza, int cantidadPizza) {
        for (int i = 0; i < cantidadPizza; i++) {
            System.out.println("Haciendo la pizza #" + (i + 1) + " " + tipoPizza + " espere 5 segundos por favor.");
            temporizador();
        }
    }

    public void temporizador() {
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public void agregarOrdenRestaurante(String orden) {
        if (orden != "Nada") {
            for (int i = 0; i < ordenesRestaurante.length; i++) {
                if (ordenesRestaurante[i] == null) {
                    Ordenes nuevaOrden = new Ordenes();
                    nuevaOrden.setMesa((i + 1));
                    nuevaOrden.setNumeroOrden((i + 1));
                    nuevaOrden.setPedidos(orden);
                    ordenesRestaurante[i] = nuevaOrden;
                    break;
                }
            }
        }
    }
    
    public void agregarOrdenExpress(String orden) {
        if (orden != "Nada") {
            for (int i = 0; i < pedidosExpress.length; i++) {
                if (pedidosExpress[i] == null) {
                    Ordenes nuevaOrden = new Ordenes();
                    nuevaOrden.setMesa((i + 1));
                    nuevaOrden.setNumeroOrden((i + 1));
                    nuevaOrden.setPedidos(orden);
                    pedidosExpress[i] = nuevaOrden;
                    break;
                }
            }
        }
    }

    public String ordenarRefrescos(Refrescos refrescos) {
        String mensaje = "";
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea ordenar refrescos?"
                + "\n 1. Si"
                + "\n 2. No"));
        switch (opcion) {
            case 1:
                mensaje = tiposRefresco(refrescos);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, " De acuerdo, gracias.");
                mensaje = "Nada";
                break;
        }
        return mensaje;
    }

    public String tiposRefresco(Refrescos refrescos) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(" Pizzeria el Gran Slice."
                + "\n 1. Coca Cola Regular"
                + "\n 2. Coca Cola Light"
                + "\n 3. Coca Cola Zero"
                + "\n 4. Fanta Colita"
                + "\n 5. Fanta Naranja"
                + "\n 6. Fresca"
                + "\n 7. Te Frío"
                + "\n 8. Zarza"));
        int cantidadRefrescos = 0;
        String mensaje = "";
        switch (opcion) {
            case 1:
                cantidadRefrescos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de refrescos"));
                if (refrescos.getCocaCola() >= cantidadRefrescos) {
                    refrescos.setCocaCola(refrescos.getCocaCola() - cantidadRefrescos);
                    mensaje = cantidadRefrescos + " Coca Regular.";
                } else {
                    JOptionPane.showMessageDialog(null, " No hay Coca Cola Regular.");
                    mensaje = "Nada";
                }
                break;
            case 2:
                cantidadRefrescos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de refrescos"));
                if (refrescos.getCocaColaLight() >= cantidadRefrescos) {
                    refrescos.setCocaColaLight(refrescos.getCocaColaLight() - cantidadRefrescos);
                    mensaje = cantidadRefrescos + " Coca Cola Light.";
                } else {
                    JOptionPane.showMessageDialog(null, " No hay Coca Cola Light.");
                    mensaje = "Nada";
                }
                break;
            case 3:
                cantidadRefrescos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de refrescos"));
                if (refrescos.getCocaColaZero() >= cantidadRefrescos) {
                    refrescos.setCocaColaZero(refrescos.getCocaColaZero() - cantidadRefrescos);
                    mensaje = cantidadRefrescos + " Coca Cola Zero.";
                } else {
                    JOptionPane.showMessageDialog(null, " No hay Coca Cola Zero.");
                    mensaje = "Nada";
                }
                break;
            case 4:
                cantidadRefrescos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de refrescos"));
                if (refrescos.getFantaColita() >= cantidadRefrescos) {
                    refrescos.setFantaColita(refrescos.getFantaColita() - cantidadRefrescos);
                    mensaje = cantidadRefrescos + " Fanta Colita.";
                } else {
                    JOptionPane.showMessageDialog(null, " No hay Fanta Colita.");
                    mensaje = "Nada";
                }
                break;
            case 5:
                cantidadRefrescos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de refrescos"));
                if (refrescos.getFantaNaranja() >= cantidadRefrescos) {
                    refrescos.setFantaNaranja(refrescos.getFantaNaranja() - cantidadRefrescos);
                    mensaje = cantidadRefrescos + " Fanta Naranja.";
                } else {
                    JOptionPane.showMessageDialog(null, " No hay Fanta Naranja.");
                    mensaje = "Nada";
                }
                break;
            case 6:
                cantidadRefrescos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de refrescos"));
                if (refrescos.getFresca() >= cantidadRefrescos) {
                    refrescos.setFresca(refrescos.getFresca() - cantidadRefrescos);
                    mensaje = cantidadRefrescos + " Fresca.";
                } else {
                    JOptionPane.showMessageDialog(null, " No hay Fresca.");
                    mensaje = "Nada";
                }
                break;
            case 7:
                cantidadRefrescos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de refrescos"));
                if (refrescos.getTeFrio() >= cantidadRefrescos) {
                    refrescos.setTeFrio(refrescos.getTeFrio() - cantidadRefrescos);
                    mensaje = cantidadRefrescos + " Te Frio.";
                } else {
                    JOptionPane.showMessageDialog(null, " No hay Te Frio.");
                    mensaje = "Nada";
                }
                break;
            case 8:
                cantidadRefrescos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de refrescos"));
                if (refrescos.getZarza() >= cantidadRefrescos) {
                    refrescos.setZarza(refrescos.getZarza() - cantidadRefrescos);
                    mensaje = cantidadRefrescos + " Zarza.";
                } else {
                    JOptionPane.showMessageDialog(null, " No hay Zarza.");
                    mensaje = "Nada";
                }
                break;
        }
        return mensaje;
    }

    public String validarOrden(String ordenPizza, String ordenRefresco) {
        String ordenFinal = "Nada";
        if (ordenPizza != "Nada" && ordenRefresco != "Nada") {
            ordenFinal = ordenPizza + " " + ordenRefresco;
        }if (ordenRefresco != "Nada") {
            ordenFinal = ordenFinal + " " + ordenRefresco;
        } else if (ordenPizza == "Nada" && ordenRefresco == "Nada") {
            JOptionPane.showMessageDialog(null, " No ordeno nada.");
        }
        return ordenFinal;
    }
    
    public void mostrarOrdenes(){
        ordenesRestaurantes();
        ordenesExpress();
    }
    
    public void ordenesRestaurantes(){
        String mensaje = "";
        for (int i = 0; i < ordenesRestaurante.length; i++) {
            if (ordenesRestaurante[i] != null) {
                mensaje = mensaje + ordenesRestaurante[i].toString() + "\n";
            }
        }
        if (mensaje != "") {
            JOptionPane.showMessageDialog(null, mensaje);
        }else {
            JOptionPane.showMessageDialog(null, "No hay ordenes en el Restaurante.");
        }
    }
    
    public void ordenesExpress(){
        String mensaje = "";
        for (int i = 0; i < pedidosExpress.length; i++) {
            if (pedidosExpress[i] != null) {
                mensaje = mensaje + pedidosExpress[i].toString() + "\n";
            }
        }
        if (mensaje != "") {
            JOptionPane.showMessageDialog(null, mensaje);
        }else {
            JOptionPane.showMessageDialog(null, "No hay ordenes Express.");
        }
        
    }

    public static void main(String[] args) {
        PizzeriaElGranSlice pizzeria = new PizzeriaElGranSlice();
        Inventario inventario = new Inventario();
        Pizzas pizzas = new Pizzas();
        Refrescos refrescos = new Refrescos();
        MueblesDeCocina cocina = new MueblesDeCocina();
        Menu menuPersonal = new Menu();
        Menu menuCliente = new Menu();
        pizzeria.generarEmpleados(pizzeria, 14);
        pizzeria.llenarInventario(inventario);
        pizzeria.hacerPizzas(pizzas);
        pizzeria.activosPizzeria(cocina, pizzeria);
        pizzeria.llenarRefri(refrescos);
        pizzeria.actualizarMenuPersonal(menuPersonal, refrescos, pizzas);
        pizzeria.asignarMenu(menuCliente);
        pizzeria.maxPedidosExpress();
        JOptionPane.showMessageDialog(null, "Bienvenidos a la Pizzeria el Gran Slice.");
        int opcion;
        int opcion2;
        String ordenPizza = "";
        String ordenRefresco = "";
        String ordenFinal = "";
        
        while (true) {
            pizzeria.actualizarMenuPersonal(menuPersonal, refrescos, pizzas);
            ordenPizza = "";
            ordenRefresco = "";
            ordenFinal = "";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" Pizzeria el Gran Slice."
                    + "\n 0. Salir"
                    + "\n 1. Ver el menu con cantidades."
                    + "\n 2. Ver el menu normal."
                    + "\n 3. Comer en restaurante"
                    + "\n 4. Pedido express"
                    + "\n 5. Ordenes"));
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    pizzeria.mostrarMenu(menuPersonal);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Este es nuestro menu de la Pizzeria el Gran Slice.");
                    pizzeria.mostrarMenu(menuCliente);
                    break;
                case 3:
                    if (pizzeria.cantidadOrdenes < pizzeria.ordenesRestaurante.length) {
                        ordenPizza = pizzeria.ordenarPizza(pizzas);
                        ordenRefresco = pizzeria.ordenarRefrescos(refrescos);
                        ordenFinal = pizzeria.validarOrden(ordenPizza, ordenRefresco);
                        if (ordenFinal != "Nada") {
                            pizzeria.agregarOrdenRestaurante(ordenFinal);
                            pizzeria.cantidadOrdenes++;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay espacio en el restaurante, puede intentar pedir express");
                    }
                    break;
                case 4:
                    if (pizzeria.cantidadOrdenesExpress < pizzeria.pedidosExpress.length) {
                        ordenPizza = pizzeria.ordenarPizza(pizzas);
                        ordenRefresco = pizzeria.ordenarRefrescos(refrescos);
                        ordenFinal = pizzeria.validarOrden(ordenPizza, ordenRefresco);
                        if (ordenFinal != "Nada") {
                            pizzeria.agregarOrdenRestaurante(ordenFinal);
                            pizzeria.cantidadOrdenesExpress++;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Los repartidadores estan ocupados intente mas tarde");
                    }
                    break;
                case 5:
                    pizzeria.mostrarOrdenes();
                    break;
            }
        }
    }

}
