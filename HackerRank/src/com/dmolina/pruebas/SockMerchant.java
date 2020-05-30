package com.dmolina.pruebas;

import java.util.Hashtable;
import java.util.Set;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

         Hashtable<Integer,Integer> temp =  new Hashtable<Integer,Integer>();
         int cant_tot = 0;
         int cant_aux = 0;
         int w = 0;
         
         for(int i = 0 ; i < ar.length ; i++){
             if(!temp.containsKey(ar[i])){
            	 temp.put(ar[i],1);
             }else{
            	 temp.replace(ar[i],temp.get(ar[i]) + 1);
             }
         }

         Set<Integer> keys = temp.keySet();
         for(Integer key : keys){
        	 w = 0;
        	 cant_aux = 0;
             while(w < temp.get(key)){
                if(cant_aux < 2){
                    cant_aux++;
                }
                if(cant_aux == 2){
                    cant_tot++;
                    cant_aux = 0;
                }
                w++;
             }
         }
         return cant_tot; 
    }

    public static void main(String[] args) {
    	
        
    	int n = 10;
        int[] ar = new int[n];
        ar[0] = 1;
        ar[1] = 1;
        ar[2] = 3;
        ar[3] = 1;
        ar[4] = 2;
        ar[5] = 1;
        ar[6] = 3;
        ar[7] = 3;
        ar[8] = 3;
        ar[9] = 3;

        int result = sockMerchant(n, ar);

        System.out.println("Pares: " + result);
    }
}
