package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xkn0 extends zkn0 {

    /* JADX INFO: renamed from: d */
    public final String f262899d;

    /* JADX INFO: renamed from: e */
    public final String f262900e;

    /* JADX INFO: renamed from: f */
    public final String f262901f;

    /* JADX INFO: renamed from: g */
    public final boolean f262902g;

    /* JADX INFO: renamed from: h */
    public final boolean f262903h;

    /* JADX INFO: renamed from: i */
    public final boolean f262904i;

    public xkn0(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        super(z, z2, true);
        this.f262899d = str;
        this.f262900e = str2;
        this.f262901f = str3;
        this.f262902g = z;
        this.f262903h = z2;
        this.f262904i = z3;
    }

    @Override // p204p.zkn0
    /* JADX INFO: renamed from: a */
    public final boolean mo91361a() {
        return this.f262902g;
    }

    @Override // p204p.zkn0
    /* JADX INFO: renamed from: b */
    public final boolean mo91362b() {
        return this.f262904i;
    }

    @Override // p204p.zkn0
    /* JADX INFO: renamed from: c */
    public final String mo91363c() {
        return this.f262900e;
    }

    @Override // p204p.zkn0
    /* JADX INFO: renamed from: d */
    public final String mo91364d() {
        return this.f262899d;
    }

    @Override // p204p.zkn0
    /* JADX INFO: renamed from: e */
    public final boolean mo91365e() {
        return this.f262903h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkn0)) {
            return false;
        }
        xkn0 xkn0Var = (xkn0) obj;
        return wj50.m88271j(this.f262899d, xkn0Var.f262899d) && wj50.m88271j(this.f262900e, xkn0Var.f262900e) && wj50.m88271j(this.f262901f, xkn0Var.f262901f) && this.f262902g == xkn0Var.f262902g && this.f262903h == xkn0Var.f262903h && this.f262904i == xkn0Var.f262904i;
    }

    public final int hashCode() {
        int iHashCode = this.f262899d.hashCode() * 31;
        String str = this.f262900e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f262901f;
        return Boolean.hashCode(this.f262904i) + s571.m77245d(s571.m77245d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f262902g), 31, this.f262903h);
    }
}
