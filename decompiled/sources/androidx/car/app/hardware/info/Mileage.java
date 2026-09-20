package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;
import p204p.cef0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Mileage {
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Float> mOdometerMeters;

    public Mileage(cef0 cef0Var) {
        CarValue<Float> carValue = cef0Var.f37119a;
        Objects.requireNonNull(carValue);
        this.mOdometerMeters = carValue;
        CarValue<Integer> carValue2 = cef0Var.f37120b;
        Objects.requireNonNull(carValue2);
        this.mDistanceDisplayUnit = carValue2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        return Objects.equals(getOdometerInKilometers(), mileage.getOdometerInKilometers()) && Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getOdometerInKilometers() {
        CarValue<Float> carValue = this.mOdometerMeters;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    @Deprecated
    public CarValue<Float> getOdometerMeters() {
        return getOdometerInKilometers();
    }

    public int hashCode() {
        return Objects.hash(getOdometerInKilometers(), this.mDistanceDisplayUnit);
    }

    public String toString() {
        return "[ odometer: " + getOdometerInKilometers() + ", distance display unit: " + this.mDistanceDisplayUnit + "]";
    }

    private Mileage() {
        this.mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }
}
