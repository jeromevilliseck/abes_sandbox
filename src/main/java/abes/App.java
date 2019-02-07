package abes;

import abes.step_subArea_compareElementsWithEnums.Exemplaire;
import abes.step_subArea_RegularExpressions.JavaCodeGenerated;

public class App 
{
    public static void main( String[] args )
    {

        // START Package demo_compareElementsWithEnums
//        List<Car> carList = new ArrayList<>();
//        carList.add(new Car<Color>("ford", Color.MAGENTA));
//        carList.add(new Car<Color>("renault", Color.SILVER));
//        carList.add(new Car<Color>("chevrolet", Color.RED));
//
//        Collections.sort(carList);
//
//        System.out.println(carList);
        // END Package demo_compareElementsWithEnums


        // START Package step_subArea_compareElementsWithEnums
        Exemplaire exemp = new Exemplaire();

        //Ajouter une zone
        exemp.addZone("930", "$b", "341720001");
        exemp.addZone("930", "$e", "456435464");
        exemp.addZone("930", "$b", "556416145");
        exemp.addZone("930", "$a", "121211212");
        exemp.addZone("930", "$b", "754456846");
        exemp.addZone("e01", "$b", "456456146");

        //Ajouter une sous zone
        exemp.addSousZone("930", "$j", "test");
        exemp.addSousZone("930", "$e", "test2");

        exemp.deleteSousZone("930", "$e");
        exemp.deleteSousZone("e01", "$b");

        //Remplacer
        exemp.replaceSousZone("930", "$a", "bidule");

        System.out.println(exemp.toString());
        //END Package step_subArea


        //START Package step_subAreaRegularExpression
        JavaCodeGenerated instanceToWork = new JavaCodeGenerated();
        instanceToWork.constructMapWithRegex();
    }
}
