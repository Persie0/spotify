package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pam0 implements qam0 {

    /* JADX INFO: renamed from: a */
    public final zam0 f175577a;

    /* JADX INFO: renamed from: b */
    public final fnm0 f175578b;

    public pam0(zam0 zam0Var, fnm0 fnm0Var) {
        this.f175577a = zam0Var;
        this.f175578b = fnm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pam0)) {
            return false;
        }
        pam0 pam0Var = (pam0) obj;
        return wj50.m88271j(this.f175577a, pam0Var.f175577a) && wj50.m88271j(this.f175578b, pam0Var.f175578b);
    }

    public final int hashCode() {
        int iHashCode = this.f175577a.hashCode() * 31;
        fnm0 fnm0Var = this.f175578b;
        return iHashCode + (fnm0Var == null ? 0 : fnm0Var.f71323a.hashCode());
    }
}
