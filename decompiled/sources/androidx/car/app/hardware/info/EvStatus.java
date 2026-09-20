package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;
import p204p.rzb;
import p204p.srw;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class EvStatus {
    private final CarValue<Boolean> mEvChargePortConnected;
    private final CarValue<Boolean> mEvChargePortOpen;

    public EvStatus(srw srwVar) {
        this.mEvChargePortConnected = srwVar.f213423b;
        this.mEvChargePortOpen = srwVar.f213422a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvStatus)) {
            return false;
        }
        EvStatus evStatus = (EvStatus) obj;
        return Objects.equals(this.mEvChargePortConnected, evStatus.mEvChargePortConnected) && Objects.equals(this.mEvChargePortOpen, evStatus.mEvChargePortOpen);
    }

    public CarValue<Boolean> getEvChargePortConnected() {
        CarValue<Boolean> carValue = this.mEvChargePortConnected;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Boolean> getEvChargePortOpen() {
        CarValue<Boolean> carValue = this.mEvChargePortOpen;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mEvChargePortOpen, this.mEvChargePortConnected);
    }

    public String toString() {
        return "[ EV charge port open: " + this.mEvChargePortOpen + ", EV charge port connected: " + this.mEvChargePortConnected + "]";
    }

    private EvStatus() {
        CarValue<Boolean> carValue = CarValue.UNKNOWN_BOOLEAN;
        this.mEvChargePortOpen = carValue;
        this.mEvChargePortConnected = carValue;
    }
}
