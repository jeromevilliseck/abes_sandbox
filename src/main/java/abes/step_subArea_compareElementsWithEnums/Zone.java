package abes.step_subArea_compareElementsWithEnums;

import abes.step_subArea_compareElementsWithEnums.enums.sousZones.*;
import abes.step_subArea_compareElementsWithEnums.enums.zones.Exemplaires;
import lombok.Getter;

import java.util.*;

public class Zone implements Comparable<Zone> {
    @Getter
    private Exemplaires label; //identifie la zone
    @Getter
    private List<SousZone> listeSousZones; //sous-zones qui composent la zone

    public Zone(String label, List<SousZone> listeSousZones) {
        this.label = Exemplaires.valueOf(label);
        this.listeSousZones = listeSousZones;
    }

    public Zone(Exemplaires label) {
        this.label = label;
        this.listeSousZones = new ArrayList<>();
    }

    public int compareTo(Zone o) {
        return this.label.compareTo(o.label);
    }

    //Zone, sous zone, valeur
    public void ajoutSousZone(String sousZone, String valeur) {
        switch (this.label) {
            case z915:
                this.listeSousZones.add(new SousZone<Zone_915>(Zone_915.valueOf(sousZone), valeur));
                break;
            case z917:
                this.listeSousZones.add(new SousZone<Zone_917>(Zone_917.valueOf(sousZone), valeur));
                break;
            case z919:
                this.listeSousZones.add(new SousZone<Zone_919>(Zone_919.valueOf(sousZone), valeur));
                break;
            case z930:
                this.listeSousZones.add(new SousZone<Zone_930>(Zone_930.valueOf(sousZone), valeur));
                break;
            case z931:
                this.listeSousZones.add(new SousZone<Zone_931>(Zone_931.valueOf(sousZone), valeur));
                break;
            case z932:
                this.listeSousZones.add(new SousZone<Zone_932>(Zone_932.valueOf(sousZone), valeur));
                break;
            case z955:
                this.listeSousZones.add(new SousZone<Zone_955>(Zone_955.valueOf(sousZone), valeur));
                break;
            case z956:
                this.listeSousZones.add(new SousZone<Zone_956>(Zone_956.valueOf(sousZone), valeur));
                break;
            case z957:
                this.listeSousZones.add(new SousZone<Zone_957>(Zone_957.valueOf(sousZone), valeur));
                break;
            case z958:
                this.listeSousZones.add(new SousZone<Zone_958>(Zone_958.valueOf(sousZone), valeur));
                break;
            case z990:
                this.listeSousZones.add(new SousZone<Zone_990>(Zone_990.valueOf(sousZone), valeur));
                break;
            case z991:
                this.listeSousZones.add(new SousZone<Zone_991>(Zone_991.valueOf(sousZone), valeur));
                break;
            case z992:
                this.listeSousZones.add(new SousZone<Zone_992>(Zone_992.valueOf(sousZone), valeur));
                break;
            case z997:
                this.listeSousZones.add(new SousZone<Zone_997>(Zone_997.valueOf(sousZone), valeur));
                break;
            case z999:
                this.listeSousZones.add(new SousZone<Zone_999>(Zone_999.valueOf(sousZone), valeur));
                break;
            case E012:
                this.listeSousZones.add(new SousZone<Zone_E012>(Zone_E012.valueOf(sousZone), valeur));
                break;
            case E316:
                this.listeSousZones.add(new SousZone<Zone_E316>(Zone_E316.valueOf(sousZone), valeur));
                break;
            case E317:
                this.listeSousZones.add(new SousZone<Zone_E317>(Zone_E317.valueOf(sousZone), valeur));
                break;
            case E318:
                this.listeSousZones.add(new SousZone<Zone_E318>(Zone_E318.valueOf(sousZone), valeur));
                break;
            case E319:
                this.listeSousZones.add(new SousZone<Zone_E319>(Zone_E319.valueOf(sousZone), valeur));
                break;
            case E702:
                this.listeSousZones.add(new SousZone<Zone_E702>(Zone_E702.valueOf(sousZone), valeur));
                break;
            case E712:
                this.listeSousZones.add(new SousZone<Zone_E712>(Zone_E712.valueOf(sousZone), valeur));
                break;
            case E722:
                this.listeSousZones.add(new SousZone<Zone_E722>(Zone_E722.valueOf(sousZone), valeur));
                break;
            default:
                if (this.label.toString().matches("[e]\\d\\d")) {
                    this.listeSousZones.add(new SousZone<Zone_exx>(Zone_exx.valueOf(sousZone), valeur));
                } else if (this.label.toString().matches("[A]\\d\\d")) {
                    this.listeSousZones.add(new SousZone<Zone_Axx>(Zone_Axx.valueOf(sousZone), valeur));
                }
        }
        Collections.sort(this.listeSousZones);
    }

    public void modifierSousZone(String sousZone, String valeur) {
        ListIterator<SousZone> iterator = this.listeSousZones.listIterator();
        while(iterator.hasNext()){
            SousZone localSousZone = iterator.next();
            if(localSousZone.getLabelSousZone().toString().equals(sousZone)){
                localSousZone.setValeur(valeur);
                iterator.set(localSousZone);
            }
        }
    }

    public void deleteSousZone(String sousZone) {
        Iterator<SousZone> it = listeSousZones.iterator();
        while (it.hasNext()) {
            SousZone sousZoneToDelete = it.next();
            switch (this.label) {
                case z915:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_915.valueOf(sousZone)) it.remove();
                    break;
                case z917:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_917.valueOf(sousZone)) it.remove();
                    break;
                case z919:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_919.valueOf(sousZone)) it.remove();
                    break;
                case z930:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_930.valueOf(sousZone)) it.remove();
                    break;
                case z931:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_931.valueOf(sousZone)) it.remove();
                    break;
                case z932:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_932.valueOf(sousZone)) it.remove();
                    break;
                case z955:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_955.valueOf(sousZone)) it.remove();
                    break;
                case z956:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_956.valueOf(sousZone)) it.remove();
                    break;
                case z957:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_957.valueOf(sousZone)) it.remove();
                    break;
                case z958:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_958.valueOf(sousZone)) it.remove();
                    break;
                case z990:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_990.valueOf(sousZone)) it.remove();
                    break;
                case z991:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_991.valueOf(sousZone)) it.remove();
                    break;
                case z992:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_992.valueOf(sousZone)) it.remove();
                    break;
                case z997:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_997.valueOf(sousZone)) it.remove();
                    break;
                case z999:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_999.valueOf(sousZone)) it.remove();
                    break;
                case E012:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_E012.valueOf(sousZone)) it.remove();
                    break;
                case E316:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_E316.valueOf(sousZone)) it.remove();
                    break;
                case E317:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_E317.valueOf(sousZone)) it.remove();
                    break;
                case E318:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_E318.valueOf(sousZone)) it.remove();
                    break;
                case E319:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_E319.valueOf(sousZone)) it.remove();
                    break;
                case E702:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_E702.valueOf(sousZone)) it.remove();
                    break;
                case E712:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_E712.valueOf(sousZone)) it.remove();
                    break;
                case E722:
                    if (sousZoneToDelete.getLabelSousZone() == Zone_E722.valueOf(sousZone)) it.remove();
                    break;
                default:
                    if (this.label.toString().matches("[e]\\d\\d")) it.remove();
                    else if (this.label.toString().matches("[A]\\d\\d")) it.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "Zone{" +
                "label=" + label +
                ", listeSousZones=" + listeSousZones +
                '}';
    }
}
