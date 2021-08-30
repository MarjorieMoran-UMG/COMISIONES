/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaComisionMAMN;

import ModeloMAMN.Modelo;
import java.util.*;

/**
 *
 * @author Marjorie
 */
public class NuevaComision {

    public List<Modelo> todos = new ArrayList<Modelo>();

    public Modelo Ingresar() {
        Modelo vende = new Modelo();
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del Vendedor:");
        vende.Nombre = t.nextLine();

        System.out.println("Ingrese el dato de Enero:");
        vende.Enero = t.nextDouble();

        System.out.println("Ingrese el dato de Febrero:");
        vende.Febrero = t.nextDouble();

        System.out.println("Ingrese el dato de Marzo:");
        vende.Marzo = t.nextDouble();

        todos.add(vende);

        return vende;
    }
    public static float TotEnero = 0;
    public static float TotFebrero = 0;
    public static float TotMarzo = 0;
    public static double MaxEnero = 0;
    public static double MinEnero = 1000;
    public static double MaxFebrero = 0;
    public static double MinFebrero = 1000;
    public static double MaxMarzo = 0;
    public static double MinMarzo = 1000;
    public static double MaxGeneral = 0;
    public static double MinGeneral = 1000;

    public void Totales() {
        double Maximo = Integer.MIN_VALUE;
        double Minimo = Integer.MAX_VALUE;
        String NombreMaximo = "";
        String NombreMinimo = "";
        for (Modelo ele : todos) {
            ele.sumE = ele.Enero + ele.Febrero + ele.Marzo;

            if (ele.sumE > Maximo) {
                Maximo = ele.sumE;
                MaxGeneral = Maximo;
                NombreMaximo = ele.Nombre;
            }
            if (ele.sumE < Minimo) {
                Minimo = ele.sumE;
                MinGeneral = Minimo;
                NombreMinimo = ele.Nombre;
            }

        }
        System.out.println(NombreMaximo + " el vendedor con más ventas con: " + MaxGeneral);
        System.out.println(NombreMinimo + " el vendedor con menos ventas con: " + MinGeneral);

    }

    public void MaxMinEnero() {
        double Maximo = Integer.MIN_VALUE;
        double Minimo = Integer.MAX_VALUE;
        String NomMaxVent = "";
        String NomMinVent = "";
        for (Modelo ele : todos) {

            if (ele.Enero > Maximo) {
                Maximo = ele.Enero;
                MaxEnero = Maximo;
                NomMaxVent = ele.Nombre;
            }
            if (ele.Enero < Minimo) {
                Minimo = ele.Enero;
                MinEnero = Minimo;
                NomMinVent = ele.Nombre;
            }

        }
        System.out.println(NomMaxVent + " Maximo de Ventas en el Mes de Enero " + MaxEnero);
        System.out.println(NomMinVent + " Minimo de Ventas en el Mes de Enero " + MinEnero);

    }

    public void MaxMinFebrero() {
        double Maximo = Integer.MIN_VALUE;
        double Minimo = Integer.MAX_VALUE;
        String NomMaxVent = "";
        String NomMinVent = "";
        for (Modelo ele : todos) {

            if (ele.Febrero > Maximo) {
                Maximo = ele.Febrero;
                MaxFebrero = Maximo;
                NomMaxVent = ele.Nombre;
            }
            if (ele.Febrero < Minimo) {
                Minimo = ele.Febrero;
                MinFebrero = Minimo;
                NomMinVent = ele.Nombre;
            }

        }
        System.out.println(NomMaxVent + " Maximo de Ventas en el Mes de Febrero " + MaxFebrero);
        System.out.println(NomMinVent + " Minimo de Ventas en el Mes de Febrero " + MinFebrero);

    }

    public void MaxMinMarzo() {
        double Maximo = Integer.MIN_VALUE;
        double Minimo = Integer.MAX_VALUE;
        String NomMaxVent = "";
        String NomMinVent = "";
        for (Modelo ele : todos) {

            if (ele.Marzo > Maximo) {
                Maximo = ele.Marzo;
                MaxMarzo = Maximo;
                NomMaxVent = ele.Nombre;
            }
            if (ele.Marzo < Minimo) {
                Minimo = ele.Marzo;
                MinMarzo = Minimo;
                NomMinVent = ele.Nombre;
            }

        }
        System.out.println(NomMaxVent + " Maximo de Ventas en el Mes de Marzo " + MaxMarzo);
        System.out.println(NomMinVent + " Minimo de Ventas en el Mes de Marzo " + MinMarzo);

    }

    public void Busqueda() {
        Scanner t = new Scanner(System.in);
        Object Buscar;
        String Nombre="";
        System.out.println("Ingrese el numero de venta que desea ver:");
        Buscar = t.nextDouble();
        
        for (Modelo ele : todos) {

            if (Buscar.equals(ele.Enero)) {
                Buscar = ele.Nombre;
                System.out.println(Buscar + " Corresponde al numero de venta ");
                break;
            } if (Buscar.equals(ele.Febrero)) {
                Buscar = ele.Nombre;
                System.out.println(Buscar + " Corresponde al numero de venta ");
                break;
            } if (Buscar.equals(ele.Marzo)) {
                Buscar = ele.Nombre;
                System.out.println(Buscar + " Corresponde al numero de venta ");
                break;
            }
        }
    }

    public void ModificarDato() {
        Scanner t = new Scanner(System.in);
        String opc = "";
        do {
            System.out.println("1. Modificar nombre de vendedor");
            System.out.println("2. Modificar una venta de enero");
            System.out.println("3. Modificar una venta de febrero");
            System.out.println("4. Modificar una venta de marzo");
            System.out.println("5. Salir");
            opc = t.nextLine();
            switch (opc) {
                case "1":
                    String nombre;
                    System.out.println("Ingrese el nombre: ");
                    nombre = t.nextLine();
                    try {
                        for (Modelo vende : todos) {

                            if (nombre.equals(vende.Nombre)) {
                                var valorLista = vende.Nombre;

                                System.out.println("Modificando... " + valorLista);
                                System.out.print("Reemplazar por:");

                                var nuevaPalabra = t.nextLine();
                                vende.Nombre = nuevaPalabra;

                                System.out.println(valorLista + " -> " + nuevaPalabra);
                                break;
                            } else {
                                System.out.println("El elemento no existe");
                                break;
                            }

                        }

                    } catch (Exception e) {
                        System.out.println("Dato no valido");
                    }
                    break;
                case "2":
                    Object enero;
                    System.out.println("Ingrese el valor a vambiar ");
                    enero = t.nextDouble();
                    try {
                        for (Modelo vende : todos) {

                            if (enero.equals(vende.Enero)) {
                                var valorLista = vende.Enero;

                                System.out.println("Modificando... -> " + valorLista);
                                System.out.print("Reemplazar por: ");

                                double numero = t.nextDouble();
                                vende.Enero = numero;

                                System.out.println(valorLista + " -> " + numero);
                                break;
                            } else {
                                System.out.println("El elemento no existe");
                                break;
                            }

                        }

                    } catch (Exception e) {
                        System.out.println("Dato no valido");
                    }
                    break;
                case "3":
                    Object febrero;
                    System.out.println("Ingrese el Valor a Cambiar ");
                    febrero = t.nextDouble();
                    try {
                        for (Modelo vende : todos) {

                            if (febrero.equals(vende.Febrero)) {
                                var valorLista = vende.Febrero;

                                System.out.println("Modificando... " + valorLista);
                                System.out.print("Reemplazar por: ");

                                double numero = t.nextDouble();
                                vende.Febrero = numero;

                                System.out.println(valorLista + " -> " + numero);
                                break;
                            } else {
                                System.out.println("El elemento no existe");
                                break;
                            }

                        }

                    } catch (Exception e) {
                        System.out.println("Dato no valido");
                    }
                    break;
                case "4":
                    Object marzo;
                    System.out.println("Ingrese el valor a Cambiar ");
                    marzo = t.nextDouble();
                    try {
                        for (Modelo vende : todos) {

                            if (marzo.equals(vende.Marzo)) {
                                var valorLista = vende.Marzo;

                                System.out.println("Modificando... " + valorLista);
                                System.out.print("Reemplazar por: ");

                                double numero = t.nextDouble();
                                vende.Marzo = numero;

                                System.out.println(valorLista + " -> " + numero);
                                break;
                            } else {
                                System.out.println("El elemento no existe");
                                break;
                            }

                        }

                    } catch (Exception e) {
                        System.out.println("Dato no valido");
                    }
                    break;
            }
        } while (!opc.equals("5"));
    }

    public void DesplegarDato() {
        for (Modelo ele : todos) {
            System.out.println("Nombre = " + ele.Nombre);
            System.out.println("Enero = " + ele.Enero);
            System.out.println("Febrero = " + ele.Febrero);
            System.out.println("Marzo = " + ele.Marzo);
            ele.Suma = ele.Enero + ele.Febrero + ele.Marzo;
            ele.Promedio = (ele.Enero + ele.Febrero + ele.Marzo) / 3;
            System.out.println("Suma = " + ele.Suma);
            System.out.println("Promedio = " + ele.Promedio);
            System.out.println("\n");

        }

    }

    public void Menu() {
        Scanner t = new Scanner(System.in);
        String opc = "";
        do {
            System.out.println("------------MENU------------");
            System.out.println("1. Ingresar informacion");
            System.out.println("2. Ventas maximas y minimas por mes");
            System.out.println("3. Ventas maximas y minimas generales");
            System.out.println("4. Editar arreglo");
            System.out.println("5. Busqueda por cantidad");
            System.out.println("6. Ver arreglo");
            System.out.println("7. Salir");
            opc = t.nextLine();
            switch (opc) {
                case "1":

                    Ingresar();
                    Ingresar();

                    break;
                case "2":
                    MaxMinEnero();
                    MaxMinFebrero();
                    MaxMinMarzo();
                    break;
                case "3":
                    Totales();
                    break;
                case "4":
                    ModificarDato();
                    break;
                case "5":
                    Busqueda();
                    break;
                case "6":
                    DesplegarDato();
                    break;

            }
        } while (!opc.equals("7"));
    }
}
