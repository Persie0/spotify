package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class jyu {

    /* JADX INFO: renamed from: a */
    public final float f117488a;

    /* JADX INFO: renamed from: b */
    public final float f117489b;

    /* JADX INFO: renamed from: c */
    public final float f117490c;

    public jyu(float f, float f2, float f3) {
        this.f117488a = f;
        this.f117489b = f2;
        this.f117490c = f3;
    }

    /* JADX INFO: renamed from: a */
    public static jyu m54818a(jyu jyuVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = jyuVar.f117488a;
        }
        if ((i & 2) != 0) {
            f2 = jyuVar.f117489b;
        }
        return new jyu(f, f2, jyuVar.f117490c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyu)) {
            return false;
        }
        jyu jyuVar = (jyu) obj;
        return ybs.m93301b(this.f117488a, jyuVar.f117488a) && ybs.m93301b(this.f117489b, jyuVar.f117489b) && ybs.m93301b(this.f117490c, jyuVar.f117490c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f117490c) + AbstractC0000a.m8g(Float.hashCode(this.f117488a) * 31, 31, this.f117489b);
    }
}
