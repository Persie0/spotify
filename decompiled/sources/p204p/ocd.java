package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ocd implements rcd {

    /* JADX INFO: renamed from: a */
    public final qdd f163901a;

    /* JADX INFO: renamed from: b */
    public final d850 f163902b;

    public ocd(qdd qddVar, d850 d850Var) {
        this.f163901a = qddVar;
        this.f163902b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocd)) {
            return false;
        }
        ocd ocdVar = (ocd) obj;
        return wj50.m88271j(this.f163901a, ocdVar.f163901a) && wj50.m88271j(this.f163902b, ocdVar.f163902b);
    }

    public final int hashCode() {
        int iHashCode = this.f163901a.hashCode() * 31;
        d850 d850Var = this.f163902b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
