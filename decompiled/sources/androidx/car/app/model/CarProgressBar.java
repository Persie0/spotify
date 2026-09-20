package androidx.car.app.model;

import java.util.Objects;
import p204p.qzb;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class CarProgressBar {
    private final CarColor mColor;
    private final float mProgress;

    public CarProgressBar(qzb qzbVar) {
        this.mProgress = qzbVar.f194161a;
        this.mColor = qzbVar.f194162b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarProgressBar)) {
            return false;
        }
        CarProgressBar carProgressBar = (CarProgressBar) obj;
        return this.mProgress == carProgressBar.mProgress && Objects.equals(this.mColor, carProgressBar.mColor);
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public float getProgress() {
        return this.mProgress;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.mProgress), this.mColor);
    }

    public String toString() {
        return "[progress: " + this.mProgress + ", color: " + this.mColor + "]";
    }

    private CarProgressBar() {
        this.mProgress = 0.0f;
        this.mColor = null;
    }
}
