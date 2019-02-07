package abes.step_subArea_RegularExpressions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaCodeGenerated {
    //Signature originale de la méthode public SortedMap<String, SortedMap<String, String>> constructMapWithRegex(String string) {
    //ne pas oublier le paramètre externe selon la configuration du projet
    public void constructMapWithRegex() {
        //Fichier splité ligne par ligne préalablement
        String lineToMatch = "E574 #########$a02-12-05$bsggsx$f45re5$e56dsfqf56q5s";

        //Booléan regex

        //Regex qui identifie les zones non systemes,
        //elles peuvent commencer par un E majuscule ou minuscule excepté le A, et contenir une serie de chiffres.
        Pattern standardZoneRegexPattern = Pattern.compile("^[^A][E/i]?\\d*");
        Matcher standardZoneRegexFinded = standardZoneRegexPattern.matcher(lineToMatch); //use .find() on watcher to use boolean

        //Regex identifiant les zones systèmes A97, A98, A99
        Pattern systemZonesRegexPattern = Pattern.compile("^[A][9][789]\\d*");
        Matcher systemZonesRegexFinded = systemZonesRegexPattern.matcher(lineToMatch);

        //Regex identifiant la zone système A97
        Pattern systemZone97RegexPattern = Pattern.compile("^[A][9][7]\\d*");
        Matcher systemZones97RegexFinded = systemZone97RegexPattern.matcher(lineToMatch);

        //Regex identifiant la zone système A98
        Pattern systemZone98RegexPattern = Pattern.compile("^[A][9][8]\\d*");
        Matcher systemZones98RegexFinded = systemZone98RegexPattern.matcher(lineToMatch);

        //SortedMap<String, SortedMap<String, String>> localMap = new TreeMap<>();

        //pattern servant à la compilation de la regex
        Pattern pattern;
        Matcher matcher;

        //NOTE En cas d'extension du nombre de sous zones possibles par zone,
        // il suffit d'augmenter le nombre de groupes szvN / szkN et aussi d'augmenter le compteur dans la boucle for

        //Traduction des acronymes de groupe de la zone système
        //zStaName := nom de la ZONE
        //zStaSpace := espaces au nombre indeterminés entre la ZONE et le début de la suite de sous-zones ou dièses
        //szk(n) := clé n d'une sous-zone
        //szv(n) := valeur n d'une sous zone

        //Traduction des acronymes de groupe des zones système
        //zSysName := nom de la zone système
        //zSysSpace := espaces au nombre indeterminé entre le nom de la zone système et les informations
        //zSysv(n) := valeur n d'une zone système, zSysv0:97 = DATE, zSysv1:97 = HOUR, zSysv0:98 = RCR, zSysv1:98 = DATE, zSysv0
        //zSysSpace2 := espacement hypothetique entre la fin de la sous zone (espacements inutiles)

        final String standardZoneRegex = "^(?<zStaName>[^A][\\w][\\d]*)*(?<zStaSpace>\\s*)?(?<zStaHash>[#]*) *((?<szk0>[$][a-z])(?<szv0>[^$]*))? *((?<szk1>[$][a-z])(?<szv1>[^$]*))? *((?<szk2>[$][a-z])(?<szv2>[^$]*))? *((?<szk3>[$][a-z])(?<szv3>[^$]*))? *((?<szk4>[$][a-z])(?<szv4>[^$]*))? *((?<szk5>[$][a-z])(?<szv5>[^$]*))? *((?<szk6>[$][a-z])(?<szv6>[^$]*))? *((?<szk7>[$][a-z])(?<szv7>[^$]*))? *((?<szk8>[$][a-z])(?<szv8>[^$]*))? *((?<szk9>[$][a-z])(?<szv9>[^$]*))? *((?<szk10>[$][a-z])(?<szv10>[^$]*))? *((?<szk11>[$][a-z])(?<szv11>[^$]*))? *((?<szk12>[$][a-z])(?<szv12>[^$]*))? *((?<szk13>[$][a-z])(?<szv13>[^$]*))? *((?<szk14>[$][a-z])(?<szv14>[^$]*))? *((?<szk15>[$][a-z])(?<szv15>[^$]*))? *((?<szk16>[$][a-z])(?<szv16>[^$]*))? *((?<szk17>[$][a-z])(?<szv17>[^$]*))? *((?<szk18>[$][a-z])(?<szv18>[^$]*))? *((?<szk19>[$][a-z])(?<szv19>[^$]*))? *((?<szk20>[$][a-z])(?<szv20>[^$]*))? *((?<szk21>[$][a-z])(?<szv21>[^$]*))? *((?<szk22>[$][a-z])(?<szv22>[^$]*))? *((?<szk23>[$][a-z])(?<szv23>[^$]*))? *((?<szk24>[$][a-z])(?<szv24>[^$]*))? *((?<szk25>[$][a-z])(?<szv25>[^$]*))? *((?<szk26>[$][a-z])(?<szv26>[^$]*))? *((?<szk27>[$][a-z])(?<szv27>[^$]*))? *((?<szk28>[$][a-z])(?<szv28>[^$]*))? *((?<szk29>[$][a-z])(?<szv29>[^$]*))? *((?<szk30>[$][a-z])(?<szv30>[^$]*))? *((?<szk31>[$][a-z])(?<szv31>[^$]*))? *((?<szk32>[$][a-z])(?<szv32>[^$]*))? *((?<szk33>[$][a-z])(?<szv33>[^$]*))? *((?<szk34>[$][a-z])(?<szv34>[^$]*))? *((?<szk35>[$][a-z])(?<szv35>[^$]*))? *((?<szk36>[$][a-z])(?<szv36>[^$]*))? *((?<szk37>[$][a-z])(?<szv37>[^$]*))? *((?<szk38>[$][a-z])(?<szv38>[^$]*))? *((?<szk39>[$][a-z])(?<szv39>[^$]*))? *((?<szk40>[$][a-z])(?<szv40>[^$]*))? *((?<szk41>[$][a-z])(?<szv41>[^$]*))? *((?<szk42>[$][a-z])(?<szv42>[^$]*))? *((?<szk43>[$][a-z])(?<szv43>[^$]*))? *((?<szk44>[$][a-z])(?<szv44>[^$]*))? *((?<szk45>[$][a-z])(?<szv45>[^$]*))? *((?<szk46>[$][a-z])(?<szv46>[^$]*))? *((?<szk47>[$][a-z])(?<szv47>[^$]*))? *((?<szk48>[$][a-z])(?<szv48>[^$]*))? *((?<szk49>[$][a-z])(?<szv49>[^$]*))? *((?<szk50>[$][a-z])(?<szv50>[^$]*))?";
        final String systemZone97Regex = "^(?<zSysName>[A][\\d]*)? *(?<zSysSpace>\\s*)? *(?<zSysv0>[\\d][\\d][-][\\d][\\d][-][\\d][\\d])? *(?<zSysv1>\\d\\d:\\d\\d:\\d\\d.?\\d?\\d?\\d?)? *(?<zSysSpace2>\\s*)?";
        final String systemZone98Regex = "^(?<zSysName>[A][\\d]*)? *(?<zSysSpace>\\s*)? *(?<zSysv0>\\d{1,9}:?)? *(?<zSysv1>\\d\\d-\\d\\d-\\d\\d)?";
        final String systemZone99Regex = "^(?<zSysName>[A][\\d]*)? *(?<zSysSpace>\\s*)? *(?<zSysv0>\\d{1,9}:?)? *(?<zSysSpace2>\\s*)?";

        //Controle si standardZone contient des elements,
        // si c'est le cas, la regex à matché et ça renvoie true
        if (standardZoneRegexFinded.find()) {
            pattern = Pattern.compile(standardZoneRegex);
            matcher = pattern.matcher(lineToMatch);

            while (matcher.find()) {
                if (matcher.group("zStaName") != null) {
                    //TODO a la place des sout remplir la KeyMap
                    System.out.println(matcher.group("zStaName"));
                }
                if (matcher.group("zStaHash") != null) {
                    System.out.println(matcher.group("zStaHash"));
                }
                for (int i = 0; i <= 50; i++) {
                    if (matcher.group("szv" + i) != null) {
                        System.out.println(matcher.group("szk" + i) + ": " + matcher.group("szv" + i));
                    }
                }
            }
        } else if (systemZonesRegexFinded.find()) {
            if (systemZones97RegexFinded.find()) {
                pattern = Pattern.compile(systemZone97Regex);
                matcher = pattern.matcher(lineToMatch);

                while (matcher.find()) {
                    if (matcher.group("zSysName") != null) {
                        System.out.println(matcher.group("zSysName"));
                    }
                    if (matcher.group("zSysv0") != null) {
                        System.out.println(matcher.group("zSysv0"));
                    }
                    if (matcher.group("zSysv1") != null) {
                        System.out.println(matcher.group("zSysv1"));
                    }
                }
            } else if (systemZones98RegexFinded.find()) {
                pattern = Pattern.compile(systemZone98Regex);
                matcher = pattern.matcher(lineToMatch);

                while (matcher.find()) {
                    if (matcher.group("zSysName") != null) {
                        System.out.println(matcher.group("zSysName"));
                    }
                    if (matcher.group("zSysv0") != null) {
                        System.out.println(matcher.group("zSysv0"));
                    }
                    if (matcher.group("zSysv1") != null) {
                        System.out.println(matcher.group("zSysv1"));
                    }
                }
            } else {
                pattern = Pattern.compile(systemZone99Regex);
                matcher = pattern.matcher(lineToMatch);

                while (matcher.find()) {
                    if (matcher.group("zSysName") != null) {
                        System.out.println(matcher.group("zSysName"));
                    }
                    if (matcher.group("zSysv0") != null) {
                        System.out.println(matcher.group("zSysv0"));
                    }
                    if (matcher.group("zSysv1") != null) {
                        System.out.println(matcher.group("zSysv1"));
                    }
                }
            }
        }
    }

    //TODO eclater une string sur plusieurs lignes en une collection de strings d'une ligne créer un reader
    public List<String> listOfLines() {
        List<String> listOfLines = new ArrayList<>();
        BufferedReader reader;
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\villiseck\\fichier_test.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                listOfLines.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }
}
