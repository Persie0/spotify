package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t8d implements lad {

    /* JADX INFO: renamed from: a */
    public final d850 f218060a;

    public t8d(d850 d850Var) {
        this.f218060a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8d) && wj50.m88271j(this.f218060a, ((t8d) obj).f218060a);
    }

    public final int hashCode() {
        d850 d850Var = this.f218060a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
