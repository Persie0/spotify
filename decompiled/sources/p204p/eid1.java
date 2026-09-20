package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class eid1 {

    /* JADX INFO: renamed from: a */
    public final float f59856a;

    /* JADX INFO: renamed from: b */
    public final float f59857b;

    /* JADX INFO: renamed from: c */
    public final float f59858c;

    /* JADX INFO: renamed from: d */
    public final float f59859d;

    public eid1(float f, float f2, float f3, float f4) {
        this.f59856a = f;
        this.f59857b = f2;
        this.f59858c = f3;
        this.f59859d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eid1)) {
            return false;
        }
        eid1 eid1Var = (eid1) obj;
        return Float.compare(this.f59856a, eid1Var.f59856a) == 0 && Float.compare(this.f59857b, eid1Var.f59857b) == 0 && Float.compare(this.f59858c, eid1Var.f59858c) == 0 && Float.compare(this.f59859d, eid1Var.f59859d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f59859d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f59856a) * 31, 31, this.f59857b), 31, this.f59858c);
    }
}
