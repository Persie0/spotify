package androidx.car.app.model;

import java.util.Objects;
import p204p.hp8;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class Badge {
    private final CarColor mDotColor;
    private final boolean mHasDot;
    private final CarIcon mIcon;
    private final CarColor mIconBackgroundColor;

    public Badge(hp8 hp8Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.mHasDot == badge.mHasDot && Objects.equals(this.mDotColor, badge.mDotColor) && Objects.equals(this.mIcon, badge.mIcon) && Objects.equals(this.mIconBackgroundColor, badge.mIconBackgroundColor);
    }

    @Deprecated
    public CarColor getBackgroundColor() {
        return this.mDotColor;
    }

    public CarColor getDotColor() {
        return this.mDotColor;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public CarColor getIconBackgroundColor() {
        return this.mIconBackgroundColor;
    }

    public boolean hasDot() {
        return this.mHasDot;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mHasDot), this.mDotColor, this.mIcon, this.mIconBackgroundColor);
    }

    public String toString() {
        return "[hasDot: " + this.mHasDot + ", dotColor: " + this.mDotColor + ", icon: " + this.mIcon + ", iconBackgroundColor: " + this.mIconBackgroundColor + "]";
    }

    private Badge() {
        this.mHasDot = false;
        this.mDotColor = null;
        this.mIcon = null;
        this.mIconBackgroundColor = null;
    }
}
