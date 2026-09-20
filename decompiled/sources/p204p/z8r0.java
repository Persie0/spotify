package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z8r0 extends g9r0 {

    /* JADX INFO: renamed from: a */
    public final String f280540a;

    /* JADX INFO: renamed from: b */
    public final String f280541b;

    /* JADX INFO: renamed from: c */
    public final boolean f280542c;

    /* JADX INFO: renamed from: d */
    public final boolean f280543d;

    /* JADX INFO: renamed from: e */
    public final boolean f280544e;

    public z8r0(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f280540a = str;
        this.f280541b = str2;
        this.f280542c = z;
        this.f280543d = z2;
        this.f280544e = z3;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: a */
    public final String mo25163a() {
        return this.f280541b;
    }

    @Override // p204p.g9r0
    /* JADX INFO: renamed from: b */
    public final boolean mo25164b() {
        return this.f280543d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8r0)) {
            return false;
        }
        z8r0 z8r0Var = (z8r0) obj;
        return wj50.m88271j(this.f280540a, z8r0Var.f280540a) && wj50.m88271j(this.f280541b, z8r0Var.f280541b) && this.f280542c == z8r0Var.f280542c && this.f280543d == z8r0Var.f280543d && this.f280544e == z8r0Var.f280544e;
    }

    public final int hashCode() {
        return qsj.f192130d.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(this.f280540a.hashCode() * 31, 31, this.f280541b), 31, this.f280542c), 31, this.f280543d), 31, this.f280544e);
    }
}
