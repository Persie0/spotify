package androidx.car.app.model;

import java.util.Objects;
import p204p.n5o0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Place {
    private final CarLocation mLocation;
    private final PlaceMarker mMarker;

    public Place(n5o0 n5o0Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return Objects.equals(this.mLocation, place.mLocation) && Objects.equals(this.mMarker, place.mMarker);
    }

    public CarLocation getLocation() {
        CarLocation carLocation = this.mLocation;
        Objects.requireNonNull(carLocation);
        return carLocation;
    }

    public PlaceMarker getMarker() {
        return this.mMarker;
    }

    public int hashCode() {
        return Objects.hash(this.mLocation, this.mMarker);
    }

    public String toString() {
        return "[ location: " + this.mLocation + ", marker: " + this.mMarker + "]";
    }

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }
}
