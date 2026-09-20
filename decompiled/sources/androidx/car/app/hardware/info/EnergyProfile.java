package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import java.util.List;
import java.util.Objects;
import p204p.rzb;
import p204p.w6v;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class EnergyProfile {
    public static final int EVCONNECTOR_TYPE_CHADEMO = 3;
    public static final int EVCONNECTOR_TYPE_COMBO_1 = 4;
    public static final int EVCONNECTOR_TYPE_COMBO_2 = 5;
    public static final int EVCONNECTOR_TYPE_GBT = 9;
    public static final int EVCONNECTOR_TYPE_GBT_DC = 10;
    public static final int EVCONNECTOR_TYPE_J1772 = 1;
    public static final int EVCONNECTOR_TYPE_MENNEKES = 2;
    public static final int EVCONNECTOR_TYPE_OTHER = 101;
    public static final int EVCONNECTOR_TYPE_SCAME = 11;
    public static final int EVCONNECTOR_TYPE_TESLA_HPWC = 7;
    public static final int EVCONNECTOR_TYPE_TESLA_ROADSTER = 6;
    public static final int EVCONNECTOR_TYPE_TESLA_SUPERCHARGER = 8;
    public static final int EVCONNECTOR_TYPE_UNKNOWN = 0;
    public static final int FUEL_TYPE_BIODIESEL = 5;
    public static final int FUEL_TYPE_CNG = 8;
    public static final int FUEL_TYPE_DIESEL_1 = 3;
    public static final int FUEL_TYPE_DIESEL_2 = 4;
    public static final int FUEL_TYPE_E85 = 6;
    public static final int FUEL_TYPE_ELECTRIC = 10;
    public static final int FUEL_TYPE_HYDROGEN = 11;
    public static final int FUEL_TYPE_LEADED = 2;
    public static final int FUEL_TYPE_LNG = 9;
    public static final int FUEL_TYPE_LPG = 7;
    public static final int FUEL_TYPE_OTHER = 12;
    public static final int FUEL_TYPE_UNKNOWN = 0;
    public static final int FUEL_TYPE_UNLEADED = 1;
    private final CarValue<List<Integer>> mEvConnectorTypes;
    private final CarValue<List<Integer>> mFuelTypes;

    public EnergyProfile(w6v w6vVar) {
        CarValue<List<Integer>> carValue = w6vVar.f248470a;
        Objects.requireNonNull(carValue);
        this.mEvConnectorTypes = carValue;
        CarValue<List<Integer>> carValue2 = w6vVar.f248471b;
        Objects.requireNonNull(carValue2);
        this.mFuelTypes = carValue2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyProfile)) {
            return false;
        }
        EnergyProfile energyProfile = (EnergyProfile) obj;
        return Objects.equals(this.mEvConnectorTypes, energyProfile.mEvConnectorTypes) && Objects.equals(this.mFuelTypes, energyProfile.mFuelTypes);
    }

    public CarValue<List<Integer>> getEvConnectorTypes() {
        CarValue<List<Integer>> carValue = this.mEvConnectorTypes;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<List<Integer>> getFuelTypes() {
        CarValue<List<Integer>> carValue = this.mFuelTypes;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mEvConnectorTypes, this.mFuelTypes);
    }

    public String toString() {
        return "[ evConnectorTypes: " + this.mEvConnectorTypes + ", fuelTypes: " + this.mFuelTypes + "]";
    }

    private EnergyProfile() {
        CarValue<List<Integer>> carValue = CarValue.UNKNOWN_INTEGER_LIST;
        this.mEvConnectorTypes = carValue;
        this.mFuelTypes = carValue;
    }
}
