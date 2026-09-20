package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i55 implements hq10 {

    /* JADX INFO: renamed from: a */
    public final api f98807a;

    /* JADX INFO: renamed from: b */
    public final e07 f98808b;

    /* JADX INFO: renamed from: c */
    public final boolean f98809c;

    /* JADX INFO: renamed from: d */
    public final boolean f98810d;

    public i55(api apiVar, e07 e07Var, boolean z, boolean z2) {
        this.f98807a = apiVar;
        this.f98808b = e07Var;
        this.f98809c = z;
        this.f98810d = z2;
    }

    @Override // p204p.hq10
    /* JADX INFO: renamed from: a */
    public final boolean mo48191a() {
        return true;
    }

    @Override // p204p.hq10
    /* JADX INFO: renamed from: b */
    public final e07 mo48192b() {
        return this.f98808b;
    }

    @Override // p204p.hq10
    /* JADX INFO: renamed from: c */
    public final api mo48193c() {
        return this.f98807a;
    }

    @Override // p204p.hq10
    /* JADX INFO: renamed from: d */
    public final boolean mo48194d() {
        return this.f98809c;
    }

    @Override // p204p.hq10
    /* JADX INFO: renamed from: e */
    public final boolean mo48195e() {
        return this.f98810d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i55)) {
            return false;
        }
        i55 i55Var = (i55) obj;
        return wj50.m88271j(this.f98807a, i55Var.f98807a) && wj50.m88271j(this.f98808b, i55Var.f98808b) && this.f98809c == i55Var.f98809c && this.f98810d == i55Var.f98810d;
    }

    public final int hashCode() {
        int iHashCode = this.f98807a.hashCode() * 31;
        e07 e07Var = this.f98808b;
        return Boolean.hashCode(this.f98810d) + s571.m77245d((iHashCode + (e07Var == null ? 0 : e07Var.hashCode())) * 31, 31, this.f98809c);
    }
}
