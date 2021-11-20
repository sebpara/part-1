/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertstring;

/**
 *
 * @author sebastianparaschivescu
 */
public class ConvertString {

    
    public static String convertString(String str, char ch){
        // TODO code application logic here
        int charPositon = str.indexOf(ch);
        if (charPosition ==1)
            return str;
        return str.substring(0, charPosition + 1);
    }
    
}
