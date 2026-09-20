package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bcs0 {

    /* JADX INFO: renamed from: a */
    public final acs0 f25937a;

    /* JADX INFO: renamed from: b */
    public final ok11 f25938b;

    public bcs0(acs0 acs0Var, ok11 ok11Var) {
        this.f25937a = acs0Var;
        this.f25938b = ok11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcs0)) {
            return false;
        }
        bcs0 bcs0Var = (bcs0) obj;
        return wj50.m88271j(this.f25937a, bcs0Var.f25937a) && wj50.m88271j(this.f25938b, bcs0Var.f25938b);
    }

    public final int hashCode() {
        int iHashCode = this.f25937a.hashCode() * 31;
        ok11 ok11Var = this.f25938b;
        return iHashCode + (ok11Var == null ? 0 : ok11Var.hashCode());
    }
}
