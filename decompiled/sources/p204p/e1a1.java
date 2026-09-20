package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class e1a1 {

    /* JADX INFO: renamed from: a */
    public final int f55160a;

    /* JADX INFO: renamed from: b */
    public final int f55161b;

    /* JADX INFO: renamed from: c */
    public final int f55162c;

    /* JADX INFO: renamed from: d */
    public final float f55163d;

    /* JADX INFO: renamed from: e */
    public final float f55164e;

    /* JADX INFO: renamed from: f */
    public final boolean f55165f;

    /* JADX INFO: renamed from: g */
    public final int f55166g;

    /* JADX INFO: renamed from: h */
    public final int f55167h;

    public e1a1(int i, int i2, int i3, float f, float f2, boolean z, int i4, int i5) {
        this.f55160a = i;
        this.f55161b = i2;
        this.f55162c = i3;
        this.f55163d = f;
        this.f55164e = f2;
        this.f55165f = z;
        this.f55166g = i4;
        this.f55167h = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1a1)) {
            return false;
        }
        e1a1 e1a1Var = (e1a1) obj;
        return this.f55160a == e1a1Var.f55160a && this.f55161b == e1a1Var.f55161b && this.f55162c == e1a1Var.f55162c && ybs.m93301b(this.f55163d, e1a1Var.f55163d) && ybs.m93301b(this.f55164e, e1a1Var.f55164e) && this.f55165f == e1a1Var.f55165f && this.f55166g == e1a1Var.f55166g && this.f55167h == e1a1Var.f55167h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55167h) + mt60.m62800g(this.f55166g, s571.m77245d(AbstractC0000a.m8g(AbstractC0000a.m8g(f710.m40938f(this.f55162c, f710.m40938f(this.f55161b, edb.m38547C(this.f55160a) * 31, 31), 31), 31, this.f55163d), 31, this.f55164e), 31, this.f55165f), 31);
    }
}
