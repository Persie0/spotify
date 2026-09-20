package androidx.car.app.model;

import java.util.Objects;
import p204p.ckx0;
import p204p.dq60;
import p204p.rzb;
import p204p.s571;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final CarIcon mIcon;

    private CarIconSpan(CarIcon carIcon, int i) {
        this.mIcon = carIcon;
        this.mAlignment = i;
    }

    private static String alignmentToString(int i) {
        if (i == 0) {
            return "bottom";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "center";
        }
        return "baseline";
    }

    public static CarIconSpan create(CarIcon carIcon) {
        return create(carIcon, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarIconSpan) {
            return Objects.equals(this.mIcon, ((CarIconSpan) obj).mIcon);
        }
        return false;
    }

    public int getAlignment() {
        return this.mAlignment;
    }

    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        Objects.requireNonNull(carIcon);
        return carIcon;
    }

    public int hashCode() {
        return Objects.hashCode(this.mIcon);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[icon: ");
        sb.append(this.mIcon);
        sb.append(", alignment: ");
        return dq60.m36616p(alignmentToString(this.mAlignment), "]", sb);
    }

    public static CarIconSpan create(CarIcon carIcon, int i) {
        ckx0.f39110f.m33212k(carIcon);
        if (i != 1 && i != 0 && i != 2) {
            throw new IllegalStateException(s571.m77246e(i, "Invalid alignment value: "));
        }
        Objects.requireNonNull(carIcon);
        return new CarIconSpan(carIcon, i);
    }

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }
}
