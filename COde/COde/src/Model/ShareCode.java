/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.*;
/**
 *
 * @author Hassan Usman
 */
public class ShareCode {
    String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code="";
        String array1[]= new String[5];
    public String GenerateCode(){
        Random ran= new Random();
        int length =5;
        char[] codes= new char[length];
        
        for(int i= 0;i<length;i++){
        codes[i]=chars.charAt(ran.nextInt(chars.length()));
    }
        for(int i=0;i<codes.length;i++){
            code += codes[i];
            
        }
        
        
        return code;
    }
    public void UpdateCode(){
        //Code saving into code table of user profile 
    String sql=String.format("UPDATE User set Code=%s where Code=null",code);
    }
}
