package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class jhz {

    /* JADX INFO: renamed from: a */
    public final float f112583a;

    /* JADX INFO: renamed from: b */
    public final float f112584b;

    /* JADX INFO: renamed from: c */
    public final long f112585c;

    public jhz(float f, float f2, long j) {
        this.f112583a = f;
        this.f112584b = f2;
        this.f112585c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhz)) {
            return false;
        }
        jhz jhzVar = (jhz) obj;
        return Float.compare(this.f112583a, jhzVar.f112583a) == 0 && Float.compare(this.f112584b, jhzVar.f112584b) == 0 && this.f112585c == jhzVar.f112585c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f112585c) + AbstractC0000a.m8g(Float.hashCode(this.f112583a) * 31, 31, this.f112584b);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f112583a + ", distance=" + this.f112584b + ", duration=" + this.f112585c + ')';
    }
}
