package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tlf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final b791 f221459a;

    /* JADX INFO: renamed from: b */
    public final d850 f221460b;

    public tlf0(b791 b791Var, d850 d850Var) {
        this.f221459a = b791Var;
        this.f221460b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlf0)) {
            return false;
        }
        tlf0 tlf0Var = (tlf0) obj;
        return wj50.m88271j(this.f221459a, tlf0Var.f221459a) && wj50.m88271j(this.f221460b, tlf0Var.f221460b);
    }

    public final int hashCode() {
        int iHashCode = this.f221459a.hashCode() * 31;
        d850 d850Var = this.f221460b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }

    public final String toString() {
        return s571.m77251j("GetAutoTransitionUri(currentTransition=", this.f221459a.m28367g(), ")");
    }
}
