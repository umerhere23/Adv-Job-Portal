/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Domain;

import Model.LocalDatabase;
import ui.Login;

/**
 *
 * @author Umer
 */
public class Validatorr extends Login {

    public static boolean ValidateCredentials(final String username, final String pass) {

        if (LocalDatabase.validate(username, pass)) {
            return true;
        }
        return false;
    }
}
