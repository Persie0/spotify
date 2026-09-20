package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xrl0 {

    /* JADX INFO: renamed from: a */
    public final boolean f265371a;

    /* JADX INFO: renamed from: b */
    public final boolean f265372b;

    public xrl0(boolean z, boolean z2) {
        this.f265371a = z;
        this.f265372b = z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91939a() {
        return this.f265371a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrl0)) {
            return false;
        }
        xrl0 xrl0Var = (xrl0) obj;
        return this.f265371a == xrl0Var.f265371a && this.f265372b == xrl0Var.f265372b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265372b) + (Boolean.hashCode(this.f265371a) * 31);
    }
}
