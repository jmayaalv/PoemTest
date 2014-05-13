package start;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;


public class FileManager {
	
	public String[] poem;
	 
	public String[] line;
	public String[] lineReference;
	
	public String[] adjective;
	public String[] adjectiveReference;
	
	public String[] noun;
	public String[] nounReference;
	
   	public String[] pronoun;
	public String[] pronounReference;
	
	public String[] verb;
	public String[] verbReference;
	
	public String[] preposition;
	public String[] prepositionReference;
	
	
	
	   public void setData() {
		   try{
      	
	            // Open file
	            FileInputStream fstream = new FileInputStream("/home/obelix/fileTest.txt");
	            DataInputStream entrada = new DataInputStream(fstream);
	            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
	            String strLinea;
	            // read file, line to line
	            while ((strLinea = buffer.readLine()) != null)   {
	                             
	                if(strLinea.substring(0, strLinea.indexOf(":")).contentEquals("POEM")){
	                	poem = (strLinea.substring(strLinea.indexOf("{")+1,strLinea.indexOf("}") )).split(",");
	                }else
	                    if(strLinea.substring(0, strLinea.indexOf(":")).contentEquals("LINE")){
	                    	line = (strLinea.substring(strLinea.indexOf("{")+1,strLinea.indexOf("}") )).split("\\|");
	                    	lineReference = (strLinea.substring(strLinea.lastIndexOf("{")+1,strLinea.lastIndexOf("}") )).split("\\|");
	                    }
	                    else
	                        if(strLinea.substring(0, strLinea.indexOf(":")).contentEquals("ADJECTIVE")){
	                        	adjective = (strLinea.substring(strLinea.indexOf("{")+1,strLinea.indexOf("}") )).split("\\|");
	                        	adjectiveReference = (strLinea.substring(strLinea.lastIndexOf("{")+1,strLinea.lastIndexOf("}") )).split("\\|");
	                        }
	                        else
	                            if(strLinea.substring(0, strLinea.indexOf(":")).contentEquals(("NOUN"))){
	                            	noun = (strLinea.substring(strLinea.indexOf("{")+1,strLinea.indexOf("}") )).split("\\|");
	                            	nounReference = (strLinea.substring(strLinea.lastIndexOf("{")+1,strLinea.lastIndexOf("}") )).split("\\|");
	                            }
	                            else
	                                if(strLinea.substring(0, strLinea.indexOf(":")).contentEquals("PRONOUN")){
	                                	pronoun = (strLinea.substring(strLinea.indexOf("{")+1,strLinea.indexOf("}") )).split("\\|");
	                                	pronounReference = (strLinea.substring(strLinea.lastIndexOf("{")+1,strLinea.lastIndexOf("}") )).split("\\|");
	                                }
	                            else
	                                if(strLinea.substring(0, strLinea.indexOf(":")).contentEquals("VERB")){
	                                	verb = (strLinea.substring(strLinea.indexOf("{")+1,strLinea.indexOf("}") )).split("\\|");
	                                	verbReference = (strLinea.substring(strLinea.lastIndexOf("{")+1,strLinea.lastIndexOf("}") )).split("\\|");
	                                }else
	                                    if(strLinea.substring(0, strLinea.indexOf(":")).contentEquals("PREPOSITION")){
	                                    	preposition = (strLinea.substring(strLinea.indexOf("{")+1,strLinea.indexOf("}") )).split("\\|");
	                                    	prepositionReference = (strLinea.substring(strLinea.lastIndexOf("{")+1,strLinea.lastIndexOf("}") )).split("\\|");
	                                    }
	                
	            }
	            // close file
	            entrada.close();
	        }catch (Exception e){
	            System.err.println("Error: " + e.getMessage());
	        }
	    
	   
	   
	   }
}
