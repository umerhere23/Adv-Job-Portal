/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Umer
 */
public class LocalDatabase {

    private static final ArrayList<String> username_ids = new ArrayList<>();

    static {
        username_ids.add("Umer");
        username_ids.add("Usman");
        username_ids.add("Noor");
    }
    private static final ArrayList<String> passwords = new ArrayList<>();

    static {
        passwords.add("123");
        passwords.add("1234");
        passwords.add("12345");

    }

    public static boolean validate(final String username, final String pass) {
        for (int i = 0; i < username_ids.size(); i++) {
            if (username_ids.get(i).equals(username) && passwords.get(i).equals(pass)) {
                return true;
            }
        }
        return false;
        
    }}
