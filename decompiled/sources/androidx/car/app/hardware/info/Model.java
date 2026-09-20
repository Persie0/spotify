package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;
import p204p.juh0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Model {
    private final CarValue<String> mManufacturer;
    private final CarValue<String> mName;
    private final CarValue<Integer> mYear;

    public Model(juh0 juh0Var) {
        CarValue<String> carValue = juh0Var.f116112a;
        Objects.requireNonNull(carValue);
        this.mName = carValue;
        CarValue<String> carValue2 = juh0Var.f116114c;
        Objects.requireNonNull(carValue2);
        this.mManufacturer = carValue2;
        CarValue<Integer> carValue3 = juh0Var.f116113b;
        Objects.requireNonNull(carValue3);
        this.mYear = carValue3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Model)) {
            return false;
        }
        Model model = (Model) obj;
        return Objects.equals(this.mName, model.mName) && Objects.equals(this.mYear, model.mYear) && Objects.equals(this.mManufacturer, model.mManufacturer);
    }

    public CarValue<String> getManufacturer() {
        CarValue<String> carValue = this.mManufacturer;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<String> getName() {
        CarValue<String> carValue = this.mName;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getYear() {
        CarValue<Integer> carValue = this.mYear;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mYear, this.mManufacturer);
    }

    public String toString() {
        return "[ name: " + this.mName + ", year: " + this.mYear + ", manufacturer: " + this.mManufacturer + "]";
    }

    private Model() {
        CarValue<String> carValue = CarValue.UNKNOWN_STRING;
        this.mName = carValue;
        this.mManufacturer = carValue;
        this.mYear = CarValue.UNKNOWN_INTEGER;
    }
}
