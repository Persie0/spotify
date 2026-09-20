package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p204p.ckx0;
import p204p.rzb;
import p204p.wdg1;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Step {
    private final CarText mCue;
    private final List<Lane> mLanes;
    private final CarIcon mLanesImage;
    private final Maneuver mManeuver;
    private final CarText mRoad;

    public Step(Maneuver maneuver, List<Lane> list, CarIcon carIcon, CarText carText, CarText carText2) {
        this.mManeuver = maneuver;
        this.mLanes = wdg1.m87845s(list);
        ckx0.f39110f.m33212k(carIcon);
        this.mLanesImage = carIcon;
        this.mCue = carText;
        this.mRoad = carText2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Step)) {
            return false;
        }
        Step step = (Step) obj;
        return Objects.equals(this.mManeuver, step.mManeuver) && Objects.equals(this.mLanes, step.mLanes) && Objects.equals(this.mLanesImage, step.mLanesImage) && Objects.equals(this.mCue, step.mCue) && Objects.equals(this.mRoad, step.mRoad);
    }

    public CarText getCue() {
        return this.mCue;
    }

    public List<Lane> getLanes() {
        List<Lane> list = this.mLanes;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarIcon getLanesImage() {
        return this.mLanesImage;
    }

    public Maneuver getManeuver() {
        return this.mManeuver;
    }

    public CarText getRoad() {
        return this.mRoad;
    }

    public int hashCode() {
        return Objects.hash(this.mManeuver, this.mLanes, this.mLanesImage, this.mCue, this.mRoad);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[maneuver: ");
        sb.append(this.mManeuver);
        sb.append(", lane count: ");
        List<Lane> list = this.mLanes;
        sb.append(list != null ? list.size() : 0);
        sb.append(", lanes image: ");
        sb.append(this.mLanesImage);
        sb.append(", cue: ");
        sb.append(CarText.toShortString(this.mCue));
        sb.append(", road: ");
        sb.append(CarText.toShortString(this.mRoad));
        sb.append("]");
        return sb.toString();
    }

    private Step() {
        this.mManeuver = null;
        this.mLanes = Collections.EMPTY_LIST;
        this.mLanesImage = null;
        this.mCue = null;
        this.mRoad = null;
    }
}
