package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class m8w {

    /* JADX INFO: renamed from: a */
    public final long f141138a;

    /* JADX INFO: renamed from: b */
    public final long f141139b;

    /* JADX INFO: renamed from: c */
    public final float f141140c;

    /* JADX INFO: renamed from: d */
    public final boolean f141141d;

    /* JADX INFO: renamed from: e */
    public final int f141142e;

    /* JADX INFO: renamed from: f */
    public final int f141143f;

    /* JADX INFO: renamed from: g */
    public final boolean f141144g;

    /* JADX INFO: renamed from: h */
    public final y6s0 f141145h;

    public m8w(long j, long j2, float f, boolean z, int i, int i2, boolean z2, y6s0 y6s0Var, int i3) {
        j = (i3 & 1) != 0 ? 0L : j;
        j2 = (i3 & 2) != 0 ? 0L : j2;
        z = (i3 & 8) != 0 ? false : z;
        y6s0Var = (i3 & 256) != 0 ? null : y6s0Var;
        this.f141138a = j;
        this.f141139b = j2;
        this.f141140c = f;
        this.f141141d = z;
        this.f141142e = i;
        this.f141143f = i2;
        this.f141144g = z2;
        this.f141145h = y6s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8w)) {
            return false;
        }
        m8w m8wVar = (m8w) obj;
        return this.f141138a == m8wVar.f141138a && this.f141139b == m8wVar.f141139b && Float.compare(this.f141140c, m8wVar.f141140c) == 0 && this.f141141d == m8wVar.f141141d && this.f141142e == m8wVar.f141142e && this.f141143f == m8wVar.f141143f && this.f141144g == m8wVar.f141144g && wj50.m88271j(this.f141145h, m8wVar.f141145h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(f710.m40938f(this.f141143f, f710.m40938f(this.f141142e, s571.m77245d(AbstractC0000a.m8g(dq60.m36605e(Long.hashCode(this.f141138a) * 31, this.f141139b, 31), 31, this.f141140c), 31, this.f141141d), 31), 31), 31, true), 31, this.f141144g);
        y6s0 y6s0Var = this.f141145h;
        return iM77245d + (y6s0Var == null ? 0 : y6s0Var.hashCode());
    }
}
