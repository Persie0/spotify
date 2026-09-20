package androidx.car.app.hardware.common;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class CarValue<T> {
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_UNAVAILABLE = 3;
    public static final int STATUS_UNIMPLEMENTED = 2;
    public static final int STATUS_UNKNOWN = 0;
    private final List<CarZone> mCarZones;
    private final int mStatus;
    private final long mTimestampMillis;
    private final T mValue;
    public static final CarValue<Integer> UNIMPLEMENTED_INTEGER = unimplemented();
    public static final CarValue<Integer> UNKNOWN_INTEGER = unknown();
    public static final CarValue<Boolean> UNKNOWN_BOOLEAN = unknown();
    public static final CarValue<Float> UNKNOWN_FLOAT = unknown();
    public static final CarValue<String> UNKNOWN_STRING = unknown();
    public static final CarValue<List<Float>> UNIMPLEMENTED_FLOAT_LIST = unimplemented();
    public static final CarValue<List<Float>> UNKNOWN_FLOAT_LIST = unknown();
    public static final CarValue<List<Integer>> UNKNOWN_INTEGER_LIST = unknown();
    public static final CarValue<Integer[]> UNKNOWN_INTEGER_ARRAY = unknown();

    public CarValue(T t, long j, int i) {
        this.mValue = t;
        this.mTimestampMillis = j;
        this.mStatus = i;
        this.mCarZones = Collections.singletonList(CarZone.CAR_ZONE_GLOBAL);
    }

    private static <T> CarValue<T> unimplemented() {
        return new CarValue<>(null, 0L, 2);
    }

    private static <T> CarValue<T> unknown() {
        return new CarValue<>(null, 0L, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarValue)) {
            return false;
        }
        CarValue carValue = (CarValue) obj;
        return Objects.equals(this.mValue, carValue.mValue) && this.mTimestampMillis == carValue.mTimestampMillis && this.mStatus == carValue.mStatus && Objects.equals(this.mCarZones, carValue.mCarZones);
    }

    public List<CarZone> getCarZones() {
        return this.mStatus == 2 ? Collections.EMPTY_LIST : this.mCarZones;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getTimestampMillis() {
        return this.mTimestampMillis;
    }

    public T getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return Objects.hash(this.mValue, Long.valueOf(this.mTimestampMillis), Integer.valueOf(this.mStatus), this.mCarZones);
    }

    public String toString() {
        return "[value: " + this.mValue + ", timestamp: " + this.mTimestampMillis + ", Status: " + this.mStatus + ", CarZones: " + this.mCarZones + "]";
    }

    public CarValue(T t, long j, int i, List<CarZone> list) {
        this.mValue = t;
        this.mTimestampMillis = j;
        this.mStatus = i;
        this.mCarZones = list;
    }

    private CarValue() {
        this.mValue = null;
        this.mTimestampMillis = 0L;
        this.mStatus = 0;
        this.mCarZones = Collections.EMPTY_LIST;
    }
}
