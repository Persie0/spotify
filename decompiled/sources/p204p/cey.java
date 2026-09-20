package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class cey {

    /* JADX INFO: renamed from: a */
    public final boolean f37208a;

    /* JADX INFO: renamed from: b */
    public final boolean f37209b;

    /* JADX INFO: renamed from: c */
    public final float f37210c;

    /* JADX INFO: renamed from: d */
    public final float f37211d;

    /* JADX INFO: renamed from: e */
    public final int f37212e;

    /* JADX INFO: renamed from: f */
    public final long f37213f;

    public cey(boolean z, boolean z2, float f, float f2, int i, long j) {
        this.f37208a = z;
        this.f37209b = z2;
        this.f37210c = f;
        this.f37211d = f2;
        this.f37212e = i;
        this.f37213f = j;
    }

    /* JADX INFO: renamed from: a */
    public static cey m32597a(cey ceyVar, boolean z, boolean z2, float f, float f2, int i, long j, int i2) {
        if ((i2 & 1) != 0) {
            z = ceyVar.f37208a;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = ceyVar.f37209b;
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            f = ceyVar.f37210c;
        }
        float f3 = f;
        if ((i2 & 8) != 0) {
            f2 = ceyVar.f37211d;
        }
        float f4 = f2;
        if ((i2 & 16) != 0) {
            i = ceyVar.f37212e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            j = ceyVar.f37213f;
        }
        ceyVar.getClass();
        return new cey(z3, z4, f3, f4, i3, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cey)) {
            return false;
        }
        cey ceyVar = (cey) obj;
        return this.f37208a == ceyVar.f37208a && this.f37209b == ceyVar.f37209b && Float.compare(this.f37210c, ceyVar.f37210c) == 0 && Float.compare(this.f37211d, ceyVar.f37211d) == 0 && this.f37212e == ceyVar.f37212e && this.f37213f == ceyVar.f37213f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f37213f) + mt60.m62800g(this.f37212e, AbstractC0000a.m8g(AbstractC0000a.m8g(s571.m77245d(Boolean.hashCode(this.f37208a) * 31, 31, this.f37209b), 31, this.f37210c), 31, this.f37211d), 31);
    }
}
