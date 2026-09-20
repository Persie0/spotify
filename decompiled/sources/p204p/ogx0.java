package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class ogx0 {

    /* JADX INFO: renamed from: a */
    public final float f165287a;

    /* JADX INFO: renamed from: b */
    public final float f165288b;

    /* JADX INFO: renamed from: c */
    public final float f165289c;

    /* JADX INFO: renamed from: d */
    public final float f165290d;

    public ogx0(float f, float f2, float f3, float f4) {
        this.f165287a = f;
        this.f165288b = f2;
        this.f165289c = f3;
        this.f165290d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogx0)) {
            return false;
        }
        ogx0 ogx0Var = (ogx0) obj;
        return this.f165287a == ogx0Var.f165287a && this.f165288b == ogx0Var.f165288b && this.f165289c == ogx0Var.f165289c && this.f165290d == ogx0Var.f165290d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f165290d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f165287a) * 31, 31, this.f165288b), 31, this.f165289c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f165287a);
        sb.append(", focusedAlpha=");
        sb.append(this.f165288b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f165289c);
        sb.append(", pressedAlpha=");
        return ms2.m62684i(sb, this.f165290d, ')');
    }
}
