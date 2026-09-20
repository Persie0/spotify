package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes5.dex */
public final class occ1 {

    /* JADX INFO: renamed from: a */
    public final float f163897a;

    /* JADX INFO: renamed from: b */
    public final float f163898b;

    /* JADX INFO: renamed from: c */
    public final float f163899c;

    /* JADX INFO: renamed from: d */
    public final float f163900d;

    public occ1(float f, float f2, float f3, float f4) {
        this.f163897a = f;
        this.f163898b = f2;
        this.f163899c = f3;
        this.f163900d = f4;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("scaleX must be greater than 0");
        }
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("scaleY must be greater than 0");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof occ1)) {
            return false;
        }
        occ1 occ1Var = (occ1) obj;
        return Float.compare(this.f163897a, occ1Var.f163897a) == 0 && Float.compare(this.f163898b, occ1Var.f163898b) == 0 && Float.compare(this.f163899c, occ1Var.f163899c) == 0 && Float.compare(this.f163900d, occ1Var.f163900d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f163900d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f163897a) * 31, 31, this.f163898b), 31, this.f163899c);
    }
}
