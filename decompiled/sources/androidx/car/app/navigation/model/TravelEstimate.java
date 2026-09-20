package androidx.car.app.navigation.model;

import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.DateTimeWithZone;
import androidx.car.app.model.Distance;
import java.util.Objects;
import p204p.ae91;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class TravelEstimate {
    public static final long REMAINING_TIME_UNKNOWN = -1;
    private final DateTimeWithZone mArrivalTimeAtDestination;
    private final Distance mRemainingDistance;
    private final CarColor mRemainingDistanceColor;
    private final CarColor mRemainingTimeColor;
    private final long mRemainingTimeSeconds;
    private final CarIcon mTripIcon;
    private final CarText mTripText;

    private TravelEstimate() {
        this.mRemainingDistance = null;
        this.mRemainingTimeSeconds = 0L;
        this.mArrivalTimeAtDestination = null;
        CarColor carColor = CarColor.DEFAULT;
        this.mRemainingTimeColor = carColor;
        this.mRemainingDistanceColor = carColor;
        this.mTripText = null;
        this.mTripIcon = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelEstimate)) {
            return false;
        }
        TravelEstimate travelEstimate = (TravelEstimate) obj;
        return Objects.equals(this.mRemainingDistance, travelEstimate.mRemainingDistance) && this.mRemainingTimeSeconds == travelEstimate.mRemainingTimeSeconds && Objects.equals(this.mArrivalTimeAtDestination, travelEstimate.mArrivalTimeAtDestination) && Objects.equals(this.mRemainingTimeColor, travelEstimate.mRemainingTimeColor) && Objects.equals(this.mRemainingDistanceColor, travelEstimate.mRemainingDistanceColor) && Objects.equals(this.mTripText, travelEstimate.mTripText) && Objects.equals(this.mTripIcon, travelEstimate.mTripIcon);
    }

    public DateTimeWithZone getArrivalTimeAtDestination() {
        return this.mArrivalTimeAtDestination;
    }

    public Distance getRemainingDistance() {
        return this.mRemainingDistance;
    }

    public CarColor getRemainingDistanceColor() {
        return this.mRemainingDistanceColor;
    }

    public CarColor getRemainingTimeColor() {
        return this.mRemainingTimeColor;
    }

    public long getRemainingTimeSeconds() {
        long j = this.mRemainingTimeSeconds;
        if (j >= 0) {
            return j;
        }
        return -1L;
    }

    public CarIcon getTripIcon() {
        return this.mTripIcon;
    }

    public CarText getTripText() {
        return this.mTripText;
    }

    public int hashCode() {
        return Objects.hash(this.mRemainingDistance, Long.valueOf(this.mRemainingTimeSeconds), this.mArrivalTimeAtDestination, this.mRemainingTimeColor, this.mRemainingDistanceColor, this.mTripText, this.mTripIcon);
    }

    public String toString() {
        return "[ remaining distance: " + this.mRemainingDistance + ", time (s): " + this.mRemainingTimeSeconds + ", ETA: " + this.mArrivalTimeAtDestination + "]";
    }

    public TravelEstimate(ae91 ae91Var) {
        throw null;
    }
}
