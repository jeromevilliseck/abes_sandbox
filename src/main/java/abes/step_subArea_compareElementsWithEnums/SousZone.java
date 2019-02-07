package abes.step_subArea_compareElementsWithEnums;

import lombok.Getter;
import lombok.Setter;

public class SousZone<K extends Enum<K>> implements Comparable<SousZone> {
    @Getter
    private Enum<K> labelSousZone;
    @Setter
    private String valeur;

    public SousZone(Enum<K> labelSousZone, String valeur) {
        this.labelSousZone = labelSousZone;
        this.valeur = valeur;
    }

    @Override
    public int compareTo(SousZone o) {
        return this.getLabelSousZone().compareTo((K) o.getLabelSousZone());
    }

    @Override
    public String toString() {
        return "SousZone{" +
                "labelSousZone=" + labelSousZone +
                ", valeur='" + valeur + '\'' +
                '}';
    }
}
