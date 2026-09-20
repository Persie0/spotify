package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class g7r {

    /* JADX INFO: renamed from: a */
    public final double f77331a;

    /* JADX INFO: renamed from: b */
    public final double f77332b;

    /* JADX INFO: renamed from: c */
    public final float f77333c;

    /* JADX INFO: renamed from: d */
    public final long f77334d;

    public g7r(double d, double d2, float f, long j) {
        this.f77331a = d;
        this.f77332b = d2;
        this.f77333c = f;
        this.f77334d = j;
    }

    /* JADX INFO: renamed from: a */
    public final float m43919a() {
        return this.f77333c;
    }

    /* JADX INFO: renamed from: b */
    public final long m43920b() {
        return this.f77334d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7r)) {
            return false;
        }
        g7r g7rVar = (g7r) obj;
        return Double.compare(this.f77331a, g7rVar.f77331a) == 0 && Double.compare(this.f77332b, g7rVar.f77332b) == 0 && Float.compare(this.f77333c, g7rVar.f77333c) == 0 && this.f77334d == g7rVar.f77334d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f77334d) + AbstractC0000a.m8g(xl81.m91399h(this.f77332b, Double.hashCode(this.f77331a) * 31, 31), 31, this.f77333c);
    }
}
