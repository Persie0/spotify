package p204p;

import androidx.compose.p002ui.geometry.Size;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class ppc1 {

    /* JADX INFO: renamed from: a */
    public final float f180009a;

    /* JADX INFO: renamed from: b */
    public final float f180010b;

    /* JADX INFO: renamed from: c */
    public final float f180011c;

    /* JADX INFO: renamed from: d */
    public final long f180012d;

    public ppc1(float f, float f2, float f3, long j) {
        this.f180009a = f;
        this.f180010b = f2;
        this.f180011c = f3;
        this.f180012d = j;
    }

    /* JADX INFO: renamed from: a */
    public final tiv0 m70548a() {
        long j = this.f180012d;
        if (Size.m262c(j, 0L)) {
            return tiv0.f220750e;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float f = this.f180011c;
        float f2 = this.f180009a;
        float f3 = (fIntBitsToFloat / f) + f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        float f4 = this.f180010b;
        return new tiv0(f2, f4, f3, fIntBitsToFloat2 + f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppc1)) {
            return false;
        }
        ppc1 ppc1Var = (ppc1) obj;
        return Float.compare(this.f180009a, ppc1Var.f180009a) == 0 && Float.compare(this.f180010b, ppc1Var.f180010b) == 0 && Float.compare(this.f180011c, ppc1Var.f180011c) == 0 && Size.m262c(this.f180012d, ppc1Var.f180012d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f180012d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f180009a) * 31, 31, this.f180010b), 31, this.f180011c);
    }
}
