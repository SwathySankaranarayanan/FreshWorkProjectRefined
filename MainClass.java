/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastore;

import java.io.IOException;


public class MainClass {
        
                
    	    public static void main(String[] args) throws IOException {
                String index="C:\\Users\\Acer\\Documents\\default.db\\index.txt",cur_file_path="C:\\Users\\Acer\\Documents\\default.db\\";
                Datastore dbClient = new Datastore(index,cur_file_path);
	        /*create();
                read();
                delete();*/
	      /* String incomingObject = "{\"name\":\"mkyong\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	       
	
                String inObject = "{\"name\":\"mcdcdsng\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	        String iObject = "{\"name\":\"dsvAS\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
                String io = "{\"name\":\"mcdcdsng\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	        String ip = "{\"name\":\"dsvAS\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	        String iq = "{\"name\":\"mcdcdsng\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	        String iz = "{\"name\":\"dsvAS\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	     
	       
             dbClient.createObject(incomingObject);
             dbClient.createObject(iObject);
             dbClient.createObject(io);
             dbClient.createObject(ip);
             dbClient.createObject(iq);
             dbClient.createObject(iz);
             */
           
              // System.out.println("Enter the key for which value must be searched");
               /* String key="6b067ecc-2108-4b33-950c-98193cf44e91";
                if(key==null)
                        System.out.println("Key not found");
                else
	        System.out.println(dbClient.getObjectForKey(key));
                */
	        /**
	         * Delete the Object
	         */
                String key="929a3bb8-849d-4206-ab39-340ff6b47aed";
	        dbClient.deleteObjectForKey(key);
	    }
           /* public static void create()
            {
                String incomingObject = "{\"name\":\"mkyong\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	       
	
                String inObject = "{\"name\":\"mcdcdsng\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	        String iObject = "{\"name\":\"dsvAS\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
                String io = "{\"name\":\"mcdcdsng\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	        String ip = "{\"name\":\"dsvAS\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	        String iq = "{\"name\":\"mcdcdsng\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	        String ir = "{\"name\":\"dsvAS\",\"age\":35,\"position\":[\"Founder\",\"CTO\",\"Writer\"],\"skills\":[\"java\",\"python\",\"node\",\"kotlin\"],\"salary\":{\"2018\":14000,\"2012\":12000,\"2010\":10000}}\n";
	     
	       
             dbClient.createObject(incomingObject);
             dbClient.createObject(iObject);
             dbClient.createObject(io);
             dbClient.createObject(ip);
             dbClient.createObject(iq);
             dbClient.createObject(ir);
            }
            public static void read()
            {
                
            }
            public static void delete()
            {
                
            }*/
}
	



