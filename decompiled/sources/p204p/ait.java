package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ait extends f2h1 {

    /* JADX INFO: renamed from: b */
    public final d850 f16089b;

    public ait(d850 d850Var) {
        this.f16089b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ait) && wj50.m88271j(this.f16089b, ((ait) obj).f16089b);
    }

    public final int hashCode() {
        d850 d850Var = this.f16089b;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
