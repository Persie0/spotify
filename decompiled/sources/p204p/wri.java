package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class wri {

    /* JADX INFO: renamed from: a */
    public final fxh0 f254361a;

    /* JADX INFO: renamed from: b */
    public final int f254362b;

    /* JADX INFO: renamed from: c */
    public final boolean f254363c;

    /* JADX INFO: renamed from: d */
    public final float f254364d;

    /* JADX INFO: renamed from: e */
    public final float f254365e;

    /* JADX INFO: renamed from: f */
    public final boolean f254366f;

    /* JADX INFO: renamed from: g */
    public final boolean f254367g;

    /* JADX INFO: renamed from: h */
    public final boolean f254368h;

    /* JADX INFO: renamed from: i */
    public final boolean f254369i;

    /* JADX INFO: renamed from: j */
    public final boolean f254370j;

    public wri(float f, float f2, int i, boolean z) {
        int i2 = (i & 2) != 0 ? 1 : 2;
        boolean z2 = (i & 4) == 0;
        f = (i & 8) != 0 ? 30 : f;
        f2 = (i & 16) != 0 ? 20 : f2;
        z = (i & 64) != 0 ? true : z;
        boolean z3 = (i & 1024) != 0;
        this.f254361a = cxh0.f43038a;
        this.f254362b = i2;
        this.f254363c = z2;
        this.f254364d = f;
        this.f254365e = f2;
        this.f254366f = true;
        this.f254367g = z;
        this.f254368h = false;
        this.f254369i = true;
        this.f254370j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wri)) {
            return false;
        }
        wri wriVar = (wri) obj;
        return wj50.m88271j(this.f254361a, wriVar.f254361a) && this.f254362b == wriVar.f254362b && this.f254363c == wriVar.f254363c && ybs.m93301b(this.f254364d, wriVar.f254364d) && ybs.m93301b(this.f254365e, wriVar.f254365e) && this.f254366f == wriVar.f254366f && this.f254367g == wriVar.f254367g && this.f254368h == wriVar.f254368h && this.f254369i == wriVar.f254369i && this.f254370j == wriVar.f254370j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254370j) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(AbstractC0000a.m8g(AbstractC0000a.m8g(s571.m77245d(f710.m40938f(this.f254362b, this.f254361a.hashCode() * 31, 31), 31, this.f254363c), 31, this.f254364d), 31, this.f254365e), 31, this.f254366f), 31, this.f254367g), 31, this.f254368h), 31, this.f254369i), 31, false);
    }
}
