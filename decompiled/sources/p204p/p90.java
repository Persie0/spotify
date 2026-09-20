package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p90 implements hq10 {

    /* JADX INFO: renamed from: a */
    public final api f175107a;

    /* JADX INFO: renamed from: b */
    public final e07 f175108b;

    /* JADX INFO: renamed from: c */
    public final boolean f175109c;

    /* JADX INFO: renamed from: d */
    public final boolean f175110d;

    /* JADX INFO: renamed from: e */
    public final boolean f175111e;

    public p90(api apiVar, e07 e07Var, boolean z, boolean z2, boolean z3) {
        this.f175107a = apiVar;
        this.f175108b = e07Var;
        this.f175109c = z;
        this.f175110d = z2;
        this.f175111e = z3;
    }

    @Override // p204p.hq10
    /* JADX INFO: renamed from: a */
    public final boolean mo48191a() {
        return this.f175111e;
    }

    @Override // p204p.hq10
    /* JADX INFO: renamed from: b */
    public final e07 mo48192b() {
        return this.f175108b;
    }

    @Override // p204p.hq10
    /* JADX INFO: renamed from: c */
    public final api mo48193c() {
        return this.f175107a;
    }

    @Override // p204p.hq10
    /* JADX INFO: renamed from: d */
    public final boolean mo48194d() {
        return this.f175109c;
    }

    @Override // p204p.hq10
    /* JADX INFO: renamed from: e */
    public final boolean mo48195e() {
        return this.f175110d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return false;
        }
        p90 p90Var = (p90) obj;
        return wj50.m88271j(this.f175107a, p90Var.f175107a) && wj50.m88271j(this.f175108b, p90Var.f175108b) && this.f175109c == p90Var.f175109c && this.f175110d == p90Var.f175110d && this.f175111e == p90Var.f175111e;
    }

    public final int hashCode() {
        int iHashCode = this.f175107a.hashCode() * 31;
        e07 e07Var = this.f175108b;
        return Boolean.hashCode(this.f175111e) + s571.m77245d(s571.m77245d((iHashCode + (e07Var == null ? 0 : e07Var.hashCode())) * 31, 31, this.f175109c), 31, this.f175110d);
    }
}
