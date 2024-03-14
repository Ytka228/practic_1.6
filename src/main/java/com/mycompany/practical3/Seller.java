
package com.mycompany.practical3;
public class Seller {

    public void modify(Telephone telephone){
        String name = telephone.getName();
        char[] arr = name.toCharArray();
        String resName = "";
        
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 'N'){
            resName += 'N';
            } else if(arr[i] == 'o'){
            resName += 'a';
            } else {
            resName += Character.toLowerCase(arr[i]);
            }
        }
        telephone.setName(resName);
    }
}
