package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class ghd1 {

    /* JADX INFO: renamed from: a */
    public final long f79897a;

    /* JADX INFO: renamed from: b */
    public final float f79898b;

    /* JADX INFO: renamed from: c */
    public final float f79899c;

    /* JADX INFO: renamed from: d */
    public final float f79900d;

    public ghd1(float f, float f2, float f3, long j) {
        this.f79897a = j;
        this.f79898b = f;
        this.f79899c = f2;
        this.f79900d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghd1)) {
            return false;
        }
        ghd1 ghd1Var = (ghd1) obj;
        long j = ghd1Var.f79897a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f79897a, j) && ybs.m93301b(this.f79898b, ghd1Var.f79898b) && ybs.m93301b(this.f79899c, ghd1Var.f79899c) && ybs.m93301b(this.f79900d, ghd1Var.f79900d);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return Float.hashCode(this.f79900d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Long.hashCode(this.f79897a) * 31, 31, this.f79898b), 31, this.f79899c);
    }
}
