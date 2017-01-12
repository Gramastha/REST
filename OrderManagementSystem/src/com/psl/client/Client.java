package com.psl.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

import com.psl.beans.PurchaseOrder;
import com.psl.utility.PurchaseOrderManagerImpl;


public class Client {

	public static void main(String[] args) throws ClassNotFoundException {
		PurchaseOrderManagerImpl pimpl= new PurchaseOrderManagerImpl();
		//System.out.println(pimpl.populateStoreItems());
		 try(
			      InputStream file = new FileInputStream("PoNo_99.ser");
			     
			      ObjectInput input = new ObjectInputStream (file);
			    ){
			     
			 PurchaseOrder pp=(PurchaseOrder)input.readObject();
			     System.out.println(pp);
			      
			    } catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    			 
			  

	}

}
