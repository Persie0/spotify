package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class bkv {

    /* JADX INFO: renamed from: a */
    public final boolean f28024a;

    /* JADX INFO: renamed from: b */
    public final boolean f28025b;

    /* JADX INFO: renamed from: c */
    public final float f28026c;

    /* JADX INFO: renamed from: d */
    public final int f28027d;

    /* JADX INFO: renamed from: e */
    public final int f28028e;

    public bkv(float f, int i, boolean z, boolean z2) {
        this.f28024a = z;
        this.f28025b = z2;
        this.f28026c = f;
        this.f28027d = i;
        this.f28028e = 1;
    }

    /* JADX INFO: renamed from: a */
    public static bkv m29725a(bkv bkvVar) {
        return new bkv(bkvVar.f28026c, bkvVar.f28027d, bkvVar.f28024a, bkvVar.f28025b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkv)) {
            return false;
        }
        bkv bkvVar = (bkv) obj;
        return this.f28024a == bkvVar.f28024a && this.f28025b == bkvVar.f28025b && Float.compare(this.f28026c, bkvVar.f28026c) == 0 && this.f28027d == bkvVar.f28027d && this.f28028e == bkvVar.f28028e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f28028e) + f710.m40938f(this.f28027d, AbstractC0000a.m8g(s571.m77245d(Boolean.hashCode(this.f28024a) * 31, 31, this.f28025b), 31, this.f28026c), 31);
    }

    public /* synthetic */ bkv(boolean z, boolean z2, float f, int i, int i2) {
        this((i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 3 : i, z, (i2 & 2) != 0 ? false : z2);
    }
}
