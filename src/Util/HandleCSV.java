package Util;

import domain.Pet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HandleCSV {

    public List<Pet> readCSV(String fileName)
    {
        List<Pet> listPets=new ArrayList<Pet>();
        FileReader file=null;
        BufferedReader reader=null;

        try{
            file=new FileReader(fileName);
            reader = new BufferedReader(file);


            String linea;
            Pet pet=null;
            while((linea=reader.readLine())!=null) {
                pet = stringToObject(linea);
                listPets.add(pet);
            }

        }catch(FileNotFoundException e){
            System.out.println("the file not exist");
        }catch(IOException e){
            System.out.println("No se puede leer");
        }finally {
            try{
                if( null != file ){
                    file.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }



        return listPets;
    }
    private Pet stringToObject(String line)
    {
        String[] data = line.split(",");
        String type = data[0];
        String name = data[1];
        String gender = data[2].equals("M")? "Male":"Female";
        String date = data[3];

        return new Pet(type, name, gender, HandleDate.convertStringToDate(date));
    }

}
