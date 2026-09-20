package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gsi0 {

    /* JADX INFO: renamed from: a */
    public final boolean f83976a;

    /* JADX INFO: renamed from: b */
    public final d850 f83977b;

    public /* synthetic */ gsi0() {
        this(null, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsi0)) {
            return false;
        }
        gsi0 gsi0Var = (gsi0) obj;
        return this.f83976a == gsi0Var.f83976a && wj50.m88271j(this.f83977b, gsi0Var.f83977b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f83976a) * 31;
        d850 d850Var = this.f83977b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }

    public gsi0(d850 d850Var, boolean z) {
        this.f83976a = z;
        this.f83977b = d850Var;
    }
}
