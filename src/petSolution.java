import domain.Pet;
import services.PetService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class petSolution {

    public static void main(String[] args) {

        PetService service=new PetService();
        if (args.length>=1)
        {
            System.out.println("Se realizo la lectura de datos de "+args[0]);
            List<Pet> list=service.readAll(args[0]);
            Collections.sort(list);
            System.out.println( list);

            List<Pet> listPetsSearch=new ArrayList<Pet>();

            if (args.length==2)
            {
                System.out.println("RESULTADO DE LA BUSQUEDA\n");
                String[] searchBy=args[1].split("=");
                if(searchBy[0].equals("type"))
                {
                    service.findByType(searchBy[1]);

                }
                if(searchBy[0].equals("name"))
                {
                    service.findByName(searchBy[1]);
                }

            }
            if (args.length==3)
            {
                System.out.println("RESULTADO DE LA BUSQUEDA\n");
                String[] searchBy=args[1].split("=");
                String[] searchBy2=args[2].split("=");
                if(searchBy[0].equals("type")&&searchBy2[0].equals("gender"))
                {
                    service.findByTypeAndGender(searchBy[1],searchBy2[1]);

                }
                if(searchBy[0].equals("gender")&&searchBy2[0].equals("type"))
                {
                    service.findByTypeAndGender(searchBy2[1],searchBy[1]);
                }

            }
        }

    }
}
