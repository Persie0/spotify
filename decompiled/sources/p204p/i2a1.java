package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i2a1 implements y3u {

    /* JADX INFO: renamed from: a */
    public final long f97785a;

    /* JADX INFO: renamed from: b */
    public final boolean f97786b;

    /* JADX INFO: renamed from: c */
    public final fzx0 f97787c;

    public i2a1(long j, boolean z, fzx0 fzx0Var) {
        this.f97785a = j;
        this.f97786b = z;
        this.f97787c = fzx0Var;
    }

    /* JADX INFO: renamed from: e */
    public static i2a1 m49480e(i2a1 i2a1Var, long j, boolean z, int i) {
        if ((i & 1) != 0) {
            j = i2a1Var.f97785a;
        }
        if ((i & 2) != 0) {
            z = i2a1Var.f97786b;
        }
        fzx0 fzx0Var = i2a1Var.f97787c;
        i2a1Var.getClass();
        return new i2a1(j, z, fzx0Var);
    }

    @Override // p204p.y3u
    /* JADX INFO: renamed from: a */
    public final boolean mo49481a() {
        return this.f97786b;
    }

    @Override // p204p.y3u
    /* JADX INFO: renamed from: b */
    public final long mo49482b() {
        return this.f97785a;
    }

    @Override // p204p.y3u
    /* JADX INFO: renamed from: c */
    public final fzx0 mo49483c() {
        return this.f97787c;
    }

    @Override // p204p.y3u
    /* JADX INFO: renamed from: d */
    public final boolean mo49484d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2a1)) {
            return false;
        }
        i2a1 i2a1Var = (i2a1) obj;
        return g450.m43520b(this.f97785a, i2a1Var.f97785a) && this.f97786b == i2a1Var.f97786b && wj50.m88271j(this.f97787c, i2a1Var.f97787c);
    }

    public final int hashCode() {
        return this.f97787c.hashCode() + s571.m77245d(Long.hashCode(this.f97785a) * 31, 31, this.f97786b);
    }
}
