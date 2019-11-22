/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Constantes
        String DUEÑO = "Sócrates";
        String MENSAJE_OK = "¡Ave César!";
        String MENSAJE_BAD = "¡Sócrates socorro!";

        //Variables
        String personaConOrejas;
        String mensajeLoro;

        //Rótulo
        System.out.printf("Alternativa Loro %n================%n");

        //Scanner
        System.out.print("Persona que se acerca ..: ");
        personaConOrejas = SCN.nextLine();
        //.toLowerCase();

        //Separador 
        System.out.println("---");

        //Condición
        if (personaConOrejas.equals("Sócrates")) {
            mensajeLoro = MENSAJE_OK;
        } else {
            mensajeLoro = MENSAJE_BAD;
        }

        //Mensaje
        System.out.printf("Dueño del loro .........: %s%n---%n", DUEÑO);
        System.out.printf("Mensaje Loro ...........: %s%n", mensajeLoro);
    }

}
