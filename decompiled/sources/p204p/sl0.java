package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sl0 {

    /* JADX INFO: renamed from: a */
    public final int f210226a;

    /* JADX INFO: renamed from: b */
    public final int f210227b;

    /* JADX INFO: renamed from: c */
    public final int f210228c;

    /* JADX INFO: renamed from: d */
    public final int f210229d;

    /* JADX INFO: renamed from: e */
    public final int f210230e;

    /* JADX INFO: renamed from: f */
    public final int f210231f;

    /* JADX INFO: renamed from: g */
    public final rl0 f210232g;

    public sl0(int i, int i2, int i3, int i4, int i5, int i6, rl0 rl0Var) {
        this.f210226a = i;
        this.f210227b = i2;
        this.f210228c = i3;
        this.f210229d = i4;
        this.f210230e = i5;
        this.f210231f = i6;
        this.f210232g = rl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl0)) {
            return false;
        }
        sl0 sl0Var = (sl0) obj;
        return this.f210226a == sl0Var.f210226a && this.f210227b == sl0Var.f210227b && this.f210228c == sl0Var.f210228c && this.f210229d == sl0Var.f210229d && this.f210230e == sl0Var.f210230e && this.f210231f == sl0Var.f210231f && this.f210232g.equals(sl0Var.f210232g);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f210232g.f200186a) + f710.m40938f(this.f210231f, mt60.m62800g(this.f210230e, mt60.m62800g(this.f210229d, mt60.m62800g(this.f210228c, mt60.m62800g(this.f210227b, Integer.hashCode(this.f210226a) * 31, 31), 31), 31), 31), 31);
    }
}
