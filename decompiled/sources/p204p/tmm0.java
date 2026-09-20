package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tmm0 implements d7a1 {

    /* JADX INFO: renamed from: a */
    public final zam0 f221754a;

    /* JADX INFO: renamed from: b */
    public final fnm0 f221755b;

    /* JADX INFO: renamed from: c */
    public final fnm0 f221756c;

    public tmm0(zam0 zam0Var, fnm0 fnm0Var, fnm0 fnm0Var2) {
        this.f221754a = zam0Var;
        this.f221755b = fnm0Var;
        this.f221756c = fnm0Var2;
    }

    /* JADX INFO: renamed from: e */
    public static tmm0 m81129e(tmm0 tmm0Var, fnm0 fnm0Var, fnm0 fnm0Var2, int i) {
        zam0 zam0Var = tmm0Var.f221754a;
        if ((i & 2) != 0) {
            fnm0Var = tmm0Var.f221755b;
        }
        if ((i & 4) != 0) {
            fnm0Var2 = tmm0Var.f221756c;
        }
        return new tmm0(zam0Var, fnm0Var, fnm0Var2);
    }

    @Override // p204p.d7a1
    /* JADX INFO: renamed from: a */
    public final zam0 mo35190a() {
        return this.f221754a;
    }

    @Override // p204p.d7a1
    /* JADX INFO: renamed from: b */
    public final d7a1 mo35191b(fnm0 fnm0Var) {
        return m81129e(this, fnm0Var, null, 5);
    }

    @Override // p204p.d7a1
    /* JADX INFO: renamed from: c */
    public final d7a1 mo35192c(fnm0 fnm0Var) {
        return m81129e(this, null, fnm0Var, 3);
    }

    @Override // p204p.d7a1
    /* JADX INFO: renamed from: d */
    public final fnm0 mo35193d() {
        return this.f221755b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmm0)) {
            return false;
        }
        tmm0 tmm0Var = (tmm0) obj;
        return wj50.m88271j(this.f221754a, tmm0Var.f221754a) && wj50.m88271j(this.f221755b, tmm0Var.f221755b) && wj50.m88271j(this.f221756c, tmm0Var.f221756c);
    }

    public final int hashCode() {
        int iHashCode = this.f221754a.hashCode() * 31;
        fnm0 fnm0Var = this.f221755b;
        int iHashCode2 = (iHashCode + (fnm0Var == null ? 0 : fnm0Var.f71323a.hashCode())) * 31;
        fnm0 fnm0Var2 = this.f221756c;
        return iHashCode2 + (fnm0Var2 != null ? fnm0Var2.f71323a.hashCode() : 0);
    }

    public /* synthetic */ tmm0(zam0 zam0Var, fnm0 fnm0Var, int i) {
        this(zam0Var, (i & 2) != 0 ? null : fnm0Var, (fnm0) null);
    }
}
