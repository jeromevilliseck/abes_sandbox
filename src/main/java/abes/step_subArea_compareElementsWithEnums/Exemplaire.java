package abes.step_subArea_compareElementsWithEnums;

import abes.step_subArea_compareElementsWithEnums.enums.zones.Exemplaires;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exemplaire {
    @Getter
    private List<Zone> listeZones;

    public Exemplaire(List<Zone> listeSousZones) {
        this.listeZones = listeSousZones;
    }

    public Exemplaire() {
        this.listeZones = new ArrayList<>();
    }

    public void addZone(String zone, String sousZone, String valeur) {
        Zone buffer = new Zone(Exemplaires.valueOf(getStringFromZone(zone)));
        buffer.ajoutSousZone(sousZone, valeur);
        listeZones.add(buffer);
    }

    private String getStringFromZone(String zone) {
        if (zone.matches("[9]\\d\\d")) {
            return "z" + zone;
        } else {
            return zone;
        }
    }
    private List<Zone> findZones(String label) {
        List<Zone> zonesfinded = new ArrayList<>();
        for (Zone localZone : this.listeZones) {
            if (localZone.getLabel() == Exemplaires.valueOf(label)) {
                zonesfinded.add(localZone);
            }
        }
        return zonesfinded;
    }

    public void addSousZone(String zone, String sousZone, String valeur) {
        List<Zone> zonesToBeAdded = new ArrayList<>();
        for (Zone localZone : this.findZones(getStringFromZone(zone))) {
            localZone.ajoutSousZone(sousZone, valeur);
            zonesToBeAdded.add(localZone);
        }
        deleteZone(getStringFromZone(zone)); //supprimer au préalable les zone modifiées pour les réensérer
        this.listeZones.addAll(zonesToBeAdded); //réajouter les zone modifiées finales dans la liste membre
        Collections.sort(this.listeZones);
    }

    public void deleteZone(String zone) {
        Iterator<Zone> it = this.listeZones.iterator();
        while (it.hasNext()) {
            Zone zonetodelete = it.next();
            if (zonetodelete.getLabel() == Exemplaires.valueOf(getStringFromZone(zone))) {
                it.remove();
            }
        }
    }

    public void deleteSousZone(String zone, String sousZone) {
        Iterator<Zone> it = this.listeZones.iterator();
        while (it.hasNext()) {
            Zone zoneToTreat = it.next();
            if (zoneToTreat.getLabel() == Exemplaires.valueOf(getStringFromZone(zone))) {
                zoneToTreat.deleteSousZone(sousZone);
                if (zoneToTreat.getListeSousZones().isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public void replaceSousZone(String zone, String sousZone, String valeur){
        for (Zone localzone : this.findZones(getStringFromZone(zone))){
            localzone.modifierSousZone(sousZone, valeur);
            Collections.sort(this.listeZones);
        }
    }

    @Override
    public String toString() {
        return "Exemplaire{" +
                "listeZones=" + listeZones +
                '}';
    }
}
