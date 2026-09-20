package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f5d implements h5d {

    /* JADX INFO: renamed from: a */
    public final d850 f66024a;

    public f5d(d850 d850Var) {
        this.f66024a = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5d) && wj50.m88271j(this.f66024a, ((f5d) obj).f66024a);
    }

    public final int hashCode() {
        d850 d850Var = this.f66024a;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
