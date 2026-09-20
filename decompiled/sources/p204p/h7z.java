package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h7z {

    /* JADX INFO: renamed from: a */
    public final int f88568a;

    /* JADX INFO: renamed from: b */
    public final int f88569b;

    /* JADX INFO: renamed from: c */
    public final boolean f88570c;

    /* JADX INFO: renamed from: d */
    public final boolean f88571d;

    /* JADX INFO: renamed from: e */
    public final boolean f88572e;

    /* JADX INFO: renamed from: f */
    public final hs61 f88573f;

    /* JADX INFO: renamed from: g */
    public final qf40 f88574g;

    /* JADX INFO: renamed from: h */
    public final qf40 f88575h;

    public h7z(int i, int i2, boolean z, boolean z2, boolean z3, hs61 hs61Var, qf40 qf40Var, qf40 qf40Var2) {
        this.f88568a = i;
        this.f88569b = i2;
        this.f88570c = z;
        this.f88571d = z2;
        this.f88572e = z3;
        this.f88573f = hs61Var;
        this.f88574g = qf40Var;
        this.f88575h = qf40Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7z)) {
            return false;
        }
        h7z h7zVar = (h7z) obj;
        return this.f88568a == h7zVar.f88568a && this.f88569b == h7zVar.f88569b && this.f88570c == h7zVar.f88570c && this.f88571d == h7zVar.f88571d && this.f88572e == h7zVar.f88572e && wj50.m88271j(this.f88573f, h7zVar.f88573f) && wj50.m88271j(this.f88574g, h7zVar.f88574g) && wj50.m88271j(this.f88575h, h7zVar.f88575h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f88569b, Integer.hashCode(this.f88568a) * 31, 31), 31, this.f88570c), 31, this.f88571d), 31, this.f88572e);
        hs61 hs61Var = this.f88573f;
        return this.f88575h.hashCode() + fr0.m42461e(this.f88574g, (iM77245d + (hs61Var == null ? 0 : hs61Var.hashCode())) * 31, 31);
    }
}
