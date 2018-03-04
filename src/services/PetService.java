package services;

import Util.HandleCSV;
import domain.Pet;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class PetService {

    HandleCSV csv;
    List<Pet> listPets;

    public PetService()
    {
        csv=new HandleCSV();
    }

    public List<Pet> readAll(String fileName){

        listPets= csv.readCSV(fileName);
        return listPets;
    }

    public void findByType(String s) {
        listPets.stream().filter(p ->s.equals(p.getType())).
                sorted(comparing(Pet::getDate)).
                forEach(System.out::println);
    }

    public void findByName(String s) {
        listPets.stream().filter(p ->s.equals(p.getName())).
                sorted(comparing(Pet::getDate)).
                forEach(System.out::println);
    }


    public void findByTypeAndGender(String type, String gender) {
        listPets.stream().filter(p ->gender.equals(p.getGender())&&type.equals(p.getType())).
                sorted(comparing(Pet::getDate)).
                forEach(System.out::println);
    }
}
